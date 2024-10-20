package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticEventRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: DiagnosticEventRequestKt$Dsl.class */
public final class DiagnosticEventRequestKt$Dsl {
    public static final Companion Companion = new Companion(null);
    private final DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder _builder;

    /* loaded from: DiagnosticEventRequestKt$Dsl$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ DiagnosticEventRequestKt$Dsl _create(DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new DiagnosticEventRequestKt$Dsl(builder, null);
        }
    }

    private DiagnosticEventRequestKt$Dsl(DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder builder) {
        this._builder = builder;
    }

    public /* synthetic */ DiagnosticEventRequestKt$Dsl(DiagnosticEventRequestOuterClass$DiagnosticEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final /* synthetic */ DiagnosticEventRequestOuterClass$DiagnosticEventRequest _build() {
        GeneratedMessageLite build = this._builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
        return (DiagnosticEventRequestOuterClass$DiagnosticEventRequest) build;
    }

    public final /* synthetic */ void addAllBatch(DslList dslList, Iterable values) {
        Intrinsics.checkNotNullParameter(dslList, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this._builder.addAllBatch(values);
    }

    public final /* synthetic */ void clearBatch(DslList dslList) {
        Intrinsics.checkNotNullParameter(dslList, "<this>");
        this._builder.clearBatch();
    }

    public final /* synthetic */ DslList getBatch() {
        List batchList = this._builder.getBatchList();
        Intrinsics.checkNotNullExpressionValue(batchList, "_builder.getBatchList()");
        return new DslList(batchList);
    }
}
