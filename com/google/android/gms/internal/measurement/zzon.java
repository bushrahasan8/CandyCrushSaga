package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzon.class */
public final class zzon implements Supplier {
    private static zzon zza = new zzon();
    private final Supplier zzb = Suppliers.ofInstance(new zzop());

    public static boolean zza() {
        return ((zzom) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzom) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzom) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzom) zza.get()).zzd();
    }

    public static boolean zze() {
        return ((zzom) zza.get()).zze();
    }

    public static boolean zzf() {
        return ((zzom) zza.get()).zzf();
    }

    public static boolean zzg() {
        return ((zzom) zza.get()).zzg();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzom) this.zzb.get();
    }
}
