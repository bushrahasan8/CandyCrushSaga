package com.google.android.gms.internal.play_games_inputmapping;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: zzco.class */
final class zzco extends zzcs {
    private static final zzco zza = new zzco(zzcs.zze());
    private final AtomicReference zzb;

    zzco(zzcs zzcsVar) {
        this.zzb = new AtomicReference(zzcsVar);
    }

    public static final zzco zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcs
    public final boolean zzb(String str, Level level, boolean z) {
        ((zzcs) this.zzb.get()).zzb(str, level, z);
        return false;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcs
    public final zzdf zzc() {
        return ((zzcs) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzcs
    public final zzbg zzd() {
        return ((zzcs) this.zzb.get()).zzd();
    }
}
