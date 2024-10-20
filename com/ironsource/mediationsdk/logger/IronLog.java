package com.ironsource.mediationsdk.logger;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: IronLog.class */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);

    IronSourceLogger.IronSourceTag a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.a = ironSourceTag;
    }

    private String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return String.format("%s %s", a(stackTrace, 5), b(stackTrace, 5));
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? a() : String.format("%s - %s", a(), str);
    }

    private String a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String[] split = stackTraceElementArr[i].getClassName().split("\\.");
        String str = split[split.length - 1];
        String str2 = str;
        if (str.contains("$")) {
            str2 = str.split("\\$")[0];
        }
        return str2;
    }

    private String b(StackTraceElement[] stackTraceElementArr, int i) {
        StackTraceElement stackTraceElement;
        String methodName;
        int i2;
        if (stackTraceElementArr.length <= i) {
            return "";
        }
        String[] split = stackTraceElementArr[i].getClassName().split("\\.");
        String str = split[split.length - 1];
        if (str.contains("$")) {
            methodName = str.split("\\$")[1] + "." + stackTraceElementArr[i].getMethodName();
        } else {
            if (!stackTraceElementArr[i].getMethodName().contains("$") || stackTraceElementArr.length <= (i2 = i + 1)) {
                stackTraceElement = stackTraceElementArr[i];
            } else {
                String[] split2 = stackTraceElementArr[i2].getClassName().split("\\$");
                if (split2.length > 1) {
                    methodName = split2[1] + "." + stackTraceElementArr[i2].getMethodName();
                } else {
                    stackTraceElement = stackTraceElementArr[i2];
                }
            }
            methodName = stackTraceElement.getMethodName();
        }
        return methodName;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().log(this.a, a(""), 3);
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().log(this.a, a(str), 3);
    }

    public void info() {
        IronSourceLoggerManager.getLogger().log(this.a, a(""), 1);
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().log(this.a, a(str), 1);
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().log(this.a, a(""), 0);
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().log(this.a, a(str), 0);
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().log(this.a, a(""), 2);
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().log(this.a, a(str), 2);
    }
}
