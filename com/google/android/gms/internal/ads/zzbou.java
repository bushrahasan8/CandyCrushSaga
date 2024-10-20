package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: zzbou.class */
public abstract class zzbou extends zzayh implements zzbov {
    public zzbou() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzayi.zza(parcel, ParcelFileDescriptor.CREATOR);
        zzayi.zzc(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
