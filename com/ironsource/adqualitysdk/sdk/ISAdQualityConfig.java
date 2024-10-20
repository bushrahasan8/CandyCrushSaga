package com.ironsource.adqualitysdk.sdk;

import com.ironsource.adqualitysdk.sdk.i.kf;
import com.ironsource.adqualitysdk.sdk.i.v;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: ISAdQualityConfig.class */
public class ISAdQualityConfig {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean f2;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f3;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private String f4;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private final Map f5;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f6;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f7;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f8;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityLogLevel f9;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private ISAdQualityInitListener f10;

    /* loaded from: ISAdQualityConfig$Builder.class */
    public static class Builder {

        /* renamed from: ﱟ, reason: contains not printable characters */
        private ISAdQualityInitListener f12;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private final int f20 = 5;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f19 = null;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private boolean f16 = false;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f17 = false;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityLogLevel f18 = ISAdQualityLogLevel.INFO;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private String f14 = null;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private boolean f13 = false;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private ISAdQualityDeviceIdType f15 = ISAdQualityDeviceIdType.NONE;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private final Map f11 = new HashMap();

        public ISAdQualityConfig build() {
            return new ISAdQualityConfig(this.f19, this.f16, this.f17, this.f18, this.f12, this.f14, this.f13, this.f15, this.f11, (byte) 0);
        }

        public Builder setAdQualityInitListener(ISAdQualityInitListener iSAdQualityInitListener) {
            this.f12 = iSAdQualityInitListener;
            return this;
        }

        public Builder setCoppa(boolean z) {
            this.f13 = z;
            return this;
        }

        public Builder setDeviceIdType(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
            this.f15 = iSAdQualityDeviceIdType;
            return this;
        }

        public Builder setInitializationSource(String str) {
            if (kf.m5673(str, 20)) {
                this.f14 = str;
            } else {
                StringBuilder sb = new StringBuilder("setInitializationSource( ");
                sb.append(str);
                sb.append(" ) init source must have length of 1-20");
                v.m5771("ISAdQualityConfig", sb.toString());
            }
            return this;
        }

        public Builder setLogLevel(ISAdQualityLogLevel iSAdQualityLogLevel) {
            this.f18 = iSAdQualityLogLevel;
            return this;
        }

        public Builder setMetaData(String str, String str2) {
            try {
                if (this.f11.size() >= 5) {
                    StringBuilder sb = new StringBuilder("setMetaData( ");
                    sb.append(str);
                    sb.append(" , ");
                    sb.append(str2);
                    sb.append(" ) limited to 5 meta data values. Ignoring meta data value.");
                    v.m5771("ISAdQualityConfig", sb.toString());
                } else if (kf.m5673(str, 64) && kf.m5673(str2, 64)) {
                    this.f11.put(str, str2);
                } else {
                    StringBuilder sb2 = new StringBuilder("setMetaData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) the length of both the key and the value should be between 1 and 64 characters.");
                    v.m5771("ISAdQualityConfig", sb2.toString());
                }
            } catch (Exception e) {
            }
            return this;
        }

        public Builder setMetaData(JSONObject jSONObject) {
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.names().length(); i++) {
                    try {
                        String string = jSONObject.names().getString(i);
                        Object opt = jSONObject.opt(string);
                        if (opt instanceof String) {
                            setMetaData(string, (String) opt);
                        } else {
                            StringBuilder sb = new StringBuilder("setMetaData( ");
                            sb.append(string);
                            sb.append(" , ");
                            sb.append(opt);
                            sb.append(" ) value must be a string");
                            v.m5771("ISAdQualityConfig", sb.toString());
                        }
                    } catch (Exception e) {
                    }
                }
            }
            return this;
        }

        public Builder setTestMode(boolean z) {
            this.f17 = z;
            return this;
        }

        public Builder setUserId(String str) {
            this.f19 = str;
            this.f16 = true;
            return this;
        }
    }

    private ISAdQualityConfig(String str, boolean z, boolean z2, ISAdQualityLogLevel iSAdQualityLogLevel, ISAdQualityInitListener iSAdQualityInitListener, String str2, boolean z3, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map) {
        this.f6 = str;
        this.f7 = z;
        this.f8 = z2;
        this.f9 = iSAdQualityLogLevel;
        this.f10 = iSAdQualityInitListener;
        this.f4 = str2;
        this.f2 = z3;
        this.f3 = iSAdQualityDeviceIdType;
        this.f5 = map;
    }

    /* synthetic */ ISAdQualityConfig(String str, boolean z, boolean z2, ISAdQualityLogLevel iSAdQualityLogLevel, ISAdQualityInitListener iSAdQualityInitListener, String str2, boolean z3, ISAdQualityDeviceIdType iSAdQualityDeviceIdType, Map map, byte b) {
        this(str, z, z2, iSAdQualityLogLevel, iSAdQualityInitListener, str2, z3, iSAdQualityDeviceIdType, map);
    }

    public ISAdQualityInitListener getAdQualityInitListener() {
        return this.f10;
    }

    public boolean getCoppa() {
        return this.f2;
    }

    public ISAdQualityDeviceIdType getDeviceIdType() {
        return this.f3;
    }

    public String getInitializationSource() {
        return this.f4;
    }

    public ISAdQualityLogLevel getLogLevel() {
        return this.f9;
    }

    public Map<String, String> getMetaData() {
        return this.f5;
    }

    public String getUserId() {
        return this.f6;
    }

    public boolean isTestMode() {
        return this.f8;
    }

    public boolean isUserIdSet() {
        return this.f7;
    }
}
