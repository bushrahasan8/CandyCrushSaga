package com.ironsource.mediationsdk.adapter;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: AbstractRewardedVideoAdapter.class */
public abstract class AbstractRewardedVideoAdapter<AdNetworkAdapter> extends AbstractAdUnitAdapter<AdNetworkAdapter> implements RewardedVideoAdapterInterface {
    public AbstractRewardedVideoAdapter(AdNetworkAdapter adnetworkadapter) {
        super(adnetworkadapter);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(JSONObject config, JSONObject jSONObject, BiddingDataCallback biddingDataCallback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(config, jSONObject);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject config, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(config, "config");
        return null;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject config, JSONObject jSONObject, RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject config, RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject config, RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject config, JSONObject jSONObject, RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject config, JSONObject jSONObject, String str, RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject config, RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
