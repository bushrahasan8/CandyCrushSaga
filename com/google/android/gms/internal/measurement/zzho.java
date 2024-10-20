package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Function;

/* loaded from: zzho.class */
public final class zzho {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final Function zzh;
    private final boolean zzi;

    public zzho(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzho(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, Function function) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = z2;
        this.zzi = z3;
        this.zzg = z4;
        this.zzh = function;
    }

    public final zzhg<Double> zza(String str, double d) {
        return zzhg.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzhg<Long> zza(String str, long j) {
        return zzhg.zza(this, str, Long.valueOf(j), true);
    }

    public final zzhg<String> zza(String str, String str2) {
        return zzhg.zza(this, str, str2, true);
    }

    public final zzhg<Boolean> zza(String str, boolean z) {
        return zzhg.zza(this, str, Boolean.valueOf(z), true);
    }

    public final zzho zza() {
        return new zzho(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzho zzb() {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        Function function = this.zzh;
        if (function == null) {
            return new zzho(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, function);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
}
