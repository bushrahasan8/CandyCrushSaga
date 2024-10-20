package com.unity3d.services.core.log;

import android.util.Log;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: DeviceLog.class */
public class DeviceLog {
    private static boolean FORCE_DEBUG_LOG = false;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 3072;
    private static final HashMap<UnityAdsLogLevel, DeviceLogLevel> _deviceLogLevel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.core.log.DeviceLog$1, reason: invalid class name */
    /* loaded from: DeviceLog$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel[] r0 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.core.log.DeviceLog.AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel = r0
                r0 = r4
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO     // Catch: java.lang.NoSuchFieldError -> L36
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L36
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L36
            L14:
                int[] r0 = com.unity3d.services.core.log.DeviceLog.AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel     // Catch: java.lang.NoSuchFieldError -> L36 java.lang.NoSuchFieldError -> L3a
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.DEBUG     // Catch: java.lang.NoSuchFieldError -> L3a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3a
            L1f:
                int[] r0 = com.unity3d.services.core.log.DeviceLog.AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel     // Catch: java.lang.NoSuchFieldError -> L3a java.lang.NoSuchFieldError -> L3e
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.WARNING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L2a:
                int[] r0 = com.unity3d.services.core.log.DeviceLog.AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel     // Catch: java.lang.NoSuchFieldError -> L3e java.lang.NoSuchFieldError -> L42
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.ERROR     // Catch: java.lang.NoSuchFieldError -> L42
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
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.log.DeviceLog.AnonymousClass1.m6620clinit():void");
        }
    }

    /* loaded from: DeviceLog$UnityAdsLogLevel.class */
    public enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<UnityAdsLogLevel, DeviceLogLevel> hashMap = new HashMap<>();
        _deviceLogLevel = hashMap;
        if (hashMap.size() == 0) {
            hashMap.put(UnityAdsLogLevel.INFO, new DeviceLogLevel("i"));
            hashMap.put(UnityAdsLogLevel.DEBUG, new DeviceLogLevel("d"));
            hashMap.put(UnityAdsLogLevel.WARNING, new DeviceLogLevel("w"));
            hashMap.put(UnityAdsLogLevel.ERROR, new DeviceLogLevel("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
            FORCE_DEBUG_LOG = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String checkMessage(java.lang.String r2) {
        /*
            r0 = r2
            if (r0 == 0) goto Ld
            r0 = r2
            r3 = r0
            r0 = r2
            int r0 = r0.length()
            if (r0 != 0) goto L10
        Ld:
            java.lang.String r0 = "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead"
            r3 = r0
        L10:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.log.DeviceLog.checkMessage(java.lang.String):java.lang.String");
    }

    private static DeviceLogEntry createLogEntry(UnityAdsLogLevel unityAdsLogLevel, String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        DeviceLogLevel logLevel = getLogLevel(unityAdsLogLevel);
        DeviceLogEntry deviceLogEntry = null;
        if (logLevel != null) {
            int i = 0;
            boolean z = false;
            while (i < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(DeviceLog.class.getName())) {
                    z = true;
                }
                if (!stackTraceElement.getClassName().equals(DeviceLog.class.getName()) && z) {
                    break;
                }
                i++;
            }
            StackTraceElement stackTraceElement2 = i < stackTrace.length ? stackTrace[i] : null;
            deviceLogEntry = null;
            if (stackTraceElement2 != null) {
                deviceLogEntry = new DeviceLogEntry(logLevel, str, stackTraceElement2);
            }
        }
        return deviceLogEntry;
    }

    public static void debug(String str) {
        if (isDebugEnabled()) {
            if (str.length() <= MAX_DEBUG_MSG_LENGTH) {
                write(UnityAdsLogLevel.DEBUG, checkMessage(str));
                return;
            }
            debug(str.substring(0, MAX_DEBUG_MSG_LENGTH));
            if (str.length() < 30720) {
                debug(str.substring(MAX_DEBUG_MSG_LENGTH));
            }
        }
    }

    public static void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            debug(String.format(str, objArr));
        }
    }

    public static void entered() {
        debug("ENTERED METHOD");
    }

    public static void error(String str) {
        write(UnityAdsLogLevel.ERROR, checkMessage(str));
    }

    public static void error(String str, Object... objArr) {
        error(String.format(str, objArr));
    }

    public static void exception(String str, Exception exc) {
        String str2 = "";
        if (str != null) {
            str2 = "" + str;
        }
        String str3 = str2;
        if (exc != null) {
            str3 = str2 + ": " + exc.getMessage();
        }
        String str4 = str3;
        if (exc != null) {
            str4 = str3;
            if (exc.getCause() != null) {
                str4 = str3 + ": " + exc.getCause().getMessage();
            }
        }
        write(UnityAdsLogLevel.ERROR, str4);
    }

    private static DeviceLogLevel getLogLevel(UnityAdsLogLevel unityAdsLogLevel) {
        return _deviceLogLevel.get(unityAdsLogLevel);
    }

    public static void info(String str) {
        write(UnityAdsLogLevel.INFO, checkMessage(str));
    }

    public static void info(String str, Object... objArr) {
        info(String.format(str, objArr));
    }

    private static boolean isDebugEnabled() {
        return LOG_DEBUG || FORCE_DEBUG_LOG;
    }

    public static void setLogLevel(int i) {
        if (i >= 8) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = true;
            return;
        }
        if (i >= 4) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = false;
            return;
        }
        if (i >= 2) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        if (i >= 1) {
            LOG_ERROR = true;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
            return;
        }
        LOG_ERROR = false;
        LOG_WARNING = false;
        LOG_INFO = false;
        LOG_DEBUG = false;
    }

    public static void warning(String str) {
        write(UnityAdsLogLevel.WARNING, checkMessage(str));
    }

    public static void warning(String str, Object... objArr) {
        warning(String.format(str, objArr));
    }

    private static void write(UnityAdsLogLevel unityAdsLogLevel, String str) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[unityAdsLogLevel.ordinal()];
        boolean z = i != 1 ? i != 2 ? i != 3 ? i != 4 ? true : LOG_ERROR : LOG_WARNING : LOG_DEBUG : LOG_INFO;
        if (FORCE_DEBUG_LOG) {
            z = true;
        }
        if (z) {
            writeToLog(createLogEntry(unityAdsLogLevel, str));
        }
    }

    private static void writeToLog(DeviceLogEntry deviceLogEntry) {
        Method method;
        if (deviceLogEntry == null || deviceLogEntry.getLogLevel() == null) {
            return;
        }
        try {
            method = Log.class.getMethod(deviceLogEntry.getLogLevel().getReceivingMethodName(), String.class, String.class);
        } catch (Exception e) {
            Log.e("UnityAds", "Writing to log failed!", e);
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(null, deviceLogEntry.getLogLevel().getLogTag(), deviceLogEntry.getParsedMessage());
            } catch (Exception e2) {
                Log.e("UnityAds", "Writing to log failed!", e2);
            }
        }
    }
}
