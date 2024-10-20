package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzapy.class */
public final class zzapy implements Runnable {
    final String zza;
    final long zzb;
    final zzaqa zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapy(zzaqa zzaqaVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaqaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaql zzaqlVar;
        zzaql zzaqlVar2;
        zzaqlVar = this.zzc.zza;
        zzaqlVar.zza(this.zza, this.zzb);
        zzaqa zzaqaVar = this.zzc;
        zzaqlVar2 = zzaqaVar.zza;
        zzaqlVar2.zzb(zzaqaVar.toString());
    }
}
