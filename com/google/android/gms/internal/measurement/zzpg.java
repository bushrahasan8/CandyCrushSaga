package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpg.class */
public final class zzpg implements Supplier {
    private static zzpg zza = new zzpg();
    private final Supplier zzb = Suppliers.ofInstance(new zzpi());

    public static boolean zza() {
        return ((zzpj) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpj) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpj) this.zzb.get();
    }
}
