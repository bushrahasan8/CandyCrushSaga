package com.unity3d.ads.core.extensions;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;

/* loaded from: TimeExtensionsKt.class */
public final class TimeExtensionsKt {
    public static final double elapsedMillis(TimeMark timeMark) {
        Intrinsics.checkNotNullParameter(timeMark, "<this>");
        return Duration.m7319toDoubleimpl(timeMark.mo7335elapsedNowUwyO8pc(), DurationUnit.MILLISECONDS);
    }
}
