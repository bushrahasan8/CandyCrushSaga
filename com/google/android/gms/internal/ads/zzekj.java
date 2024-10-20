package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: zzekj.class */
public final class zzekj extends zzbta implements zzdch {
    private zzbtb zza;
    private zzdcg zzb;

    @Override // com.google.android.gms.internal.ads.zzdch
    public final void zza(zzdcg zzdcgVar) {
        synchronized (this) {
            this.zzb = zzdcgVar;
        }
    }

    public final void zzc(zzbtb zzbtbVar) {
        synchronized (this) {
            this.zza = zzbtbVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zze() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzf() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzg(int i) throws RemoteException {
        synchronized (this) {
            zzdcg zzdcgVar = this.zzb;
            if (zzdcgVar != null) {
                zzdcgVar.zza(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        synchronized (this) {
            zzdcg zzdcgVar = this.zzb;
            if (zzdcgVar != null) {
                zzdcgVar.zzb(zzeVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzi(int i, String str) throws RemoteException {
        synchronized (this) {
            zzdcg zzdcgVar = this.zzb;
            if (zzdcgVar != null) {
                zzdcgVar.zzc(i, str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzj(int i) throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzj(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzk(zzeVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzl(String str) throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzl(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzm() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzm();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzn() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzn();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzo() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzo();
            }
            zzdcg zzdcgVar = this.zzb;
            if (zzdcgVar != null) {
                zzdcgVar.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzp() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzp();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzq(String str, String str2) throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzq(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzr(zzbkg zzbkgVar, String str) throws RemoteException {
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzs(zzcag zzcagVar) throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzs(zzcagVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzt(zzcak zzcakVar) throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzt(zzcakVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzu() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzu();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzv() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzw() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzw();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzx() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzx();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzy() throws RemoteException {
        synchronized (this) {
            zzbtb zzbtbVar = this.zza;
            if (zzbtbVar != null) {
                zzbtbVar.zzy();
            }
        }
    }
}
