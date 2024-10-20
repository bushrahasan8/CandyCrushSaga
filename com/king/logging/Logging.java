package com.king.logging;

import androidx.annotation.Keep;
import com.ironsource.t2;
import java.io.PrintWriter;
import java.io.StringWriter;

@Keep
/* loaded from: Logging.class */
public class Logging {
    public static final boolean LOGGING = false;
    public static final String TAG = "FictionFactory";

    private Logging() {
        throw new IllegalStateException("Utility class");
    }

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

    private static native void logDebug(String str);

    public static void logDebug(String str, String str2) {
        try {
            logDebug(str + ": " + getCallerInfo() + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
        }
    }

    private static native void logError(String str);

    public static void logError(String str, String str2) {
        try {
            logError(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
        }
    }

    public static void logException(String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        try {
            logWarning(str + " Error:" + exc.getMessage() + " StackTrace:" + stringWriter.toString());
        } catch (UnsatisfiedLinkError e) {
        }
    }

    private static native void logInfo(String str);

    public static void logInfo(String str, String str2) {
        try {
            logInfo(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
        }
    }

    private static native void logWarning(String str);

    public static void logWarning(String str, String str2) {
        try {
            logWarning(str + ": " + str2);
        } catch (UnsatisfiedLinkError e) {
        }
    }
}
