package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzaf.class */
public abstract class zzaf implements zzag {
    public static final zzaf zza = new zzad();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(zza());
        sb.append(", method=");
        sb.append(zzb());
        sb.append(", line=");
        sb.append(zzc());
        if (zzd() != null) {
            sb.append(", file=");
            sb.append(zzd());
        }
        sb.append(" }");
        return sb.toString();
    }

    public abstract String zza();

    public abstract String zzb();

    public abstract int zzc();

    @NullableDecl
    public abstract String zzd();
}
