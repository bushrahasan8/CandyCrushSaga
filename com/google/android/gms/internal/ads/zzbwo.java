package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbwo.class */
public abstract class zzbwo extends zzayh implements zzbwp {
    public static zzbwp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof zzbwp ? (zzbwp) queryLocalInterface : new zzbwn(iBinder);
    }
}
