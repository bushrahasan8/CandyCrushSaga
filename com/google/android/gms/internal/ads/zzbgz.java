package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbgz.class */
public abstract class zzbgz extends zzayh implements zzbha {
    public static zzbha zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return queryLocalInterface instanceof zzbha ? (zzbha) queryLocalInterface : new zzbgy(iBinder);
    }
}
