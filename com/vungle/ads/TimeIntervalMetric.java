package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: TimeIntervalMetric.class */
public class TimeIntervalMetric extends DualValueMetric {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeIntervalMetric(Sdk$SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final long calculateIntervalDuration() {
        Long valueSecond = getValueSecond();
        long longValue = valueSecond != null ? valueSecond.longValue() : System.currentTimeMillis();
        Long valueFirst = getValueFirst();
        return longValue - (valueFirst != null ? valueFirst.longValue() : System.currentTimeMillis());
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
