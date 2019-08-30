#### 超低温冰箱通信插件

**安装**

cordova plugin add ultralow-plugin

**使用**

1.打开串口

ultralowPlugin.openSerialPort(arg0, successCallback, errorCallback);

2.关闭串口

ultralowPlugin.closeSerialPort(successCallback, errorCallback);

3.发送串口指令	-向串口发送数据 (**所有参数的json字符串**)

ultralowPlugin.sendSerialPort(arg0, successCallback, errorCallback);

4.读取串口数据	-读取串口发出数据

ultralowPlugin.readSerial(successCallback, errorCallback);

5.反馈主控板	-读取到串口数据后需要反馈主控板一次，否则控制板会报通信故障

ultralowPlugin.sendDataInfo(successCallback, errorCallback);

6.读取参数	-读取控制板参数需要发送该指令

ultralowPlugin.sendParamInfo(successCallback, errorCallback);

7.开电磁锁

ultralowPlugin.openLock(successCallback, errorCallback);

**示例**

    onDeviceReady: function() {
        ultralowPlugin.openSerialPort(["/dev/ttyS1", 9600], function(success) {
            alert(success);
            ultralowPlugin.readSerial(function(data){
                alert(data);
                //反馈主控板
                ultralowPlugin.sendDataInfo(function(s){}, function(e){});
                var obj = JSON.parse(data);
                if(obj.sourceDataState == 1) {
                    //数据正常
                    if(obj.type == 1) {
                        //获取冰箱运行状态数据
                    }else if(obj.type == 2) {
                        //获取参数设置
                    }
                }else if(obj.sourceDataState == 99) {
                    //crc解析错误
                }
            }, function(error) {
                alert(error);
            })
        }, function(error) {
            alert(error);
        });
    },

**运行数据**

```
	/**
     * 温度1
     */
    private Double temperature1;
    /**
     * 温度2
     */
    private Double temperature2;
    /**
     * 平均温度		可直接使用此温度表示箱内温度
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

    private Integer sourceDataState;
    /**
     * 门开关状态	1-门开 0-门关
     */
    private Integer doorOpenState;
    /**
     * 是否断电		1-断电 0-未断电
     */
    private Integer isPowerOn;
    /**
     * 制冷开关		1-制冷开 0-制冷关
     */
    private Integer isCoolingOn;
    /**
     * 电池电量状态		1-电量低 0-电量正常
     */
    private Integer batteryState;
    /**
     * Pt1000-1传感器状态	1-故障 0-正常
     */
    private Integer temperature1State;
    /**
     * Pt1000-2传感器状态	1-故障 0-正常
     */
    private Integer temperature2State;
    /**
     * 冷凝器传感器状态		1-故障 0-正常
     */
    private Integer condenserSensorState;
    /**
     * 环境传感器状态		1-故障 0-正常
     */
    private Integer environmentSensorState;
    /**
     * 箱内温度高温报警状态	1-报警 0-正常
     */
    private Integer temperature1HighWarn;
    /**
     * 箱内温度低温报警状态	1-报警 0-正常
     */
    private Integer temperature1LowWarn;
    /**
     * 环境温度高温报警状态	1-报警 0-正常
     */
    private Integer environmentTemperatureHighWarn;
    /**
     * 冷凝器温度高温报警状态	1-报警 0-正常
     */
    private Integer condenserTemperateHighWarn;
    /**
     * 门长时间打开报警状态	1-报警 0-正常
     */
    private Integer doorOpenTimeout;
    /**
     * 电源电压检测故障状态	1-故障 0-正常
     */
    private Integer powerVoltageState;
    /**
     * 主控板通信故障状态	1-故障 0-正常
     */
    private Integer correspondenceState;
    /**
     * 电池电量检测故障状态状态	1-故障 0-正常
     */
    private Integer batteryDetectionState;
    /**
     * 锁开关状态	1-锁开 0-锁关
     */
    private Integer lockState;
    /**
     * 风机状态		1-开 0-关
     */
    private Integer fanState;
    /**
     * 加热器1状态	1-开 0-关
     */
    private Integer heater1State;
    /**
     * 加热器2状态	1-开 0-关
     */
    private Integer heater2State;
    /**
     * 压力开关状态	1-开 0-关
     */
    private Integer pressureState;
```



**设置参数**
*用户一般只需要设置：温度设定、高温报警偏差、低温报警偏差、环温高温报警值，但是设置时所有值都要传，其他值收到什么传什么。*
    

```
	/*温度设定*/
    private Double temperatureSetting;
    /*高温报警偏差*/
    private Double highTemperatureWarnDeviation;
    /*低温报警偏差*/
    private Double lowTemperatureWarnDeviation;
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
```


