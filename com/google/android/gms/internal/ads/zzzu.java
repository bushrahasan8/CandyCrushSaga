package com.google.android.gms.internal.ads;

/* loaded from: zzzu.class */
final class zzzu implements zzaan {
    private zzzu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzzu(zzzt zzztVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zza(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zzb(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // com.google.android.gms.internal.ads.zzaan
    public final boolean zzc(long j, long j2, long j3, boolean z, boolean z2) {
        return false;
    }
}
