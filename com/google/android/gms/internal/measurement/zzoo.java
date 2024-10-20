package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzoo.class */
public final class zzoo implements Supplier {
    private static zzoo zza = new zzoo();
    private final Supplier zzb = Suppliers.ofInstance(new zzoq());

    public static boolean zza() {
        return ((zzor) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzor) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzor) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzor) this.zzb.get();
    }
}
