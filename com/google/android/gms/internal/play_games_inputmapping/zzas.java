package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzas.class */
final class zzas implements zzag {
    private final zzag zza;
    private final Object zzb;

    private zzas(zzag zzagVar, Object obj) {
        zzds.zza(zzagVar, "log site key");
        this.zza = zzagVar;
        zzds.zza(obj, "log site qualifier");
        this.zzb = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzag zza(zzag zzagVar, Object obj) {
        return new zzas(zzagVar, obj);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        return this.zza.equals(zzasVar.zza) && this.zzb.equals(zzasVar.zzb);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String obj2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 50 + obj2.length());
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(obj);
        sb.append("', qualifier='");
        sb.append(obj2);
        sb.append("' }");
        return sb.toString();
    }
}
