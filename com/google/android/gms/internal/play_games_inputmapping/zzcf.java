package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzcf.class */
public final class zzcf {
    private final zzdo zza;
    private final String zzb;

    public zzcf(zzdo zzdoVar, String str) {
        zzds.zza(zzdoVar, "parser");
        this.zza = zzdoVar;
        zzds.zza(str, "message");
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcf)) {
            return false;
        }
        zzcf zzcfVar = (zzcf) obj;
        return this.zza.equals(zzcfVar.zza) && this.zzb.equals(zzcfVar.zzb);
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final zzdo zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
