package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: zzfip.class */
public final class zzfip implements zzdba {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcdp zzc;

    public zzfip(Context context, zzcdp zzcdpVar) {
        this.zzb = context;
        this.zzc = zzcdpVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(com.google.android.gms.ads.internal.client.zze zzeVar) {
        synchronized (this) {
            if (zzeVar.zza != 3) {
                this.zzc.zzl(this.zza);
            }
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this) {
            this.zza.clear();
            this.zza.addAll(hashSet);
        }
    }
}
