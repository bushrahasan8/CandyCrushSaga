package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzip.class */
public final class zzip extends zzb implements zzio {
    public static zzio zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        return queryLocalInterface instanceof zzio ? (zzio) queryLocalInterface : new zziq(iBinder);
    }
}
