package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: bo.class */
public abstract class bo {
    public static Boolean a(int i, String str) {
        if (!a(str)) {
            return null;
        }
        String[] split = str.split("~", -1);
        List asList = Arrays.asList(split[1].split("\\."));
        String valueOf = String.valueOf(i);
        boolean contains = asList.contains(valueOf);
        if (split[0].equals("1")) {
            return Boolean.valueOf(contains);
        }
        if (contains) {
            return Boolean.TRUE;
        }
        if (Arrays.asList(split[2].split("\\.")).contains(valueOf)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean a(String str) {
        boolean z = false;
        if (str != null) {
            if (str.length() < 2) {
                z = false;
            } else {
                String[] split = str.split("~", -1);
                if (split.length == 2 && "1".equals(split[0])) {
                    return Pattern.matches("(\\d+(\\.\\d+)*)?", split[1]);
                }
                z = false;
                if (split.length == 3) {
                    z = false;
                    if (CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(split[0])) {
                        z = false;
                        if (Pattern.matches("(\\d+(\\.\\d+)*)?", split[1])) {
                            z = false;
                            if (split[2].length() >= 3) {
                                z = false;
                                if (split[2].startsWith("dv.")) {
                                    z = false;
                                    if (Pattern.matches("(\\d+(\\.\\d+)*)?", split[2].substring(3))) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public static boolean a(String str, int i) {
        boolean z = false;
        if (str != null) {
            z = false;
            if (i >= 0) {
                if (str.length() <= i) {
                    z = false;
                } else {
                    z = false;
                    if (str.charAt(i) == '1') {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : str.split("\\.")) {
            if (!c(str2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[a-zA-Z\\d_-]*$");
    }
}
