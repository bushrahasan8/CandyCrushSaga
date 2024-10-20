package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzdr.class */
public final class zzdr {
    private static final String[] zza;
    private static final zzdv zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.gms.internal.play_games_inputmapping.zzdv] */
    static {
        zzdw zzdwVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        zza = strArr;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzdwVar = new zzdw();
                break;
            }
            zzdwVar = null;
            try {
                zzdwVar = (zzdv) Class.forName(strArr[i]).asSubclass(zzdv.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable th) {
            }
            if (zzdwVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzdwVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i) {
        zzds.zza(cls, "target");
        return zzb.zza(cls, 2);
    }

    public static StackTraceElement[] zzb(Class cls, int i, int i2) {
        if (i > 0 || i == -1) {
            return zzb.zzb(cls, i, 2);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
