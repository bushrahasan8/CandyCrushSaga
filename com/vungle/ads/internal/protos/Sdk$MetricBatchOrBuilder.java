package com.vungle.ads.internal.protos;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: Sdk$MetricBatchOrBuilder.class */
public interface Sdk$MetricBatchOrBuilder extends MessageLiteOrBuilder {
    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Sdk$SDKMetric getMetrics(int i);

    int getMetricsCount();

    List<Sdk$SDKMetric> getMetricsList();

    @Override // com.google.protobuf.MessageLiteOrBuilder
    /* synthetic */ boolean isInitialized();
}
