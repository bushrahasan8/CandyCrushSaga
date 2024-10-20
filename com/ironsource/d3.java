package com.ironsource;

import java.lang.Thread;

/* loaded from: d3.class */
public class d3 implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d3(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append(System.lineSeparator());
        int i = 0;
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append(";" + System.lineSeparator());
            if (stackTraceElement.toString().contains(e3.d().e())) {
                z = true;
            }
        }
        Throwable cause = th.getCause();
        boolean z2 = z;
        if (cause != null) {
            sb.append("--CAUSE");
            sb.append(System.lineSeparator());
            sb.append(cause.toString());
            sb.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            int length = stackTrace2.length;
            while (true) {
                z2 = z;
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement2 = stackTrace2[i];
                sb.append(stackTraceElement2.toString());
                sb.append(";" + System.lineSeparator());
                if (stackTraceElement2.toString().contains(e3.d().e())) {
                    z = true;
                }
                i++;
            }
        }
        if (z2) {
            new u4(sb.toString(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.a.uncaughtException(thread, th);
    }
}
