package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: zzeqp.class */
public final class zzeqp {
    private final zzequ zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzeqp(zzequ zzequVar, String str) {
        this.zza = zzequVar;
        this.zzb = str;
    }

    public final String zza() {
        String str;
        synchronized (this) {
            str = null;
            try {
                com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
                if (zzdnVar != null) {
                    str = zzdnVar.zzg();
                }
            } catch (RemoteException e) {
                zzcec.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        return str;
    }

    public final String zzb() {
        String str;
        synchronized (this) {
            str = null;
            try {
                com.google.android.gms.ads.internal.client.zzdn zzdnVar = this.zzc;
                if (zzdnVar != null) {
                    str = zzdnVar.zzg();
                }
            } catch (RemoteException e) {
                zzcec.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        return str;
    }

    public final void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        synchronized (this) {
            this.zzc = null;
            zzeqv zzeqvVar = new zzeqv(i);
            zzeqo zzeqoVar = new zzeqo(this);
            this.zza.zzb(zzlVar, this.zzb, zzeqvVar, zzeqoVar);
        }
    }

    public final boolean zze() throws RemoteException {
        boolean zza;
        synchronized (this) {
            zza = this.zza.zza();
        }
        return zza;
    }
}
