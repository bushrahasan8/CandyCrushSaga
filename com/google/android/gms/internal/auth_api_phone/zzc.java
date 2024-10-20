package com.google.android.gms.internal.auth_api_phone;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: zzc.class */
public class zzc {
    private static final ClassLoader zzd = com.google.android.gms.internal.auth-api-phone.zzc.class.getClassLoader();

    private zzc() {
    }

    public static <T extends Parcelable> T zza(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zza(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
