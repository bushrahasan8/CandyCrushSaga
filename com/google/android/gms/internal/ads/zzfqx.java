package com.google.android.gms.internal.ads;

/* loaded from: zzfqx.class */
final class zzfqx extends zzfqt {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfqx(String str, boolean z, boolean z2, zzfqw zzfqwVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfqt)) {
            return false;
        }
        zzfqt zzfqtVar = (zzfqt) obj;
        return this.zza.equals(zzfqtVar.zzb()) && this.zzb == zzfqtVar.zzd() && this.zzc == zzfqtVar.zzc();
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int i = 1231;
        int i2 = true != this.zzb ? 1237 : 1231;
        if (true != this.zzc) {
            i = 1237;
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i;
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqt
    public final boolean zzd() {
        return this.zzb;
    }
}
