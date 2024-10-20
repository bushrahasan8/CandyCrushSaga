package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayg;
import com.google.android.gms.internal.ads.zzayi;

/* loaded from: zzcy.class */
public final class zzcy extends zzayg implements zzda {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzd(zza, zzeVar);
        zzbm(1, zza);
    }
}
