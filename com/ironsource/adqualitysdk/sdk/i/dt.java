package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: dt.class */
public final class dt {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f1884 = 0;

    /* renamed from: ﬤ, reason: contains not printable characters */
    private static char f1885 = 0;

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f1886 = 0;

    /* renamed from: ףּ, reason: contains not printable characters */
    private static int f1887 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static long f1888;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static short[] f1889;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1890;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1891;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f1892;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1893;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1894;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static final List f1895;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1896;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1897;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1898;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1899;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1900;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1901;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1902;

    static {
        m4831();
        KeyEvent.getModifierMetaStateMask();
        Color.red(0);
        TextUtils.getTrimmedLength("");
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getJumpTapTimeout();
        Color.red(0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getScrollDefaultDelay();
        View.MeasureSpec.getMode(0);
        Process.getThreadPriority(0);
        TextUtils.getTrimmedLength("");
        TextUtils.indexOf((CharSequence) "", '0');
        ExpandableListView.getPackedPositionForGroup(0);
        Object[] objArr = new Object[1];
        b((char) Drawable.resolveOpacity(0, 0), (-1560560334) - (ViewConfiguration.getScrollDefaultDelay() >> 16), "��������", "㉸﮽膢䶛", "ᬷᡄ\ue9ba\u16fe\ue002ɢ䭼잞鎷ᮜ暵ꚼ䠻昇䬾๘萂⩬ሡ䫼瑸諾ꞙ麰ﶍ", objArr);
        f1902 = Pattern.compile(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getCapsMode("", 0, 0), (byte) TextUtils.indexOf("", ""), (-228620501) + TextUtils.indexOf("", "", 0, 0), (-35) - (ViewConfiguration.getKeyRepeatDelay() >> 16), 503436704 - (ViewConfiguration.getTouchSlop() >> 8), objArr2);
        f1900 = Pattern.compile(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) View.getDefaultSize(0, 0), (-228620501) + TextUtils.getCapsMode("", 0, 0), Color.red(0) - 35, 503436719 - View.resolveSize(0, 0), objArr3);
        f1899 = Pattern.compile(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 9753), 1294481419 - (ViewConfiguration.getLongPressTimeout() >> 16), "��������", "ଁ⠸᥍픦", "鸝䉈厷묾质\u2e6c⺖먂\ue4f8좟죅Ö亶\ue0c0麉", objArr4);
        f1898 = Pattern.compile(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-228620502) + (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) - 44, 503436734 - KeyEvent.keyCodeFromString(""), objArr5);
        f1901 = Pattern.compile(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        a((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-228620501) - View.MeasureSpec.makeMeasureSpec(0, 0), (-18) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 503436740 - (ViewConfiguration.getScrollBarSize() >> 8), objArr6);
        f1894 = Pattern.compile(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        b((char) (58497 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1545504574 - TextUtils.lastIndexOf("", '0'), "��������", "㼇ẇ腜엤", "\uf56fᨐ讎", objArr7);
        f1897 = Pattern.compile(((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        b((char) (35665 - View.resolveSizeAndState(0, 0, 0)), (-670324304) - (ViewConfiguration.getKeyRepeatDelay() >> 16), "��������", "낶ன凘銋", "疹昸ꭵ뇟뿽", objArr8);
        f1896 = Pattern.compile(((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b((char) (8465 - KeyEvent.getDeadChar(0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "��������", "㝁ﯸᄈ蠡", "乷檪", objArr9);
        String intern = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b((char) (42191 - View.resolveSizeAndState(0, 0, 0)), KeyEvent.getDeadChar(0, 0), "��������", "벷ᔘ콗벤", "ꔿ꯴镒�", objArr10);
        String intern2 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a((short) KeyEvent.getDeadChar(0, 0), (byte) (ViewConfiguration.getTouchSlop() >> 8), (-228620485) + (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) - 47, 503436772 + (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr11);
        String intern3 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b((char) (22570 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "��������", "梡ࢾ⨂㙘", "ﳹ讚᤹蕾挟Ꮿ", objArr12);
        String intern4 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        b((char) (52166 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.red(0) - 227134548, "��������", "겨瘳웲\ue5cb", "툽\uf62e婜呓⭫", objArr13);
        String intern5 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a((short) (KeyEvent.getMaxKeyCode() >> 16), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-228620479) - View.getDefaultSize(0, 0), (-49) - TextUtils.lastIndexOf("", '0', 0, 0), 503436775 - KeyEvent.normalizeMetaState(0), objArr14);
        String intern6 = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        b((char) (14398 - TextUtils.indexOf((CharSequence) "", '0')), Color.argb(0, 0, 0, 0) - 1090639967, "��������", "ꅩ︧㾾訸", "悜䆹ᢪ鮨䎩", objArr15);
        f1895 = Arrays.asList(intern, intern2, intern3, intern4, intern5, intern6, ((String) objArr15[0]).intern());
        f1887 = (f1886 + 119) % 128;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        boolean z;
        int length;
        int i5;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i6 = f1892;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371(TextUtils.getOffsetBefore("", 0), (char) View.combineMeasuredStates(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41);
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i6))).intValue();
            if (intValue == -1) {
                $10 = ($11 + 99) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i7 = $11;
                int i8 = i7 + 85;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = f1891;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    $10 = (i7 + 87) % 128;
                    int length2 = bArr.length;
                    byte[] bArr3 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        byte b2 = bArr[i9];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(122654587);
                        if (obj2 == null) {
                            obj2 = ((Class) b.m3371(Color.alpha(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 41)).getMethod("h", Integer.TYPE);
                            map2.put(122654587, obj2);
                        }
                        bArr3[i9] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    $10 = ($11 + 83) % 128;
                    byte[] bArr4 = f1891;
                    int i10 = f1893;
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1903297911);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(View.resolveSizeAndState(0, 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("g", cls4, cls4);
                        map3.put(-1903297911, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i3), Integer.valueOf(i10))).intValue()] ^ 8044072489887092822L)) + ((int) (f1892 ^ 8044072489887092822L)));
                } else {
                    intValue = (short) (((short) (f1889[i3 + ((int) (f1893 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f1892 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                qVar.f3047 = ((i3 + intValue) - 2) + ((int) (f1893 ^ 8044072489887092822L)) + i4;
                int i11 = f1890;
                Map map4 = b.f452;
                Object obj4 = map4.get(-2107390936);
                if (obj4 == null) {
                    Class cls5 = (Class) b.m3371(ViewConfiguration.getTapTimeout() >> 16, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 41 - TextUtils.getCapsMode("", 0, 0));
                    Class<?> cls6 = Integer.TYPE;
                    obj4 = cls5.getMethod("f", Object.class, cls6, cls6, Object.class);
                    map4.put(-2107390936, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i11), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr5 = f1891;
                byte[] bArr6 = bArr5;
                if (bArr5 != null) {
                    int i12 = $11 + 125;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        length = bArr5.length;
                        bArr6 = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr5.length;
                        bArr6 = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr6[i5] = (byte) (bArr5[i5] ^ 8044072489887092822L);
                        i5++;
                    }
                }
                if (bArr6 != null) {
                    int i13 = $11;
                    int i14 = i13 + 101;
                    $10 = i14 % 128;
                    z = i14 % 2 == 0;
                    $10 = (i13 + 23) % 128;
                } else {
                    z = false;
                }
                qVar.f3050 = 1;
                while (qVar.f3050 < intValue) {
                    $11 = ($10 + 27) % 128;
                    if (z) {
                        byte[] bArr7 = f1891;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr7[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f1889;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((short) (((short) (sArr[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    }
                    sb.append(qVar.f3049);
                    qVar.f3048 = qVar.f3049;
                    qVar.f3050++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void b(char c, int i, String str, String str2, String str3, Object[] objArr) {
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            int i2 = $11 + 115;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            str2 = str2.toCharArray();
        }
        char[] cArr3 = (char[]) str2;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr4 = (char[]) str;
        g gVar = new g();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr7 = new char[length3];
        gVar.f2182 = 0;
        $10 = ($11 + 3) % 128;
        while (gVar.f2182 < length3) {
            $10 = ($11 + 65) % 128;
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371(TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), MotionEvent.axisFromString("") + 42)).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(Color.green(0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 42)).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371(TextUtils.getOffsetBefore("", 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Gravity.getAbsoluteGravity(0, 0) + 41);
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371(ViewConfiguration.getTouchSlop() >> 8, (char) Color.red(0), 41 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i3 = gVar.f2182;
                cArr7[i3] = (char) ((((r0 ^ cArr2[i3]) ^ (f1888 ^ (-6542782394566060766L))) ^ ((int) (f1884 ^ (-6542782394566060766L)))) ^ ((char) (f1885 ^ (-6542782394566060766L))));
                gVar.f2182 = i3 + 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m4828(Pattern pattern, String str) {
        int i = f1886 + 119;
        f1887 = i % 128;
        if (i % 2 == 0) {
            pattern.matcher(str).find();
            throw new ArithmeticException("divide by zero");
        }
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String substring = str.substring(matcher.start(), matcher.end());
        int i2 = f1887 + 29;
        f1886 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return substring;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m4829(String str) {
        int i = f1887 + 77;
        f1886 = i % 128;
        return str.substring(1, i % 2 != 0 ? str.length() >> 1 : str.length() - 1);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0091. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00c6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x073c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x078f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06c5 A[SYNTHETIC] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.ironsource.adqualitysdk.sdk.i.ea> m4830(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dt.m4830(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m4831() {
        f1893 = -1966572842;
        f1892 = 1798721637;
        f1890 = 1721117029;
        f1891 = new byte[]{86, -28, 83, 31, -90, 85, -88, -92, 81, 93, -83, -8, 71, -81, 83, 21, -22, -87, -67, 71, -83, 81, -82, 90, -88, -91, 82, 79, 91, -69, 69, 79, -82, 87, -102, 109, -110, 85, -119, 12, -112, 86, 116, -83, 65, 80, -110, -85, 87, -102, 96, -97, 85, -119, 3, -99, 86, 116, -83, 65, 87, -97, -104, 114, 90, -85, -125, -85, 86, 68, -93, 95, 99, -124, 100, -101, 121, -103, 109, -67, 90, -85, Byte.MIN_VALUE, 123, -70, -111, 27, -102, 80, -88, -88, 109, -100, 123, -70, -111, 27, -102, 80, -85, 86, -95, 81, 81, -88, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86};
        f1884 = -919218910;
        f1888 = -6542782394566060766L;
        f1885 = (char) 13503;
    }
}
