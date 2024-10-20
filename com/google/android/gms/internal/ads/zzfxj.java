package com.google.android.gms.internal.ads;

/* loaded from: zzfxj.class */
final class zzfxj extends zzfwz {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxj(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxj) {
            return this.zza.equals(((zzfxj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final zzfwz zza(zzfws zzfwsVar) {
        Object apply = zzfwsVar.apply(this.zza);
        zzfxe.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfxj(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfwz
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
