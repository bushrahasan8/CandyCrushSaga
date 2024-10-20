package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbxe.class */
public final class zzbxe extends zzayh implements zzbxf {
    public static zzbxf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof zzbxf ? (zzbxf) queryLocalInterface : new zzbxd(iBinder);
    }
}
