package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbzz.class */
public abstract class zzbzz extends zzayh implements zzcaa {
    public static zzcaa zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof zzcaa ? (zzcaa) queryLocalInterface : new zzbzy(iBinder);
    }
}
