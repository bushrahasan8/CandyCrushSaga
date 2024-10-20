package com.google.android.gms.internal.ads;

import com.ironsource.t2;

/* loaded from: zzads.class */
public final class zzads {
    public final zzadv zza;
    public final zzadv zzb;

    public zzads(zzadv zzadvVar, zzadv zzadvVar2) {
        this.zza = zzadvVar;
        this.zzb = zzadvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzads.class != obj.getClass()) {
            return false;
        }
        zzads zzadsVar = (zzads) obj;
        return this.zza.equals(zzadsVar.zza) && this.zzb.equals(zzadsVar.zzb);
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzadv zzadvVar = this.zza;
        zzadv zzadvVar2 = this.zzb;
        return t2.i.d + zzadvVar.toString() + (zzadvVar.equals(zzadvVar2) ? "" : ", ".concat(this.zzb.toString())) + t2.i.e;
    }
}
