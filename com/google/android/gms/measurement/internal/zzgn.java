package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: zzgn.class */
final class zzgn {
    private final zzip zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgn(zzip zzipVar) {
        this.zza = zzipVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgn zza(String str) {
        return new zzgn((TextUtils.isEmpty(str) || str.length() > 1) ? zzip.UNINITIALIZED : zziq.zza(str.charAt(0)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzip zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return String.valueOf(zziq.zza(this.zza));
    }
}
