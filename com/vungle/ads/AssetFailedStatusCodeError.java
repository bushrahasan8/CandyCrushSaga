package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AssetFailedStatusCodeError.class */
public final class AssetFailedStatusCodeError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFailedStatusCodeError(String url, Integer num, String str) {
        super(117, Sdk$SDKError.Reason.ASSET_FAILED_STATUS_CODE, "Asset fail to download: " + url + ", Error code:" + num, str, null, null, 48, null);
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public /* synthetic */ AssetFailedStatusCodeError(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }
}
