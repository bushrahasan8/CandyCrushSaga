package com.google.android.gms.internal.ads;

/* loaded from: zzazy.class */
public final class zzazy {
    final long zza;
    final String zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazy(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zzazy)) {
            return false;
        }
        zzazy zzazyVar = (zzazy) obj;
        return zzazyVar.zza == this.zza && zzazyVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
