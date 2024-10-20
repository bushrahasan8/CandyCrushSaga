package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultimap;

/* loaded from: zzhv.class */
public final class zzhv {
    private final boolean zza;

    public zzhv(zzhu zzhuVar) {
        Preconditions.checkNotNull(zzhuVar, "BuildInfo must be non-null");
        this.zza = !zzhuVar.zza();
    }

    public final boolean zza(String str) {
        Preconditions.checkNotNull(str, "flagName must not be null");
        if (this.zza) {
            return ((ImmutableMultimap) zzhx.zza.get()).containsValue(str);
        }
        return true;
    }
}
