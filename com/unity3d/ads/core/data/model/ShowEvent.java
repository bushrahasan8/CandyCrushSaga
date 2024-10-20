package com.unity3d.ads.core.data.model;

import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ShowEvent.class */
public abstract class ShowEvent {

    /* loaded from: ShowEvent$CancelTimeout.class */
    public static final class CancelTimeout extends ShowEvent {
        public static final CancelTimeout INSTANCE = new CancelTimeout();

        private CancelTimeout() {
            super(null);
        }
    }

    /* loaded from: ShowEvent$Clicked.class */
    public static final class Clicked extends ShowEvent {
        public static final Clicked INSTANCE = new Clicked();

        private Clicked() {
            super(null);
        }
    }

    /* loaded from: ShowEvent$Completed.class */
    public static final class Completed extends ShowEvent {
        private final ShowStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(ShowStatus status) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public static /* synthetic */ Completed copy$default(Completed completed, ShowStatus showStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                showStatus = completed.status;
            }
            return completed.copy(showStatus);
        }

        public final ShowStatus component1() {
            return this.status;
        }

        public final Completed copy(ShowStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new Completed(status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && this.status == ((Completed) obj).status;
        }

        public final ShowStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "Completed(status=" + this.status + ')';
        }
    }

    /* loaded from: ShowEvent$Error.class */
    public static final class Error extends ShowEvent {
        private final int errorCode;
        private final String message;
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i, String reason) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.message = message;
            this.errorCode = i;
            this.reason = reason;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = error.message;
            }
            if ((i2 & 2) != 0) {
                i = error.errorCode;
            }
            if ((i2 & 4) != 0) {
                str2 = error.reason;
            }
            return error.copy(str, i, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final String component3() {
            return this.reason;
        }

        public final Error copy(String message, int i, String reason) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Error(message, i, reason);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.message, error.message) && this.errorCode == error.errorCode && Intrinsics.areEqual(this.reason, error.reason);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.errorCode) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ", reason=" + this.reason + ')';
        }
    }

    /* loaded from: ShowEvent$LeftApplication.class */
    public static final class LeftApplication extends ShowEvent {
        public static final LeftApplication INSTANCE = new LeftApplication();

        private LeftApplication() {
            super(null);
        }
    }

    /* loaded from: ShowEvent$Started.class */
    public static final class Started extends ShowEvent {
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    private ShowEvent() {
    }

    public /* synthetic */ ShowEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
