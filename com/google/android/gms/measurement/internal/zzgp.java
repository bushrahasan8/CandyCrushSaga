package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: zzgp.class */
public final class zzgp {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final zzgm zze;

    public zzgp(zzgm zzgmVar, String str, boolean z) {
        this.zze = zzgmVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        edit.putBoolean(this.zza, z);
        edit.apply();
        this.zzd = z;
    }

    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}
