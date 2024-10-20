package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzpy.class */
public final class zzpy implements Supplier {
    private static zzpy zza = new zzpy();
    private final Supplier zzb = Suppliers.ofInstance(new zzqa());

    public static boolean zza() {
        return ((zzqb) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzqb) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzqb) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzqb) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzqb) zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzqb) zza.get()).zzf();
    }

    public static boolean zzg() {
        return ((zzqb) zza.get()).zzg();
    }

    public static boolean zzh() {
        return ((zzqb) zza.get()).zzh();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzqb) this.zzb.get();
    }
}
