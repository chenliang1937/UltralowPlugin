package com.zkmeiling.serialport.model;

import java.util.Date;
import java.util.List;

public class Message extends ReadParams {

    /**
     * 业务数据类型
     */
    public static final int BUSINESS_TYPE = 1;

    /*数据类型*/
    private Integer type;

    /**
     * 温度1
     */
    private Double temperature1;
    /**
     * 温度2
     */
    private Double temperature2;
    /**
     * 平均温度
     */
    private Double averageTemperate;
    /**
     * 冷凝器温度
     */
    private Double condenserTemperate;
    /**
     * 环境温度
     */
    private Double environmentTemperature;
    /**
     * 记录时间
     */
    private Date recordTime;
    /**
     * 接收时间
     */
    private Date receiveTime;
    /**
     * 记录仪状态
     * 0：记录仪正常；1：记录仪停止；2：记录仪故障
     */
    private Integer recodingState;
    /**
     * U盘导出数据状态
     * 0：无U盘；1：正在导出数据；2：数据导出结束
     */
    private Integer exportFileState;

    private String sourceData;

    private Integer sourceDataState;
    private String sourceDataStateDesc;

    List<MessageState> messageStates;

    /**
     * 门开关状态
     */
    private Integer doorOpenState;

    /**
     * 是否断电：
     */
    private Integer isPowerOn;

    /**
     * wifi：
     */
    private Integer isWifiOn;

    /**
     * 制冷开关：
     */
    private Integer isCoolingOn;

    /**
     * 电量状态
     */
    private Integer batteryState;

    /**
     * 打印状态
     */
    private Integer printState;

    /**
     * RS485连接状态
     */
    private Integer rs485connectState;

    /**
     * Pt1000-1传感器状态
     */
    private Integer temperature1State;
    /**
     * Pt1000-2传感器状态
     */
    private Integer temperature2State;
    /**
     * 冷凝器传感器状态
     */
    private Integer condenserSensorState;
    /**
     * 环境传感器状态
     */
    private Integer environmentSensorState;

    /**
     * Pt1000-1温度高温报警状态：
     */
    private Integer temperature1HighWarn;
    /**
     * Pt1000-1温度低温报警状态
     */
    private Integer temperature1LowWarn;

    /**
     * 环境温度高温报警状态
     */
    private Integer environmentTemperatureHighWarn;

    /**
     * 冷凝器温度高温报警状态
     */
    private Integer condenserTemperateHighWarn;

    /**
     * 门长时间打开报警状态
     */
    private Integer doorOpenTimeout;


    /**
     * 接收到手动打印状态
     */
    private Integer manualPrintState;

    /**
     * 电源电压检测故障状态
     */
    private Integer powerVoltageState;

    /**
     * 主控板通信故障状态
     */
    private Integer correspondenceState;

    /**
     * 电池电量检测故障状态状态：
     */
    private Integer batteryDetectionState;

    /**
     * 蜂鸣器鸣叫状态
     */
    private Integer buzzerState;

    /**
     * USB导出pdf文件结束标志：
     */
    private Integer exportUsbFileState;

    /**
     * USB通信故障状态
     */
    private Integer usbCorrespondenceState;

    /**
     * 取消静音状态
     */
    private Integer muteState;

    /**
     * 锁开关状态
     */
    private Integer lockState;

    /**
     * 风机状态
     */
    private Integer fanState;

    /**
     * 加热器1状态
     */
    private Integer heater1State;

    /**
     * 加热器2状态
     */
    private Integer heater2State;

    /**
     * 压力开关状态
     */
    private Integer pressureState;

    /**
     * 疫苗箱锁状态
     */
    private Integer lock1;
    private Integer lock2;
    private Integer lock3;
    private Integer lock4;
    private Integer lock5;
    private Integer lock6;

