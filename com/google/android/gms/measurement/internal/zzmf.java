package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzmj;
import com.ironsource.t2;

/* loaded from: zzmf.class */
public final class zzmf<T extends Context & zzmj> {
    private final T zza;

    public zzmf(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    private final void zza(Runnable runnable) {
        zznd zza = zznd.zza(this.zza);
        zza.zzl().zzb(new zzmg(this, zza, runnable));
    }

    private final zzgb zzc() {
        return zzho.zza(this.zza, null, null).zzj();
    }

    public final int zza(final Intent intent, int i, final int i2) {
        final zzgb zzj = zzho.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        zza(new Runnable(this, i2, zzj, intent) { // from class: com.google.android.gms.measurement.internal.zzmh
            private zzmf zza;
            private int zzb;
            private zzgb zzc;
            private Intent zzd;

            {
                this.zza = this;
                this.zzb = i2;
                this.zzc = zzj;
                this.zzd = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc, this.zzd);
            }
        });
        return 2;
    }

    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhs(zznd.zza(this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    public final void zza() {
        zzho.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzgb zzgbVar, Intent intent) {
        if (this.zza.zza(i)) {
            zzgbVar.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzp().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzgb zzgbVar, JobParameters jobParameters) {
        zzgbVar.zzp().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean zza(final JobParameters jobParameters) {
        final zzgb zzj = zzho.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString(t2.h.h);
        zzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza(new Runnable(this, zzj, jobParameters) { // from class: com.google.android.gms.measurement.internal.zzme
            private zzmf zza;
            private zzgb zzb;
            private JobParameters zzc;

            {
                this.zza = this;
                this.zzb = zzj;
                this.zzc = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc);
            }
        });
        return true;
    }

    public final void zzb() {
        zzho.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
        } else {
            zzc().zzp().zza("onRebind called. action", intent.getAction());
        }
    }

    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
