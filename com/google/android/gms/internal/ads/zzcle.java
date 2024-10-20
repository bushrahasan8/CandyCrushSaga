package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzcle.class */
public abstract class zzcle extends zzayh implements zzclf {
    public static zzclf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzclf ? (zzclf) queryLocalInterface : new zzcld(iBinder);
    }
}
