package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* loaded from: zzbob.class */
public final class zzbob extends zzbod {
    private final OnH5AdsEventListener zza;

    public zzbob(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
