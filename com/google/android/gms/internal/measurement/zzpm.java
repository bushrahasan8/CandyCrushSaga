package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpm.class */
public final class zzpm implements Supplier {
    private static zzpm zza = new zzpm();
    private final Supplier zzb = Suppliers.ofInstance(new zzpo());

    public static boolean zza() {
        return ((zzpp) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpp) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzpp) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpp) this.zzb.get();
    }
}
