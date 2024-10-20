package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzbgw.class */
public abstract class zzbgw extends zzayh implements zzbgx {
    public zzbgw() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
            return true;
        }
        if (i == 2) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
            return true;
        }
        if (i == 3) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayi.zzc(parcel);
            zzd(asInterface);
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            zze();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzf();
        parcel2.writeNoException();
        return true;
    }
}
