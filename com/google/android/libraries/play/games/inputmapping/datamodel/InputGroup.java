package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import com.google.android.gms.internal.play_games_inputmapping.zzh;
import com.google.android.gms.internal.play_games_inputmapping.zzi;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: InputGroup.class */
public abstract class InputGroup {
    @Keep
    public static InputGroup create(String str, List<InputAction> list) {
        return new AutoValue_InputGroup(str, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract String groupLabel();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract List<InputAction> inputActions();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi toProto() {
        zzh zza = zzi.zza();
        Iterator<InputAction> it = inputActions().iterator();
        while (it.hasNext()) {
            zza.zzb(it.next().toProto());
        }
        zza.zza(groupLabel());
        return (zzi) zza.zzj();
    }
}
