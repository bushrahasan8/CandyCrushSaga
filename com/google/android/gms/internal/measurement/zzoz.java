package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzoz.class */
public final class zzoz implements Supplier {
    private static zzoz zza = new zzoz();
    private final Supplier zzb = Suppliers.ofInstance(new zzpb());

    public static boolean zza() {
        return ((zzoy) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzoy) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzoy) this.zzb.get();
    }
}
