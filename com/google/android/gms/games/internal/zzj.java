package com.google.android.gms.games.internal;

/* loaded from: zzj.class */
public final class zzj {
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;

    private zzj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzj(zzi zziVar) {
    }

    public final zzj zza(boolean z) {
        this.zzc = true;
        return this;
    }

    public final zzj zzb(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzj zzc(boolean z) {
        this.zzb = true;
        return this;
    }

    public final zzl zzd() {
        return new zzl(this);
    }
}
