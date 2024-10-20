package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: UnityAdsNetworkException.class */
public final class UnityAdsNetworkException extends Exception {
    private final String client;
    private final Integer code;
    private final Integer cronetCode;
    private final String message;
    private final String protocol;
    private final OperationType type;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ UnityAdsNetworkException copy$default(UnityAdsNetworkException unityAdsNetworkException, String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unityAdsNetworkException.getMessage();
        }
        if ((i & 2) != 0) {
            operationType = unityAdsNetworkException.type;
        }
        if ((i & 4) != 0) {
            num = unityAdsNetworkException.code;
        }
        if ((i & 8) != 0) {
            str2 = unityAdsNetworkException.url;
        }
        if ((i & 16) != 0) {
            str3 = unityAdsNetworkException.protocol;
        }
        if ((i & 32) != 0) {
            num2 = unityAdsNetworkException.cronetCode;
        }
        if ((i & 64) != 0) {
            str4 = unityAdsNetworkException.client;
        }
        return unityAdsNetworkException.copy(str, operationType, num, str2, str3, num2, str4);
    }

    public final String component1() {
        return getMessage();
    }

    public final OperationType component2() {
        return this.type;
    }

    public final Integer component3() {
        return this.code;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.protocol;
    }

    public final Integer component6() {
        return this.cronetCode;
    }

    public final String component7() {
        return this.client;
    }

    public final UnityAdsNetworkException copy(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        return new UnityAdsNetworkException(message, type, num, str, str2, num2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnityAdsNetworkException)) {
            return false;
        }
        UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) obj;
        return Intrinsics.areEqual(getMessage(), unityAdsNetworkException.getMessage()) && this.type == unityAdsNetworkException.type && Intrinsics.areEqual(this.code, unityAdsNetworkException.code) && Intrinsics.areEqual(this.url, unityAdsNetworkException.url) && Intrinsics.areEqual(this.protocol, unityAdsNetworkException.protocol) && Intrinsics.areEqual(this.cronetCode, unityAdsNetworkException.cronetCode) && Intrinsics.areEqual(this.client, unityAdsNetworkException.client);
    }

    public final String getClient() {
        return this.client;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final OperationType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = getMessage().hashCode();
        int hashCode2 = this.type.hashCode();
        Integer num = this.code;
        int i = 0;
        int hashCode3 = num == null ? 0 : num.hashCode();
        String str = this.url;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.protocol;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.cronetCode;
        int hashCode6 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.client;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "UnityAdsNetworkException(message=" + getMessage() + ", type=" + this.type + ", code=" + this.code + ", url=" + this.url + ", protocol=" + this.protocol + ", cronetCode=" + this.cronetCode + ", client=" + this.client + ')';
    }
}
