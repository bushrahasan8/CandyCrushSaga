package com.google.android.gms.internal.play_games_inputmapping;

import java.lang.reflect.InvocationTargetException;

/* loaded from: zzbz.class */
public final class zzbz {
    private static final zzcb zza;

    static {
        String[] strArr;
        strArr = zzcb.zzd;
        zza = zzb(strArr);
    }

    public static /* synthetic */ zzcb zza() {
        return zza;
    }

    private static zzcb zzb(String[] strArr) {
        zzcb zzcbVar;
        try {
            zzcbVar = zzcc.zza();
        } catch (NoClassDefFoundError e) {
            zzcbVar = null;
        }
        if (zzcbVar != null) {
            return zzcbVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzcb) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                Throwable th2 = th;
                if (th instanceof InvocationTargetException) {
                    th2 = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th2);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
