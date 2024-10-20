package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import java.util.List;

/* loaded from: AutoValue_InputControls.class */
final class AutoValue_InputControls extends InputControls {
    private final List zza;
    private final List zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InputControls(List list, List list2) {
        if (list == null) {
            throw new NullPointerException("Null keycodes");
        }
        this.zza = list;
        if (list2 == null) {
            throw new NullPointerException("Null mouseActions");
        }
        this.zzb = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputControls)) {
            return false;
        }
        InputControls inputControls = (InputControls) obj;
        return this.zza.equals(inputControls.keycodes()) && this.zzb.equals(inputControls.mouseActions());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputControls
    @Keep
    List<Integer> keycodes() {
        return this.zza;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputControls
    @Keep
    List<Integer> mouseActions() {
        return this.zzb;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 38 + obj2.length() + 1);
        sb.append("InputControls{keycodes=");
        sb.append(obj);
        sb.append(", mouseActions=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
