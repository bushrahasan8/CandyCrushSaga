package com.google.android.gms.internal.drive;

/* loaded from: zzix.class */
final class zzix {
    private static final Class<?> zzni = zzj("libcore.io.Memory");
    private static final boolean zznj;

    static {
        zznj = zzj("org.robolectric.Robolectric") != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbr() {
        return (zzni == null || zznj) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzbs() {
        return zzni;
    }

    private static <T> Class<T> zzj(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
