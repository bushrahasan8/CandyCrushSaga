package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: zzcrp.class */
final class zzcrp implements zzcqw {
    private final zzcbx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrp(zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqw
    public final void zza(JSONObject jSONObject) {
        this.zza.zzb(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa") ? 1 : 0, jSONObject.optLong("timestamp"));
    }
}
