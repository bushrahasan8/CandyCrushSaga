package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import com.google.android.gms.internal.play_games_inputmapping.zzb;
import com.google.android.gms.internal.play_games_inputmapping.zzc;

@Keep
/* loaded from: InputAction.class */
public abstract class InputAction {
    @Keep
    public static InputAction create(String str, int i, InputControls inputControls) {
        return new AutoValue_InputAction(str, i, inputControls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract String actionLabel();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract InputControls inputControls();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc toProto() {
        zzb zza = zzc.zza();
        zza.zza(actionLabel());
        zza.zzb(uniqueId());
        zza.zzc(inputControls().toProto());
        return (zzc) zza.zzj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract int uniqueId();
}
