package com.google.android.gms.internal.ads;

/* loaded from: zzcdt.class */
final class zzcdt extends Thread {
    final String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdt(zzcdv zzcdvVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzceh(null).zza(this.zza);
    }
}
