package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: db.class */
public class db {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1581 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1582 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1583 = 2075947622;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1584 = 1798721610;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f1585 = {-90, -6, 87, 68, -88, 21, -6, 83, 87, 86, 91, 72, -66, -25, -83, 2};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f1586;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1587 = 1549320753;

    private static void e(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        int i4;
        boolean z;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i5 = f1584;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371(Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.indexOf("", ""), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i5))).intValue();
            boolean z2 = intValue == -1;
            if (z2) {
                byte[] bArr = f1585;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    $10 = ($11 + 3) % 128;
                    int length = bArr.length;
                    byte[] bArr3 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        byte b2 = bArr[i6];
                        Map map2 = b.f452;
                        Object obj2 = map2.get(122654587);
                        if (obj2 == null) {
                            obj2 = ((Class) b.m3371((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 41)).getMethod("h", Integer.TYPE);
                            map2.put(122654587, obj2);
                        }
                        bArr3[i6] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = f1585;
                    int i7 = f1583;
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-1903297911);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 40 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("g", cls4, cls4);
                        map3.put(-1903297911, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, Integer.valueOf(i3), Integer.valueOf(i7))).intValue()] ^ 8044072489887092822L)) + ((int) (f1584 ^ 8044072489887092822L)));
                } else {
                    intValue = (short) (((short) (f1586[i3 + ((int) (f1583 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f1584 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                int i8 = (int) (f1583 ^ 8044072489887092822L);
                if (z2) {
                    $11 = ($10 + 91) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                qVar.f3047 = ((i3 + intValue) - 2) + i8 + i4;
                int i9 = f1587;
                Map map4 = b.f452;
                Object obj4 = map4.get(-2107390936);
                if (obj4 == null) {
                    Class cls5 = (Class) b.m3371(View.resolveSize(0, 0), (char) Color.red(0), 41 - (Process.myPid() >> 22));
                    Class<?> cls6 = Integer.TYPE;
                    obj4 = cls5.getMethod("f", Object.class, cls6, cls6, Object.class);
                    map4.put(-2107390936, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i9), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr5 = f1585;
                byte[] bArr6 = bArr5;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    bArr6 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $11 + 15;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            bArr6[i10] = (byte) (bArr5[i10] - 8044072489887092822L);
                            i10 %= 0;
                        } else {
                            bArr6[i10] = (byte) (bArr5[i10] ^ 8044072489887092822L);
                            i10++;
                        }
                    }
                }
                if (bArr6 != null) {
                    $11 = ($10 + 75) % 128;
                    z = true;
                } else {
                    z = false;
                }
                qVar.f3050 = 1;
                while (qVar.f3050 < intValue) {
                    if (!(!z)) {
                        byte[] bArr7 = f1585;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr7[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f1586;
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m4586(List list, int i, Class cls) {
        f1581 = (f1582 + 37) % 128;
        Object obj = list.get(i);
        if (obj == null) {
            return true;
        }
        int i2 = f1582 + 73;
        f1581 = i2 % 128;
        boolean isAssignableFrom = cls.isAssignableFrom(obj.getClass());
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return isAssignableFrom;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static <T> T m4587(List<Object> list, int i, Class<T> cls) {
        f1581 = (f1582 + 13) % 128;
        T t = (T) list.get(i);
        if (t != null) {
            int i2 = f1582 + 29;
            f1581 = i2 % 128;
            if (i2 % 2 == 0) {
                cls.isAssignableFrom(t.getClass());
                throw null;
            }
            if (!cls.isAssignableFrom(t.getClass())) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                e((short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-929993252) + (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 30, (-277488176) - (Process.myTid() >> 22), objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(t.getClass().getName());
                Object[] objArr2 = new Object[1];
                e((short) View.getDefaultSize(0, 0), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) - 929993287, Color.red(0) - 29, 56844 - AndroidCharacter.getMirror('0'), objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append(cls.getName());
                throw new ClassCastException(sb.toString());
            }
        }
        f1582 = (f1581 + 83) % 128;
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static List m4588(List list, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        if (list.size() > i) {
            arrayList2 = arrayList;
            if (m4586(list, i, List.class)) {
                f1581 = (f1582 + 95) % 128;
                arrayList2 = (List) m4587(list, i, List.class);
                f1582 = (f1581 + 23) % 128;
            }
        }
        return arrayList2;
    }
}
