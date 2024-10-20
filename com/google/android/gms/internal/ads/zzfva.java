package com.google.android.gms.internal.ads;

/* loaded from: zzfva.class */
final class zzfva extends zzfvs {
    private final String zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfva(String str, String str2, zzfuz zzfuzVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfvs)) {
            return false;
        }
        zzfvs zzfvsVar = (zzfvs) obj;
        String str = this.zza;
        if (str == null) {
            if (zzfvsVar.zzb() != null) {
                return false;
            }
        } else if (!str.equals(zzfvsVar.zzb())) {
            return false;
        }
        String str2 = this.zzb;
        return str2 == null ? zzfvsVar.zza() == null : str2.equals(zzfvsVar.zza());
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
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvs
    public final String zzb() {
        return this.zza;
    }
}
