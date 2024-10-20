package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzay.class */
public enum zzay {
    GENERAL(false, true),
    BOOLEAN(false, false),
    CHARACTER(false, false),
    INTEGRAL(true, false),
    FLOAT(true, true);

    private final boolean zzf;

    zzay(boolean z, boolean z2) {
        this.zzf = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza() {
        return this.zzf;
    }
}
