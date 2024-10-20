package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: en.class */
public abstract class en extends eb {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f2046;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2047 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f2048 = {-62, -62};

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2049 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2050 = 1798721595;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2051 = 1852276909;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2052 = -166842346;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private eb f2053;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private eb f2054;

    /* JADX INFO: Access modifiers changed from: package-private */
    public en(eb ebVar, eb ebVar2, dr drVar) {
        super(drVar);
        this.f2054 = ebVar;
        this.f2053 = ebVar2;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4;
        q qVar = new q();
        StringBuilder sb = new StringBuilder();
        int i5 = f2050;
        try {
            Map map = b.f452;
            Object obj = map.get(-1903297911);
            if (obj == null) {
                Class cls = (Class) b.m3371((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) TextUtils.getTrimmedLength(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 41);
                Class<?> cls2 = Integer.TYPE;
                obj = cls.getMethod("g", cls2, cls2);
                map.put(-1903297911, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, Integer.valueOf(i2), Integer.valueOf(i5))).intValue();
            int i6 = intValue == -1 ? 1 : 0;
            if ((i6 ^ 1) == 0) {
                byte[] bArr = f2048;
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr3 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 1;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            byte b2 = bArr[i7];
                            Map map2 = b.f452;
                            Object obj2 = map2.get(122654587);
                            if (obj2 == null) {
                                obj2 = ((Class) b.m3371((Process.getThreadPriority(0) + 20) >> 6, (char) View.MeasureSpec.getSize(0), 41 - (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("h", Integer.TYPE);
                                map2.put(122654587, obj2);
                            }
                            bArr3[i7] = ((Byte) ((Method) obj2).invoke(null, Integer.valueOf(b2))).byteValue();
                            i7 >>= 1;
                        } else {
                            byte b3 = bArr[i7];
                            Map map3 = b.f452;
                            Object obj3 = map3.get(122654587);
                            if (obj3 == null) {
                                obj3 = ((Class) b.m3371((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 41 - TextUtils.indexOf("", "", 0))).getMethod("h", Integer.TYPE);
                                map3.put(122654587, obj3);
                            }
                            bArr3[i7] = ((Byte) ((Method) obj3).invoke(null, Integer.valueOf(b3))).byteValue();
                            i7++;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i9 = $11 + 85;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        byte[] bArr4 = f2048;
                        int i10 = f2052;
                        Map map4 = b.f452;
                        Object obj4 = map4.get(-1903297911);
                        if (obj4 == null) {
                            Class cls3 = (Class) b.m3371(KeyEvent.keyCodeFromString(""), (char) ExpandableListView.getPackedPositionType(0L), AndroidCharacter.getMirror('0') - 7);
                            Class<?> cls4 = Integer.TYPE;
                            obj4 = cls3.getMethod("g", cls4, cls4);
                            map4.put(-1903297911, obj4);
                        }
                        i4 = ((byte) (bArr4[((Integer) ((Method) obj4).invoke(null, Integer.valueOf(i3), Integer.valueOf(i10))).intValue()] + 8044072489887092822L)) >>> ((int) (f2050 / 8044072489887092822L));
                    } else {
                        byte[] bArr5 = f2048;
                        int i11 = f2052;
                        Map map5 = b.f452;
                        Object obj5 = map5.get(-1903297911);
                        if (obj5 == null) {
                            Class cls5 = (Class) b.m3371(((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) (Process.getGidForName("") + 1), 41 - Color.alpha(0));
                            Class<?> cls6 = Integer.TYPE;
                            obj5 = cls5.getMethod("g", cls6, cls6);
                            map5.put(-1903297911, obj5);
                        }
                        i4 = ((byte) (bArr5[((Integer) ((Method) obj5).invoke(null, Integer.valueOf(i3), Integer.valueOf(i11))).intValue()] ^ 8044072489887092822L)) + ((int) (f2050 ^ 8044072489887092822L));
                    }
                    intValue = (byte) i4;
                } else {
                    intValue = (short) (((short) (f2046[i3 + ((int) (f2052 ^ 8044072489887092822L))] ^ 8044072489887092822L)) + ((int) (f2050 ^ 8044072489887092822L)));
                }
            }
            if (intValue > 0) {
                qVar.f3047 = ((i3 + intValue) - 2) + ((int) (f2052 ^ 8044072489887092822L)) + i6;
                int i12 = f2051;
                Map map6 = b.f452;
                Object obj6 = map6.get(-2107390936);
                if (obj6 == null) {
                    Class cls7 = (Class) b.m3371(ExpandableListView.getPackedPositionGroup(0L), (char) View.combineMeasuredStates(0, 0), 41 - View.getDefaultSize(0, 0));
                    Class<?> cls8 = Integer.TYPE;
                    obj6 = cls7.getMethod("f", Object.class, cls8, cls8, Object.class);
                    map6.put(-2107390936, obj6);
                }
                ((StringBuilder) ((Method) obj6).invoke(null, qVar, Integer.valueOf(i), Integer.valueOf(i12), sb)).append(qVar.f3049);
                qVar.f3048 = qVar.f3049;
                byte[] bArr6 = f2048;
                byte[] bArr7 = bArr6;
                if (bArr6 != null) {
                    int length2 = bArr6.length;
                    bArr7 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr7[i13] = (byte) (bArr6[i13] ^ 8044072489887092822L);
                    }
                }
                if (bArr7 != null) {
                    $11 = ($10 + 21) % 128;
                    z = true;
                } else {
                    z = false;
                }
                qVar.f3050 = 1;
                $11 = ($10 + 41) % 128;
                while (qVar.f3050 < intValue) {
                    if (z) {
                        $10 = ($11 + 105) % 128;
                        byte[] bArr8 = f2048;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((byte) (((byte) (bArr8[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    } else {
                        short[] sArr = f2046;
                        qVar.f3047 = qVar.f3047 - 1;
                        qVar.f3049 = (char) (qVar.f3048 + (((short) (((short) (sArr[r0] ^ 8044072489887092822L)) + s)) ^ b));
                    }
                    sb.append(qVar.f3049);
                    qVar.f3048 = qVar.f3049;
                    qVar.f3050++;
                }
            }
            String sb2 = sb.toString();
            $11 = ($10 + 93) % 128;
            objArr[0] = sb2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            f2049 = (f2047 + 73) % 128;
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        en enVar = (en) obj;
        eb ebVar = this.f2054;
        if (ebVar != null) {
            f2047 = (f2049 + 113) % 128;
            if (!ebVar.equals(enVar.f2054)) {
                return false;
            }
        } else if (enVar.f2054 != null) {
            return false;
        }
        eb ebVar2 = this.f2053;
        eb ebVar3 = enVar.f2053;
        if (ebVar2 != null) {
            return ebVar2.equals(ebVar3);
        }
        if (ebVar3 != null) {
            return false;
        }
        f2047 = (f2049 + 119) % 128;
        return true;
    }

    public int hashCode() {
        int i;
        eb ebVar = this.f2054;
        int i2 = 0;
        if (ebVar != null) {
            f2049 = (f2047 + 21) % 128;
            i = ebVar.hashCode();
        } else {
            i = 0;
        }
        eb ebVar2 = this.f2053;
        if (ebVar2 != null) {
            i2 = ebVar2.hashCode();
            f2049 = (f2047 + 103) % 128;
        }
        return (i * 31) + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m4970().toString());
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetAfter("", 0) - 89247904, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 110, 1657249728 - ExpandableListView.getPackedPositionType(0L), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(m4969().toString());
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getTrimmedLength(""), (byte) TextUtils.indexOf("", ""), (-89247902) - (ViewConfiguration.getLongPressTimeout() >> 16), Drawable.resolveOpacity(0, 0) - 110, KeyEvent.normalizeMetaState(0) + 1657249729, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String obj = sb.toString();
        f2047 = (f2049 + 63) % 128;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public final eb m4969() {
        int i = f2049 + 37;
        f2047 = i % 128;
        if (i % 2 != 0) {
            return this.f2053;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final eb m4970() {
        int i = (f2049 + 15) % 128;
        f2047 = i;
        eb ebVar = this.f2054;
        f2049 = (i + 33) % 128;
        return ebVar;
    }
}
