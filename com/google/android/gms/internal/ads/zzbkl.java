package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzbkl.class */
public final class zzbkl extends zzayg implements zzbkn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zze(zzbkd zzbkdVar) throws RemoteException {
        Parcel zza = zza();
        zzayi.zzf(zza, zzbkdVar);
        zzbm(1, zza);
    }
}
