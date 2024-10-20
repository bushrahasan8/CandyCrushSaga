package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzob.class */
public final class zzob implements Supplier {
    private static zzob zza = new zzob();
    private final Supplier zzb = Suppliers.ofInstance(new zzod());

    public static long zza() {
        return ((zzoa) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzoa) this.zzb.get();
    }
}
