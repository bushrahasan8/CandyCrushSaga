package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: zzel.class */
public final class zzel extends zzcv {
    private final String zza;
    private final String zzb;

    public zzel(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() throws RemoteException {
        return this.zzb;
    }
}
