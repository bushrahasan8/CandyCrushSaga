package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UniversalRequestWorkerData.class */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    /* loaded from: UniversalRequestWorkerData$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UniversalRequestWorkerData(String universalRequestId) {
        Intrinsics.checkNotNullParameter(universalRequestId, "universalRequestId");
        this.universalRequestId = universalRequestId;
    }

    public final Data invoke() {
        Data build = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .p…tId)\n            .build()");
        return build;
    }
}
