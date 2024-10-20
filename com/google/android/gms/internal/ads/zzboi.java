package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzboi.class */
public final class zzboi extends zzayg implements zzbok {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.gms.internal.ads.zzboh] */
    @Override // com.google.android.gms.internal.ads.zzbok
    public final zzboh zze(IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, int i, zzboe zzboeVar) throws RemoteException {
        zzbof zzbofVar;
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        zzayi.zzf(zza, zzboeVar);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbofVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbofVar = queryLocalInterface instanceof zzboh ? (zzboh) queryLocalInterface : new zzbof(readStrongBinder);
        }
        zzbl.recycle();
        return zzbofVar;
    }
}
