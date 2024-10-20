package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpf.class */
public final class zzpf implements Supplier {
    private static zzpf zza = new zzpf();
    private final Supplier zzb = Suppliers.ofInstance(new zzph());

    public static boolean zza() {
        return ((zzpe) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpe) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzpe) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpe) this.zzb.get();
    }
}
