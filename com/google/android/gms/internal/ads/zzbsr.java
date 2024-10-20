package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: zzbsr.class */
public final class zzbsr extends zzbsu {
    private static final zzbuw zza = new zzbuw();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.gms.internal.ads.zzbtv] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.android.gms.internal.ads.zzbtv] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.zzbsy] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.google.android.gms.internal.ads.zzbtv] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.google.android.gms.internal.ads.zzbtv] */
    @Override // com.google.android.gms.internal.ads.zzbsv
    public final zzbsy zzb(String str) throws RemoteException {
        RemoteException remoteException;
        boolean equals;
        try {
            Class<?> cls = Class.forName(str, false, zzbsr.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                str = new zzbtv((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
            } else {
                if (!Adapter.class.isAssignableFrom(cls)) {
                    zzcec.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                    throw new RemoteException();
                }
                str = new zzbtv((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
            }
        } finally {
            if (equals) {
            }
            return str;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final zzbus zzc(String str) throws RemoteException {
        try {
            return new zzbve((RtbAdapter) Class.forName(str, false, zzbuw.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable th) {
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbsr.class.getClassLoader()));
        } catch (Throwable th) {
            zzcec.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbsr.class.getClassLoader()));
        } catch (Throwable th) {
            zzcec.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
