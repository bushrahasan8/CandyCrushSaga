package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqe.class */
public final class zzqe implements Supplier {
    private static zzqe zza = new zzqe();
    private final Supplier zzb = Suppliers.ofInstance(new zzqg());

    public static boolean zza() {
        return ((zzqh) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqh) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqh) this.zzb.get();
    }
}
