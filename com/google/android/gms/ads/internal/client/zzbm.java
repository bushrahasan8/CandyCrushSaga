package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: zzbm.class */
public abstract class zzbm extends zzayh implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzl zzlVar = (zzl) zzayi.zza(parcel, zzl.CREATOR);
            zzayi.zzc(parcel);
            zzg(zzlVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String zze = zze();
            parcel2.writeNoException();
            parcel2.writeString(zze);
            return true;
        }
        if (i == 3) {
            boolean zzi = zzi();
            parcel2.writeNoException();
            int i3 = zzayi.zza;
            parcel2.writeInt(zzi ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(zzf);
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzl zzlVar2 = (zzl) zzayi.zza(parcel, zzl.CREATOR);
        int readInt = parcel.readInt();
        zzayi.zzc(parcel);
        zzh(zzlVar2, readInt);
        parcel2.writeNoException();
        return true;
    }
}
