package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;

@Deprecated
/* loaded from: CustomEventExtras.class */
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    public Object getExtra(String str) {
        return this.zza.get(str);
    }

    public void setExtra(String str, Object obj) {
        this.zza.put(str, obj);
    }
}
