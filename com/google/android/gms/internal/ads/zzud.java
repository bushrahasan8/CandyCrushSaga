package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: zzud.class */
final class zzud {
    private final zzadb zza;
    private final Map zzb = new HashMap();
    private final Set zzc = new HashSet();
    private final Map zzd = new HashMap();
    private zzgv zze;

    public zzud(zzadb zzadbVar) {
        this.zza = zzadbVar;
    }

    public final void zza(zzgv zzgvVar) {
        if (zzgvVar != this.zze) {
            this.zze = zzgvVar;
            this.zzb.clear();
            this.zzd.clear();
        }
    }
}
