package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqj.class */
public final class zzqj implements Supplier {
    private static zzqj zza = new zzqj();
    private final Supplier zzb = Suppliers.ofInstance(new zzql());

    public static boolean zza() {
        return ((zzqi) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqi) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqi) this.zzb.get();
    }
}
