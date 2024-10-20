package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzqk.class */
public final class zzqk implements Supplier {
    private static zzqk zza = new zzqk();
    private final Supplier zzb = Suppliers.ofInstance(new zzqm());

    public static boolean zza() {
        return ((zzqn) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqn) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqn) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzqn) zza.get()).zzd();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqn) this.zzb.get();
    }
}
