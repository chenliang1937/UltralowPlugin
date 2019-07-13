package com.zkmeiling.serialport.model;

public class ReadParams {

    /*帧头*/
    private Integer head;
    /*功能码*/
    private Integer dataType;
    /*字节数*/
    private Integer length;
    /*温度设定*/
    private Double temperatureSetting;
    /*高温报警偏差*/
    private Double highTemperatureWarnDeviation;
    /*低温报警偏差*/
    private Double lowTemperatureWarnDeviation;
    /*当前时间*/
    private String currentTime;
    /*打印间隔*/
    private Integer printInterval;
    /*环温高温报警值*/
    private Double evnHighTemperatureWarn;
    /*用户菜单密码设置*/
    private Integer userMenuPassword;
    /*硬件版本*/
    private Integer hardWareVersion;
    /*软件版本*/
    private Integer softWareVersion;
    /*冷凝传感器高温报警值*/
    private Double conHighTemperatureWarn;
    /*PT1000-1传感器温度校正*/
    private Double pt10001TemperatureRevise;
    /*PT1000-2传感器温度校正*/
    private Double pt10002TemperatureRevise;
    /*环境传感器温度校正*/
    private Double evnTemperatureRevise;
    /*冷凝器传感器温度校正*/
    private Double conTemperatureRevise;
    /*压缩机开机回差*/
    private Double compressorStartDiff;
    /*压缩机停机回差*/
    private Double compressorStopDiff;
    /*压缩机启动间隔*/
    private Integer compressorStartInterval;
    /*冷凝风机滞后压缩机停机时间*/
    private Integer conCompressorLagTime;
    /*超温报警延时*/
    private Integer overTemperatureWarnTime;
    /*开门报警延时*/
    private Integer openDoorWarnTime;
    /*PT1000-1/2传感器故障时压缩机工作时间*/
    private Integer sensorErrorCompressorWorkTime;
    /*PT1000-1/2传感器故障时压缩机停机时间*/
    private Integer sensorErrorCompressorStopTime;
    /*冷凝风机工作模式选择*/
    private Integer evaporatorModel;
    /*温度数据记录周期*/
    private Integer temperatureDataRecordTime;
    /*设定记录仪模块的时间*/
    private String setRecordingTime;
    /*控制电磁阀V1初始状态*/
    private Integer v1InitState;
    /*V1动作温度点*/
    private double v1OperateTemperature;
    /*V1控制偏差*/
    private double v1ControlDeviation;
    /*控制电磁阀V2初始状态*/
    private Integer v2InitState;
    /*V2动作温度点*/
    private double v2OperateTemperature;
    /*V2控制偏差*/
    private double v2ControlDeviation;
    /*控制电磁阀V3初始状态*/
    private Integer v3InitState;
    /*压缩机累计/连续运行时间*/
    private Integer compressorRunTime;
    /*V3闭合打开时间*/
    private Integer v3CloseOpenTime;
    /*控制电磁阀V4初始状态*/
    private Integer v4InitState;
    /*V4动作温度点*/
    private double v4OperateTemperature;
    /*V4控制偏差*/
    private double v4ControlDeviation;
    /*控制电磁阀V5初始状态*/
    private Integer v5InitState;
    /*V5动作温度点*/
    private double v5OperateTemperature;
    /*V5控制偏差*/
    private double v5ControlDeviation;
    /*管理员菜单密码设置*/
    private Integer adminMenuPassword;
    /*CRC8*/
    private Integer crc8;

    /*接收参数时间*/
    private String receivedTime;

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getTemperatureSetting() {
        return temperatureSetting;
    }

