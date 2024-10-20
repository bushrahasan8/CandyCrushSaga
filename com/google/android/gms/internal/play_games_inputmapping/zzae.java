package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzae.class */
final class zzae extends zzaf {
    private final String zzb;
    private final String zzc;
    private final int zzd;

    @NullableDecl
    private final String zze;
    private int zzf = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzae(String str, String str2, int i, String str3, zzad zzadVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i;
        this.zze = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        return this.zzb.equals(zzaeVar.zzb) && this.zzc.equals(zzaeVar.zzc) && this.zzd == zzaeVar.zzd;
    }

    public final int hashCode() {
        int i = this.zzf;
        int i2 = i;
        if (i == 0) {
            i2 = ((((this.zzb.hashCode() + 4867) * 31) + this.zzc.hashCode()) * 31) + this.zzd;
            this.zzf = i2;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    public final String zza() {
        return this.zzb.replace('/', '.');
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    public final int zzc() {
        return (char) this.zzd;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzaf
    @NullableDecl
    public final String zzd() {
        return this.zze;
    }
}
