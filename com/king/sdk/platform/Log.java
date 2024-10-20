package com.king.sdk.platform;

import androidx.annotation.Keep;

@Keep
/* loaded from: Log.class */
public class Log {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.sdk.platform.Log$1, reason: invalid class name */
    /* loaded from: Log$1.class */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$king$sdk$platform$Log$Level;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.king.sdk.platform.Log$Level[] r0 = com.king.sdk.platform.Log.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.king.sdk.platform.Log.AnonymousClass1.$SwitchMap$com$king$sdk$platform$Log$Level = r0
                r0 = r4
                com.king.sdk.platform.Log$Level r1 = com.king.sdk.platform.Log.Level.DEBUG     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.king.sdk.platform.Log.AnonymousClass1.$SwitchMap$com$king$sdk$platform$Log$Level     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.king.sdk.platform.Log$Level r1 = com.king.sdk.platform.Log.Level.INFO     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.king.sdk.platform.Log.AnonymousClass1.$SwitchMap$com$king$sdk$platform$Log$Level     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.king.sdk.platform.Log$Level r1 = com.king.sdk.platform.Log.Level.WARNING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.king.sdk.platform.Log.AnonymousClass1.$SwitchMap$com$king$sdk$platform$Log$Level     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.king.sdk.platform.Log$Level r1 = com.king.sdk.platform.Log.Level.ERROR     // Catch: java.lang.NoSuchFieldError -> L42
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L42
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L42
            L35:
                return
            L36:
                r4 = move-exception
                goto L14
            L3a:
                r4 = move-exception
                goto L1f
            L3e:
                r4 = move-exception
                goto L2a
            L42:
                r4 = move-exception
                goto L35
            */
            throw new UnsupportedOperationException("Method not decompiled: com.king.sdk.platform.Log.AnonymousClass1.m6243clinit():void");
        }
    }

    /* loaded from: Log$Level.class */
    public enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    private static int GetLevel(Level level) {
        int i = AnonymousClass1.$SwitchMap$com$king$sdk$platform$Log$Level[level.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    private static native void KsdkLog(int i, String str, int i2, String str2, String str3);

    public static void log(Level level, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= 3) {
            KsdkLog(GetLevel(level), "", 0, "", str);
            return;
        }
        String methodName = stackTrace[3].getMethodName();
        int lineNumber = stackTrace[3].getLineNumber();
        KsdkLog(GetLevel(level), stackTrace[3].getFileName(), lineNumber, methodName, str);
    }
}
