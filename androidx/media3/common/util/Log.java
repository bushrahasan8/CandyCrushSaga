package androidx.media3.common.util;

import android.text.TextUtils;
import java.net.UnknownHostException;

/* loaded from: Log.class */
public abstract class Log {
    private static int logLevel = 0;
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();
    private static Logger logger = Logger.DEFAULT;

    /* loaded from: Log$Logger.class */
    public interface Logger {
        public static final Logger DEFAULT = new Logger() { // from class: androidx.media3.common.util.Log.Logger.1
            AnonymousClass1() {
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void d(String str, String str2, Throwable th) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(String str, String str2, Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(String str, String str2, Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(String str, String str2, Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }
        };

        /* renamed from: androidx.media3.common.util.Log$Logger$1 */
        /* loaded from: Log$Logger$1.class */
        class AnonymousClass1 implements Logger {
            AnonymousClass1() {
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void d(String str, String str2, Throwable th) {
                android.util.Log.d(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void e(String str, String str2, Throwable th) {
                android.util.Log.e(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void i(String str, String str2, Throwable th) {
                android.util.Log.i(str, Log.appendThrowableString(str2, th));
            }

            @Override // androidx.media3.common.util.Log.Logger
            public void w(String str, String str2, Throwable th) {
                android.util.Log.w(str, Log.appendThrowableString(str2, th));
            }
        }

        void d(String str, String str2, Throwable th);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2, Throwable th);

        void w(String str, String str2, Throwable th);
    }

    public static String appendThrowableString(String str, Throwable th) {
        String throwableString = getThrowableString(th);
        String str2 = str;
        if (!TextUtils.isEmpty(throwableString)) {
            str2 = str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str2;
    }

    public static void d(String str, String str2) {
        synchronized (lock) {
            if (logLevel == 0) {
                logger.d(str, str2, null);
            }
        }
    }

    public static void e(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.e(str, str2, null);
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        synchronized (lock) {
            if (logLevel <= 3) {
                logger.e(str, str2, th);
            }
        }
    }

    public static String getThrowableString(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (lock) {
            if (isCausedByUnknownHostException(th)) {
                return "UnknownHostException (no network)";
            }
            if (logStackTraces) {
                return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
            }
            return th.getMessage();
        }
    }

    public static void i(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 1) {
                logger.i(str, str2, null);
            }
        }
    }

    private static boolean isCausedByUnknownHostException(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void w(String str, String str2) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.w(str, str2, null);
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        synchronized (lock) {
            if (logLevel <= 2) {
                logger.w(str, str2, th);
            }
        }
    }
}
