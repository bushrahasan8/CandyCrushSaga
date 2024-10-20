package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ir.class */
public final class ir {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f2620;

    /* renamed from: ｋ, reason: contains not printable characters */
    private b f2621;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f2622;

    /* loaded from: ir$b.class */
    public static final class b {

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f2623;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private int f2624;

        public b(int i, String str) {
            this.f2624 = i;
            this.f2623 = str;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final int m5375() {
            return this.f2624;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final String m5376() {
            return this.f2623;
        }
    }

    public ir(String str, int i, String str2, long j) {
        this.f2622 = str;
        this.f2620 = j;
        this.f2621 = new b(i, str2);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m5371() throws JSONException {
        return !TextUtils.isEmpty(this.f2622) ? new JSONObject(this.f2622) : new JSONObject();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m5372() {
        return this.f2622;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final b m5373() {
        return this.f2621;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final long m5374() {
        return this.f2620;
    }
}
