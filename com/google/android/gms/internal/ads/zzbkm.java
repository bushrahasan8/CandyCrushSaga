package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbkm.class */
public abstract class zzbkm extends zzayh implements zzbkn {
    public static zzbkn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof zzbkn ? (zzbkn) queryLocalInterface : new zzbkl(iBinder);
    }
}
