package com.zkmeiling.serialport.util;

import com.zkmeiling.serialport.model.ReadParams;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

/**
 * 发送参数
 */
public class ParamsEncoderUtil {

    public static byte[] doEncoder(ReadParams params) throws IOException, ParseException {
        byte[] bytes = ParamsEncoderUtil.getBytes(params);
        return bytes;

    }

    /**
     * 参数设置
     *
     * @param params
     * @return
     * @throws ParseException
     */
    public static byte[] getBytes(ReadParams params) throws ParseException {
        byte[] bytes = new byte[110];
        bytes[0] = (byte)0xA5;
        bytes[1] = 0x03;
        bytes[2] = 106;
        /*温度设定*/
        bytes[3] = DataUtil.doubleData2low(params.getTemperatureSetting());
        bytes[4] = DataUtil.doubleData2high(params.getTemperatureSetting());
        /*高温报警偏差*/
        bytes[5] = DataUtil.doubleData2low(params.getHighTemperatureWarnDeviation());
        bytes[6] = DataUtil.doubleData2high(params.getHighTemperatureWarnDeviation());
        /*低温报警偏差   -无意义*/
        bytes[7] = DataUtil.doubleData2low(params.getLowTemperatureWarnDeviation());
        bytes[8] = DataUtil.doubleData2high(params.getLowTemperatureWarnDeviation());
        /*查看当前日期-年 -无意义*/
        bytes[9] = 0;
        bytes[10] = 0;
        /*查看当前日期 月 -无意义*/
        bytes[11] = 0;
        bytes[12] = 0;
        /*查看当前日期 日 -无意义*/
        bytes[13] = 0;
        bytes[14] = 0;
        /*查看当前日期 时 -无意义*/
        bytes[15] = 0;
        bytes[16] = 0;
        /*查看当前日期 分 -无意义*/
        bytes[17] = 0;
        bytes[18] = 0;
        /*打印间隔*/
        bytes[19] = DataUtil.intData2low(params.getPrintInterval());
        bytes[20] = DataUtil.intData2high(params.getPrintInterval());
        /*环温高温报警值*/
        bytes[21] = DataUtil.doubleData2low(params.getEvnHighTemperatureWarn());
        bytes[22] = DataUtil.doubleData2high(params.getEvnHighTemperatureWarn());
        /*用户菜单密码设置*/
        bytes[23] = DataUtil.intData2low(params.getUserMenuPassword());
        bytes[24] = DataUtil.intData2high(params.getUserMenuPassword());
        /*硬件版本*/
        bytes[25] = DataUtil.intData2low(params.getHardWareVersion());
        bytes[26] = DataUtil.intData2high(params.getHardWareVersion());
        /*软件版本*/
        bytes[27] = DataUtil.intData2low(params.getSoftWareVersion());
        bytes[28] = DataUtil.intData2high(params.getSoftWareVersion());
        /*PT1000-1传感器温度--无意义*/
//        bytes[29] = 0;
        bytes[29] = -39;
//        bytes[30] = 0;
        bytes[30] = -2;
        /*PT1000-2传感器温度--无意义*/
//        bytes[31] = 0;
        bytes[31] = 68;
//        bytes[32] = 0;
        bytes[32] = 1;
        /*环境传感器温度--无意义*/
//        bytes[33] = 0;
        bytes[33] = 56;
//        bytes[34] = 0;
        bytes[34] = 1;
        /*冷凝器传感器温度--无意义*/
//        bytes[35] = 0;
        bytes[35] = 51;
//        bytes[36] = 0;
        bytes[36] = 1;
        /*冷凝传感器高温报警值*/
        bytes[37] = DataUtil.doubleData2low(params.getConHighTemperatureWarn());
        bytes[38] = DataUtil.doubleData2high(params.getConHighTemperatureWarn());
        /*PT1000-1传感器温度校正*/
        bytes[39] = DataUtil.doubleData2low(params.getPt10001TemperatureRevise());
        bytes[40] = DataUtil.doubleData2high(params.getPt10001TemperatureRevise());
        /*PT1000-2传感器温度校正*/
        bytes[41] = DataUtil.doubleData2low(params.getPt10002TemperatureRevise());
        bytes[42] = DataUtil.doubleData2high(params.getPt10002TemperatureRevise());
        /*环境传感器温度校正*/
        bytes[43] = DataUtil.doubleData2low(params.getEvnTemperatureRevise());
        bytes[44] = DataUtil.doubleData2high(params.getEvnTemperatureRevise());
        /*冷凝器传感器温度校正*/
        bytes[45] = DataUtil.doubleData2low(params.getConTemperatureRevise());
        bytes[46] = DataUtil.doubleData2high(params.getConTemperatureRevise());
        /*压缩机开机回差*/
        bytes[47] = DataUtil.doubleData2low(params.getCompressorStartDiff());
        bytes[48] = DataUtil.doubleData2high(params.getCompressorStartDiff());
        /*压缩机停机回差*/
        bytes[49] = DataUtil.doubleData2low(params.getCompressorStopDiff());
        bytes[50] = DataUtil.doubleData2high(params.getCompressorStopDiff());
        /*压缩机启动间隔*/
        bytes[51] = DataUtil.intData2low(params.getCompressorStartInterval());
        bytes[52] = DataUtil.intData2high(params.getCompressorStartInterval());
        /*冷凝风机滞后压缩机停机时间*/
        bytes[53] = DataUtil.intData2low(params.getConCompressorLagTime());
        bytes[54] = DataUtil.intData2high(params.getConCompressorLagTime());
        /*超温报警延时*/
        bytes[55] = DataUtil.intData2low(params.getOverTemperatureWarnTime());
        bytes[56] = DataUtil.intData2high(params.getOverTemperatureWarnTime());
        /*开门报警延时*/
        bytes[57] = DataUtil.intData2low(params.getOpenDoorWarnTime());
        bytes[58] = DataUtil.intData2high(params.getOpenDoorWarnTime());
        /*PT1000-1/2传感器故障时压缩机工作时间*/
        bytes[59] = DataUtil.intData2low(params.getSensorErrorCompressorWorkTime());
        bytes[60] = DataUtil.intData2high(params.getSensorErrorCompressorWorkTime());
        /*PT1000-1/2传感器故障时压缩机停机时间*/
        bytes[61] = DataUtil.intData2low(params.getSensorErrorCompressorStopTime());
        bytes[62] = DataUtil.intData2high(params.getSensorErrorCompressorStopTime());
        /*冷凝风机工作模式选择*/
        bytes[63] = DataUtil.intData2low(params.getEvaporatorModel());
        bytes[64] = DataUtil.intData2high(params.getEvaporatorModel());
        /*温度数据记录周期*/
        bytes[65] = DataUtil.intData2low(params.getTemperatureDataRecordTime());
        bytes[66] = DataUtil.intData2high(params.getTemperatureDataRecordTime());
        String setRecordingTime = params.getSetRecordingTime();

        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        /*以- 开头*/
        if (setRecordingTime.startsWith("-")) {
            String[] time = setRecordingTime.split("-");
            year = 0 - Integer.parseInt(time[1]);
            month = Integer.parseInt(setRecordingTime.split("-")[2]);
            String timeLeft = setRecordingTime.split("-")[3];
            day = Integer.parseInt(timeLeft.substring(0, timeLeft.indexOf(" ")));
            hour = Integer.parseInt(timeLeft.substring(timeLeft.indexOf(" ") + 1, timeLeft.indexOf(":")));
            minute = Integer.parseInt(timeLeft.substring(timeLeft.indexOf(":") + 1));
        } else {
            year = Integer.parseInt(setRecordingTime.substring(0, setRecordingTime.indexOf("-")));
            month = Integer.parseInt(setRecordingTime.substring(setRecordingTime.indexOf("-") + 1, setRecordingTime.lastIndexOf("-")));
            day = Integer.parseInt(setRecordingTime.substring(setRecordingTime.lastIndexOf("-") + 1, setRecordingTime.indexOf(" ")));
            hour = Integer.parseInt(setRecordingTime.substring(setRecordingTime.indexOf(" ") + 1, setRecordingTime.indexOf(":")));
            minute = Integer.parseInt(setRecordingTime.substring(setRecordingTime.indexOf(":") + 1));
        }
        /*设定记录仪模块的时间   -年*/
        bytes[67] = DataUtil.intData2low(year);
        bytes[68] = DataUtil.intData2high(year);
        /*设定记录仪模块的时间   -月*/
        bytes[69] = DataUtil.intData2low(month);
        bytes[70] = DataUtil.intData2high(month);
        /*设定记录仪模块的时间   -日*/
        bytes[71] = DataUtil.intData2low(day);
        bytes[72] = DataUtil.intData2high(day);
        /*设定记录仪模块的时间   -时*/
        bytes[73] = DataUtil.intData2low(hour);
        bytes[74] = DataUtil.intData2high(hour);
        /*设定记录仪模块的时间   -分*/
        bytes[75] = DataUtil.intData2low(minute);
        bytes[76] = DataUtil.intData2high(minute);
        /*控制电磁阀V1初始状态*/
        bytes[77] = DataUtil.intData2low(params.getV1InitState());
        bytes[78] = DataUtil.intData2high(params.getV1InitState());
        /*V1动作温度点*/
        bytes[79] = DataUtil.doubleData2low(params.getV1OperateTemperature());
        bytes[80] = DataUtil.doubleData2high(params.getV1OperateTemperature());
        /*V1控制偏差*/
        bytes[81] = DataUtil.doubleData2low(params.getV1ControlDeviation());
        bytes[82] = DataUtil.doubleData2high(params.getV1ControlDeviation());
        /*控制电磁阀V2初始状态*/
        bytes[83] = DataUtil.intData2low(params.getV2InitState());
        bytes[84] = DataUtil.intData2high(params.getV2InitState());
        /*V2动作温度点*/
        bytes[85] = DataUtil.doubleData2low(params.getV2OperateTemperature());
        bytes[86] = DataUtil.doubleData2high(params.getV2OperateTemperature());
        /*V2控制偏差*/
        bytes[87] = DataUtil.doubleData2low(params.getV2ControlDeviation());
        bytes[88] = DataUtil.doubleData2high(params.getV2ControlDeviation());
        /*控制电磁阀V3初始状态*/
        bytes[89] = DataUtil.intData2low(params.getV3InitState());
        bytes[90] = DataUtil.intData2high(params.getV3InitState());
        /*压缩机累计/连续运行时间*/
        bytes[91] = DataUtil.intData2low(params.getCompressorRunTime());
        bytes[92] = DataUtil.intData2high(params.getCompressorRunTime());
        /*V3闭合打开时间*/
        bytes[93] = DataUtil.intData2low(params.getV3CloseOpenTime());
        bytes[94] = DataUtil.intData2high(params.getV3CloseOpenTime());
        /*控制电磁阀V4初始状态*/
        bytes[95] = DataUtil.intData2low(params.getV4InitState());
        bytes[96] = DataUtil.intData2high(params.getV4InitState());
        /*V4动作温度点*/
        bytes[97] = DataUtil.doubleData2low(params.getV4OperateTemperature());
        bytes[98] = DataUtil.doubleData2high(params.getV4OperateTemperature());
        /*V4控制偏差*/
        bytes[99] = DataUtil.doubleData2low(params.getV4ControlDeviation());
        bytes[100] = DataUtil.doubleData2high(params.getV4ControlDeviation());
        /*控制电磁阀V5初始状态*/
        bytes[101] = DataUtil.intData2low(params.getV5InitState());
        bytes[102] = DataUtil.intData2high(params.getV5InitState());
        /*V5动作温度点*/
        bytes[103] = DataUtil.doubleData2low(params.getV5OperateTemperature());
        bytes[104] = DataUtil.doubleData2high(params.getV5OperateTemperature());
        /*V5控制偏差*/
        bytes[105] = DataUtil.doubleData2low(params.getV5ControlDeviation());
        bytes[106] = DataUtil.doubleData2high(params.getV5ControlDeviation());
        /*管理员菜单密码设置*/
        bytes[107] = DataUtil.intData2low(params.getAdminMenuPassword());
        bytes[108] = DataUtil.intData2high(params.getAdminMenuPassword());



//        CrcUtil.sendInfoDoCrc();

        byte[] contents = Arrays.copyOfRange(bytes, 0, 109);
        int crc = CrcUtil.doCrc(contents);
        bytes[109] = (byte) crc;

        byte[] tempBytes = {90,2,106,-92,-4,100,0,100,0,0,0,0,0,0,0,0,0,0,0,20,0,104,1,5,0,0,0,0,0,-39,-2,68,1,56,1,51,1,32,3,0,0,0,0,0,0,0,0,20,0,20,0,3,0,1,0,10,0,3,0,30,0,30,0,1,0,10,0,0,-6,0,0,0,0,0,0,0,0,1,0,112,-2,100,0,0,0,116,-6,100,0,0,0,5,0,5,0,0,0,124,-4,100,0,0,0,-120,-6,100,0,22,0};

        StringBuilder stringBuilder = new StringBuilder("");
        for (int index = 0 ; index<tempBytes.length;index++){
            stringBuilder.append(bytes[index]+",");
            if (!judgeEquals(bytes[index],tempBytes[index])){
                System.out.println("有区别 ：index:   "+index+"    "+tempBytes[index]+"    "+bytes[index]);
            }
        }
        stringBuilder.append(crc);
        System.out.println("test:  "+stringBuilder.toString());


        return bytes;
    }

    private static boolean judgeEquals(Object obj1, Object obj2) {
        return (obj1 != null) ? (obj1.equals(obj2)) : (obj2 == null);
    }

}
