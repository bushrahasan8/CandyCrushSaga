package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzbsv;

/* loaded from: zzdk.class */
public final class zzdk extends zzayg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.ads.internal.client.zzdj] */
    public final zzdj zze(IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, int i) throws RemoteException {
        zzdh zzdhVar;
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(1, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        zzbl.recycle();
        return zzdhVar;
    }
}
