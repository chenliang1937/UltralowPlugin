#### 超低温冰箱通信插件

**安装**

cordova plugin add ultralow-plugin

**使用**

1.打开串口

ultralowPlugin.openSerialPort(arg0, successCallback, errorCallback);

2.关闭串口

ultralowPlugin.closeSerialPort(successCallback, errorCallback);

3.发送串口指令	-向串口发送数据 (string类型)

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



