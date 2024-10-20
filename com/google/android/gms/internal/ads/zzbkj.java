package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbkj.class */
public abstract class zzbkj extends zzayh implements zzbkk {
    public static zzbkk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof zzbkk ? (zzbkk) queryLocalInterface : new zzbki(iBinder);
    }
}
