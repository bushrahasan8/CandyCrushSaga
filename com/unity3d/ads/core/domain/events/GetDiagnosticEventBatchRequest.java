package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.DiagnosticEventRequestKt$Dsl;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEvent;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GetDiagnosticEventBatchRequest.class */
public final class GetDiagnosticEventBatchRequest {
    public final DiagnosticEventRequestOuterClass$DiagnosticEventRequest invoke(List<DiagnosticEventRequestOuterClass$DiagnosticEvent> diagnosticEvents) {
        Intrinsics.checkNotNullParameter(diagnosticEvents, "diagnosticEvents");
        DiagnosticEventRequestKt$Dsl.Companion companion = DiagnosticEventRequestKt$Dsl.Companion;
        DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder newBuilder = DiagnosticEventRequestOuterClass$DiagnosticEventRequest.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        DiagnosticEventRequestKt$Dsl _create = companion._create(newBuilder);
        _create.addAllBatch(_create.getBatch(), diagnosticEvents);
        return _create._build();
    }
}
