package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: ei.class */
public abstract class ei extends eb {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2024 = {37212};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2025 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2026;

    /* renamed from: ｋ, reason: contains not printable characters */
    private eb f2027;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private eb f2028;

    public ei(eb ebVar, eb ebVar2, dr drVar) {
        super(drVar);
        this.f2027 = ebVar;
        this.f2028 = ebVar2;
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        int i;
        String str2 = str;
        if (str != null) {
            int i2 = $11 + 59;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                str.getBytes("ISO-8859-1");
                throw new ArithmeticException("divide by zero");
            }
            str2 = str.getBytes("ISO-8859-1");
            $10 = ($11 + 11) % 128;
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = f2024;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                char c = cArr[i7];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371(View.combineMeasuredStates(0, 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 41 - TextUtils.getCapsMode("", 0, 0))).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr2[i7] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        char[] cArr4 = cArr3;
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            jVar.f2705 = 0;
            char c2 = 0;
            while (true) {
                int i8 = jVar.f2705;
                if (i8 >= i4) {
                    break;
                }
                if (bArr[i8] == 1) {
                    char c3 = cArr3[i8];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371(View.MeasureSpec.getSize(0), (char) View.getDefaultSize(0, 0), View.MeasureSpec.getSize(0) + 41);
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr5[i8] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                } else {
                    char c4 = cArr3[i8];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 41);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr5[i8] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                }
                c2 = cArr5[jVar.f2705];
                Map map4 = b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371((Process.getThreadPriority(0) + 20) >> 6, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 40 - TextUtils.lastIndexOf("", '0', 0))).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i9 = $10 + 103;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr4, 0, cArr6, 1, i4);
                System.arraycopy(cArr6, 1, cArr4, i4 << i6, i6);
                System.arraycopy(cArr6, i6, cArr4, 1, i4 >> i6);
            } else {
                char[] cArr7 = new char[i4];
                System.arraycopy(cArr4, 0, cArr7, 0, i4);
                int i10 = i4 - i6;
                System.arraycopy(cArr7, 0, cArr4, i10, i6);
                System.arraycopy(cArr7, i6, cArr4, 0, i10);
            }
        }
        char[] cArr8 = cArr4;
        if (z) {
            $11 = ($10 + 91) % 128;
            cArr8 = new char[i4];
            jVar.f2705 = 0;
            while (true) {
                int i11 = jVar.f2705;
                if (i11 >= i4) {
                    break;
                }
                int i12 = $10 + 77;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr8[i11] = cArr4[i4 + i11];
                    i = i11 >> 1;
                } else {
                    cArr8[i11] = cArr4[(i4 - i11) - 1];
                    i = i11 + 1;
                }
                jVar.f2705 = i;
            }
        }
        if (i5 > 0) {
            int i13 = 0;
            while (true) {
                jVar.f2705 = i13;
                int i14 = jVar.f2705;
                if (i14 >= i4) {
                    break;
                }
                cArr8[i14] = (char) (cArr8[i14] - iArr[2]);
                i13 = i14 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    public boolean equals(Object obj) {
        int i = f2025 + 25;
        int i2 = i % 128;
        f2026 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i3 = i2 + 113;
        f2025 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ei eiVar = (ei) obj;
        eb ebVar = this.f2027;
        if (ebVar == null ? eiVar.f2027 != null : !ebVar.equals(eiVar.f2027)) {
            f2026 = (f2025 + 33) % 128;
            return false;
        }
        eb ebVar2 = this.f2028;
        if (ebVar2 != null) {
            f2026 = (f2025 + 125) % 128;
            return ebVar2.equals(eiVar.f2028);
        }
        if (eiVar.f2028 != null) {
            return false;
        }
        f2026 = (f2025 + 79) % 128;
        return true;
    }

    public int hashCode() {
        int i;
        eb ebVar = this.f2027;
        int i2 = 0;
        if (ebVar != null) {
            f2026 = (f2025 + 75) % 128;
            i = ebVar.hashCode();
        } else {
            i = 0;
        }
        eb ebVar2 = this.f2028;
        if (ebVar2 != null) {
            int i3 = f2025 + 23;
            f2026 = i3 % 128;
            if (i3 % 2 != 0) {
                ebVar2.hashCode();
                throw new ArithmeticException("divide by zero");
            }
            i2 = ebVar2.hashCode();
        }
        return (i * 31) + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2027);
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 1, 0, 1}, "��", objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(mo4955());
        Object[] objArr2 = new Object[1];
        a(false, new int[]{0, 1, 0, 1}, "��", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.f2028);
        String obj = sb.toString();
        f2025 = (f2026 + 55) % 128;
        return obj;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract String mo4955();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final eb m4956() {
        int i = f2026;
        eb ebVar = this.f2028;
        int i2 = i + 89;
        f2025 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return ebVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final eb m4957() {
        int i = f2025 + 31;
        f2026 = i % 128;
        if (i % 2 == 0) {
            return this.f2027;
        }
        throw null;
    }
}
