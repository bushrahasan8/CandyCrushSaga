package com.google.android.gms.internal.play_billing;

/* loaded from: zzcg.class */
final class zzcg {
    private static final zzce zza = new zzcf();
    private static final zzce zzb;

    static {
        zzce zzceVar = null;
        try {
            zzceVar = (zzce) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
        }
        zzb = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzce zza() {
        zzce zzceVar = zzb;
        if (zzceVar != null) {
            return zzceVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzce zzb() {
        return zza;
    }
}
