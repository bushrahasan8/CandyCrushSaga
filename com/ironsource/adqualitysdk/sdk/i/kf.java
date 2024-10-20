package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* loaded from: kf.class */
public final class kf {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2997 = 287397480;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2998 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2999;

    /* JADX WARN: Removed duplicated region for block: B:23:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kf.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m5670(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            f2999 = (f2998 + 85) % 128;
            Object[] objArr = new Object[1];
            a(-TextUtils.lastIndexOf("", '0'), -TextUtils.indexOf((CharSequence) "", '0'), true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 163, "��", objArr);
            String str3 = str;
            if (!str.startsWith(((String) objArr[0]).intern())) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                a(((Process.getThreadPriority(0) + 20) >> 6) + 8, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, true, 156 - ((Process.getThreadPriority(0) + 20) >> 6), "\u0006￼\u0005\u001c\u0005\u0004\u0007ￓ", objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(str);
                str3 = sb.toString();
            }
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, (ViewConfiguration.getEdgeSlop() >> 16) + 1, false, 105 - View.resolveSizeAndState(0, 0, 0), "��", objArr3);
            str2 = str3;
            if (!str3.endsWith(((String) objArr3[0]).intern())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                Object[] objArr4 = new Object[1];
                a(7 - TextUtils.indexOf("", "", 0), 3 - TextUtils.getOffsetAfter("", 0), false, 155 - (KeyEvent.getMaxKeyCode() >> 16), "�\u0007ￔ\u0005\u0006\u001d\u0006", objArr4);
                sb2.append(((String) objArr4[0]).intern());
                str2 = sb2.toString();
                f2999 = (f2998 + 79) % 128;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m5671(String str, String str2, boolean z) {
        String str3 = str2;
        if (z) {
            int i = f2998 + 59;
            f2999 = i % 128;
            if (i % 2 != 0) {
                m5670(str2);
                throw null;
            }
            str3 = m5670(str2);
        }
        List m5675 = m5675(str, str3, true);
        if (m5675.size() <= 0) {
            return null;
        }
        f2999 = (f2998 + 95) % 128;
        return (String) m5675.get(0);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m5672(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            f2998 = (f2999 + 63) % 128;
            arrayList.addAll(m5675(str, jSONArray.optString(i), false));
        }
        int i2 = f2998 + 81;
        f2999 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m5673(String str, int i) {
        return ((Boolean) m5679(new Object[]{str, Integer.valueOf(i)}, -1465107849, 1465107849, i)).booleanValue();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m5674(String str, String str2) {
        int i = f2999 + 9;
        f2998 = i % 128;
        List<String> m5675 = m5675(str, str2, i % 2 == 0);
        int i2 = f2999 + 41;
        f2998 = i2 % 128;
        if (i2 % 2 != 0) {
            return m5675;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List m5675(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    return arrayList;
                }
            } else {
                int i = 1;
                while (i <= matcher.groupCount()) {
                    int i2 = f2998 + 19;
                    f2999 = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(matcher.group(i));
                        throw null;
                    }
                    arrayList.add(matcher.group(i));
                    if (z) {
                        f2998 = (f2999 + 61) % 128;
                        return arrayList;
                    }
                    i++;
                    f2998 = (f2999 + 33) % 128;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static int m5676(String str, String str2) {
        return ((Integer) m5679(new Object[]{str, str2}, 1722204562, -1722204561, (int) System.currentTimeMillis())).intValue();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m5677(String str, JSONArray jSONArray, boolean z) {
        f2998 = (f2999 + 67) % 128;
        for (int i = 0; i < jSONArray.length(); i++) {
            f2999 = (f2998 + 101) % 128;
            String m5671 = m5671(str, jSONArray.optString(i), z);
            if (m5671 != null) {
                return m5671;
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5678(String str) {
        int i = f2999 + 33;
        f2998 = i % 128;
        if (i % 2 == 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            f2998 = (f2999 + 17) % 128;
            return false;
        }
        Object[] objArr = new Object[1];
        a(14 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, true, 139 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u001c\u0016\u0019\uffdf￥\u0018\ufff4￨￫\u0015￨￼5￨", objArr);
        return str.matches(((String) objArr[0]).intern());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m5679(Object[] objArr, int i, int i2, int i3) {
        Object valueOf;
        int i4 = i2 ^ (-1);
        int i5 = i3 ^ (-1);
        int i6 = i ^ (-1);
        int i7 = (i | i2) ^ (-1);
        if ((i * 371) + (i2 * 371) + ((((i4 | i5) ^ (-1)) | ((i6 | i3) ^ (-1))) * (-370)) + ((((i3 | i4) ^ (-1)) | ((i5 | i6) ^ (-1)) | i7) * (-370)) + (i7 * 370) != 1) {
            String str = (String) objArr[0];
            int intValue = ((Number) objArr[1]).intValue();
            f2998 = (f2999 + 23) % 128;
            if ((true ^ TextUtils.isEmpty(str)) && str.length() > 0) {
                f2998 = (f2999 + 19) % 128;
                if (str.length() <= intValue) {
                    f2998 = (f2999 + 91) % 128;
                    valueOf = Boolean.TRUE;
                }
            }
            f2999 = (f2998 + 33) % 128;
            valueOf = Boolean.FALSE;
        } else {
            String str2 = (String) objArr[0];
            String str3 = (String) objArr[1];
            f2998 = (f2999 + 57) % 128;
            Object[] objArr2 = new Object[1];
            a(7 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), true, 135 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u001a￫\ufff6￪￭\u001b\u0018", objArr2);
            String replaceAll = str2.replaceAll(((String) objArr2[0]).intern(), "");
            Object[] objArr3 = new Object[1];
            a(View.getDefaultSize(0, 0) + 2, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, 137 - MotionEvent.axisFromString(""), "￩\u0017", objArr3);
            String[] split = replaceAll.split(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a(8 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 7 - View.resolveSize(0, 0), true, (KeyEvent.getMaxKeyCode() >> 16) + 136, "\u001a￫\ufff6￪￭\u001b\u0018", objArr4);
            String replaceAll2 = str3.replaceAll(((String) objArr4[0]).intern(), "");
            Object[] objArr5 = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, (Process.myPid() >> 22) + 1, false, 137 - ExpandableListView.getPackedPositionChild(0L), "￩\u0017", objArr5);
            String[] split2 = replaceAll2.split(((String) objArr5[0]).intern());
            int i8 = 0;
            while (i8 < split.length && i8 < split2.length) {
                f2999 = (f2998 + 41) % 128;
                if (!split[i8].equals(split2[i8])) {
                    break;
                }
                f2998 = (f2999 + 43) % 128;
                i8++;
            }
            valueOf = Integer.valueOf((i8 >= split.length || i8 >= split2.length) ? Integer.signum(split.length - split2.length) : Integer.signum(Integer.valueOf(split[i8]).compareTo(Integer.valueOf(split2[i8]))));
        }
        return valueOf;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5680(String str, String str2) {
        f2999 = (f2998 + 71) % 128;
        String substring = str.substring(0, str.length() - str2.length());
        int i = f2998 + 25;
        f2999 = i % 128;
        if (i % 2 == 0) {
            return substring;
        }
        throw null;
    }
}
