package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzbwl.class */
public abstract class zzbwl extends zzayh implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbwm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbwm ? (zzbwm) queryLocalInterface : new zzbwk(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) zzayi.zza(parcel, Intent.CREATOR);
                zzayi.zzc(parcel);
                zze(intent);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzayi.zzc(parcel);
                zzi(asInterface, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 3:
                zzh();
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzg(asInterface2);
                parcel2.writeNoException();
                return true;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzf(createStringArray, createIntArray, asInterface3);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzayi.zza(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzayi.zzc(parcel);
                zzj(asInterface4, zzaVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
