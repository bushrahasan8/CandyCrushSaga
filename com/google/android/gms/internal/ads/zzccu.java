package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzccu.class */
public final class zzccu extends zzayg implements zzccw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.zzcct] */
    @Override // com.google.android.gms.internal.ads.zzccw
    public final zzcct zze(IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, int i) throws RemoteException {
        zzccr zzccrVar;
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        zzayi.zzf(zza, zzbsvVar);
        zza.writeInt(240304000);
        Parcel zzbl = zzbl(2, zza);
        IBinder readStrongBinder = zzbl.readStrongBinder();
        if (readStrongBinder == null) {
            zzccrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzccrVar = queryLocalInterface instanceof zzcct ? (zzcct) queryLocalInterface : new zzccr(readStrongBinder);
        }
        zzbl.recycle();
        return zzccrVar;
    }
}
