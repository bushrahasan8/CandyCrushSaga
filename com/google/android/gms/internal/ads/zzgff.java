package com.google.android.gms.internal.ads;

/* loaded from: zzgff.class */
final class zzgff {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
