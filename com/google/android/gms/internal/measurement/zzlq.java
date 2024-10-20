package com.google.android.gms.internal.measurement;

/* loaded from: zzlq.class */
final class zzlq {
    private static final zzlo zza = zzc();
    private static final zzlo zzb = new zzln();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlo zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlo zzb() {
        return zzb;
    }

    private static zzlo zzc() {
        try {
            return (zzlo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            return null;
        }
    }
}
