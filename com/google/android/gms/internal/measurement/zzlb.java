package com.google.android.gms.internal.measurement;

/* loaded from: zzlb.class */
final class zzlb {
    private static final zzkz zza = zzc();
    private static final zzkz zzb = new zzlc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkz zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzkz zzb() {
        return zzb;
    }

    private static zzkz zzc() {
        try {
            return (zzkz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            return null;
        }
    }
}
