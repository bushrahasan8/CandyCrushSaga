package com.google.android.gms.internal.games_v2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzai.class */
public final class zzai implements Runnable {
    final zzaj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzaj zzajVar) {
        this.zza = zzajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaj.zzb(this.zza);
    }
}
