package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: zzc.class */
final class zzc {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = zza.matcher(str);
            StringBuilder sb = null;
            int i = 0;
            while (matcher.find()) {
                StringBuilder sb2 = sb;
                if (sb == null) {
                    sb2 = new StringBuilder();
                }
                int start = matcher.start();
                int i2 = start;
                while (i2 >= 0 && str.charAt(i2) == '\\') {
                    i2--;
                }
                sb = sb2;
                if ((start - i2) % 2 != 0) {
                    int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                    sb2.append((CharSequence) str, i, matcher.start());
                    if (parseInt == 92) {
                        sb2.append("\\\\");
                    } else {
                        sb2.append(Character.toChars(parseInt));
                    }
                    i = matcher.end();
                    sb = sb2;
                }
            }
            if (sb == null) {
                str2 = str;
            } else {
                if (i < matcher.regionEnd()) {
                    sb.append((CharSequence) str, i, matcher.regionEnd());
                }
                str2 = sb.toString();
            }
        }
        return str2;
    }
}
