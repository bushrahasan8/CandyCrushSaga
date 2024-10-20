package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: RewardedVideoAdapterInterface.class */
public interface RewardedVideoAdapterInterface extends AdUnitAdapterInterface {
    void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback);

    Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2);

    void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener);

    void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    boolean isRewardedVideoAvailable(JSONObject jSONObject);

    void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener);

    void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener);

    @Override // com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface, com.ironsource.mediationsdk.INetworkInitCallbackListener, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface, com.ironsource.mediationsdk.sdk.BannerAdapterInterface, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    /* synthetic */ void onNetworkInitCallbackFailed(String str);

    @Override // com.ironsource.mediationsdk.sdk.AdUnitAdapterInterface, com.ironsource.mediationsdk.INetworkInitCallbackListener, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface, com.ironsource.mediationsdk.sdk.BannerAdapterInterface, com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdAdapterInterface
    /* synthetic */ void onNetworkInitCallbackSuccess();

    void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);
}
