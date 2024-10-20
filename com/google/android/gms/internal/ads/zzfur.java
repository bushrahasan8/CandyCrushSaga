package com.google.android.gms.internal.ads;

/* loaded from: zzfur.class */
final class zzfur extends zzfvc {
    private final String zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfur(String str, String str2, zzfuq zzfuqVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfvc)) {
            return false;
        }
        zzfvc zzfvcVar = (zzfvc) obj;
        String str = this.zza;
        if (str == null) {
            if (zzfvcVar.zzb() != null) {
                return false;
            }
        } else if (!str.equals(zzfvcVar.zzb())) {
            return false;
        }
        String str2 = this.zzb;
        return str2 == null ? zzfvcVar.zza() == null : str2.equals(zzfvcVar.zza());
    }

    public final int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final String zzb() {
        return this.zza;
    }
}
