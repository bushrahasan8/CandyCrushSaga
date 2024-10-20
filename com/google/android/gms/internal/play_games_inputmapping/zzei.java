package com.google.android.gms.internal.play_games_inputmapping;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzei.class */
public class zzei extends zzeh {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzei(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzek) || zzc() != ((zzek) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzei)) {
            return obj.equals(this);
        }
        zzei zzeiVar = (zzei) obj;
        int zzl = zzl();
        int zzl2 = zzeiVar.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzeiVar.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 18 + String.valueOf(zzc2).length());
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (zzc > zzeiVar.zzc()) {
            int zzc3 = zzeiVar.zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 27 + String.valueOf(zzc3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzeiVar.zza;
        zzeiVar.zzd();
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i >= zzc) {
                break;
            }
            if (bArr[i] != bArr2[i2]) {
                z = false;
                break;
            }
            i++;
            i2++;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public byte zza(int i) {
        return this.zza[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final zzek zze(int i, int i2) {
        zzek.zzm(0, i2, zzc());
        return i2 == 0 ? zzek.zzb : new zzef(this.zza, 0, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final void zzf(zzeb zzebVar) throws IOException {
        ((zzen) zzebVar).zzp(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    public final boolean zzh() {
        return zzhr.zzb(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzek
    protected final int zzi(int i, int i2, int i3) {
        return zzfi.zzh(i, this.zza, 0, i3);
    }
}
