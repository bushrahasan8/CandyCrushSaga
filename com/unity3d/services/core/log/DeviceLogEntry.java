package com.unity3d.services.core.log;

/* loaded from: DeviceLogEntry.class */
class DeviceLogEntry {
    private DeviceLogLevel _logLevel;
    private String _originalMessage;
    private StackTraceElement _stackTraceElement;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel, String str, StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        String str;
        String str2;
        int i;
        String str3 = this._originalMessage;
        StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
            str2 = this._stackTraceElement.getMethodName();
            i = this._stackTraceElement.getLineNumber();
        } else {
            str = "UnknownClass";
            str2 = "unknownMethod";
            i = -1;
        }
        String str4 = str3;
        if (str3 != null) {
            str4 = str3;
            if (!str3.isEmpty()) {
                str4 = " :: " + str3;
            }
        }
        String str5 = str4;
        if (str4 == null) {
            str5 = "";
        }
        return str + "." + str2 + "()" + (" (line:" + i + ")") + str5;
    }
}
