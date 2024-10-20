package com.google.android.gms.internal.play_games_inputmapping;

import java.util.logging.Level;

/* loaded from: zzcp.class */
public final class zzcp implements zzci {
    private final String zza;
    private final Level zzb;

    public zzcp() {
        this("", true, false, Level.ALL, false);
    }

    private zzcp(String str, boolean z, boolean z2, Level level, boolean z3) {
        this.zza = "";
        this.zzb = level;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzci
    public final zzbc zza(String str) {
        return new zzcr(this.zza, str, true, false, this.zzb, null);
    }

    public final zzcp zzb(boolean z) {
        return new zzcp(this.zza, true, false, Level.OFF, false);
    }
}
