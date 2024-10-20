package com.google.android.gms.internal.ads;

/* loaded from: zzhhe.class */
public final class zzhhe implements zzhhd, zzhgx {
    private static final zzhhe zza = new zzhhe(null);
    private final Object zzb;

    private zzhhe(Object obj) {
        this.zzb = obj;
    }

    public static zzhhd zza(Object obj) {
        zzhhl.zza(obj, "instance cannot be null");
        return new zzhhe(obj);
    }

    public static zzhhd zzc(Object obj) {
        return obj == null ? zza : new zzhhe(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final Object zzb() {
        return this.zzb;
    }
}
