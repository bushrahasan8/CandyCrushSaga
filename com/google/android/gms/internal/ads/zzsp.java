package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* loaded from: zzsp.class */
public final class zzsp {
    public final zzsv zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzsp(zzsv zzsvVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzsvVar;
        this.zzb = mediaFormat;
        this.zzc = zzamVar;
        this.zzd = surface;
    }

    public static zzsp zza(zzsv zzsvVar, MediaFormat mediaFormat, zzam zzamVar, MediaCrypto mediaCrypto) {
        return new zzsp(zzsvVar, mediaFormat, zzamVar, null, null, 0);
    }

    public static zzsp zzb(zzsv zzsvVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsp(zzsvVar, mediaFormat, zzamVar, surface, null, 0);
    }
}
