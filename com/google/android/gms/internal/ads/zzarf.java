package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: zzarf.class */
final class zzarf implements zzaqv {
    final Context zza;
    private File zzb = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarf(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
