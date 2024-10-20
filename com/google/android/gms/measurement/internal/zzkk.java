package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: zzkk.class */
final class zzkk implements Runnable {
    private final boolean zza;
    private final Uri zzb;
    private final String zzc;
    private final String zzd;
    private final zzkl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkk(zzkl zzklVar, boolean z, Uri uri, String str, String str2) {
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzklVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkl.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
