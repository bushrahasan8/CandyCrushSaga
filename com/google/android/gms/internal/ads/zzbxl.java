package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* loaded from: zzbxl.class */
final class zzbxl extends zzbxh {
    final UpdateImpressionUrlsCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbxl(zzbxq zzbxqVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
