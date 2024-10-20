package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: zzbxn.class */
final class zzbxn extends zzbxh {
    final List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxn(zzbxq zzbxqVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze(String str) {
        zzcec.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzf(List list) {
        zzcec.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
