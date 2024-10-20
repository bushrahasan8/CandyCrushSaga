package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: di.class */
public class di extends db implements cn {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static long f1749 = 0;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f1750 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f1751 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1752;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f1753;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1754;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1755;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1756;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f1758;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private hm f1759;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1761;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1762;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final JSONObject f1760 = new JSONObject();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private final List f1757 = new ArrayList();

    static {
        m4675();
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getTouchSlop();
        Process.getGidForName("");
        SystemClock.elapsedRealtime();
        Process.myPid();
        ImageFormat.getBitsPerPixel(0);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getKeyRepeatTimeout();
        TextUtils.getTrimmedLength("");
        AudioTrack.getMaxVolume();
        ViewConfiguration.getTapTimeout();
        Process.myTid();
        MotionEvent.axisFromString("");
        ViewConfiguration.getScrollBarSize();
        Process.getGidForName("");
        AudioTrack.getMaxVolume();
        Color.alpha(0);
        Color.red(0);
        ImageFormat.getBitsPerPixel(0);
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf("", "", 0);
        Process.getElapsedCpuTime();
        View.MeasureSpec.getMode(0);
        View.resolveSizeAndState(0, 0, 0);
        ImageFormat.getBitsPerPixel(0);
        Color.rgb(0, 0, 0);
        TextUtils.indexOf("", "", 0, 0);
        ViewConfiguration.getWindowTouchSlop();
        Process.myPid();
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ExpandableListView.getPackedPositionChild(0L);
        Drawable.resolveOpacity(0, 0);
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getGlobalActionKeyTimeout();
        Process.getGidForName("");
        ViewConfiguration.getTapTimeout();
        ViewConfiguration.getZoomControlsTimeout();
        ExpandableListView.getPackedPositionForGroup(0);
        View.resolveSize(0, 0);
        ViewConfiguration.getScrollFriction();
        ViewConfiguration.getScrollBarSize();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.lastIndexOf("", '0');
        TextUtils.getCapsMode("", 0, 0);
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getKeyRepeatTimeout();
        View.combineMeasuredStates(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        TypedValue.complexToFloat(0);
        ViewConfiguration.getScrollDefaultDelay();
        Color.argb(0, 0, 0, 0);
        Process.getGidForName("");
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        Process.getThreadPriority(0);
        TextUtils.lastIndexOf("", '0');
        SystemClock.uptimeMillis();
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getDoubleTapTimeout();
        Color.red(0);
        KeyEvent.getDeadChar(0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ExpandableListView.getPackedPositionForGroup(0);
        f1750 = (f1751 + 55) % 128;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i6 = f1755;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371(TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 41 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i6))).intValue();
            if (intValue == -1) {
                $11 = ($10 + 35) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i7 = $11 + 111;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = f1753;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr3 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        $10 = ($11 + 107) % 128;
                        byte b2 = bArr[i8];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(122654587);
                        if (obj2 == null) {
                            obj2 = ((Class) b.m3371((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 41 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("h", Integer.TYPE);
                            map2.put(122654587, obj2);
                        }
                        bArr3[i8] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i9 = $10 + 21;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        byte[] bArr4 = f1753;
                        int i10 = f1754;
                        Map map3 = b.f452;
                        Object obj3 = map3.get(-1903297911);
                        if (obj3 == null) {
                            Class cls3 = (Class) b.m3371(TextUtils.indexOf("", "", 0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40);
                            Class<?> cls4 = Integer.TYPE;
                            obj3 = cls3.getMethod("g", cls4, cls4);
                            map3.put(-1903297911, obj3);
                        }
                        i5 = ((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i3), Integer.valueOf(i10))).intValue()] + 8044072489887092822L)) / ((int) (f1755 - 8044072489887092822L));
                    } else {
                        byte[] bArr5 = f1753;
                        int i11 = f1754;
                        Map map4 = b.f452;
                        Object obj4 = map4.get(-1903297911);
                        if (obj4 == null) {
                            Class cls5 = (Class) b.m3371((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (char) View.resolveSizeAndState(0, 0, 0), 41 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            Class<?> cls6 = Integer.TYPE;
                            obj4 = cls5.getMethod("g", cls6, cls6);
                            map4.put(-1903297911, obj4);
                        }
                        i5 = ((byte) (bArr5[((Integer) ((Method) obj4).invoke(null, Integer.valueOf(i3), Integer.valueOf(i11))).intValue()] ^ 8044072489887092822L)) + ((int) (f1755 ^ 8044072489887092822L));
                    }
                    intValue = (byte) i5;
                } else {
                    intValue = (short) (((short) (f1752[i3 + ((int) (f1754 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f1755 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                qVar.f3047 = ((i3 + intValue) - 2) + ((int) (f1754 ^ 8044072489887092822L)) + i4;
                int i12 = f1756;
                Map map5 = b.f452;
                Object obj5 = map5.get(-2107390936);
                if (obj5 == null) {
                    Class cls7 = (Class) b.m3371(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getFadingEdgeLength() >> 16) + 41);
                    Class<?> cls8 = Integer.TYPE;
                    obj5 = cls7.getMethod("f", Object.class, cls8, cls8, Object.class);
                    map5.put(-2107390936, obj5);
                }
                ((StringBuilder) ((Method) obj5).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i12), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr6 = f1753;
                byte[] bArr7 = bArr6;
                if (bArr6 != null) {
                    $11 = ($10 + 37) % 128;
                    int length2 = bArr6.length;
                    bArr7 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr7[i13] = (byte) (bArr6[i13] ^ 8044072489887092822L);
                    }
                }
                boolean z = bArr7 != null;
                qVar.f3050 = 1;
                while (qVar.f3050 < intValue) {
                    if (!(!z)) {
                        byte[] bArr8 = f1753;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr8[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f1752;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((short) (((short) (sArr[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    }
                    sb.append(qVar.f3049);
                    qVar.f3048 = qVar.f3049;
                    qVar.f3050++;
                }
            }
            String sb2 = sb.toString();
            $11 = ($10 + 1) % 128;
            objArr[0] = sb2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void b(String str, int i, Object[] objArr) {
        int i2 = $10 + 39;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i4 = i3 + 51;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            str = str.toCharArray();
        }
        n nVar = new n();
        char[] m5750 = n.m5750(f1749 ^ (-7438370749274812225L), (char[]) str, i);
        nVar.f3042 = 4;
        while (true) {
            int i5 = nVar.f3042;
            if (i5 >= m5750.length) {
                objArr[0] = new String(m5750, 4, m5750.length - 4);
                return;
            }
            int i6 = i5 - 4;
            nVar.f3041 = i6;
            long j = m5750[i5] ^ m5750[i5 % 4];
            long j2 = i6;
            long j3 = f1749;
            try {
                Map map = b.f452;
                Object obj = map.get(983860882);
                if (obj == null) {
                    Class cls = (Class) b.m3371(KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 41);
                    Class<?> cls2 = Long.TYPE;
                    obj = cls.getMethod("p", cls2, cls2, cls2);
                    map.put(983860882, obj);
                }
                m5750[i5] = ((Character) ((Method) obj).invoke(null, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3))).charValue();
                Object obj2 = map.get(-2082235053);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 42)).getMethod("q", Object.class, Object.class);
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

    /* renamed from: ﭴ, reason: contains not printable characters */
    private Object m4656() {
        boolean z;
        f1751 = (f1750 + 105) % 128;
        if (TextUtils.isEmpty(this.f1762)) {
            f1750 = (f1751 + 113) % 128;
            if (TextUtils.isEmpty(this.f1758) && TextUtils.isEmpty(this.f1761) && this.f1757.size() <= 0) {
                z = false;
                f1751 = (f1750 + 95) % 128;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        f1751 = (f1750 + 95) % 128;
        return Boolean.valueOf(z);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Object m4657() {
        f1750 = (f1751 + 111) % 128;
        String optString = this.f1760.optString(ig.f2566);
        f1750 = (f1751 + 125) % 128;
        return optString;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private void m4658(String str) {
        f1751 = (f1750 + 105) % 128;
        try {
            this.f1760.put(ig.f2566, str);
            f1751 = (f1750 + 7) % 128;
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m4659() {
        f1750 = (f1751 + 17) % 128;
        String optString = this.f1760.optString(ig.f2573);
        int i = f1750 + 73;
        f1751 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return optString;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private List m4660() {
        int i = f1751;
        int i2 = i + 93;
        f1750 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        List list = this.f1757;
        int i3 = i + 79;
        f1750 = i3 % 128;
        if (i3 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private void m4661(String str) {
        f1751 = (f1750 + 65) % 128;
        try {
            this.f1760.put(ig.f2562, str);
            f1751 = (f1750 + 109) % 128;
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m4662() {
        int i = f1750 + 103;
        f1751 = i % 128;
        if (i % 2 == 0) {
            this.f1760.optString(ig.f2562);
            throw null;
        }
        String optString = this.f1760.optString(ig.f2562);
        f1751 = (f1750 + 97) % 128;
        return optString;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String m4663() {
        int i = f1751 + 91;
        f1750 = i % 128;
        if (i % 2 != 0) {
            this.f1760.optString(ig.f2567);
            throw new ArithmeticException("divide by zero");
        }
        String optString = this.f1760.optString(ig.f2567);
        f1750 = (f1751 + 115) % 128;
        return optString;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private void m4664(String str) {
        f1751 = (f1750 + 67) % 128;
        try {
            this.f1760.put(ig.f2567, str);
            f1751 = (f1750 + 11) % 128;
        } catch (JSONException e) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private hm m4665() {
        int i = f1751 + 63;
        int i2 = i % 128;
        f1750 = i2;
        if (i % 2 != 0) {
            hm hmVar = this.f1759;
            throw new ArithmeticException("divide by zero");
        }
        hm hmVar2 = this.f1759;
        f1751 = (i2 + 7) % 128;
        return hmVar2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4666(hm hmVar) {
        int i = f1751 + 25;
        f1750 = i % 128;
        this.f1759 = hmVar;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m4667(String str) {
        int i = (f1751 + 43) % 128;
        f1750 = i;
        this.f1762 = str;
        int i2 = i + 29;
        f1751 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m4668(Object[] objArr) {
        di diVar = (di) objArr[0];
        String str = (String) objArr[1];
        f1750 = (f1751 + 47) % 128;
        try {
            diVar.f1760.put(ig.f2573, str);
            f1751 = (f1750 + 71) % 128;
            return null;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m4669(String str) {
        int i = f1751 + 87;
        f1750 = i % 128;
        if (i % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (!TextUtils.isEmpty(str) && !this.f1757.contains(str)) {
            f1750 = (f1751 + 51) % 128;
            this.f1757.add(str);
        }
        int i2 = f1750 + 89;
        f1751 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m4670(Object[] objArr, int i, int i2, int i3) {
        Object obj;
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        int i6 = i3 ^ (-1);
        int i7 = (i * 69) + (i2 * (-67)) + ((((i | i2) ^ (-1)) | (((i4 | i5) | i6) ^ (-1)) | ((i3 | i2) ^ (-1))) * (-68)) + ((((i4 | i6) | i2) ^ (-1)) * (-68)) + ((((i5 | i6) ^ (-1)) | i4) * 68);
        if (i7 != 1) {
            obj = i7 != 2 ? i7 != 3 ? m4668(objArr) : m4677(objArr) : m4674(objArr);
        } else {
            di diVar = (di) objArr[0];
            int i8 = f1750;
            f1751 = (i8 + 47) % 128;
            obj = diVar.f1761;
            f1751 = (i8 + 67) % 128;
        }
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m4671() {
        int i = (f1750 + 71) % 128;
        f1751 = i;
        String str = this.f1758;
        int i2 = i + 25;
        f1750 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m4672(String str) {
        int i = f1751 + 107;
        f1750 = i % 128;
        this.f1761 = str;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m4673(List list) {
        int i = f1750 + 37;
        f1751 = i % 128;
        if (i % 2 == 0) {
            list.iterator();
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m4669((String) it.next());
            f1750 = (f1751 + 101) % 128;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m4674(Object[] objArr) {
        di diVar = (di) objArr[0];
        JSONObject jSONObject = new JSONObject();
        try {
            String str = diVar.f1762;
            if (str != null) {
                int i = f1751 + 95;
                f1750 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                if (diVar.f1759 != null) {
                    jSONObject.putOpt(ig.f2573, str);
                    jSONObject.putOpt(ig.f2570, Integer.valueOf(diVar.f1759.m5126()));
                }
            }
            jSONObject.putOpt(ig.f2567, diVar.f1758);
            jSONObject.putOpt(ig.f2566, diVar.f1761);
            if (diVar.f1757.size() > 0) {
                jSONObject.putOpt(ig.f2562, new JSONArray((Collection) diVar.f1757));
            }
            if (diVar.f1760.length() > 0) {
                jSONObject.putOpt(ig.f2571, diVar.f1760.toString());
                f1750 = (f1751 + 71) % 128;
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static void m4675() {
        f1754 = 1696508978;
        f1755 = 1798721660;
        f1756 = -2119293548;
        f1753 = new byte[]{77, -127, 91, -92, 92, -93, 84, 91, -71, 68, 117, -101, 89, -88, 77, -127, 91, -92, 92, -93, 84, 91, -71, 68, 117, -101, 89, -92, -93, -95, 115, -90, 77, -127, 91, -92, 92, -93, 84, 91, -71, 68, 117, -101, 89, -88, -93, -95, 115, -90, 77, -127, 91, -92, 92, -93, 84, 91, -71, 68, 117, -101, 89, -92, -84, 75, -65, 93, -91, 83, 117, -124, 89, -92, 84, -89, -85, 80, 74, -79, -84, 75, -73, 87, 88, 119, -122, 89, -88, 84, -89, -85, 80, 74, -79, -84, 75, -73, 87, 88, 119, -122, 89, -92, 84, -89, -85, 80, 74, -79, -84, 75, -90, 84, -89, -85, 80, 74, -119, 89, -88, 84, -89, -85, 80, 74, -79, -84, 75, -90, 84, -89, -85, 80, 74, -119, 89, -92, -87, -86, Byte.MAX_VALUE, -77, 84, -89, -85, 80, 74, -73, 91, -92, 92, -93, 84, 91, -71, 68, 117, -101, 89, -88, 95, -82, 115, -127, 91, -92, 92, -93, 84, 91, -71, 68, 117, -104, 68, -81, -87, -86, Byte.MAX_VALUE, -115, -83, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86, 86};
        f1749 = 8055861691952673360L;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m4676(String str) {
        int i = (f1751 + 19) % 128;
        f1750 = i;
        this.f1758 = str;
        f1751 = (i + 101) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m4677(Object[] objArr) {
        di diVar = (di) objArr[0];
        int i = f1750;
        f1751 = (i + 47) % 128;
        JSONObject jSONObject = diVar.f1760;
        int i2 = i + 77;
        f1751 = i2 % 128;
        if (i2 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m4678() {
        int i = f1751 + 71;
        f1750 = i % 128;
        if (i % 2 == 0) {
            return this.f1762;
        }
        String str = this.f1762;
        throw new ArithmeticException("divide by zero");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x069c, code lost:
    
        if (r10.equals(((java.lang.String) r0[0]).intern()) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0724, code lost:
    
        if (r10.equals(((java.lang.String) r0[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03a3, code lost:
    
        if ((r0 % 2) != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03a6, code lost:
    
        r17 = 4;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo3719(java.lang.String r10, java.util.List<java.lang.Object> r11, com.ironsource.adqualitysdk.sdk.i.cp r12) {
        /*
            Method dump skipped, instructions count: 2593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.di.mo3719(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.cp):java.lang.Object");
    }
}
