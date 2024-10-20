package com.google.android.gms.internal.ads;

/* loaded from: zzgzi.class */
final class zzgzi {
    private static final zzgzg zza = new zzgzh();
    private static final zzgzg zzb;

    static {
        zzgzg zzgzgVar = null;
        try {
            zzgzgVar = (zzgzg) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
        }
        zzb = zzgzgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgzg zza() {
        zzgzg zzgzgVar = zzb;
        if (zzgzgVar != null) {
            return zzgzgVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgzg zzb() {
        return zza;
    }
}
