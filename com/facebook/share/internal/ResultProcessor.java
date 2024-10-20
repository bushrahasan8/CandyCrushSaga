package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.internal.AppCall;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ResultProcessor.class */
public abstract class ResultProcessor {
    private final FacebookCallback appCallback;

    public ResultProcessor(FacebookCallback facebookCallback) {
        this.appCallback = facebookCallback;
    }

    public void onCancel(AppCall appCall) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        FacebookCallback facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public void onError(AppCall appCall, FacebookException error) {
        Intrinsics.checkNotNullParameter(appCall, "appCall");
        Intrinsics.checkNotNullParameter(error, "error");
        FacebookCallback facebookCallback = this.appCallback;
        if (facebookCallback != null) {
            facebookCallback.onError(error);
        }
    }

    public abstract void onSuccess(AppCall appCall, Bundle bundle);
}
