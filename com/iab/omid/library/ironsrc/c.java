package com.iab.omid.library.ironsrc;

import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: c.class */
class c {
    private static final Pattern a = Pattern.compile("<(head)( [^>]*)?>", 2);
    private static final Pattern b = Pattern.compile("<(head)( [^>]*)?/>", 2);
    private static final Pattern c = Pattern.compile("<(body)( [^>]*?)?>", 2);
    private static final Pattern d = Pattern.compile("<(body)( [^>]*?)?/>", 2);
    private static final Pattern e = Pattern.compile("<(html)( [^>]*?)?>", 2);
    private static final Pattern f = Pattern.compile("<(html)( [^>]*?)?/>", 2);
    private static final Pattern g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static String a(String str, String str2) {
        g.a(str, "HTML is null or empty");
        int[][] a2 = a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (!b(str, sb, b, str2, a2) && !a(str, sb, a, str2, a2) && !b(str, sb, d, str2, a2) && !a(str, sb, c, str2, a2) && !b(str, sb, f, str2, a2) && !a(str, sb, e, str2, a2) && !a(str, sb, g, str2, a2)) {
            return str2 + str;
        }
        return sb.toString();
    }

    private static boolean a(int i, int[][] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int[] iArr2 : iArr) {
            if (i >= iArr2[0] && i <= iArr2[1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            i = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return (int[][]) arrayList.toArray(new int[0][2]);
            }
            int indexOf = str.indexOf("<!--", i2);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                if (indexOf2 >= 0) {
                    arrayList.add(new int[]{indexOf, indexOf2});
                    i = indexOf2 + 3;
                } else {
                    arrayList.add(new int[]{indexOf, length});
                }
            }
            i = length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, String str2) {
        return a(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            i = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
        }
        return false;
    }
}