    public static int getBusinessType() {
        return BUSINESS_TYPE;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getTemperature1() {
        return temperature1;
    }

    public void setTemperature1(Double temperature1) {
        this.temperature1 = temperature1;
    }

    public Double getTemperature2() {
        return temperature2;
    }

    public void setTemperature2(Double temperature2) {
        this.temperature2 = temperature2;
    }

    public Double getAverageTemperate() {
        return averageTemperate;
    }

    public void setAverageTemperate(Double averageTemperate) {
        this.averageTemperate = averageTemperate;
    }

    public Double getCondenserTemperate() {
        return condenserTemperate;
    }

    public void setCondenserTemperate(Double condenserTemperate) {
        this.condenserTemperate = condenserTemperate;
    }

    public Double getEnvironmentTemperature() {
        return environmentTemperature;
    }

    public void setEnvironmentTemperature(Double environmentTemperature) {
        this.environmentTemperature = environmentTemperature;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getRecodingState() {
        return recodingState;
    }

    public void setRecodingState(Integer recodingState) {
        this.recodingState = recodingState;
    }

    public Integer getExportFileState() {
        return exportFileState;
    }

    public void setExportFileState(Integer exportFileState) {
        this.exportFileState = exportFileState;
    }

    public String getSourceData() {
        return sourceData;
    }

    public void setSourceData(String sourceData) {
        this.sourceData = sourceData;
    }

    public Integer getSourceDataState() {
        return sourceDataState;
    }

    public void setSourceDataState(Integer sourceDataState) {
        this.sourceDataState = sourceDataState;
    }

    public String getSourceDataStateDesc() {
        return sourceDataStateDesc;
    }

    public void setSourceDataStateDesc(String sourceDataStateDesc) {
        this.sourceDataStateDesc = sourceDataStateDesc;
    }

    public List<MessageState> getMessageStates() {
        return messageStates;
    }

    public void setMessageStates(List<MessageState> messageStates) {
        this.messageStates = messageStates;
    }

    public Integer getDoorOpenState() {
        return doorOpenState;
    }

    public void setDoorOpenState(Integer doorOpenState) {
        this.doorOpenState = doorOpenState;
    }

    public Integer getIsPowerOn() {
        return isPowerOn;
    }

    public void setIsPowerOn(Integer isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public Integer getIsWifiOn() {
        return isWifiOn;
    }

    public void setIsWifiOn(Integer isWifiOn) {
        this.isWifiOn = isWifiOn;
    }

    public Integer getIsCoolingOn() {
        return isCoolingOn;
    }

    public void setIsCoolingOn(Integer isCoolingOn) {
        this.isCoolingOn = isCoolingOn;
    }

    public Integer getBatteryState() {
        return batteryState;
    }

    public void setBatteryState(Integer batteryState) {
        this.batteryState = batteryState;
    }

    public Integer getPrintState() {
        return printState;
    }

    public void setPrintState(Integer printState) {
        this.printState = printState;
    }

    public Integer getRs485connectState() {
        return rs485connectState;
    }

    public void setRs485connectState(Integer rs485connectState) {
        this.rs485connectState = rs485connectState;
    }

    public Integer getTemperature1State() {
        return temperature1State;
    }

    public void setTemperature1State(Integer temperature1State) {
        this.temperature1State = temperature1State;
    }

    public Integer getTemperature2State() {
        return temperature2State;
    }

    public void setTemperature2State(Integer temperature2State) {
        this.temperature2State = temperature2State;
    }

    public Integer getCondenserSensorState() {
        return condenserSensorState;
    }

    public void setCondenserSensorState(Integer condenserSensorState) {
        this.condenserSensorState = condenserSensorState;
    }

    public Integer getEnvironmentSensorState() {
        return environmentSensorState;
    }

    public void setEnvironmentSensorState(Integer environmentSensorState) {
        this.environmentSensorState = environmentSensorState;
    }

    public Integer getTemperature1HighWarn() {
        return temperature1HighWarn;
    }

    public void setTemperature1HighWarn(Integer temperature1HighWarn) {
        this.temperature1HighWarn = temperature1HighWarn;
    }

    public Integer getTemperature1LowWarn() {
        return temperature1LowWarn;
    }

    public void setTemperature1LowWarn(Integer temperature1LowWarn) {
        this.temperature1LowWarn = temperature1LowWarn;
    }

    public Integer getEnvironmentTemperatureHighWarn() {
        return environmentTemperatureHighWarn;
    }

    public void setEnvironmentTemperatureHighWarn(Integer environmentTemperatureHighWarn) {
        this.environmentTemperatureHighWarn = environmentTemperatureHighWarn;
    }

    public Integer getCondenserTemperateHighWarn() {
        return condenserTemperateHighWarn;
    }

    public void setCondenserTemperateHighWarn(Integer condenserTemperateHighWarn) {
        this.condenserTemperateHighWarn = condenserTemperateHighWarn;
    }

    public Integer getDoorOpenTimeout() {
        return doorOpenTimeout;
    }

    public void setDoorOpenTimeout(Integer doorOpenTimeout) {
        this.doorOpenTimeout = doorOpenTimeout;
    }

    public Integer getManualPrintState() {
        return manualPrintState;
    }

    public void setManualPrintState(Integer manualPrintState) {
        this.manualPrintState = manualPrintState;
    }

    public Integer getPowerVoltageState() {
        return powerVoltageState;
    }

    public void setPowerVoltageState(Integer powerVoltageState) {
        this.powerVoltageState = powerVoltageState;
    }

    public Integer getCorrespondenceState() {
        return correspondenceState;
    }

    public void setCorrespondenceState(Integer correspondenceState) {
        this.correspondenceState = correspondenceState;
    }

    public Integer getBatteryDetectionState() {
        return batteryDetectionState;
    }

    public void setBatteryDetectionState(Integer batteryDetectionState) {
        this.batteryDetectionState = batteryDetectionState;
    }

    public Integer getBuzzerState() {
        return buzzerState;
    }

    public void setBuzzerState(Integer buzzerState) {
        this.buzzerState = buzzerState;
    }

    public Integer getExportUsbFileState() {
        return exportUsbFileState;
    }

    public void setExportUsbFileState(Integer exportUsbFileState) {
        this.exportUsbFileState = exportUsbFileState;
    }

    public Integer getUsbCorrespondenceState() {
        return usbCorrespondenceState;
    }

    public void setUsbCorrespondenceState(Integer usbCorrespondenceState) {
        this.usbCorrespondenceState = usbCorrespondenceState;
    }

    public Integer getMuteState() {
        return muteState;
    }

    public void setMuteState(Integer muteState) {
        this.muteState = muteState;
    }

    public Integer getLockState() {
        return lockState;
    }

    public void setLockState(Integer lockState) {
        this.lockState = lockState;
    }

    public Integer getFanState() {
        return fanState;
    }

    public void setFanState(Integer fanState) {
        this.fanState = fanState;
    }

    public Integer getHeater1State() {
        return heater1State;
    }

    public void setHeater1State(Integer heater1State) {
        this.heater1State = heater1State;
    }

    public Integer getHeater2State() {
        return heater2State;
    }

    public void setHeater2State(Integer heater2State) {
        this.heater2State = heater2State;
    }

    public Integer getPressureState() {
        return pressureState;
    }

    public void setPressureState(Integer pressureState) {
        this.pressureState = pressureState;
    }

    public Integer getLock1() {
        return lock1;
    }

    public void setLock1(Integer lock1) {
        this.lock1 = lock1;
    }

    public Integer getLock2() {
        return lock2;
    }

    public void setLock2(Integer lock2) {
        this.lock2 = lock2;
    }

    public Integer getLock3() {
        return lock3;
    }

    public void setLock3(Integer lock3) {
        this.lock3 = lock3;
    }

    public Integer getLock4() {
        return lock4;
    }

    public void setLock4(Integer lock4) {
        this.lock4 = lock4;
    }

    public Integer getLock5() {
        return lock5;
    }

    public void setLock5(Integer lock5) {
        this.lock5 = lock5;
    }

    public Integer getLock6() {
        return lock6;
    }

    public void setLock6(Integer lock6) {
        this.lock6 = lock6;
    }
}
