package com.google.android.gms.internal.play_games_inputmapping;

import android.util.Log;

/* loaded from: zzcg.class */
public abstract class zzcg extends zzbc {
    private final String zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcg(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbc
    public void zzd(RuntimeException runtimeException, zzba zzbaVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
