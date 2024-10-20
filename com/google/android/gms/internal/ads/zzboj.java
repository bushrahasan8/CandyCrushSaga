package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzboj.class */
public abstract class zzboj extends zzayh implements zzbok {
    public static zzbok zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return queryLocalInterface instanceof zzbok ? (zzbok) queryLocalInterface : new zzboi(iBinder);
    }
}
