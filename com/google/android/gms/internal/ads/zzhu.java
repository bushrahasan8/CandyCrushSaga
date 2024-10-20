package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.t2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: zzhu.class */
public final class zzhu {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e) {
                zzff.zzc("HttpUtil", "Unexpected Content-Length [" + str + t2.i.e);
                j = -1L;
            }
        }
        long j2 = j;
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = zza.matcher(str2);
            j2 = j;
            if (matcher.matches()) {
                try {
                    String group = matcher.group(2);
                    group.getClass();
                    long parseLong = Long.parseLong(group);
                    String group2 = matcher.group(1);
                    group2.getClass();
                    long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                    if (j < 0) {
                        j2 = parseLong2;
                    } else {
                        j2 = j;
                        if (j != parseLong2) {
                            zzff.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + t2.i.e);
                            j2 = Math.max(j, parseLong2);
                        }
                    }
                } catch (NumberFormatException e2) {
                    zzff.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + t2.i.e);
                    j2 = j;
                }
            }
        }
        return j2;
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
