package com.google.android.gms.internal.ads;

/* loaded from: zzfzs.class */
final class zzfzs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
