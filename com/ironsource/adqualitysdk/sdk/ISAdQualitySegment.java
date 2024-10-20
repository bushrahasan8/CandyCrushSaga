package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.kf;
import com.ironsource.adqualitysdk.sdk.i.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ISAdQualitySegment.class */
public class ISAdQualitySegment {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private final Map f37;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private double f38;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private final long f39;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final int f40;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final AtomicBoolean f41;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final String f42;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final String f43;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f44;

    /* loaded from: ISAdQualitySegment$Builder.class */
    public static class Builder {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private String f46;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f55;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private final int f52 = 999999;

        /* renamed from: ｋ, reason: contains not printable characters */
        private final int f53 = 5;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private double f51 = 999999.99d;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private int f54 = -1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private int f47 = -1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private AtomicBoolean f49 = null;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private long f48 = 0;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private double f50 = -1.0d;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private Map f45 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f55, this.f54, this.f46, this.f47, this.f49, this.f50, this.f48, new HashMap(this.f45), (byte) 0);
        }

        public Builder setAge(int i) {
            if (i <= 0 || i > 199) {
                StringBuilder sb = new StringBuilder("setAge( ");
                sb.append(i);
                sb.append(" ) age must be between 1-199");
                v.m5771("ISAdQualitySegment Builder", sb.toString());
            } else {
                this.f54 = i;
            }
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            try {
                if (this.f45.size() >= 5) {
                    StringBuilder sb = new StringBuilder("setCustomData( ");
                    sb.append(str);
                    sb.append(" , ");
                    sb.append(str2);
                    sb.append(" ) limited to 5 custom values. Ignoring custom value.");
                    v.m5771("ISAdQualitySegment Builder", sb.toString());
                } else if (kf.m5678(str) && kf.m5678(str2) && kf.m5673(str, 32) && kf.m5673(str2, 32)) {
                    this.f45.put("sgct_".concat(String.valueOf(str)), str2);
                } else {
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) key and value must be alphanumeric and 1-32 in length");
                    v.m5771("ISAdQualitySegment Builder", sb2.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this;
        }

        public Builder setGender(String str) {
            if (!TextUtils.isEmpty(str)) {
                Locale locale = Locale.ENGLISH;
                if (str.toLowerCase(locale).equals(IronSourceConstants.a.b) || str.toLowerCase(locale).equals(IronSourceConstants.a.c)) {
                    this.f46 = str.toLowerCase(locale);
                    return this;
                }
            }
            StringBuilder sb = new StringBuilder("setGender( ");
            sb.append(str);
            sb.append(" ) is invalid");
            v.m5771("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setInAppPurchasesTotal(double d) {
            if (d <= 0.0d || d >= this.f51) {
                StringBuilder sb = new StringBuilder("setIAPTotal( ");
                sb.append(d);
                sb.append(" ) iapt must be between 0-");
                sb.append(this.f51);
                v.m5771("ISAdQualitySegment Builder", sb.toString());
            } else {
                this.f50 = Math.floor(d * 100.0d) / 100.0d;
            }
            return this;
        }

        public Builder setIsPaying(boolean z) {
            if (this.f49 == null) {
                this.f49 = new AtomicBoolean();
            }
            this.f49.set(z);
            return this;
        }

        public Builder setLevel(int i) {
            if (i <= 0 || i >= 999999) {
                StringBuilder sb = new StringBuilder("setLevel( ");
                sb.append(i);
                sb.append(" ) level must be between 1-999999");
                v.m5771("ISAdQualitySegment Builder", sb.toString());
            } else {
                this.f47 = i;
            }
            return this;
        }

        public Builder setSegmentName(String str) {
            if (kf.m5678(str) && kf.m5673(str, 32)) {
                this.f55 = str;
            } else {
                StringBuilder sb = new StringBuilder("setSegmentName( ");
                sb.append(str);
                sb.append(" ) segment name must be alphanumeric and 1-32 in length");
                v.m5771("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }

        public Builder setUserCreationDate(long j) {
            if (j > 0) {
                this.f48 = j;
            } else {
                StringBuilder sb = new StringBuilder("setUserCreationDate( ");
                sb.append(j);
                sb.append(" ) is an invalid timestamp");
                v.m5771("ISAdQualitySegment Builder", sb.toString());
            }
            return this;
        }
    }

    private ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map map) {
        this.f43 = str;
        this.f40 = i;
        this.f42 = str2;
        this.f44 = i2;
        this.f41 = atomicBoolean;
        this.f38 = d;
        this.f39 = j;
        this.f37 = map;
    }

    /* synthetic */ ISAdQualitySegment(String str, int i, String str2, int i2, AtomicBoolean atomicBoolean, double d, long j, Map map, byte b) {
        this(str, i, str2, i2, atomicBoolean, d, j, map);
    }

    public int getAge() {
        return this.f40;
    }

    public Map<String, String> getCustomData() {
        return this.f37;
    }

    public String getGender() {
        return this.f42;
    }

    public double getInAppPurchasesTotal() {
        return this.f38;
    }

    public AtomicBoolean getIsPaying() {
        return this.f41;
    }

    public int getLevel() {
        return this.f44;
    }

    public String getName() {
        return this.f43;
    }

    public long getUserCreationDate() {
        return this.f39;
    }
}
