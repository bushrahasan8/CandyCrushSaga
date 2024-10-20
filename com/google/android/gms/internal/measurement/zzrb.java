package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzrb.class */
public final class zzrb implements Supplier {
    private static zzrb zza = new zzrb();
    private final Supplier zzb = Suppliers.ofInstance(new zzrd());

    public static boolean zza() {
        return ((zzra) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzra) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzra) this.zzb.get();
    }
}
