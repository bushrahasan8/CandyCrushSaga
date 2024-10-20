package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: zziu.class */
public abstract class zziu {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zziy zzc;
    private int zze;
    private boolean zzf;

    private zziu() {
        this.zzb = zzd;
        this.zze = Integer.MAX_VALUE;
        this.zzf = false;
    }

    public static int zza(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zziu zza(byte[] bArr, int i, int i2, boolean z) {
        zzix zzixVar = new zzix(bArr, i2);
        try {
            zzixVar.zzb(i2);
            return zzixVar;
        } catch (zzkb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzb(int i) throws zzkb;

    public abstract int zzc();

    public abstract void zzc(int i) throws zzkb;

    public abstract int zzd() throws IOException;

    public abstract void zzd(int i);

    public abstract int zze() throws IOException;

    public abstract boolean zze(int i) throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzij zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;
}
