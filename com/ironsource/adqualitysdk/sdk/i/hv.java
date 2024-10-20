package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: hv.class */
public final class hv {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static hv f2448;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final hn f2450 = new hn();

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ib f2449 = new ib();

    private hv() {
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static hv m5211() {
        hv hvVar;
        synchronized (hv.class) {
            try {
                if (f2448 == null) {
                    f2448 = new hv();
                }
                hvVar = f2448;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hvVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5212() {
        synchronized (hv.class) {
            try {
                f2448 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final hn m5213() {
        return this.f2450;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ib m5214() {
        return this.f2449;
    }
}
