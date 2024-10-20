package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpr.class */
public final class zzpr implements Supplier {
    private static zzpr zza = new zzpr();
    private final Supplier zzb = Suppliers.ofInstance(new zzpt());

    public static boolean zza() {
        return ((zzpq) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpq) this.zzb.get();
    }
}
