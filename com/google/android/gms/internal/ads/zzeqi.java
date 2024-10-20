package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: zzeqi.class */
public final class zzeqi implements com.google.android.gms.ads.internal.client.zza, zzdiu {
    private com.google.android.gms.ads.internal.client.zzbe zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this) {
            com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
            if (zzbeVar != null) {
                try {
                    zzbeVar.zzb();
                } catch (RemoteException e) {
                    zzcec.zzk("Remote Exception at onAdClicked.", e);
                }
            }
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        synchronized (this) {
            this.zza = zzbeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzbo() {
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() {
        synchronized (this) {
            com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.zza;
            if (zzbeVar != null) {
                try {
                    zzbeVar.zzb();
                } catch (RemoteException e) {
                    zzcec.zzk("Remote Exception at onPhysicalClick.", e);
                }
            }
        }
    }
}
