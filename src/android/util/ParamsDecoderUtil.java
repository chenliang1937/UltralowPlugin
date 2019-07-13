package com.zkmeiling.serialport.util;

import com.zkmeiling.serialport.model.Message;
import com.zkmeiling.serialport.model.Received;

import java.io.IOException;
import java.text.ParseException;

/**
 * 处理接收到的参数
 */
public class ParamsDecoderUtil {
    public static Message doDecoder(Received received) throws IOException, ParseException, ArrayIndexOutOfBoundsException {
        Message message = ParamsDecoderUtil.getMessage(received);
        return message;

    }

    public static Message getMessage(Received received) throws IOException, ParseException, ArrayIndexOutOfBoundsException {
        Message readParams = new Message();
        byte[] content = received.getContent();
        readParams.setTemperatureSetting(DataUtil.byte2doubleData( content[1],content[0]));
        readParams.setHighTemperatureWarnDeviation(DataUtil.byte2doubleData( content[3],content[2]));
        readParams.setLowTemperatureWarnDeviation(DataUtil.byte2doubleData( content[5],content[4]));
        String currentTime = content[6] + "-" + content[8] + "-" + content[10] + " " + content[12] + ":" + content[14];
        readParams.setCurrentTime(currentTime);
        readParams.setPrintInterval(DataUtil.byte2intData(content[17], content[16]));
        readParams.setEvnHighTemperatureWarn(DataUtil.byte2doubleData( content[19],content[18]));
        readParams.setUserMenuPassword(DataUtil.byte2intData(content[21], content[20]));
        readParams.setHardWareVersion(DataUtil.byte2intData(content[23], content[22]));
        readParams.setSoftWareVersion(DataUtil.byte2intData(content[25], content[24]));
        readParams.setConHighTemperatureWarn(DataUtil.byte2doubleData( content[35],content[34]));
        readParams.setPt10001TemperatureRevise(DataUtil.byte2doubleData( content[37],content[36]));
        readParams.setPt10002TemperatureRevise(DataUtil.byte2doubleData( content[39],content[38]));
        readParams.setEvnTemperatureRevise(DataUtil.byte2doubleData( content[41],content[40]));
        readParams.setConTemperatureRevise(DataUtil.byte2doubleData( content[43],content[42]));
        readParams.setCompressorStartDiff(DataUtil.byte2doubleData( content[45],content[44]));
        readParams.setCompressorStopDiff(DataUtil.byte2doubleData( content[47],content[46]));
        readParams.setCompressorStartInterval(DataUtil.byte2intData(content[49], content[48]));
        readParams.setConCompressorLagTime(DataUtil.byte2intData(content[51], content[50]));
        readParams.setOverTemperatureWarnTime(DataUtil.byte2intData(content[53], content[52]));
        readParams.setOpenDoorWarnTime(DataUtil.byte2intData(content[55], content[54]));
        readParams.setSensorErrorCompressorWorkTime(DataUtil.byte2intData(content[57], content[56]));
        readParams.setSensorErrorCompressorStopTime(DataUtil.byte2intData(content[59], content[58]));
        readParams.setEvaporatorModel(DataUtil.byte2intData(content[61], content[60]));
        readParams.setTemperatureDataRecordTime(DataUtil.byte2intData(content[63], content[62]));
        String setRecordingTime = (DataUtil.byte2intData(content[65], content[64])) + "-" + (DataUtil.byte2intData(content[67], content[66])) + "-" + (DataUtil.byte2intData(content[69], content[68])) + " " + (DataUtil.byte2intData(content[71], content[70])) + ":" + (DataUtil.byte2intData(content[73], content[72]));
        readParams.setSetRecordingTime(setRecordingTime);
        readParams.setV1InitState(DataUtil.byte2intData(content[75], content[74]));
        readParams.setV1OperateTemperature(DataUtil.byte2doubleData( content[77],content[76]));
        readParams.setV1ControlDeviation(DataUtil.byte2doubleData( content[79],content[78]));
        readParams.setV2InitState(DataUtil.byte2intData(content[81], content[80]));
        readParams.setV2OperateTemperature(DataUtil.byte2doubleData( content[83],content[82]));
        readParams.setV2ControlDeviation(DataUtil.byte2doubleData( content[85],content[84]));
        readParams.setV3InitState(DataUtil.byte2intData(content[87], content[86]));
        readParams.setCompressorRunTime(DataUtil.byte2intData(content[89], content[88]));
        readParams.setV3CloseOpenTime(DataUtil.byte2intData(content[91], content[90]));
        readParams.setV4InitState(DataUtil.byte2intData(content[93], content[92]));
        readParams.setV4OperateTemperature(DataUtil.byte2doubleData( content[95],content[94]));
        readParams.setV4ControlDeviation(DataUtil.byte2doubleData( content[97],content[96]));
        readParams.setV5InitState(DataUtil.byte2intData(content[99], content[98]));
        readParams.setV5OperateTemperature(DataUtil.byte2doubleData( content[101],content[100]));
        readParams.setV5ControlDeviation(DataUtil.byte2doubleData( content[103],content[102]));
        readParams.setAdminMenuPassword(DataUtil.byte2intData(content[105], content[104]));
        return readParams;
    }

}
