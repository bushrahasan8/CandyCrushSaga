package com.ironsource.adqualitysdk.sdk;

/* loaded from: ISAdQualityLogLevel.class */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: ｋ, reason: contains not printable characters */
    private final int f34;

    ISAdQualityLogLevel(int i) {
        this.f34 = i;
    }

    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }

    public final int getValue() {
        return this.f34;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f34;
        return i != NONE.f34 && i >= iSAdQualityLogLevel.f34;
    }
}
