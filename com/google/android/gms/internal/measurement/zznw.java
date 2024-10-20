package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zznw.class */
public final class zznw implements Supplier {
    private static zznw zza = new zznw();
    private final Supplier zzb = Suppliers.ofInstance(new zzny());

    public static boolean zza() {
        return ((zznz) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zznz) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zznz) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zznz) this.zzb.get();
    }
}
