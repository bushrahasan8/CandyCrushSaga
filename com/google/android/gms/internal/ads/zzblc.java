package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzblc.class */
public abstract class zzblc extends zzayh implements zzbld {
    public static zzbld zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof zzbld ? (zzbld) queryLocalInterface : new zzblb(iBinder);
    }
}
