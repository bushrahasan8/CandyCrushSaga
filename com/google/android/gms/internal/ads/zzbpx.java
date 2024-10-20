package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbpx.class */
public abstract class zzbpx extends zzayh implements zzbpy {
    public static zzbpy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof zzbpy ? (zzbpy) queryLocalInterface : new zzbpw(iBinder);
    }
}
