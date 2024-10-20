package com.google.android.gms.internal.play_games_inputmapping;

import java.util.logging.Level;

/* loaded from: zzv.class */
public final class zzv extends zzp {
    private static final zzu zza = new zzu(null);

    zzv(zzbc zzbcVar) {
        super(zzbcVar);
    }

    @Deprecated
    public static zzv zzg(String str) {
        zzds.zzb(!str.isEmpty(), "injected class name is empty");
        return new zzv(zzcb.zzd(str.replace('/', '.')));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzp
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzs zza(Level level) {
        boolean zze = zze(level);
        zzcb.zzh(zzd(), level, zze);
        return !zze ? zza : new zzt(this, level, false);
    }
}
