package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: zziw.class */
public final class zziw {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdq zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zziw(Context context, com.google.android.gms.internal.measurement.zzdq zzdqVar, Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzdqVar != null) {
            this.zzg = zzdqVar;
            this.zzb = zzdqVar.zzf;
            this.zzc = zzdqVar.zze;
            this.zzd = zzdqVar.zzd;
            this.zzh = zzdqVar.zzc;
            this.zzf = zzdqVar.zzb;
            this.zzj = zzdqVar.zzh;
            Bundle bundle = zzdqVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