    public void setTemperatureSetting(Double temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    public Double getHighTemperatureWarnDeviation() {
        return highTemperatureWarnDeviation;
    }

    public void setHighTemperatureWarnDeviation(Double highTemperatureWarnDeviation) {
        this.highTemperatureWarnDeviation = highTemperatureWarnDeviation;
    }

    public Double getLowTemperatureWarnDeviation() {
        return lowTemperatureWarnDeviation;
    }

    public void setLowTemperatureWarnDeviation(Double lowTemperatureWarnDeviation) {
        this.lowTemperatureWarnDeviation = lowTemperatureWarnDeviation;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public Integer getPrintInterval() {
        return printInterval;
    }

    public void setPrintInterval(Integer printInterval) {
        this.printInterval = printInterval;
    }

    public Double getEvnHighTemperatureWarn() {
        return evnHighTemperatureWarn;
    }

    public void setEvnHighTemperatureWarn(Double evnHighTemperatureWarn) {
        this.evnHighTemperatureWarn = evnHighTemperatureWarn;
    }

    public Integer getUserMenuPassword() {
        return userMenuPassword;
    }

    public void setUserMenuPassword(Integer userMenuPassword) {
        this.userMenuPassword = userMenuPassword;
    }

    public Integer getHardWareVersion() {
        return hardWareVersion;
    }

    public void setHardWareVersion(Integer hardWareVersion) {
        this.hardWareVersion = hardWareVersion;
    }

    public Integer getSoftWareVersion() {
        return softWareVersion;
    }

    public void setSoftWareVersion(Integer softWareVersion) {
        this.softWareVersion = softWareVersion;
    }

    public Double getConHighTemperatureWarn() {
        return conHighTemperatureWarn;
    }

    public void setConHighTemperatureWarn(Double conHighTemperatureWarn) {
        this.conHighTemperatureWarn = conHighTemperatureWarn;
    }

    public Double getPt10001TemperatureRevise() {
        return pt10001TemperatureRevise;
    }

    public void setPt10001TemperatureRevise(Double pt10001TemperatureRevise) {
        this.pt10001TemperatureRevise = pt10001TemperatureRevise;
    }

    public Double getPt10002TemperatureRevise() {
        return pt10002TemperatureRevise;
    }

    public void setPt10002TemperatureRevise(Double pt10002TemperatureRevise) {
        this.pt10002TemperatureRevise = pt10002TemperatureRevise;
    }

    public Double getEvnTemperatureRevise() {
        return evnTemperatureRevise;
    }

    public void setEvnTemperatureRevise(Double evnTemperatureRevise) {
        this.evnTemperatureRevise = evnTemperatureRevise;
    }

    public Double getConTemperatureRevise() {
        return conTemperatureRevise;
    }

    public void setConTemperatureRevise(Double conTemperatureRevise) {
        this.conTemperatureRevise = conTemperatureRevise;
    }

    public Double getCompressorStartDiff() {
        return compressorStartDiff;
    }

    public void setCompressorStartDiff(Double compressorStartDiff) {
        this.compressorStartDiff = compressorStartDiff;
    }

    public Double getCompressorStopDiff() {
        return compressorStopDiff;
    }

    public void setCompressorStopDiff(Double compressorStopDiff) {
        this.compressorStopDiff = compressorStopDiff;
    }

    public Integer getCompressorStartInterval() {
        return compressorStartInterval;
    }

    public void setCompressorStartInterval(Integer compressorStartInterval) {
        this.compressorStartInterval = compressorStartInterval;
    }

    public Integer getConCompressorLagTime() {
        return conCompressorLagTime;
    }

    public void setConCompressorLagTime(Integer conCompressorLagTime) {
        this.conCompressorLagTime = conCompressorLagTime;
    }

    public Integer getOverTemperatureWarnTime() {
        return overTemperatureWarnTime;
    }

    public void setOverTemperatureWarnTime(Integer overTemperatureWarnTime) {
        this.overTemperatureWarnTime = overTemperatureWarnTime;
    }

    public Integer getOpenDoorWarnTime() {
        return openDoorWarnTime;
    }

    public void setOpenDoorWarnTime(Integer openDoorWarnTime) {
        this.openDoorWarnTime = openDoorWarnTime;
    }

    public Integer getSensorErrorCompressorWorkTime() {
        return sensorErrorCompressorWorkTime;
    }

    public void setSensorErrorCompressorWorkTime(Integer sensorErrorCompressorWorkTime) {
        this.sensorErrorCompressorWorkTime = sensorErrorCompressorWorkTime;
    }

    public Integer getSensorErrorCompressorStopTime() {
        return sensorErrorCompressorStopTime;
    }

    public void setSensorErrorCompressorStopTime(Integer sensorErrorCompressorStopTime) {
        this.sensorErrorCompressorStopTime = sensorErrorCompressorStopTime;
    }

    public Integer getEvaporatorModel() {
        return evaporatorModel;
    }

    public void setEvaporatorModel(Integer evaporatorModel) {
        this.evaporatorModel = evaporatorModel;
    }

    public Integer getTemperatureDataRecordTime() {
        return temperatureDataRecordTime;
    }

    public void setTemperatureDataRecordTime(Integer temperatureDataRecordTime) {
        this.temperatureDataRecordTime = temperatureDataRecordTime;
    }

    public String getSetRecordingTime() {
        return setRecordingTime;
    }

    public void setSetRecordingTime(String setRecordingTime) {
        this.setRecordingTime = setRecordingTime;
    }

    public Integer getV1InitState() {
        return v1InitState;
    }

    public void setV1InitState(Integer v1InitState) {
        this.v1InitState = v1InitState;
    }

    public double getV1OperateTemperature() {
        return v1OperateTemperature;
    }

    public void setV1OperateTemperature(double v1OperateTemperature) {
        this.v1OperateTemperature = v1OperateTemperature;
    }

    public double getV1ControlDeviation() {
        return v1ControlDeviation;
    }

    public void setV1ControlDeviation(double v1ControlDeviation) {
        this.v1ControlDeviation = v1ControlDeviation;
    }

    public Integer getV2InitState() {
        return v2InitState;
    }

    public void setV2InitState(Integer v2InitState) {
        this.v2InitState = v2InitState;
    }

    public double getV2OperateTemperature() {
        return v2OperateTemperature;
    }

    public void setV2OperateTemperature(double v2OperateTemperature) {
        this.v2OperateTemperature = v2OperateTemperature;
    }

    public double getV2ControlDeviation() {
        return v2ControlDeviation;
    }

    public void setV2ControlDeviation(double v2ControlDeviation) {
        this.v2ControlDeviation = v2ControlDeviation;
    }

    public Integer getV3InitState() {
        return v3InitState;
    }

    public void setV3InitState(Integer v3InitState) {
        this.v3InitState = v3InitState;
    }

    public Integer getCompressorRunTime() {
        return compressorRunTime;
    }

    public void setCompressorRunTime(Integer compressorRunTime) {
        this.compressorRunTime = compressorRunTime;
    }

    public Integer getV3CloseOpenTime() {
        return v3CloseOpenTime;
    }

    public void setV3CloseOpenTime(Integer v3CloseOpenTime) {
        this.v3CloseOpenTime = v3CloseOpenTime;
    }

    public Integer getV4InitState() {
        return v4InitState;
    }

    public void setV4InitState(Integer v4InitState) {
        this.v4InitState = v4InitState;
    }

    public double getV4OperateTemperature() {
        return v4OperateTemperature;
    }

    public void setV4OperateTemperature(double v4OperateTemperature) {
        this.v4OperateTemperature = v4OperateTemperature;
    }

    public double getV4ControlDeviation() {
        return v4ControlDeviation;
    }

    public void setV4ControlDeviation(double v4ControlDeviation) {
        this.v4ControlDeviation = v4ControlDeviation;
    }

    public Integer getV5InitState() {
        return v5InitState;
    }

    public void setV5InitState(Integer v5InitState) {
        this.v5InitState = v5InitState;
    }

    public double getV5OperateTemperature() {
        return v5OperateTemperature;
    }

    public void setV5OperateTemperature(double v5OperateTemperature) {
        this.v5OperateTemperature = v5OperateTemperature;
    }

    public double getV5ControlDeviation() {
        return v5ControlDeviation;
    }

    public void setV5ControlDeviation(double v5ControlDeviation) {
        this.v5ControlDeviation = v5ControlDeviation;
    }

    public Integer getAdminMenuPassword() {
        return adminMenuPassword;
    }

    public void setAdminMenuPassword(Integer adminMenuPassword) {
        this.adminMenuPassword = adminMenuPassword;
    }

    public Integer getCrc8() {
        return crc8;
    }

    public void setCrc8(Integer crc8) {
        this.crc8 = crc8;
    }

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }
}
