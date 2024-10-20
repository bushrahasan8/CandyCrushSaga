package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzbjl.class */
public abstract class zzbjl extends zzayh implements zzbjm {
    public zzbjl() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbjm zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzbjm ? (zzbjm) queryLocalInterface : new zzbjk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzf = zzf();
            parcel2.writeNoException();
            zzayi.zzf(parcel2, zzf);
            return true;
        }
        if (i == 2) {
            Uri zze = zze();
            parcel2.writeNoException();
            zzayi.zze(parcel2, zze);
            return true;
        }
        if (i == 3) {
            double zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(zzb);
            return true;
        }
        if (i == 4) {
            int zzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(zzd);
            return true;
        }
        if (i != 5) {
            return false;
        }
        int zzc = zzc();
        parcel2.writeNoException();
        parcel2.writeInt(zzc);
        return true;
    }
}
