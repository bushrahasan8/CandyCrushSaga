package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzey.class */
final class zzey implements zzgc {
    private static final zzey zza = new zzey();

    private zzey() {
    }

    public static zzey zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final boolean zzb(Class cls) {
        return zzfc.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgc
    public final zzgb zzc(Class cls) {
        if (!zzfc.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzgb) zzfc.zzn(cls.asSubclass(zzfc.class)).zzf(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
