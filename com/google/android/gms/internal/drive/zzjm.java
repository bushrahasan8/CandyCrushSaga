package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzjm.class */
public class zzjm extends zzjl {
    protected final byte[] zzny;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjm(byte[] bArr) {
        bArr.getClass();
        this.zzny = bArr;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjc) || size() != ((zzjc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzjm)) {
            return obj.equals(this);
        }
        zzjm zzjmVar = (zzjm) obj;
        int zzbv = zzbv();
        int zzbv2 = zzjmVar.zzbv();
        if (zzbv == 0 || zzbv2 == 0 || zzbv == zzbv2) {
            return zza(zzjmVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public int size() {
        return this.zzny.length;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final int zza(int i, int i2, int i3) {
        return zzkm.zza(i, this.zzny, zzbw(), i3);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final zzjc zza(int i, int i2) {
        int zzb = zzjc.zzb(0, i2, size());
        return zzb == 0 ? zzjc.zznq : new zzjh(this.zzny, zzbw(), zzb);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final String zza(Charset charset) {
        return new String(this.zzny, zzbw(), size(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zzjc
    public final void zza(zzjb zzjbVar) throws IOException {
        zzjbVar.zza(this.zzny, zzbw(), size());
    }

    @Override // com.google.android.gms.internal.drive.zzjl
    final boolean zza(zzjc zzjcVar, int i, int i2) {
        if (i2 > zzjcVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > zzjcVar.size()) {
            int size2 = zzjcVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzjcVar instanceof zzjm)) {
            return zzjcVar.zza(0, i2).equals(zza(0, i2));
        }
        zzjm zzjmVar = (zzjm) zzjcVar;
        byte[] bArr = this.zzny;
        byte[] bArr2 = zzjmVar.zzny;
        int zzbw = zzbw();
        int zzbw2 = zzbw();
        int zzbw3 = zzjmVar.zzbw();
        while (zzbw2 < zzbw + i2) {
            if (bArr[zzbw2] != bArr2[zzbw3]) {
                return false;
            }
            zzbw2++;
            zzbw3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean zzbu() {
        int zzbw = zzbw();
        return zznf.zze(this.zzny, zzbw, size() + zzbw);
    }

    protected int zzbw() {
        return 0;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzs(int i) {
        return this.zzny[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzt(int i) {
        return this.zzny[i];
    }
}
