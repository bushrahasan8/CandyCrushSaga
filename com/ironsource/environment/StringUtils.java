package com.ironsource.environment;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Locale;

/* loaded from: StringUtils.class */
public class StringUtils {
    public static String decodeURI(String str) {
        String str2;
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            str2 = "";
        }
        return str2;
    }

    public static String encodeURI(String str) {
        String str2;
        try {
            str2 = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            str2 = "";
        }
        return str2;
    }

    public static String toLowerCase(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ENGLISH);
    }

    public static String toUpperCase(String str) {
        return str == null ? "" : str.toUpperCase(Locale.ENGLISH);
    }
}
