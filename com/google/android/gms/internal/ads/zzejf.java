package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: zzejf.class */
final class zzejf extends zzbuc {
    private final zzeiq zza;

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zze(String str) throws RemoteException {
        ((zzekj) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzekj) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzg() throws RemoteException {
        ((zzekj) this.zza.zzc).zzo();
    }
}
