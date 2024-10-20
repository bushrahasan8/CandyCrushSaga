package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: zzfsf.class */
public final class zzfsf {
    private final zzayf zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfsf(zzayf zzayfVar, File file, File file2, File file3) {
        this.zza = zzayfVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzayf zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zze() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsf.zze():byte[]");
    }
}
