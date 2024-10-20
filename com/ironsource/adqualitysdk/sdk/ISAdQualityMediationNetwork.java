package com.ironsource.adqualitysdk.sdk;

/* loaded from: ISAdQualityMediationNetwork.class */
public enum ISAdQualityMediationNetwork {
    UNKNOWN(-1),
    ADMOB(0),
    DT_FAIR_BID(1),
    HELIUM(2),
    LEVEL_PLAY(3),
    MAX(4),
    UNITY(5),
    SELF_MEDIATED(6),
    OTHER(7);


    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f36;

    ISAdQualityMediationNetwork(int i) {
        this.f36 = i;
    }

    public static ISAdQualityMediationNetwork fromInt(int i) {
        switch (i) {
            case -1:
                return UNKNOWN;
            case 0:
                return ADMOB;
            case 1:
                return DT_FAIR_BID;
            case 2:
                return HELIUM;
            case 3:
                return LEVEL_PLAY;
            case 4:
                return MAX;
            case 5:
                return UNITY;
            case 6:
                return SELF_MEDIATED;
            case 7:
                return OTHER;
            default:
                return null;
        }
    }

    public final int getValue() {
        return this.f36;
    }
}
