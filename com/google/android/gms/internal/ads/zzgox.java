package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: zzgox.class */
public final class zzgox implements zzgpc {
    private final String zza;
    private final zzgxq zzb;
    private final zzgyl zzc;
    private final zzgus zzd;
    private final zzgvz zze;
    private final Integer zzf;

    private zzgox(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) {
        this.zza = str;
        this.zzb = zzgpm.zza(str);
        this.zzc = zzgylVar;
        this.zzd = zzgusVar;
        this.zze = zzgvzVar;
        this.zzf = num;
    }

    public static zzgox zza(String str, zzgyl zzgylVar, zzgus zzgusVar, zzgvz zzgvzVar, Integer num) throws GeneralSecurityException {
        if (zzgvzVar == zzgvz.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgox(str, zzgylVar, zzgusVar, zzgvzVar, num);
    }

    public final zzgus zzb() {
        return this.zzd;
    }

    public final zzgvz zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpc
    public final zzgxq zzd() {
        return this.zzb;
    }

    public final zzgyl zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
