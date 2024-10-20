package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzps.class */
public final class zzps implements Supplier {
    private static zzps zza = new zzps();
    private final Supplier zzb = Suppliers.ofInstance(new zzpu());

    public static double zza() {
        return ((zzpv) zza.get()).zza();
    }

    public static long zzb() {
        return ((zzpv) zza.get()).zzb();
    }

    public static long zzc() {
        return ((zzpv) zza.get()).zzc();
    }

    public static String zzd() {
        return ((zzpv) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzpv) zza.get()).zze();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzpv) this.zzb.get();
    }
}
