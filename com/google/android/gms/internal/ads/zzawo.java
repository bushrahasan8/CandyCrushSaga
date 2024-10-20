package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzawo.class */
public final class zzawo implements Runnable {
    final zzawq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawo(zzawq zzawqVar) {
        this.zza = zzawqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzf();
    }
}
