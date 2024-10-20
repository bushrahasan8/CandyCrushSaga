package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: zzfzm.class */
final class zzfzm extends zzfzp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzm() {
        super(null);
    }

    static final zzfzp zzg(int i) {
        zzfzp zzfzpVar;
        zzfzp zzfzpVar2;
        zzfzp zzfzpVar3;
        zzfzp zzfzpVar4;
        if (i < 0) {
            zzfzpVar4 = zzfzp.zzb;
            zzfzpVar2 = zzfzpVar4;
        } else if (i > 0) {
            zzfzpVar3 = zzfzp.zzc;
            zzfzpVar2 = zzfzpVar3;
        } else {
            zzfzpVar = zzfzp.zza;
            zzfzpVar2 = zzfzpVar;
        }
        return zzfzpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzb(int i, int i2) {
        return zzg(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzc(long j, long j2) {
        return zzg(j < j2 ? -1 : j > j2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzd(Object obj, Object obj2, Comparator comparator) {
        return zzg(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zze(boolean z, boolean z2) {
        return zzg(zzgcs.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final zzfzp zzf(boolean z, boolean z2) {
        return zzg(zzgcs.zza(z2, z));
    }
}
