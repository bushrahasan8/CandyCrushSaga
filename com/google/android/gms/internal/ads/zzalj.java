package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: zzalj.class */
final class zzalj {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;
    public final PointF zzb;

    static {
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzalj(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:4|(2:5|6)|(4:8|(1:10)|11|12)(2:42|(1:44)(10:45|20|(1:22)|23|24|26|(3:28|29|30)(1:38)|31|(3:33|34|35)(1:37)|36))|13|14|15|16|17|18|19|20|(0)|23|24|26|(0)(0)|31|(0)(0)|36|2) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7 A[Catch: RuntimeException -> 0x0121, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0121, blocks: (B:24:0x00d7, B:28:0x00e7, B:30:0x00f2), top: B:23:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzalj zza(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.zza(java.lang.String):com.google.android.gms.internal.ads.zzalj");
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
