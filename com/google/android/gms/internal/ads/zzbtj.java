package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: zzbtj.class */
public abstract class zzbtj extends zzayh implements zzbtk {
    public zzbtj() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbtk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof zzbtk ? (zzbtk) queryLocalInterface : new zzbti(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayh
    protected final boolean zzbO(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                zzbjm zzl = zzl();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzl);
                return true;
            case 6:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 7:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String zzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(zzu);
                return true;
            case 10:
                String zzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzt);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdq zzj = zzj();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                zzayi.zzf(parcel2, null);
                return true;
            case 13:
                IObjectWrapper zzm = zzm();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzm);
                return true;
            case 14:
                IObjectWrapper zzn = zzn();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzn);
                return true;
            case 15:
                IObjectWrapper zzo = zzo();
                parcel2.writeNoException();
                zzayi.zzf(parcel2, zzo);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                zzayi.zze(parcel2, zzi);
                return true;
            case 17:
                boolean zzB = zzB();
                parcel2.writeNoException();
                int i3 = zzayi.zza;
                parcel2.writeInt(zzB ? 1 : 0);
                return true;
            case 18:
                boolean zzA = zzA();
                parcel2.writeNoException();
                int i4 = zzayi.zza;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzw(asInterface);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzy(asInterface2, asInterface3, asInterface4);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayi.zzc(parcel);
                zzz(asInterface5);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            default:
                return false;
        }
    }
}
