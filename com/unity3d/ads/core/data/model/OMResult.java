package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: OMResult.class */
public abstract class OMResult {

    /* loaded from: OMResult$Failure.class */
    public static final class Failure extends OMResult {
        private final String reason;
        private final String reasonDebug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String reason, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.reasonDebug = str;
        }

        public /* synthetic */ Failure(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            if ((i & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.reasonDebug;
        }

        public final Failure copy(String reason, String str) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failure(reason, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.reason, failure.reason) && Intrinsics.areEqual(this.reasonDebug, failure.reasonDebug);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode();
            String str = this.reasonDebug;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }
    }

    /* loaded from: OMResult$Success.class */
    public static final class Success extends OMResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    public /* synthetic */ OMResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
