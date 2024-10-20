package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzfid.class */
public final class zzfid {
    private static zzfid zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfid(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzcec.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfid zzd(Context context) {
        synchronized (zzfid.class) {
            try {
                zzfid zzfidVar = zza;
                if (zzfidVar != null) {
                    return zzfidVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) zzbic.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
                if (longValue > 0) {
                    zzclVar = null;
                    if (longValue <= 240304702) {
                        zzclVar = zza(applicationContext);
                    }
                }
                zzfid zzfidVar2 = new zzfid(applicationContext, zzclVar);
                zza = zzfidVar2;
                return zzfidVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar == null) {
            return null;
        }
        try {
            return zzclVar.getLiteSdkVersion();
        } catch (RemoteException e) {
            return null;
        }
    }

    public final zzbsv zzb() {
        return (zzbsv) this.zzd.get();
    }

    public final zzcei zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzen zzg;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.zzb);
        zzcei zzceiVar = new zzcei(240304000, i2, true, zzD);
        if (((Boolean) zzbic.zzc.zze()).booleanValue() && (zzg = zzg()) != null) {
            zzceiVar = new zzcei(240304000, zzg.zza(), true, zzD);
        }
        return zzceiVar;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbsv r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbic.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L37
            r0 = r4
            com.google.android.gms.ads.internal.client.zzcl r0 = r0.zzc
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L1d
        L18:
            r0 = 0
            r6 = r0
            goto L24
        L1d:
            r0 = r6
            com.google.android.gms.internal.ads.zzbsv r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L42
            r6 = r0
        L24:
            r0 = r4
            java.util.concurrent.atomic.AtomicReference r0 = r0.zzd
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L2f
            r0 = r6
            r5 = r0
        L2f:
            r0 = r7
            r1 = 0
            r2 = r5
            boolean r0 = com.google.android.gms.internal.ads.zzfic.zza(r0, r1, r2)
            return
        L37:
            r0 = r4
            java.util.concurrent.atomic.AtomicReference r0 = r0.zzd
            r1 = 0
            r2 = r5
            boolean r0 = com.google.android.gms.internal.ads.zzfic.zza(r0, r1, r2)
            return
        L42:
            r6 = move-exception
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfid.zzf(com.google.android.gms.internal.ads.zzbsv):void");
    }
}
