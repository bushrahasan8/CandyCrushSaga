package com.google.android.gms.internal.ads;

/* loaded from: zzfux.class */
final class zzfux extends zzfvp {
    private final int zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfux(int i, String str, zzfuw zzfuwVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfvp)) {
            return false;
        }
        zzfvp zzfvpVar = (zzfvp) obj;
        if (this.zza != zzfvpVar.zza()) {
            return false;
        }
        String str = this.zzb;
        return str == null ? zzfvpVar.zzb() == null : str.equals(zzfvpVar.zzb());
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final String zzb() {
        return this.zzb;
    }
}
