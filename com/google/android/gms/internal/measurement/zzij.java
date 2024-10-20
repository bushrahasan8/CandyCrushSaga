package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: zzij.class */
public abstract class zzij implements Serializable, Iterable<Byte> {
    public static final zzij zza = new zzit(zzjw.zzb);
    private static final zzim zzb = new zzis();
    private static final Comparator<zzij> zzc = new zzil();
    private int zzd = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, int i2, int i3) {
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

    public static zzij zza(String str) {
        return new zzit(str.getBytes(zzjw.zza));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzij zza(byte[] bArr) {
        return new zzit(bArr);
    }

    public static zzij zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzit(zzb.zza(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzio zzc(int i) {
        return new zzio(i);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzd;
        int i2 = i;
        if (i == 0) {
            int zzb2 = zzb();
            int zzb3 = zzb(zzb2, 0, zzb2);
            i2 = zzb3;
            if (zzb3 == 0) {
                i2 = 1;
            }
            this.zzd = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzii(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb2 = zzb();
        if (zzb() <= 50) {
            str = zzmp.zza(this);
        } else {
            str = zzmp.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, Integer.valueOf(zzb2), str);
    }

    public abstract byte zza(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza() {
        return this.zzd;
    }

    public abstract zzij zza(int i, int i2);

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzig zzigVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzb();

    protected abstract int zzb(int i, int i2, int i3);

    public final String zzc() {
        return zzb() == 0 ? "" : zza(zzjw.zza);
    }

    public abstract boolean zzd();
}
