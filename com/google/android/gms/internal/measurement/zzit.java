package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzit.class */
public class zzit extends zziq {
    protected final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzij) || zzb() != ((zzij) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzit)) {
            return obj.equals(this);
        }
        zzit zzitVar = (zzit) obj;
        int zza = zza();
        int zza2 = zzitVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzitVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final zzij zza(int i, int i2) {
        int zza = zzij.zza(0, i2, zzb());
        return zza == 0 ? zzij.zza : new zzin(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzij
    public final void zza(zzig zzigVar) throws IOException {
        zzigVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zziq
    final boolean zza(zzij zzijVar, int i, int i2) {
        if (i2 > zzijVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzb());
        }
        if (i2 > zzijVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zzijVar.zzb());
        }
        if (!(zzijVar instanceof zzit)) {
            return zzijVar.zza(0, i2).equals(zza(0, i2));
        }
        zzit zzitVar = (zzit) zzijVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzitVar.zzb;
        int zze = zze();
        int zze2 = zze();
        int zze3 = zzitVar.zze();
        while (zze2 < zze + i2) {
            if (bArr[zze2] != bArr2[zze3]) {
                return false;
            }
            zze2++;
            zze3++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzij
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    protected final int zzb(int i, int i2, int i3) {
        return zzjw.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzij
    public final boolean zzd() {
        int zze = zze();
        return zznd.zzc(this.zzb, zze, zzb() + zze);
    }

    protected int zze() {
        return 0;
    }
}
