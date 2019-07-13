var ultralowPlugin = {
    /** 打开串口 */
    openSerialPort: function (arg0, successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'openSerialPort',
            arg0
        );
    },

    /** 关闭串口 */
    closeSerialPort: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'closeSerialPort',
            []
        );
    },

    /** 发送串口指令 */
    sendSerialPort: function (arg0, successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'sendSerialPort',
            [arg0]
        );
    },

    /** 读取串口数据 */
    readSerial: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'readSerial',
            []
        );
    },

    /** 反馈主控板 */
    sendDataInfo: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'sendDataInfo',
            []
        );
    },

    /** 读取参数 */
    sendParamInfo: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'sendParamInfo',
            []
        );
    },

    /** 开电磁锁 */
    openLock: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'UltralowPlugin',
            'openLock',
            []
        );
    }
};

module.exports = ultralowPlugin;