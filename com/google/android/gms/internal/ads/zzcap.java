package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzcap.class */
public abstract class zzcap extends zzayh implements zzcaq {
    public zzcap() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcak zzcaiVar;
        switch (i) {
            case 1:
                zzj();
                parcel2.writeNoException();
                return true;
            case 2:
                zzg();
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcaiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzcaiVar = queryLocalInterface instanceof zzcak ? (zzcak) queryLocalInterface : new zzcai(readStrongBinder);
                }
                zzayi.zzc(parcel);
                zzk(zzcaiVar);
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                zzh(readInt);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayi.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayi.zzc(parcel);
                zzi(zzeVar);
                parcel2.writeNoException();
                return true;
            case 6:
                zzf();
                parcel2.writeNoException();
                return true;
            case 7:
                zze();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
