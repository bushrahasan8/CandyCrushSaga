package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: zzbg.class */
public abstract class zzbg extends zzayh implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzd();
                parcel2.writeNoException();
                return true;
            case 2:
                int readInt = parcel.readInt();
                zzayi.zzc(parcel);
                zze(readInt);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                zzi();
                parcel2.writeNoException();
                return true;
            case 5:
                zzj();
                parcel2.writeNoException();
                return true;
            case 6:
                zzc();
                parcel2.writeNoException();
                return true;
            case 7:
                zzg();
                parcel2.writeNoException();
                return true;
            case 8:
                zze zzeVar = (zze) zzayi.zza(parcel, zze.CREATOR);
                zzayi.zzc(parcel);
                zzf(zzeVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzk();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
