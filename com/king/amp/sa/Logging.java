package com.king.amp.sa;

import android.util.Log;
import androidx.annotation.Keep;
import com.ironsource.t2;
import java.io.PrintWriter;
import java.io.StringWriter;

@Keep
/* loaded from: Logging.class */
public class Logging {
    public static final String TAG = "ABM";

    public static String getCallerInfo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 1; i < stackTrace.length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.getClassName().equals(Logging.class.getName()) && stackTraceElement.getClassName().indexOf("java.lang.Thread") != 0) {
                return stackTraceElement.getClassName() + ": " + stackTraceElement.getFileName() + "(" + stackTraceElement.getLineNumber() + ")[" + stackTraceElement.getMethodName() + t2.i.e;
            }
        }
        return "";
    }

    private static native void logBreadcrumb(String str);

    public static void logBreadcrumb(String str, String str2) {
        try {
            logBreadcrumb(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
            Log.d(str, str2);
        }
    }

    private static native void logDebug(String str);

    public static void logDebug(String str, String str2) {
        try {
            logDebug(str + ": " + getCallerInfo() + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
            Log.d(str, str2);
        }
    }

    private static native void logError(String str);

    public static void logError(String str, String str2) {
        try {
            logError(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
            Log.e(str, str2);
        }
    }

    public static void logException(String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String str2 = str + " ErrorApi:" + exc.getMessage() + " StackTrace:" + stringWriter.toString();
        try {
            logWarning(str2);
        } catch (UnsatisfiedLinkError e) {
            Log.w(TAG, str2);
        }
    }

    private static native void logInfo(String str);

    public static void logInfo(String str, String str2) {
        try {
            logInfo(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
            Log.i(str, str2);
        }
    }

    private static native void logWarning(String str);

    public static void logWarning(String str, String str2) {
        try {
            logWarning(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
            Log.w(str, str2);
        }
    }
}
