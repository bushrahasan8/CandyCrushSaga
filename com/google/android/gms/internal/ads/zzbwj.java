package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: zzbwj.class */
public final class zzbwj extends zzblf {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbwj(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
