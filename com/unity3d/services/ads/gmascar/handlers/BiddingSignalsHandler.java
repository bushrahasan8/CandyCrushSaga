package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: BiddingSignalsHandler.class */
public class BiddingSignalsHandler implements ISignalCollectionListener {
    private final boolean isBannerEnabled;
    private final IBiddingSignalsListener listener;

    public BiddingSignalsHandler(boolean z, IBiddingSignalsListener iBiddingSignalsListener) {
        this.listener = iBiddingSignalsListener;
        this.isBannerEnabled = z;
    }

    private String getSignalFromJson(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    private BiddingSignals getSignals(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return this.isBannerEnabled ? new BiddingSignals(getSignalFromJson(jSONObject, "gmaScarBiddingRewardedSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingInterstitialSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingBannerSignal")) : new BiddingSignals(getSignalFromJson(jSONObject, "gmaScarBiddingRewardedSignal"), getSignalFromJson(jSONObject, "gmaScarBiddingInterstitialSignal"));
        } catch (JSONException e) {
            return null;
        }
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollected(String str) {
        this.listener.onSignalsReady(getSignals(str));
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollectionFailed(String str) {
        this.listener.onSignalsFailure(str);
    }
}
