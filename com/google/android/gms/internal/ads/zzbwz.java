package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: zzbwz.class */
public final class zzbwz {
    public final boolean zza;
    public final String zzb;

    public zzbwz(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbwz zza(JSONObject jSONObject) {
        return new zzbwz(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
