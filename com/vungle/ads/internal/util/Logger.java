package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Logger.class */
public final class Logger {
    public static final Companion Companion = new Companion(null);
    private static boolean enabled;

    /* loaded from: Logger$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int d(String str, String str2) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.d(str, str2);
        }

        public final int e(String str, String str2) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.e(str, str2);
        }

        public final int e(String str, String str2, Throwable th) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.e(str, str2, th);
        }

        public final void enable(boolean z) {
            Logger.enabled = z;
        }

        public final int w(String str, String str2) {
            if (!Logger.enabled || str == null || str2 == null) {
                return -1;
            }
            return Log.w(str, str2);
        }

        public final int w(String str, String str2, Throwable th) {
            if (!Logger.enabled || str2 == null || th == null) {
                return -1;
            }
            Log.w(str, str2, th);
            return -1;
        }
    }

    public static final int d(String str, String str2) {
        return Companion.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return Companion.e(str, str2);
    }

    public static final int e(String str, String str2, Throwable th) {
        return Companion.e(str, str2, th);
    }

    public static final int w(String str, String str2) {
        return Companion.w(str, str2);
    }

    public static final int w(String str, String str2, Throwable th) {
        return Companion.w(str, str2, th);
    }
}
