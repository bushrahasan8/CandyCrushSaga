package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import com.google.android.gms.internal.play_games_inputmapping.zzn;
import com.google.android.gms.internal.play_games_inputmapping.zzo;

@Keep
/* loaded from: MouseSettings.class */
public abstract class MouseSettings {
    @Keep
    public static MouseSettings create(boolean z, boolean z2) {
        return new AutoValue_MouseSettings(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract boolean allowMouseSensitivityAdjustment();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract boolean invertMouseMovement();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo toProto() {
        zzn zza = zzo.zza();
        zza.zza(allowMouseSensitivityAdjustment());
        zza.zzb(invertMouseMovement());
        return (zzo) zza.zzj();
    }
}
