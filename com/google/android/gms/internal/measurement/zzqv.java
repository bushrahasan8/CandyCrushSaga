package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqv.class */
public final class zzqv implements Supplier {
    private static zzqv zza = new zzqv();
    private final Supplier zzb = Suppliers.ofInstance(new zzqx());

    public static boolean zza() {
        return ((zzqu) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqu) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqu) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzqu) zza.get()).zzd();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqu) this.zzb.get();
    }
}
