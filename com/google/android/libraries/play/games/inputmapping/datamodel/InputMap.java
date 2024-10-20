package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import com.google.android.gms.internal.play_games_inputmapping.zzk;
import com.google.android.gms.internal.play_games_inputmapping.zzl;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: InputMap.class */
public abstract class InputMap {
    @Keep
    public static InputMap create(List<InputGroup> list, MouseSettings mouseSettings) {
        return new AutoValue_InputMap(list, mouseSettings);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract List<InputGroup> inputGroups();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract MouseSettings mouseSettings();

    public zzl toProto() {
        zzk zza = zzl.zza();
        Iterator<InputGroup> it = inputGroups().iterator();
        while (it.hasNext()) {
            zza.zza(it.next().toProto());
        }
        zza.zzb(mouseSettings().toProto());
        return (zzl) zza.zzj();
    }
}
