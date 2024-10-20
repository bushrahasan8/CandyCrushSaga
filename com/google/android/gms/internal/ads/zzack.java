package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.ExecutionOptions;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: zzack.class */
public final class zzack implements zzacv {
    private final zzu zzb;
    private final long zzc;
    private long zzd;
    private int zzf;
    private int zzg;
    private byte[] zze = new byte[ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH];
    private final byte[] zza = new byte[4096];

    static {
        zzbq.zzb("media3.extractor");
    }

    public zzack(zzu zzuVar, long j, long j2) {
        this.zzb = zzuVar;
        this.zzd = j;
        this.zzc = j2;
    }

    private final int zzp(byte[] bArr, int i, int i2) {
        int i3 = this.zzg;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.zze, 0, bArr, i, min);
        zzu(min);
        return min;
    }

    private final int zzq(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int zza = this.zzb.zza(bArr, i + i3, i2 - i3);
        if (zza != -1) {
            return i3 + zza;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final int zzr(int i) {
        int min = Math.min(this.zzg, i);
        zzu(min);
        return min;
    }

    private final void zzs(int i) {
        if (i != -1) {
            this.zzd += i;
        }
    }

    private final void zzt(int i) {
        int i2 = this.zzf + i;
        int length = this.zze.length;
        if (i2 > length) {
            this.zze = Arrays.copyOf(this.zze, Math.max(ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH + i2, Math.min(length + length, i2 + 524288)));
        }
    }

    private final void zzu(int i) {
        int i2 = this.zzg - i;
        this.zzg = i2;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.zze = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zzp = zzp(bArr, i, i2);
        int i3 = zzp;
        if (zzp == 0) {
            i3 = zzq(bArr, i, i2, 0, true);
        }
        zzs(i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        int min;
        zzt(i2);
        int i3 = this.zzg;
        int i4 = this.zzf;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = zzq(this.zze, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.zzg += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.zze, this.zzf, bArr, i, min);
        this.zzf += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final int zzc(int i) throws IOException {
        int zzr = zzr(1);
        int i2 = zzr;
        if (zzr == 0) {
            i2 = zzq(this.zza, 0, Math.min(1, 4096), 0, true);
        }
        zzs(i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zze() {
        return this.zzd + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzg(int i) throws IOException {
        zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzh(byte[] bArr, int i, int i2) throws IOException {
        zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzi(byte[] bArr, int i, int i2) throws IOException {
        zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzj() {
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzk(int i) throws IOException {
        zzo(i, false);
    }

    public final boolean zzl(int i, boolean z) throws IOException {
        zzt(i);
        int i2 = this.zzg - this.zzf;
        while (i2 < i) {
            i2 = zzq(this.zze, this.zzf, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.zzg = this.zzf + i2;
        }
        this.zzf += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!zzl(i2, z)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i2, bArr, i, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int i3;
        int zzp = zzp(bArr, i, i2);
        while (true) {
            i3 = zzp;
            if (i3 >= i2 || i3 == -1) {
                break;
            }
            zzp = zzq(bArr, i, i2, i3, z);
        }
        zzs(i3);
        return i3 != -1;
    }

    public final boolean zzo(int i, boolean z) throws IOException {
        int i2;
        int zzr = zzr(i);
        while (true) {
            i2 = zzr;
            if (i2 >= i || i2 == -1) {
                break;
            }
            zzr = zzq(this.zza, -i2, Math.min(i, i2 + 4096), i2, false);
        }
        zzs(i2);
        return i2 != -1;
    }
}
