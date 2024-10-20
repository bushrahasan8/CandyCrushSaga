package com.onetrust.otpublishers.headless.gpp;

import com.ironsource.t2;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import java.util.regex.Pattern;

/* loaded from: a.class */
public abstract class a {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static String a(String str) {
        int i;
        String str2 = str;
        if (!a.matcher(str).matches()) {
            OTLogger.a("GPPBase64UrlEncoder", 6, "Base64Url encoding failed");
            str2 = str;
        }
        while (str2.length() % 6 > 0) {
            str2 = str2.concat(t2.h);
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 <= str2.length() - 6) {
            int i3 = i2 + 6;
            String substring = str2.substring(i2, i3);
            try {
                if (!g.a.matcher(substring).matches()) {
                    OTLogger.a("GPPIntegerEncoder", 6, "Integer decode failed");
                }
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    i = i5;
                    if (i4 >= substring.length()) {
                        break;
                    }
                    int length = substring.length();
                    int i6 = i4 + 1;
                    int i7 = i;
                    if (substring.charAt(length - i6) == '1') {
                        i7 = i + (1 << i4);
                    }
                    i4 = i6;
                    i5 = i7;
                }
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
                i2 = i3;
            } catch (Exception e) {
                OTLogger.a("GPPBase64UrlEncoder", 6, "Base64Url encoding failed");
            }
        }
        return sb.toString();
    }
}
