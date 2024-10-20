package com.google.android.gms.internal.play_games_inputmapping;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzgo.class */
public final class zzgo implements zzgb {
    private final zzge zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgo(zzge zzgeVar, String str, Object[] objArr) {
        this.zza = zzgeVar;
        this.zzb = str;
        this.zzc = objArr;
        int charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i3++;
                i2 += 13;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgb
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgb
    public final zzge zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgb
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
