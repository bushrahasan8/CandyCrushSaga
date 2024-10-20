package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: zzdmz.class */
public final class zzdmz extends com.google.android.gms.ads.internal.client.zzdp {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzdq zzb;
    private final zzbtk zzc;

    public zzdmz(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbtk zzbtkVar) {
        this.zzb = zzdqVar;
        this.zzc = zzbtkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() throws RemoteException {
        zzbtk zzbtkVar = this.zzc;
        if (zzbtkVar != null) {
            return zzbtkVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() throws RemoteException {
        zzbtk zzbtkVar = this.zzc;
        if (zzbtkVar != null) {
            return zzbtkVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
            if (zzdqVar == null) {
                return null;
            }
            return zzdqVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVar = this.zzb;
            if (zzdqVar != null) {
                zzdqVar.zzm(zzdtVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
