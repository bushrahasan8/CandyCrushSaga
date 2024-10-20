package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: zzdmj.class */
public final class zzdmj extends zzbji {
    private final zzdna zza;
    private IObjectWrapper zzb;

    public zzdmj(zzdna zzdnaVar) {
        this.zza = zzdnaVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zze() throws RemoteException {
        float f;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgm)).booleanValue()) {
            f = 0.0f;
        } else {
            if (this.zza.zzb() != 0.0f) {
                return this.zza.zzb();
            }
            if (this.zza.zzj() != null) {
                try {
                    f = this.zza.zzj().zze();
                } catch (RemoteException e) {
                    zzcec.zzh("Remote exception getting video controller aspect ratio.", e);
                    f = 0.0f;
                }
            } else {
                IObjectWrapper iObjectWrapper = this.zzb;
                if (iObjectWrapper != null) {
                    f = zzb(iObjectWrapper);
                } else {
                    zzbjm zzm = this.zza.zzm();
                    if (zzm == null) {
                        f = 0.0f;
                    } else {
                        f = (zzm.zzd() == -1 || zzm.zzc() == -1) ? 0.0f : zzm.zzd() / zzm.zzc();
                        if (f == 0.0f) {
                            return zzb(zzm.zzf());
                        }
                    }
                }
            }
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zzf() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgn)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final float zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgn)).booleanValue() && this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgn)).booleanValue()) {
            return this.zza.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbjm zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final boolean zzk() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgn)).booleanValue()) {
            return this.zza.zzaf();
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final boolean zzl() throws RemoteException {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgn)).booleanValue() && this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zzm(zzbku zzbkuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgn)).booleanValue() && (this.zza.zzj() instanceof zzcki)) {
            ((zzcki) this.zza.zzj()).zzv(zzbkuVar);
        }
    }
}
