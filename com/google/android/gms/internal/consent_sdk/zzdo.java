package com.google.android.gms.internal.consent_sdk;

/* loaded from: zzdo.class */
public final class zzdo implements zzdn {
    private static final zzdo zza = new zzdo(null);
    private final Object zzb;

    private zzdo(Object obj) {
        this.zzb = obj;
    }

    public static zzdn zzb(Object obj) {
        if (obj != null) {
            return new zzdo(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb;
    }
}
