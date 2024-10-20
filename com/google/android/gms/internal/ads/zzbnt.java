package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbnt.class */
public final class zzbnt implements zzbnu {
    final zzceu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnt(zzbnv zzbnvVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zza(String str) {
        this.zza.zzd(new zzbrm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
