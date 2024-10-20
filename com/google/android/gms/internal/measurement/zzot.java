package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzot.class */
public final class zzot implements Supplier {
    private static zzot zza = new zzot();
    private final Supplier zzb = Suppliers.ofInstance(new zzov());

    public static boolean zza() {
        return ((zzos) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzos) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzos) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzos) this.zzb.get();
    }
}
