package com.google.android.gms.internal.ads;

/* loaded from: zzdft.class */
public final class zzdft implements zzdds {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbg)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbh)).booleanValue()) {
                try {
                    this.zza = zzfgyVar.zzb.zzb.zzc;
                } catch (NullPointerException e) {
                }
            }
        }
    }

    public final int zzc() {
        int i;
        synchronized (this) {
            i = this.zza;
        }
        return i;
    }
}
