package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpa.class */
public final class zzpa implements Supplier {
    private static zzpa zza = new zzpa();
    private final Supplier zzb = Suppliers.ofInstance(new zzpc());

    public static boolean zza() {
        return ((zzpd) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpd) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpd) this.zzb.get();
    }
}
