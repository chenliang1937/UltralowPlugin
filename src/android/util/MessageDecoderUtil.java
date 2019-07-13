package com.zkmeiling.serialport.util;

import android.content.Context;

import com.zkmeiling.serialport.model.Message;
import com.zkmeiling.serialport.model.Received;

import java.text.ParseException;
import java.util.Date;

/**
 * @author Chenl
 * 处理接收到的温度等数据
 */
public class MessageDecoderUtil {

    public static Message getMessage(Received received) throws ParseException {
        Message message = new Message();
        byte[] content = received.getContent();
        /**Pt1000-1*/
        message.setTemperature1(DataUtil.byte2doubleData(content[0],content[1]));
        /**Pt1000-2*/
        message.setTemperature2(DataUtil.byte2doubleData(content[2],content[3]));
        /**平均温度*/
        int sensorState = content[17] & 0xff;
        boolean pt1State = false;
        boolean pt2State = false;
        if ((sensorState & 0b0010_0000) >> 5 == 1) { //Pt1000-1 故障
            pt1State = false;
        } else if ((sensorState & 0b0010_0000) >> 5 == 0) { //Pt1000-1 正常
            pt1State = true;
        }
        if ((sensorState & 0b0001_0000) >> 4 == 1) { //Pt1000-2 故障
            pt2State = false;
        } else if ((sensorState & 0b0001_0000) >> 4 == 0) { //Pt1000-2 正常
            pt2State = true;
        }
        if (pt1State && !pt2State) { // pt1正常 pt2故障 则显示pt1的温度
            message.setAverageTemperate(DataUtil.byte2doubleData(content[0],content[1]));
        }else if (!pt1State && pt2State) { // pt2正常 pt1故障 则显示pt2的温度
            message.setAverageTemperate(DataUtil.byte2doubleData(content[2],content[3]));
        }else {
            message.setAverageTemperate(DataUtil.byte2doubleData(content[4],content[5]));
        }

        /**冷凝传感器温度*/
        message.setCondenserTemperate(DataUtil.byte2doubleData(content[10],content[11]));
        /**环境温度*/
        message.setEnvironmentTemperature(DataUtil.byte2doubleData(content[12],content[13]));

        initState(message, content);

        message.setRecodingState((int) content[20]);
        message.setExportFileState((int) content[21]);
        byte[] timeBytes = new byte[5];
        System.arraycopy(content, 22, timeBytes, 0, 5);
        message.setRecordTime(new Date());
        message.setReceiveTime(new Date());

        return message;
    }

