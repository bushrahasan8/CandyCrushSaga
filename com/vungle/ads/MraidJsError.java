package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MraidJsError.class */
public final class MraidJsError extends VungleError {
    public MraidJsError() {
        this(null, 1, null);
    }

    public MraidJsError(String str) {
        super(130, Sdk$SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR, str, null, null, null, 56, null);
    }

    public /* synthetic */ MraidJsError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
