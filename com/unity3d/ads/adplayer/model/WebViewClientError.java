package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: WebViewClientError.class */
public final class WebViewClientError {
    private final ErrorReason reason;
    private final Integer statusCode;
    private final String url;

    public WebViewClientError(String str, ErrorReason reason, Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.url = str;
        this.reason = reason;
        this.statusCode = num;
    }

    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, errorReason, (i & 4) != 0 ? null : num);
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    public final String component1() {
        return this.url;
    }

    public final ErrorReason component2() {
        return this.reason;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final WebViewClientError copy(String str, ErrorReason reason, Integer num) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new WebViewClientError(str, reason, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        return Intrinsics.areEqual(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && Intrinsics.areEqual(this.statusCode, webViewClientError.statusCode);
    }

    public final ErrorReason getReason() {
        return this.reason;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.reason.hashCode();
        Integer num = this.statusCode;
        if (num != null) {
            i = num.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }
}
