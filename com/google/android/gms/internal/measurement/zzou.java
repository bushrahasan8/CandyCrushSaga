package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

/* loaded from: zzou.class */
public final class zzou implements Supplier {
    private static zzou zza = new zzou();
    private final Supplier zzb = Suppliers.ofInstance(new zzow());

    public static boolean zza() {
        return ((zzox) zza.get()).zza();
    }

    public static boolean zzb() {
        return ((zzox) zza.get()).zzb();
    }

    public static boolean zzc() {
        return ((zzox) zza.get()).zzc();
    }

    public static boolean zzd() {
        return ((zzox) zza.get()).zzd();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ Object get() {
        return (zzox) this.zzb.get();
    }
}
