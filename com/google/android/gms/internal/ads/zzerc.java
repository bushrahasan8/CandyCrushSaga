package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: zzerc.class */
public final class zzerc implements zzexq {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzcJ)).booleanValue()) {
            return zzgen.zzh(new zzerd(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzgen.zzh(null);
    }
}
