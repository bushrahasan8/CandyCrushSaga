package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzoc.class */
public final class zzoc implements Supplier {
    private static zzoc zza = new zzoc();
    private final Supplier zzb = Suppliers.ofInstance(new zzoe());

    public static boolean zza() {
        return ((zzof) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzof) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzof) this.zzb.get();
    }
}
