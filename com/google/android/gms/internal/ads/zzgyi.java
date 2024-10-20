package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: zzgyi.class */
public final class zzgyi extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgyi(int i) {
    }

    private final void zzd(int i) {
        this.zzc.add(new zzgyh(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        synchronized (this) {
            if (this.zzf == this.zze.length) {
                zzd(1);
            }
            byte[] bArr = this.zze;
            int i2 = this.zzf;
            this.zzf = i2 + 1;
            bArr[i2] = (byte) i;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this) {
            byte[] bArr2 = this.zze;
            int length = bArr2.length;
            int i3 = this.zzf;
            int i4 = length - i3;
            if (i2 <= i4) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.zzf += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i4);
            int i5 = i2 - i4;
            zzd(i5);
            System.arraycopy(bArr, i + i4, this.zze, 0, i5);
            this.zzf = i5;
        }
    }

    public final int zza() {
        int i;
        int i2;
        synchronized (this) {
            i = this.zzd;
            i2 = this.zzf;
        }
        return i + i2;
    }

    public final zzgyl zzb() {
        zzgyl zzu;
        synchronized (this) {
            int i = this.zzf;
            byte[] bArr = this.zze;
            if (i >= bArr.length) {
                this.zzc.add(new zzgyh(this.zze));
                this.zze = zza;
            } else if (i > 0) {
                this.zzc.add(new zzgyh(Arrays.copyOf(bArr, i)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
            zzu = zzgyl.zzu(this.zzc);
        }
        return zzu;
    }

    public final void zzc() {
        synchronized (this) {
            this.zzc.clear();
            this.zzd = 0;
            this.zzf = 0;
        }
    }
}
