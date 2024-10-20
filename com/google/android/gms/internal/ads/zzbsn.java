package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: zzbsn.class */
public final class zzbsn {
    private static zzbsn zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    zzbsn() {
    }

    public static zzbsn zza() {
        if (zza == null) {
            zza = new zzbsn();
        }
        return zza;
    }

    public final Thread zzb(final Context context, final String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.zzbsm
            public final zzbsn zza;
            public final Context zzb;
            public final String zzc;

            {
                this.zza = this;
                this.zzb = context;
                this.zzc = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.zzb;
                zzbgc.zza(context2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzat)).booleanValue()) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzah)).booleanValue());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzao)).booleanValue()) {
                    bundle.putString("ad_storage", "denied");
                    bundle.putString("analytics_storage", "denied");
                }
                try {
                    ((zzclf) zzceg.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzcee() { // from class: com.google.android.gms.internal.ads.zzbsl
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.internal.ads.zzcee
                        public final Object zza(Object obj) {
                            return zzcle.zzb(obj);
                        }
                    })).zze(ObjectWrapper.wrap(context2), new zzbsk(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", this.zzc, bundle)));
                } catch (RemoteException | zzcef | NullPointerException e) {
                    zzcec.zzl("#007 Could not call remote method.", e);
                }
            }
        });
        thread.start();
        return thread;
    }
}
