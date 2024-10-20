package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzfvk.class */
final class zzfvk extends zzfun {
    final zzfvl zza;
    private final zzfvq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvk(zzfvl zzfvlVar, zzfvq zzfvqVar) {
        this.zza = zzfvlVar;
        this.zzb = zzfvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuo
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfvo zzc = zzfvp.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
