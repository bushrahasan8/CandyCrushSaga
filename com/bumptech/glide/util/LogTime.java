package com.bumptech.glide.util;

import android.os.SystemClock;

/* loaded from: LogTime.class */
public abstract class LogTime {
    private static final double MILLIS_MULTIPLIER = 1.0d / Math.pow(10.0d, 6.0d);

    public static double getElapsedMillis(long j) {
        return (getLogTime() - j) * MILLIS_MULTIPLIER;
    }

    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
