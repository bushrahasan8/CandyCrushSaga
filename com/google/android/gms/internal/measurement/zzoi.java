package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzoi.class */
public final class zzoi implements Supplier {
    private static zzoi zza = new zzoi();
    private final Supplier zzb = Suppliers.ofInstance(new zzok());

    public static boolean zza() {
        return ((zzol) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzol) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzol) this.zzb.get();
    }
}
