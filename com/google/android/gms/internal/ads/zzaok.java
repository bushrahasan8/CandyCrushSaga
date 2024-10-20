package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: zzaok.class */
public final class zzaok {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzaok(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i = this.zzd;
        int i2 = i == Integer.MIN_VALUE ? this.zzb : i + this.zzc;
        this.zzd = i2;
        this.zze = this.zza + i2;
    }
}
