package com.google.android.gms.internal.ads;

/* loaded from: zzgze.class */
final class zzgze {
    private final Object zza;
    private final int zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgze(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgze)) {
            return false;
        }
        zzgze zzgzeVar = (zzgze) obj;
        return this.zza == zzgzeVar.zza && this.zzb == zzgzeVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
