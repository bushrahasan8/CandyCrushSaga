package com.google.android.gms.internal.measurement;

/* loaded from: zzjk.class */
final class zzjk {
    private static final zzji<?> zza = new zzjh();
    private static final zzji<?> zzb = zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzji<?> zza() {
        zzji<?> zzjiVar = zzb;
        if (zzjiVar != null) {
            return zzjiVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzji<?> zzb() {
        return zza;
    }

    private static zzji<?> zzc() {
        try {
            return (zzji) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            return null;
        }
    }
}
