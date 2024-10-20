package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzbwn.class */
public final class zzbwn extends zzayg implements zzbwp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.zzbwm] */
    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zze(IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, int i) throws RemoteException {
        zzbwk zzbwkVar;
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzbwkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbwkVar = queryLocalInterface instanceof zzbwm ? (zzbwm) queryLocalInterface : new zzbwk(readStrongBinder);
        }
        zzbl.recycle();
        return zzbwkVar;
    }
}
