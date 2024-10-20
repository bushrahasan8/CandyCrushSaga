package com.google.android.gms.internal.ads;

/* loaded from: zzhbk.class */
final class zzhbk {
    private static final zzhbj zza;
    private static final zzhbj zzb;

    static {
        zzhbj zzhbjVar = null;
        try {
            zzhbjVar = (zzhbj) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
        }
        zza = zzhbjVar;
        zzb = new zzhbj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhbj zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhbj zzb() {
        return zzb;
    }
}
