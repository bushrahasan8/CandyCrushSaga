package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpx.class */
public final class zzpx implements Supplier {
    private static zzpx zza = new zzpx();
    private final Supplier zzb = Suppliers.ofInstance(new zzpz());

    public static boolean zza() {
        return ((zzpw) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpw) this.zzb.get();
    }
}
