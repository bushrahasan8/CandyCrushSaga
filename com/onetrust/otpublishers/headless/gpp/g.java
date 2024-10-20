package com.onetrust.otpublishers.headless.gpp;

import com.ironsource.t2;
import java.util.regex.Pattern;

/* loaded from: g.class */
public abstract class g {
    public static final Pattern a = Pattern.compile("^[0-1]*$", 2);

    public static String a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = t2.h;
            if (i <= 0) {
                break;
            }
            if ((i & 1) == 1) {
                str = "1";
            }
            sb.insert(0, str);
            i >>= 1;
        }
        while (sb.length() < i2) {
            sb.insert(0, t2.h);
        }
        return sb.toString();
    }
}
