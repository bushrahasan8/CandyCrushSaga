package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: zzbwg.class */
public final class zzbwg {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbwg(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final NativeCustomFormatAd zzf(zzbkg zzbkgVar) {
        synchronized (this) {
            NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
            if (nativeCustomFormatAd != null) {
                return nativeCustomFormatAd;
            }
            zzbwh zzbwhVar = new zzbwh(zzbkgVar);
            this.zzc = zzbwhVar;
            return zzbwhVar;
        }
    }

    public final zzbkq zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbwd(this, null);
    }

    public final zzbkt zzb() {
        return new zzbwf(this, null);
    }
}