    /**
     * 解析原始数据的4类状态
     */
    private static Message initState(Message message, byte[] content) {

        if (content.length < 20) {
            return null;
        }
        int state1 = content[16] & 0xff;
        int state2 = content[17] & 0xff;
        int state3 = content[18] & 0xff;
        int state4 = content[19] & 0xff;
        int state5 = content[26] & 0xff;//疫苗箱锁状态
        int state0 = content[15] & 0xff;

        //----------------------------------state1 start---------------------------------------
        // 1-门开 0-门关
        message.setDoorOpenState((state1 >> 7));
        // 1-断电 0-未断电
        message.setIsPowerOn((state1 & 0b0010_0000) >> 5);
        // 1-连接正常 0-未连接
        message.setIsWifiOn((state1 & 0b0001_0000) >> 4);
        // 1-锁开 0-锁关
        message.setLockState((state1 & 0b0000_1000) >> 3);
        // 1-制冷开 0-制冷关
        message.setIsCoolingOn((state1 & 0b0000_0100) >> 2);
        // 1-电量低 0-电量正常
        message.setBatteryState((state1 & 0b0000_0010) >> 1);
        // 1-打印 0-未打印
        message.setPrintState(state1 & 0b0000_0001);
        //----------------------------------state1 end---------------------------------------

        //----------------------------------state2 start---------------------------------------
        // 1-连接正常 0-未连接
        message.setRs485connectState(state2 >> 7);
        // pt1000-1 1-故障 0-正常
        message.setTemperature1State((state2 & 0b0010_0000) >> 5);
        // pt1000-2 1-故障 0-正常
        message.setTemperature2State((state2 & 0b0001_0000) >> 4);
        // 冷凝器传感器 1-故障 0-正常
        message.setCondenserSensorState((state2 & 0b0000_0010) >> 1);
        // 环境温度传感器 1-故障 0-正常
        message.setEnvironmentSensorState(state2 & 0b0000_0001);
        //----------------------------------state2 end---------------------------------------

        //----------------------------------state3 start---------------------------------------
        // 高温报警 1-报警 0-正常
        message.setTemperature1HighWarn(state3 >> 7);
        // 低温报警 1-报警 0-正常
        message.setTemperature1LowWarn((state3 & 0b0100_0000) >> 6);
        // 环温高温报警 1-报警 0-正常
        message.setEnvironmentTemperatureHighWarn((state3 & 0b0010_0000) >> 5);
        // 环温低温报警 1-报警 0-正常
        message.setCondenserTemperateHighWarn((state3 & 0b0001_0000) >> 4);
        // 门长时间打开报警 1-报警 0-正常
        message.setDoorOpenTimeout((state3 & 0b0000_1000) >> 3);
        // 接收到手动打印状态 1-接收到 0-未接收到
        message.setManualPrintState((state3 & 0b0000_0100) >> 2);
        // 电源电压检测故障状态 1-故障 0-正常
        message.setPowerVoltageState((state3 & 0b0000_0010) >> 1);
        // 主控板通信故障状态 1-故障 0-正常
        message.setCorrespondenceState(state3 & 0b0000_0001);
        //----------------------------------state3 end---------------------------------------

        //----------------------------------state4 start---------------------------------------
        // 电池电量检测故障状态状态 1-故障 0-正常
        message.setBatteryDetectionState(state4 >> 7);
        // 蜂鸣器鸣叫状态 1-鸣叫 0-不鸣叫
        message.setBuzzerState((state4 & 0b0100_0000) >> 6);
        // USB导出pdf文件结束标志 1-结束 0-没结束
        message.setExportUsbFileState((state4 & 0b0001_0000) >> 4);
        // USB通信故障状态 1-故障 0-正常
        message.setUsbCorrespondenceState((state4 & 0b0000_1000) >> 3);
        // 取消静音状态 1-取消静音 0-允许静音
        message.setMuteState(state4 & 0b0000_0001);
        //----------------------------------state4 end---------------------------------------

        //----------------------------------state5 start---------------------------------------
        // 锁1 0-开 1-关
        message.setLock1(state5 & 0b0000_0001);
        // 锁2 0-开 1-关
        message.setLock2((state5 & 0b0000_0010) >> 1);
        // 锁3 0-开 1-关
        message.setLock3((state5 & 0b0000_0100) >> 2);
        // 锁4 0-开 1-关
        message.setLock4((state5 & 0b0000_1000) >> 3);
        // 锁5 0-开 1-关
        message.setLock5((state5 & 0b0001_0000) >> 4);
        // 锁6 0-开 1-关
        message.setLock6((state5 & 0b0010_0000) >> 5);
        //----------------------------------state5 end---------------------------------------

        //----------------------------------state0 start---------------------------------------
        // 风机状态 0-关 1-开
        message.setFanState(state0 & 0b0000_0001);
        // 压力开关状态 0-关 1-开
        message.setPressureState((state0 & 0b0000_0010) >> 1);
        // 加热器1状态 0-关 1-开
        message.setHeater1State((state0 & 0b0000_0100) >> 2);
        // 加热器2状态 0-关 1-开
        message.setHeater2State((state0 & 0b0000_1000) >> 3);
        //----------------------------------state0 end---------------------------------------

        return message;
    }

}
