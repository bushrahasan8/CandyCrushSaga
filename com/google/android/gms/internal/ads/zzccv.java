package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzccv.class */
public abstract class zzccv extends zzayh implements zzccw {
    public static zzccw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof zzccw ? (zzccw) queryLocalInterface : new zzccu(iBinder);
    }
}
