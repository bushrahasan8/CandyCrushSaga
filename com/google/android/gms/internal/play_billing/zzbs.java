package com.google.android.gms.internal.play_billing;

/* loaded from: zzbs.class */
final class zzbs extends zzbu {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbs(byte[] bArr, int i, int i2, boolean z, zzbr zzbrVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzdc {
        int i2 = this.zze;
        this.zze = 0;
        int i3 = this.zzc + this.zzd;
        this.zzc = i3;
        if (i3 > 0) {
            this.zzd = i3;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i2;
    }
}
