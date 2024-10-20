package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzbf.class */
final class zzbf extends zzbg {
    static final zzbf zza = new zzbf();

    private zzbf() {
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    public final zzar zzb(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    public final Object zzc(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbg
    @NullableDecl
    public final Object zzd(zzar zzarVar) {
        return null;
    }
}
