package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* loaded from: zzq.class */
public final class zzq implements Api.ApiOptions.Optional {
    public final int zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzq(int i, String str, zzp zzpVar) {
        this.zza = i;
        this.zzb = str;
    }

    public static zzo zza() {
        return new zzo(null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza == zzqVar.zza && Objects.equal(this.zzb, zzqVar.zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb);
    }
}
