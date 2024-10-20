package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.id;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.if, reason: invalid class name */
/* loaded from: if.class */
public final class Cif {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Context f2516;

    /* renamed from: ｋ, reason: contains not printable characters */
    private ih f2517;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f2518;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private id f2519;

    public Cif(Context context, String str, String str2) {
        this.f2516 = context.getApplicationContext();
        this.f2518 = str2;
        this.f2517 = new ih(this.f2516, str);
        this.f2519 = new id(ii.f2594, this.f2516.getPackageName(), ik.m5365(this.f2516), this.f2518);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashMap<String, String> m5336(String str, int i) {
        try {
            HashMap<String, String> m5346 = this.f2517.m5346(str, i);
            HashMap<String, String> hashMap = new HashMap<>();
            for (String str2 : m5346.keySet()) {
                String str3 = m5346.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        hashMap.put(str2, this.f2519.m5335(str3));
                    } catch (id.c e) {
                    }
                }
            }
            return hashMap;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5337(String str) {
        try {
            this.f2517.m5348(str);
        } catch (Throwable th) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m5338(String str) {
        try {
            return this.f2517.m5349(str);
        } catch (Throwable th) {
            return 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5339(String str) {
        try {
            String m5345 = this.f2517.m5345(str);
            String str2 = m5345;
            if (m5345 != null) {
                str2 = m5345;
                if (!TextUtils.isEmpty(m5345)) {
                    try {
                        str2 = this.f2519.m5335(m5345);
                    } catch (id.c e) {
                        str2 = "";
                    }
                }
            }
            return str2;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5340(String str, String str2) {
        try {
            this.f2517.m5347(str, this.f2519.m5334(str2));
        } catch (Throwable th) {
        }
    }
}
