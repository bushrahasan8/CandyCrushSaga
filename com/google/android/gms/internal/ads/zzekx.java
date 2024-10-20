package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: zzekx.class */
final class zzekx extends zzbui {
    private final zzeiq zza;

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zze(String str) throws RemoteException {
        ((zzekj) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzekj) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void zzg() throws RemoteException {
        ((zzekj) this.zza.zzc).zzo();
    }
}
