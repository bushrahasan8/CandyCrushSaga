package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzmf;
import com.google.android.gms.measurement.internal.zzmj;

@TargetApi(24)
/* loaded from: AppMeasurementJobService.class */
public final class AppMeasurementJobService extends JobService implements zzmj {
    private zzmf<AppMeasurementJobService> zza;

    private final zzmf<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new zzmf<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zza().zzb(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return zza().zza(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmj
    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzmj
    public final void zza(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzmj
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }
}
