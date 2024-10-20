package com.ironsource.adqualitysdk.sdk;

/* loaded from: ISAdQualityCustomMediationRevenue.class */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final String f21;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final double f22;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f23;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final ISAdQualityAdType f24;

    /* loaded from: ISAdQualityCustomMediationRevenue$Builder.class */
    public static class Builder {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private String f25;

        /* renamed from: ｋ, reason: contains not printable characters */
        private double f27;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f28 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityAdType f26 = ISAdQualityAdType.UNKNOWN;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f28, this.f26, this.f27, this.f25, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f26 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f28 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f25 = str;
            return this;
        }

        public Builder setRevenue(double d) {
            this.f27 = d;
            return this;
        }
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f23 = iSAdQualityMediationNetwork;
        this.f24 = iSAdQualityAdType;
        this.f22 = d;
        this.f21 = str;
    }

    /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, byte b) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    public ISAdQualityAdType getAdType() {
        return this.f24;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f23;
    }

    public String getPlacement() {
        return this.f21;
    }

    public double getRevenue() {
        return this.f22;
    }
}
