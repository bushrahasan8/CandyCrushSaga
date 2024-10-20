package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: SingleValueMetric.class */
public final class SingleValueMetric extends Metric {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleValueMetric(Sdk$SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final void addValue(long j) {
        Long l = this.value;
        this.value = Long.valueOf((l != null ? l.longValue() : 0L) + j);
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        Long l = this.value;
        return l != null ? l.longValue() : 0L;
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final Long m6720getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l) {
        this.value = l;
    }
}
