package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;

/* loaded from: AutoValue_InputAction.class */
final class AutoValue_InputAction extends InputAction {
    private final String zza;
    private final int zzb;
    private final InputControls zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InputAction(String str, int i, InputControls inputControls) {
        if (str == null) {
            throw new NullPointerException("Null actionLabel");
        }
        this.zza = str;
        this.zzb = i;
        if (inputControls == null) {
            throw new NullPointerException("Null inputControls");
        }
        this.zzc = inputControls;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputAction
    @Keep
    String actionLabel() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputAction)) {
            return false;
        }
        InputAction inputAction = (InputAction) obj;
        return this.zza.equals(inputAction.actionLabel()) && this.zzb == inputAction.uniqueId() && this.zzc.equals(inputAction.inputControls());
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputAction
    @Keep
    InputControls inputControls() {
        return this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        int i = this.zzb;
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(i).length() + 16 + obj.length() + 1);
        sb.append("InputAction{actionLabel=");
        sb.append(str);
        sb.append(", uniqueId=");
        sb.append(i);
        sb.append(", inputControls=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputAction
    @Keep
    int uniqueId() {
        return this.zzb;
    }
}
