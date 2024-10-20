package com.unity3d.ads.core.data.datasource;

import com.ironsource.jb;

/* loaded from: AndroidKnownStore.class */
public enum AndroidKnownStore {
    GOOGLE("com.android.vending"),
    GOOGLE_MARKET(jb.a),
    AMAZON("com.amazon.venezia"),
    SAMSUNG("com.sec.android.app.samsungapps"),
    XIAOMI("com.xiaomi.market"),
    HUAWEI("com.huawei.appmarket"),
    OPPO("com.oppo.market"),
    VIVO("com.bbk.appstore"),
    UNKNOWN("unknown");

    private final String packageName;

    AndroidKnownStore(String str) {
        this.packageName = str;
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
