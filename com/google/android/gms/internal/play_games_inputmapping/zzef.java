package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzef.class */
final class zzef extends zzei {
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzef(byte[] bArr, int i, int i2) {
        super(bArr);
        zzek.zzm(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei, com.google.android.gms.internal.play_games_inputmapping.zzek
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzei) this).zza[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei, com.google.android.gms.internal.play_games_inputmapping.zzek
    public final byte zzb(int i) {
        return ((zzei) this).zza[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei, com.google.android.gms.internal.play_games_inputmapping.zzek
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzei
    protected final int zzd() {
        return 0;
    }
}
