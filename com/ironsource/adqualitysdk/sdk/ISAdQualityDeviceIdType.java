package com.ironsource.adqualitysdk.sdk;

/* loaded from: ISAdQualityDeviceIdType.class */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: ﻛ, reason: contains not printable characters */
    private final int f30;

    ISAdQualityDeviceIdType(int i) {
        this.f30 = i;
    }

    public static ISAdQualityDeviceIdType fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return GAID;
        }
        if (i != 2) {
            return null;
        }
        return IDFA;
    }

    public final int getValue() {
        return this.f30;
    }
}
