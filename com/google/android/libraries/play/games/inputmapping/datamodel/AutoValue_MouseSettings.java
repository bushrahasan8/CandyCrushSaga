package com.google.android.libraries.play.games.inputmapping.datamodel;

import androidx.annotation.Keep;

/* loaded from: AutoValue_MouseSettings.class */
final class AutoValue_MouseSettings extends MouseSettings {
    private final boolean zza;
    private final boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_MouseSettings(boolean z, boolean z2) {
        this.zza = z;
        this.zzb = z2;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings
    @Keep
    boolean allowMouseSensitivityAdjustment() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MouseSettings)) {
            return false;
        }
        MouseSettings mouseSettings = (MouseSettings) obj;
        return this.zza == mouseSettings.allowMouseSensitivityAdjustment() && this.zzb == mouseSettings.invertMouseMovement();
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = true != this.zza ? 1237 : 1231;
        if (true != this.zzb) {
            i = 1237;
        }
        return ((i2 ^ 1000003) * 1000003) ^ i;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings
    @Keep
    boolean invertMouseMovement() {
        return this.zzb;
    }

    public final String toString() {
        boolean z = this.zza;
        boolean z2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 68 + String.valueOf(z2).length() + 1);
        sb.append("MouseSettings{allowMouseSensitivityAdjustment=");
        sb.append(z);
        sb.append(", invertMouseMovement=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
