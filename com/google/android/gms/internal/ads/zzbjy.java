package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: zzbjy.class */
public abstract class zzbjy extends zzayh implements zzbjz {
    public static zzbjz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzbjz ? (zzbjz) queryLocalInterface : new zzbjx(iBinder);
    }
}
