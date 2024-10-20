package com.king.usdk.facebook.sdk;

import androidx.annotation.Keep;
import java.io.PrintWriter;
import java.io.StringWriter;

@Keep
/* loaded from: Logger.class */
public class Logger {
    private static String className() {
        String className = Thread.currentThread().getStackTrace()[3].getClassName();
        return className.substring(className.lastIndexOf(".") + 1) + "." + Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static void d(long j, String str) {
        logd(j, line(), className(), str);
    }

    public static void e(long j, String str) {
        loge(j, line(), className(), str);
    }

    public static void exception(long j, String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        w(j, str + " Error:" + exc.getMessage() + " StackTrace:" + stringWriter.toString());
    }

    public static void i(long j, String str) {
        logi(j, line(), className(), str);
    }

    private static int line() {
        return Thread.currentThread().getStackTrace()[3].getLineNumber();
    }

    private static native void logd(long j, long j2, String str, String str2);

    private static native void loge(long j, long j2, String str, String str2);

    private static native void logi(long j, long j2, String str, String str2);

    private static native void logw(long j, long j2, String str, String str2);

    public static void w(long j, String str) {
        logw(j, line(), className(), str);
    }
}
