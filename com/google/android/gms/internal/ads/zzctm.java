package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzctm.class */
public final class zzctm implements zzhhd {
    private final zzhhu zza;

    public zzctm(zzhhu zzhhuVar) {
        this.zza = zzhhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(((zzcwy) this.zza).zza().zzA);
        } catch (JSONException e) {
            jSONObject = null;
        }
        return jSONObject;
    }
}
