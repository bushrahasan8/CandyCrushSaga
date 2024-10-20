package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: hz.class */
public final class hz<T> extends db implements cn, hy<T> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2468 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2469 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2470;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2471;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f2472;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f2473;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2474;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Object f2475;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Collection f2476;

    /* renamed from: ｋ, reason: contains not printable characters */
    private hy f2477;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Field f2478;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map f2479;

    static {
        m5279();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getMaximumFlingVelocity();
        TextUtils.indexOf((CharSequence) "", '0');
        Color.alpha(0);
        Process.getThreadPriority(0);
        TextUtils.indexOf((CharSequence) "", '0');
        View.MeasureSpec.getSize(0);
        Process.getThreadPriority(0);
        TextUtils.lastIndexOf("", '0', 0);
        ExpandableListView.getPackedPositionChild(0L);
        int i = f2468 + 25;
        f2469 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hz(Field field, Object obj, hy hyVar) {
        this.f2478 = field;
        this.f2475 = obj;
        this.f2477 = hyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hz(Collection collection, Object obj, hy hyVar) {
        this.f2476 = collection;
        this.f2475 = obj;
        this.f2477 = hyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hz(Map map, Object obj, hy hyVar) {
        this.f2479 = map;
        this.f2475 = obj;
        this.f2477 = hyVar;
    }

    private static void a(int[] iArr, String str, int i, String str2, Object[] objArr) {
        char[] cArr;
        String str3 = str2;
        if (str2 != null) {
            $10 = ($11 + 87) % 128;
            str3 = str2.getBytes("ISO-8859-1");
            $10 = ($11 + 79) % 128;
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr2 = (char[]) str;
        r rVar = new r();
        char[] cArr3 = f2470;
        char[] cArr4 = cArr3;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr5 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                char c = cArr3[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(TextUtils.getOffsetBefore("", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 41 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr5[i2] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                    i2++;
                    $11 = ($10 + 103) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 5) % 128;
            cArr4 = cArr5;
        }
        int i3 = f2474;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40)).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i3))).intValue();
        if (f2473) {
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr6 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i4 = rVar.f3051;
                int i5 = rVar.f3052;
                if (i4 >= i5) {
                    String str4 = new String(cArr6);
                    $10 = ($11 + 51) % 128;
                    objArr[0] = str4;
                    return;
                }
                $10 = ($11 + 117) % 128;
                cArr6[i4] = (char) (cArr4[bArr[(i5 - 1) - i4] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(Color.green(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 41)).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else if (f2471) {
            int i6 = $11 + 87;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int length3 = cArr2.length;
                rVar.f3052 = length3;
                cArr = new char[length3];
                rVar.f3051 = 1;
            } else {
                int length4 = cArr2.length;
                rVar.f3052 = length4;
                cArr = new char[length4];
                rVar.f3051 = 0;
            }
            while (true) {
                int i7 = rVar.f3051;
                int i8 = rVar.f3052;
                if (i7 >= i8) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i7] = (char) (cArr4[cArr2[(i8 - 1) - i7] - i] - intValue);
                Map map4 = b.f452;
                Object obj4 = map4.get(-1176441533);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) View.getDefaultSize(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 41)).getMethod("a", Object.class, Object.class);
                    map4.put(-1176441533, obj4);
                }
                ((Method) obj4).invoke(null, rVar, rVar);
            }
        } else {
            int length5 = iArr.length;
            rVar.f3052 = length5;
            char[] cArr7 = new char[length5];
            rVar.f3051 = 0;
            while (true) {
                int i9 = rVar.f3051;
                int i10 = rVar.f3052;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i9] = (char) (cArr4[iArr[(i10 - 1) - i9] - i] - intValue);
                    rVar.f3051 = i9 + 1;
                }
            }
        }
    }

    private static void b(String str, int i, Object[] objArr) {
        int i2 = $10 + 3;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f2472 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i3 = nVar.f3042;
            if (i3 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            $10 = ($11 + 55) % 128;
            int i4 = i3 - 4;
            nVar.f3041 = i4;
            long j = m5750[i3] ^ m5750[i3 % 4];
            long j2 = i4;
            long j3 = f2472;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(ViewConfiguration.getScrollBarSize() >> 8, (char) KeyEvent.keyCodeFromString(""), 41 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i3] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 42 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).getMethod("q", Object.class, Object.class);
                    map.put(-2082235053, obj2);
                }
                ((Method) obj2).invoke(null, nVar, nVar);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Map m5269() {
        int i = (f2468 + 69) % 128;
        f2469 = i;
        Map map = this.f2479;
        f2468 = (i + 37) % 128;
        return map;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Collection m5270() {
        int i = f2469;
        Collection collection = this.f2476;
        f2468 = (i + 111) % 128;
        return collection;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private Object m5271() {
        int i = f2468;
        Object obj = this.f2475;
        int i2 = i + 97;
        f2469 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return obj;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean m5272() {
        return ((Boolean) m5278(new Object[]{this}, -636238156, 636238156, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).booleanValue();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m5273(Object[] objArr) {
        hz hzVar = (hz) objArr[0];
        int i = f2469;
        int i2 = i + 121;
        f2468 = i2 % 128;
        hy hyVar = hzVar.f2477;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i + 57;
        f2468 = i3 % 128;
        if (i3 % 2 == 0) {
            return hyVar;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5274(Object obj) {
        if (m5276()) {
            int i = f2469 + 101;
            f2468 = i % 128;
            try {
                if (i % 2 != 0) {
                    this.f2478.set(this.f2475, obj);
                    throw new ArithmeticException("divide by zero");
                }
                this.f2478.set(this.f2475, obj);
                return;
            } catch (Exception e) {
            }
        }
        f2469 = (f2468 + 83) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m5275() {
        int i = f2468;
        int i2 = i + 51;
        f2469 = i2 % 128;
        if (i2 % 2 == 0) {
            Collection collection = this.f2476;
            throw new ArithmeticException("divide by zero");
        }
        if (this.f2476 == null) {
            return false;
        }
        f2469 = (i + 75) % 128;
        return true;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m5276() {
        if (this.f2478 == null) {
            f2468 = (f2469 + 43) % 128;
            return false;
        }
        int i = (f2468 + 117) % 128;
        f2469 = i;
        int i2 = i + 25;
        f2468 = i2 % 128;
        if (i2 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m5277(Object[] objArr) {
        hz hzVar = (hz) objArr[0];
        int i = f2468;
        f2469 = (i + 27) % 128;
        if (hzVar.f2479 == null) {
            return Boolean.FALSE;
        }
        int i2 = i + 105;
        f2469 = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m5278(Object[] objArr, int i, int i2, int i3) {
        int i4 = i2 ^ (-1);
        int i5 = i3 ^ (-1);
        return ((((i * (-830)) + (i2 * 832)) + ((((i4 | i5) ^ (-1)) | (((i | i2) | i3) ^ (-1))) * (-831))) + ((((i4 | i) | i3) ^ (-1)) * (-1662))) + (((((i | i3) ^ (-1)) | (((i ^ (-1)) | i5) ^ (-1))) | ((i2 | i3) ^ (-1))) * 831) != 1 ? m5277(objArr) : m5273(objArr);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5279() {
        f2471 = true;
        f2470 = new char[]{6379, 6381, 6172, 6394, 6385, 6372, 6173, 6175, 6377, 6346, 6380, 6341, 6368, 6336, 6174, 6370};
        f2473 = true;
        f2474 = 343349392;
        f2472 = -5957675255781671332L;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    public final Object mo3719(String str, List<Object> list, cp cpVar) {
        int i = f2468 + 73;
        f2469 = i % 128;
        if (i % 2 == 0) {
            str.hashCode();
            throw null;
        }
        boolean z = -1;
        switch (str.hashCode()) {
            case -2039060844:
                Object[] objArr = new Object[1];
                b("翿耑羘꺗짰鑂\uf229练쐜樒赼멹ࢄ▞䃵\uf187䴵", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
                if (str.equals(((String) objArr[0]).intern())) {
                    int i2 = (f2468 + 103) % 128;
                    f2469 = i2;
                    f2468 = (i2 + 31) % 128;
                    z = 5;
                    break;
                }
                break;
            case -1661939189:
                Object[] objArr2 = new Object[1];
                b("Ი疭\u1cff嬫ⓛ祩꒱⡑ꝺ龱恏\uece5毮퀵귒", KeyEvent.getDeadChar(0, 0) + 1, objArr2);
                if (str.equals(((String) objArr2[0]).intern())) {
                    z = 9;
                    break;
                }
                break;
            case -1249356250:
                Object[] objArr3 = new Object[1];
                a(null, null, TextUtils.indexOf("", "") + 127, "\u008d\u0085\u008c\u0083\u0082\u0081", objArr3);
                if (str.equals(((String) objArr3[0]).intern())) {
                    z = 7;
                    break;
                }
                break;
            case 100472786:
                Object[] objArr4 = new Object[1];
                b("䦵\uf570䧜�㮈昃垵�\uf249", -TextUtils.indexOf((CharSequence) "", '0'), objArr4);
                if (str.equals(((String) objArr4[0]).intern())) {
                    z = 6;
                    break;
                }
                break;
            case 429960040:
                Object[] objArr5 = new Object[1];
                b("\u1add\uea43᪴쓓뺃\ue306暳\uea75ꄽ@僧⻥涱俑㞷攜", TextUtils.indexOf("", "", 0, 0) + 1, objArr5);
                if (str.equals(((String) objArr5[0]).intern())) {
                    f2468 = (f2469 + 83) % 128;
                    z = 4;
                    break;
                }
                break;
            case 700591008:
                Object[] objArr6 = new Object[1];
                a(null, null, 127 - Drawable.resolveOpacity(0, 0), "\u0083\u0090\u0082\u008f\u0085\u008e\u0083\u0082\u0081", objArr6);
                if (str.equals(((String) objArr6[0]).intern())) {
                    f2469 = (f2468 + 49) % 128;
                    z = 8;
                    break;
                }
                break;
            case 1406685743:
                Object[] objArr7 = new Object[1];
                a(null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, "\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0088", objArr7);
                if (str.equals(((String) objArr7[0]).intern())) {
                    z = true;
                    break;
                }
                break;
            case 1953253188:
                Object[] objArr8 = new Object[1];
                a(null, null, 127 - KeyEvent.keyCodeFromString(""), "\u008b\u0086\u0082\u0089\u008a\u0083\u0082\u0081", objArr8);
                if (str.equals(((String) objArr8[0]).intern())) {
                    z = 3;
                    break;
                }
                break;
            case 1967798203:
                Object[] objArr9 = new Object[1];
                a(null, null, View.resolveSizeAndState(0, 0, 0) + 127, "\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr9);
                if (str.equals(((String) objArr9[0]).intern())) {
                    z = false;
                    break;
                }
                break;
            case 2058833392:
                Object[] objArr10 = new Object[1];
                a(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, "\u008b\u0086\u0082\u0089\u008a\u0088\u0089", objArr10);
                if (str.equals(((String) objArr10[0]).intern())) {
                    z = 2;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                return mo5267();
            case true:
                m5274(db.m4587(list, 0, Object.class));
                return null;
            case true:
                return Boolean.valueOf(m5276());
            case true:
                return mo5266();
            case true:
                return Boolean.valueOf(m5275());
            case true:
                return m5270();
            case true:
                return Boolean.valueOf(m5272());
            case true:
                Map m5269 = m5269();
                int i3 = f2469 + 1;
                f2468 = i3 % 128;
                if (i3 % 2 == 0) {
                    return m5269;
                }
                throw null;
            case true:
                return (hy) m5278(new Object[]{this}, -699554903, 699554904, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
            case true:
                return m5271();
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hy
    /* renamed from: ﻐ */
    public final Field mo5266() {
        int i = f2468;
        int i2 = i + 91;
        f2469 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Field field = this.f2478;
        f2469 = (i + 1) % 128;
        return field;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hy
    /* renamed from: ﾇ */
    public final T mo5267() {
        int i = f2469 + 1;
        f2468 = i % 128;
        if (i % 2 != 0) {
            m5276();
            throw new ArithmeticException("divide by zero");
        }
        if (m5276()) {
            int i2 = f2469 + 61;
            f2468 = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.f2478.get(this.f2475);
                    throw null;
                }
                T t = (T) this.f2478.get(this.f2475);
                f2468 = (f2469 + 21) % 128;
                return t;
            } catch (Exception e) {
                return null;
            }
        }
        if (!m5275()) {
            int i3 = f2469 + 111;
            f2468 = i3 % 128;
            if (i3 % 2 != 0) {
                m5272();
                throw null;
            }
            if (!m5272()) {
                return null;
            }
        }
        return (T) this.f2475;
    }
}
