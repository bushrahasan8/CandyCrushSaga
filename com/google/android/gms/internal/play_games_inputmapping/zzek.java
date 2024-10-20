package com.google.android.gms.internal.play_games_inputmapping;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: zzek.class */
public abstract class zzek implements Iterable, Serializable {
    public static final zzek zzb = new zzei(zzfi.zzd);
    private static final Comparator zzc;
    private static final zzej zzd;
    private int zza = 0;

    static {
        int i = zzea.zza;
        zzd = new zzej(null);
        zzc = new zzed();
    }

    public static zzek zzj(String str) {
        return new zzei(str.getBytes(zzfi.zzb));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb.append("End index: ");
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        int i2 = i;
        if (i == 0) {
            int zzc2 = zzc();
            int zzi = zzi(zzc2, 0, zzc2);
            i2 = zzi;
            if (zzi == 0) {
                i2 = 1;
            }
            this.zza = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzec(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzhb.zza(this) : zzhb.zza(zze(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzc();

    public abstract zzek zze(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(zzeb zzebVar) throws IOException;

    protected abstract String zzg(Charset charset);

    public abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    public final String zzk(Charset charset) {
        return zzc() == 0 ? "" : zzg(charset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzl() {
        return this.zza;
    }
}
