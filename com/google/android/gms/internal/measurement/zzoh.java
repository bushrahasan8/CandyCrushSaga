package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzoh.class */
public final class zzoh implements Supplier {
    private static zzoh zza = new zzoh();
    private final Supplier zzb = Suppliers.ofInstance(new zzoj());

    public static boolean zza() {
        return ((zzog) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzog) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzog) this.zzb.get();
    }
}
