package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: zzbq.class */
public abstract class zzbq implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzbq zzb = new zzbn(zzda.zzd);
    private static final zzbp zzd;
    private int zzc = 0;

    static {
        int i = zzbb.zza;
        zzd = new zzbp(null);
        zza = new zzbh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static zzbq zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzbn(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        int i2 = i;
        if (i == 0) {
            int zzd2 = zzd();
            int zze = zze(zzd2, 0, zzd2);
            i2 = zze;
            if (zze == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbg(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzfd.zza(this) : zzfd.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract int zze(int i, int i2, int i3);

    public abstract zzbq zzf(int i, int i2);

    protected abstract String zzg(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzh(zzbf zzbfVar) throws IOException;

    public abstract boolean zzi();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
