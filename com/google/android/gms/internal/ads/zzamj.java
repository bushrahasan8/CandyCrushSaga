package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: zzamj.class */
public final class zzamj {
    private static final Pattern zza = Pattern.compile("^NOTE([ \t].*)?$");

    public static float zza(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long zzb(String str) throws NumberFormatException {
        int i = zzfy.zza;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        long j3 = j2;
        if (split.length == 2) {
            j3 = j2 + Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }
}
