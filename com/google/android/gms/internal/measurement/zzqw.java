package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqw.class */
public final class zzqw implements Supplier {
    private static zzqw zza = new zzqw();
    private final Supplier zzb = Suppliers.ofInstance(new zzqy());

    public static boolean zza() {
        return ((zzqz) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqz) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqz) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqz) this.zzb.get();
    }
}
