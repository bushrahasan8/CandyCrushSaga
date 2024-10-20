package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzful.class */
public abstract class zzful extends zzayh implements zzfum {
    public static zzfum zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return queryLocalInterface instanceof zzfum ? (zzfum) queryLocalInterface : new zzfuk(iBinder);
    }
}
