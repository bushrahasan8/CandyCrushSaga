package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: AutoValue_InputMap.class */
public final class AutoValue_InputMap extends InputMap {
    private final List zza;
    private final MouseSettings zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InputMap(List list, MouseSettings mouseSettings) {
        if (list == null) {
            throw new NullPointerException("Null inputGroups");
        }
        this.zza = list;
        if (mouseSettings == null) {
            throw new NullPointerException("Null mouseSettings");
        }
        this.zzb = mouseSettings;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputMap)) {
            return false;
        }
        InputMap inputMap = (InputMap) obj;
        return this.zza.equals(inputMap.inputGroups()) && this.zzb.equals(inputMap.mouseSettings());
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputMap
    @Keep
    public List<InputGroup> inputGroups() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputMap
    @Keep
    public MouseSettings mouseSettings() {
        return this.zzb;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 37 + obj2.length() + 1);
        sb.append("InputMap{inputGroups=");
        sb.append(obj);
        sb.append(", mouseSettings=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
