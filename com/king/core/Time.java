package com.king.core;

import android.os.SystemClock;
import androidx.annotation.Keep;
import java.util.Locale;
import java.util.TimeZone;

@Keep
/* loaded from: Time.class */
public class Time {
    private Time() {
        throw new IllegalStateException("Utility class");
    }

    public static long getElapsedRealTime() {
        return SystemClock.elapsedRealtime();
    }

    public static String getTimeZone() {
        int offset = (TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000) / 60;
        return String.format(Locale.ENGLISH, "GMT%+03d:%02d", Integer.valueOf(offset / 60), Integer.valueOf(Math.abs(offset) % 60));
    }

    public static long getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
    }
}
