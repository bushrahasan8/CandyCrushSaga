package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.t2;

/* loaded from: zzaps.class */
public final class zzaps {
    private final String zza;
    private final String zzb;

    public zzaps(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaps.class != obj.getClass()) {
            return false;
        }
        zzaps zzapsVar = (zzaps) obj;
        return TextUtils.equals(this.zza, zzapsVar.zza) && TextUtils.equals(this.zzb, zzapsVar.zzb);
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + t2.i.e;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
