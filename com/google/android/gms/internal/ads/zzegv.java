package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* loaded from: zzegv.class */
final class zzegv extends zzegz {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegv(String str, String str2, Drawable drawable) {
        if (str == null) {
            throw new NullPointerException("Null advertiserName");
        }
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzegz)) {
            return false;
        }
        zzegz zzegzVar = (zzegz) obj;
        if (!this.zza.equals(zzegzVar.zzb()) || !this.zzb.equals(zzegzVar.zzc())) {
            return false;
        }
        Drawable drawable = this.zzc;
        return drawable == null ? zzegzVar.zza() == null : drawable.equals(zzegzVar.zza());
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        int hashCode2 = this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + String.valueOf(this.zzc) + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzegz
    public final Drawable zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzegz
    public final String zzb() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzegz
    public final String zzc() {
        return this.zzb;
    }
}
