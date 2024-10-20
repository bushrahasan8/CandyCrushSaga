package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqq.class */
public final class zzqq implements Supplier {
    private static zzqq zza = new zzqq();
    private final Supplier zzb = Suppliers.ofInstance(new zzqs());

    public static boolean zza() {
        return ((zzqt) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqt) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqt) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqt) this.zzb.get();
    }
}
