package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzbsi.class */
final class zzbsi implements zzbnu {
    final zzbsj zza;
    private final zzceu zzb;

    public zzbsi(zzbsj zzbsjVar, zzceu zzceuVar) {
        this.zza = zzbsjVar;
        this.zzb = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbrm());
            } else {
                this.zzb.zzd(new zzbrm(str));
            }
        } catch (IllegalStateException e) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException e) {
        } catch (JSONException e2) {
            this.zzb.zzd(e2);
        }
    }
}
