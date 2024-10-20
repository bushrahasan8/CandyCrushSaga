package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzfsv.class */
public abstract class zzfsv extends zzayh implements zzfsw {
    public zzfsv() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readInt();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.readInt();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzayi.zzc(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
