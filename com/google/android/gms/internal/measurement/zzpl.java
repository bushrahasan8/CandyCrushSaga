package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpl.class */
public final class zzpl implements Supplier {
    private static zzpl zza = new zzpl();
    private final Supplier zzb = Suppliers.ofInstance(new zzpn());

    public static boolean zza() {
        return ((zzpk) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzpk) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpk) this.zzb.get();
    }
}
