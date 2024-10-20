package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import com.google.android.gms.internal.play_games_inputmapping.zze;
import com.google.android.gms.internal.play_games_inputmapping.zzf;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: InputControls.class */
public abstract class InputControls {

    @Keep
    public static final int MOUSE_ACTION_UNSPECIFIED = 0;

    @Keep
    public static final int MOUSE_BACK_CLICK = 4;

    @Keep
    public static final int MOUSE_FORWARD_CLICK = 3;

    @Keep
    public static final int MOUSE_LEFT_CLICK = 10;

    @Keep
    public static final int MOUSE_LEFT_DRAG = 8;

    @Keep
    public static final int MOUSE_MOVEMENT = 7;

    @Keep
    public static final int MOUSE_RIGHT_CLICK = 1;

    @Keep
    public static final int MOUSE_RIGHT_DRAG = 9;

    @Keep
    public static final int MOUSE_SCROLL_DOWN = 6;

    @Keep
    public static final int MOUSE_SCROLL_UP = 5;

    @Keep
    public static final int MOUSE_TERTIARY_CLICK = 2;

    @Keep
    public static InputControls create(List<Integer> list, List<Integer> list2) {
        return new AutoValue_InputControls(list, list2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract List<Integer> keycodes();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public abstract List<Integer> mouseActions();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf toProto() {
        zze zza = zzf.zza();
        Iterator<Integer> it = keycodes().iterator();
        while (it.hasNext()) {
            zza.zza(it.next().intValue());
        }
        zza.zzb(mouseActions());
        return (zzf) zza.zzj();
    }
}
