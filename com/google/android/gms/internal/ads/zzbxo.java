package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: zzbxo.class */
final class zzbxo extends zzbxh {
    final List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxo(zzbxq zzbxqVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze(String str) {
        zzcec.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzf(List list) {
        zzcec.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
