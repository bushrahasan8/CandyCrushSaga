package com.king.core;

import android.content.Context;
import androidx.annotation.Keep;
import java.lang.Thread;

@Keep
/* loaded from: UncaughtExceptionWriter.class */
public class UncaughtExceptionWriter implements Thread.UncaughtExceptionHandler {
    static volatile String mBuildId;
    static volatile boolean mEnabled = false;
    static volatile boolean mShuttingDown = false;
    private final String mPackageVersionName;
    private final Thread.UncaughtExceptionHandler mPreviousHandler = Thread.getDefaultUncaughtExceptionHandler();

    public UncaughtExceptionWriter(Context context) {
        this.mPackageVersionName = AndroidCallstackUtils.getPackageVersionName(context);
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void appendBacktrace(StringBuilder sb, Throwable th) {
        sb.append("[backtrace]\n");
        while (th != null) {
            try {
                sb.append("Caused by: ");
                sb.append(th.getMessage());
                sb.append("\n");
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    sb.append("\t");
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
                th = th.getCause();
            } catch (Exception e) {
                sb.append("Error writing back trace\n");
                return;
            }
        }
    }

    private void appendOther(StringBuilder sb, Thread thread, Throwable th) {
        sb.append("[other]\n");
        try {
            sb.append("Uncaught Java exception\n");
            sb.append("Name: ");
            sb.append(th.getClass().getName());
            sb.append("\n");
            sb.append("Thread: ");
            sb.append(thread.getName());
            sb.append("\n");
            if (th.getCause() != null) {
                sb.append("Cause: ");
                sb.append(th.getCause().getClass().getName());
                sb.append("\n");
            }
            sb.append("Message: ");
            sb.append(th.getMessage());
            sb.append("\n");
        } catch (Exception e) {
            sb.append("Error writing other\n");
        }
    }

    public static void enable() {
        mEnabled = true;
    }

    public static void setAppShuttingDownFlag() {
        mShuttingDown = true;
    }

    public static void setBuildId(String str) {
        mBuildId = str;
    }

    public static void throwException() throws Exception {
        throw new Exception("dummyCrashWriterException");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01a4 -> B:25:0x021a). Please report as a decompilation issue!!! */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.king.core.UncaughtExceptionWriter.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
