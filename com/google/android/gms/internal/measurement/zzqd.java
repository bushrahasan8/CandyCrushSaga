package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqd.class */
public final class zzqd implements Supplier {
    private static zzqd zza = new zzqd();
    private final Supplier zzb = Suppliers.ofInstance(new zzqf());

    public static boolean zza() {
        return ((zzqc) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqc) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqc) this.zzb.get();
    }
}
