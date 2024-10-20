package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
import com.google.android.gms.drive.ExecutionOptions;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GetTokenClient.class */
public final class GetTokenClient extends PlatformServiceClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenClient(Context context, LoginClient.Request request) {
        super(context, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH, 65537, 20121101, request.getApplicationId(), request.getNonce());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // com.facebook.internal.PlatformServiceClient
    protected void populateRequestBundle(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
