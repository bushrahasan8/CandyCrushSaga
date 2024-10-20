package com.google.ads.mediation.unity;

import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: UnityReward.class */
public class UnityReward implements RewardItem {
    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }
}
