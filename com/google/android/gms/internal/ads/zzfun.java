package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzfun.class */
public abstract class zzfun extends zzayh implements zzfuo {
    public zzfun() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzayi.zza(parcel, Bundle.CREATOR);
        zzayi.zzc(parcel);
        zzb(bundle);
        return true;
    }
}
