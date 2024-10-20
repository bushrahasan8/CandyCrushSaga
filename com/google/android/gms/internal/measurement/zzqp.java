package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqp.class */
public final class zzqp implements Supplier {
    private static zzqp zza = new zzqp();
    private final Supplier zzb = Suppliers.ofInstance(new zzqr());

    public static boolean zza() {
        return ((zzqo) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqo) this.zzb.get();
    }
}
