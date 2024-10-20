package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbwv.class */
public abstract class zzbwv extends zzayh implements zzbww {
    public static zzbww zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbww ? (zzbww) queryLocalInterface : new zzbwu(iBinder);
    }
}
