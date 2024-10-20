package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: zzgyl.class */
public abstract class zzgyl implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgyl zzb = new zzgyh(zzhae.zzd);
    private static final zzgyk zzd;
    private int zzc = 0;

    static {
        int i = zzgxw.zza;
        zzd = new zzgyk(null);
        zza = new zzgyc();
    }

    private static zzgyl zzc(Iterator it, int i) {
        zzgyl zzC;
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            zzC = (zzgyl) it.next();
        } else {
            int i2 = i >>> 1;
            zzgyl zzc = zzc(it, i2);
            zzgyl zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() < zzc2.zzd()) {
                throw new IllegalArgumentException("ByteString would be too long: " + zzc.zzd() + "+" + zzc2.zzd());
            }
            zzC = zzhbx.zzC(zzc, zzc2);
        }
        return zzC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i, int i2, int i3) {
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

    public static zzgyi zzt() {
        return new zzgyi(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgyl zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                size = i;
                if (!it.hasNext()) {
                    break;
                }
                it.next();
                i++;
            }
        } else {
            size = iterable.size();
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgyl zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgyh(bArr2);
    }

    public static zzgyl zzw(String str) {
        return new zzgyh(str.getBytes(zzhae.zzb));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        int i2 = i;
        if (i == 0) {
            int zzd2 = zzd();
            int zzi = zzi(zzd2, 0, zzd2);
            i2 = zzi;
            if (zzi == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzhcn.zza(this) : zzhcn.zza(zzk(0, 47)).concat("..."));
    }

    public final byte[] zzA() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzhae.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzd();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzh();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzi(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgyl zzk(int i, int i2);

    public abstract zzgyt zzl();

    protected abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(zzgya zzgyaVar) throws IOException;

    public abstract boolean zzp();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgyf iterator() {
        return new zzgyb(this);
    }

    public final String zzx(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }
}
