package com.google.android.gms.internal.ads;

/* loaded from: zzfjh.class */
public final class zzfjh implements zzfjf {
    private final String zza;

    public zzfjh(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfjf
    public final boolean equals(Object obj) {
        if (obj instanceof zzfjh) {
            return this.zza.equals(((zzfjh) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfjf
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
