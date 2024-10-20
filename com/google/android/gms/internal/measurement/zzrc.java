package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzrc.class */
public final class zzrc implements Supplier {
    private static zzrc zza = new zzrc();
    private final Supplier zzb = Suppliers.ofInstance(new zzre());

    public static boolean zza() {
        return ((zzrf) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzrf) this.zzb.get();
    }
}
