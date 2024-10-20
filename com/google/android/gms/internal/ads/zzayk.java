package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzayk.class */
public abstract class zzayk extends zzayh implements zzayl {
    public static zzayl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof zzayl ? (zzayl) queryLocalInterface : new zzayj(iBinder);
    }
}
