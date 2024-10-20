package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.domain.InitializeAndroidBoldSDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: InitializationException.class */
public final class InitializationException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String reason;
    private final String reasonDebug;
    private final Throwable throwable;

    /* loaded from: InitializationException$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InitializationException parseFrom(Exception e) {
            InitializationException initializationException;
            Intrinsics.checkNotNullParameter(e, "e");
            if (e instanceof TimeoutCancellationException) {
                initializationException = new InitializationException(InitializeAndroidBoldSDK.MSG_TIMEOUT, e, "timeout", e.getMessage());
            } else if (e instanceof UnityAdsNetworkException) {
                StringBuilder sb = new StringBuilder();
                sb.append("network.");
                UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) e;
                sb.append(unityAdsNetworkException.getCode());
                initializationException = new InitializationException(InitializeAndroidBoldSDK.MSG_NETWORK, e, sb.toString(), unityAdsNetworkException.getMessage());
            } else {
                initializationException = e instanceof InitializationException ? (InitializationException) e : new InitializationException(InitializeAndroidBoldSDK.MSG_UNKNOWN, e, "unknown", e.getMessage());
            }
            return initializationException;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(String message, Throwable th, String reason, String str) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.message = message;
        this.throwable = th;
        this.reason = reason;
        this.reasonDebug = str;
    }

    public /* synthetic */ InitializationException(String str, Throwable th, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? "gateway" : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, String str, Throwable th, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializationException.getMessage();
        }
        if ((i & 2) != 0) {
            th = initializationException.throwable;
        }
        if ((i & 4) != 0) {
            str2 = initializationException.reason;
        }
        if ((i & 8) != 0) {
            str3 = initializationException.reasonDebug;
        }
        return initializationException.copy(str, th, str2, str3);
    }

    public final String component1() {
        return getMessage();
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final String component3() {
        return this.reason;
    }

    public final String component4() {
        return this.reasonDebug;
    }

    public final InitializationException copy(String message, Throwable th, String reason, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new InitializationException(message, th, reason, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return Intrinsics.areEqual(getMessage(), initializationException.getMessage()) && Intrinsics.areEqual(this.throwable, initializationException.throwable) && Intrinsics.areEqual(this.reason, initializationException.reason) && Intrinsics.areEqual(this.reasonDebug, initializationException.reasonDebug);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getReasonDebug() {
        return this.reasonDebug;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int hashCode = getMessage().hashCode();
        Throwable th = this.throwable;
        int i = 0;
        int hashCode2 = th == null ? 0 : th.hashCode();
        int hashCode3 = this.reason.hashCode();
        String str = this.reasonDebug;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(message=" + getMessage() + ", throwable=" + this.throwable + ", reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
    }
}
