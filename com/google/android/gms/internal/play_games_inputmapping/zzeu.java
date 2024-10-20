package com.google.android.gms.internal.play_games_inputmapping;

/* loaded from: zzeu.class */
final class zzeu {
    private static final zzes zza = new zzet();
    private static final zzes zzb;

    static {
        zzes zzesVar = null;
        try {
            zzesVar = (zzes) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
        }
        zzb = zzesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzes zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzes zzb() {
        zzes zzesVar = zzb;
        if (zzesVar != null) {
            return zzesVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
