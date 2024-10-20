package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzfaf.class */
public final class zzfaf implements zzexp {
    private final String zza;
    private final String zzb;

    public zzfaf(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbw.zzf((JSONObject) obj, "pii");
            zzf.put("doritos", this.zza);
            zzf.put("doritos_v2", this.zzb);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
