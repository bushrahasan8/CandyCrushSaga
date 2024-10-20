package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* loaded from: MaxRewardImpl.class */
public class MaxRewardImpl implements MaxReward {
    private final String a;
    private final int b;

    private MaxRewardImpl(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.a = str;
        this.b = i;
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.b + ", label=" + this.a + "}";
    }
}
