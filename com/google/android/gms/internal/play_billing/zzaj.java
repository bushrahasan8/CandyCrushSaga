package com.google.android.gms.internal.play_billing;

import com.ironsource.t2;

/* loaded from: zzaj.class */
final class zzaj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + t2.i.b + String.valueOf(obj2) + " and " + String.valueOf(obj3) + t2.i.b + String.valueOf(obj));
    }
}
