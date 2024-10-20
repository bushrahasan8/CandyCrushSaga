package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;
import java.util.List;

/* loaded from: AutoValue_InputGroup.class */
final class AutoValue_InputGroup extends InputGroup {
    private final String zza;
    private final List zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InputGroup(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null groupLabel");
        }
        this.zza = str;
        if (list == null) {
            throw new NullPointerException("Null inputActions");
        }
        this.zzb = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputGroup)) {
            return false;
        }
        InputGroup inputGroup = (InputGroup) obj;
        return this.zza.equals(inputGroup.groupLabel()) && this.zzb.equals(inputGroup.inputActions());
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup
    @Keep
    String groupLabel() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup
    @Keep
    List<InputAction> inputActions() {
        return this.zzb;
    }

    public final String toString() {
        String str = this.zza;
        String obj = this.zzb.toString();
        StringBuilder sb = new StringBuilder(str.length() + 37 + obj.length() + 1);
        sb.append("InputGroup{groupLabel=");
        sb.append(str);
        sb.append(", inputActions=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
