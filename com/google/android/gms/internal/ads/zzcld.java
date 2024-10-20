package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: zzcld.class */
public final class zzcld extends zzayg implements zzclf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcld(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzclf
    public final void zze(IObjectWrapper iObjectWrapper, zzclc zzclcVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, iObjectWrapper);
        zzayi.zzf(zza, zzclcVar);
        zzbm(2, zza);
    }
}
