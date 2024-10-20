package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: zzble.class */
public final class zzble extends zzayg implements zzblg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzble(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zze() throws RemoteException {
        zzbm(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbm(1, zza);
    }
}
