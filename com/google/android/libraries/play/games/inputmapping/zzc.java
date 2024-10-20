package com.google.android.libraries.play.games.inputmapping;

import android.content.Context;
import com.google.android.gms.internal.play_games_inputmapping.zzs;
import com.google.android.gms.internal.play_games_inputmapping.zzv;

/* loaded from: zzc.class */
final class zzc implements InputMappingClient {
    private static final zzv zza = zzv.zzg("com/google/android/libraries/play/games/inputmapping/NoOpInputMappingClientImpl");

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(Context context) {
    }

    @Override // com.google.android.libraries.play.games.inputmapping.InputMappingClient
    public final void clearInputMappingProvider() {
        ((zzs) zza.zzc().zzn("com/google/android/libraries/play/games/inputmapping/NoOpInputMappingClientImpl", "clearInputMappingProvider", 22, "NoOpInputMappingClientImpl.java")).zzo("clearInputMappingProvider was called but a device supporting for input sdk was not detected.");
    }

    @Override // com.google.android.libraries.play.games.inputmapping.InputMappingClient
    public final void setInputMappingProvider(InputMappingProvider inputMappingProvider) {
        ((zzs) zza.zzc().zzn("com/google/android/libraries/play/games/inputmapping/NoOpInputMappingClientImpl", "setInputMappingProvider", 15, "NoOpInputMappingClientImpl.java")).zzo("setInputMappingProvider was called but a device supporting for input sdk was not detected.");
    }
}
