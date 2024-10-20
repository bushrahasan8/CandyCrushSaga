package com.ironsource.mediationsdk.adapter;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: AbstractAdUnitAdapter.class */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    protected final String getAdUnitIdMissingErrorString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return "Missing params - " + key;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    protected final String getConfigStringValueFromKey(JSONObject config, String key) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(key, "key");
        String optString = config.optString(key);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(key)");
        return optString;
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface, com.ironsource.mediationsdk.sdk.BannerAdapterInterface, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void onNetworkInitCallbackFailed(String str) {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface, com.ironsource.mediationsdk.sdk.BannerAdapterInterface, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    public void onNetworkInitCallbackSuccess() {
    }

    public final void postBackgroundThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }
}
