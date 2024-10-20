package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbxb.class */
public final class zzbxb extends zzayh implements zzbxc {
    public static zzbxc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof zzbxc ? (zzbxc) queryLocalInterface : new zzbxa(iBinder);
    }
}
