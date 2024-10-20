package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: ic.class */
public class ic {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2500 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2501;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final byte[] f2502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final byte[] f2503;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2504;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2505;

    static {
        m5327();
        f2501 = (f2500 + 63) % 128;
        f2505 = true;
        f2502 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2503 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private ic() {
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) {
        String str2 = str;
        if (str != null) {
            str2 = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str2;
        j jVar = new j();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = f2504;
        char[] cArr2 = cArr;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char c = cArr[i5];
                try {
                    Map map = b.f452;
                    Object obj = map.get(123012079);
                    if (obj == null) {
                        obj = ((Class) b.m3371(View.MeasureSpec.getSize(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 41 - View.MeasureSpec.getMode(0))).getMethod("t", Integer.TYPE);
                        map.put(123012079, obj);
                    }
                    cArr3[i5] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i2];
        System.arraycopy(cArr2, i, cArr4, 0, i2);
        char[] cArr5 = cArr4;
        if (bArr != null) {
            char[] cArr6 = new char[i2];
            jVar.f2705 = 0;
            char c2 = 0;
            while (true) {
                int i6 = jVar.f2705;
                if (i6 >= i2) {
                    break;
                }
                if (bArr[i6] == 1) {
                    $10 = ($11 + 13) % 128;
                    char c3 = cArr4[i6];
                    Map map2 = b.f452;
                    Object obj2 = map2.get(-1475644584);
                    if (obj2 == null) {
                        Class cls = (Class) b.m3371(View.MeasureSpec.getMode(0), (char) Color.alpha(0), (ViewConfiguration.getTouchSlop() >> 8) + 41);
                        Class<?> cls2 = Integer.TYPE;
                        obj2 = cls.getMethod("v", cls2, cls2);
                        map2.put(-1475644584, obj2);
                    }
                    cArr6[i6] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c3), Integer.valueOf(c2))).charValue();
                    $11 = ($10 + 125) % 128;
                } else {
                    char c4 = cArr4[i6];
                    Map map3 = b.f452;
                    Object obj3 = map3.get(1186866459);
                    if (obj3 == null) {
                        Class cls3 = (Class) b.m3371((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + 42);
                        Class<?> cls4 = Integer.TYPE;
                        obj3 = cls3.getMethod("y", cls4, cls4);
                        map3.put(1186866459, obj3);
                    }
                    cArr6[i6] = ((Character) ((Method) obj3).invoke(null, Integer.valueOf(c4), Integer.valueOf(c2))).charValue();
                }
                c2 = cArr6[jVar.f2705];
                Map map4 = b.f452;
                Object obj4 = map4.get(-811294887);
                if (obj4 == null) {
                    obj4 = ((Class) b.m3371(View.resolveSizeAndState(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 42)).getMethod("w", Object.class, Object.class);
                    map4.put(-811294887, obj4);
                }
                ((Method) obj4).invoke(null, jVar, jVar);
            }
            cArr5 = cArr6;
        }
        if (i4 > 0) {
            char[] cArr7 = new char[i2];
            System.arraycopy(cArr5, 0, cArr7, 0, i2);
            int i7 = i2 - i4;
            System.arraycopy(cArr7, 0, cArr5, i7, i4);
            System.arraycopy(cArr7, i4, cArr5, 0, i7);
        }
        char[] cArr8 = cArr5;
        if (z) {
            int i8 = $10 + 19;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr8 = new char[i2];
                jVar.f2705 = 1;
            } else {
                cArr8 = new char[i2];
                jVar.f2705 = 0;
            }
            while (true) {
                int i9 = jVar.f2705;
                if (i9 >= i2) {
                    break;
                }
                cArr8[i9] = cArr5[(i2 - i9) - 1];
                jVar.f2705 = i9 + 1;
            }
        }
        if (i3 > 0) {
            jVar.f2705 = 0;
            $10 = ($11 + 17) % 128;
            while (true) {
                int i10 = jVar.f2705;
                if (i10 >= i2) {
                    break;
                }
                cArr8[i10] = (char) (cArr8[i10] - iArr[2]);
                jVar.f2705 = i10 + 1;
            }
        }
        objArr[0] = new String(cArr8);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m5320(byte[] bArr, int i, byte[] bArr2) {
        byte[] m5330 = m5330(bArr, 0, i, bArr2);
        String str = new String(m5330, 0, m5330.length);
        f2500 = (f2501 + 105) % 128;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m5321(byte[] bArr, int i, int i2, byte[] bArr2) {
        int i3;
        byte[] bArr3 = new byte[((i2 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        f2500 = (f2501 + 61) % 128;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i6;
            if (i4 >= i2) {
                break;
            }
            byte b = (byte) (bArr[i4] & Byte.MAX_VALUE);
            byte b2 = bArr2[b];
            if (b2 < -5) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(false, new int[]{143, 30, 0, 0}, "��\u0001\u0001����\u0001����\u0001����\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001��\u0001\u0001��", objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(i4);
                Object[] objArr2 = new Object[1];
                a(true, new int[]{173, 2, 133, 0}, "\u0001��", objArr2);
                sb.append(((String) objArr2[0]).intern());
                sb.append((int) bArr[i4]);
                Object[] objArr3 = new Object[1];
                a(true, new int[]{175, 9, 0, 2}, "����\u0001\u0001\u0001��������", objArr3);
                sb.append(((String) objArr3[0]).intern());
                throw new ie(sb.toString());
            }
            int i7 = i5;
            int i8 = i3;
            if (b2 >= -1) {
                if (b == 61) {
                    int i9 = i2 - i4;
                    byte b3 = (byte) (bArr[i2 - 1] & Byte.MAX_VALUE);
                    if (i5 == 0 || i5 == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr4 = new Object[1];
                        a(true, new int[]{0, 40, 0, 20}, "\u0001\u0001\u0001\u0001��\u0001\u0001\u0001\u0001��\u0001\u0001����\u0001\u0001\u0001\u0001��\u0001\u0001��\u0001��\u0001��\u0001\u0001\u0001\u0001\u0001\u0001����\u0001\u0001\u0001����\u0001", objArr4);
                        sb2.append(((String) objArr4[0]).intern());
                        sb2.append(i4);
                        throw new ie(sb2.toString());
                    }
                    if ((i5 == 3 && i9 > 2) || (i5 == 4 && i9 > 1)) {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr5 = new Object[1];
                        a(true, new int[]{40, 64, 24, 20}, null, objArr5);
                        sb3.append(((String) objArr5[0]).intern());
                        sb3.append(i4);
                        throw new ie(sb3.toString());
                    }
                    if (b3 != 61) {
                        int i10 = f2501 + 47;
                        f2500 = i10 % 128;
                        if (i10 % 2 != 0 ? b3 != 10 : b3 != 71) {
                            Object[] objArr6 = new Object[1];
                            a(false, new int[]{104, 39, 83, 17}, "\u0001\u0001\u0001������\u0001��\u0001\u0001\u0001\u0001\u0001��\u0001\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001��\u0001\u0001\u0001��\u0001", objArr6);
                            throw new ie(((String) objArr6[0]).intern());
                        }
                    }
                } else {
                    i7 = i5 + 1;
                    bArr4[i5] = b;
                    if (i7 == 4) {
                        f2500 = (f2501 + 95) % 128;
                        i8 = i3 + m5326(bArr4, bArr3, i3, bArr2);
                        i7 = 0;
                    } else {
                        i8 = i3;
                    }
                }
            }
            i4++;
            i5 = i7;
            i6 = i8;
        }
        int i11 = i3;
        if (i5 != 0) {
            int i12 = f2501 + 103;
            f2500 = i12 % 128;
            if (i12 % 2 != 0 ? i5 == 1 : i5 == 0) {
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr7 = new Object[1];
                a(true, new int[]{184, 36, 0, 15}, "\u0001\u0001\u0001\u0001\u0001��\u0001����\u0001\u0001\u0001\u0001\u0001��\u0001��\u0001��\u0001��\u0001\u0001��\u0001\u0001��\u0001\u0001\u0001��\u0001\u0001\u0001\u0001\u0001", objArr7);
                sb4.append(((String) objArr7[0]).intern());
                sb4.append(i2 - 1);
                throw new ie(sb4.toString());
            }
            bArr4[i5] = 61;
            i11 = i3 + m5326(bArr4, bArr3, i3, bArr2);
        }
        byte[] bArr5 = new byte[i11];
        System.arraycopy(bArr3, 0, bArr5, 0, i11);
        return bArr5;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m5322(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4;
        int i5;
        if (i2 > 0) {
            int i6 = f2501 + 47;
            f2500 = i6 % 128;
            i4 = i6 % 2 == 0 ? (bArr[i] % 16) / 10 : (bArr[i] << 24) >>> 8;
        } else {
            i4 = 0;
        }
        int i7 = i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0;
        if (i2 > 2) {
            int i8 = f2501 + 85;
            f2500 = i8 % 128;
            i5 = i8 % 2 == 0 ? (bArr[i * 2] % 82) / 93 : (bArr[i + 2] << 24) >>> 24;
        } else {
            f2500 = (f2501 + 83) % 128;
            i5 = 0;
        }
        int i9 = i4 | i7 | i5;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i9 >>> 18];
            bArr2[i3 + 1] = bArr3[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i9 >>> 18];
            bArr2[i3 + 1] = bArr3[(i9 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i9 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        }
        if (i2 != 3) {
            return bArr2;
        }
        bArr2[i3] = bArr3[i9 >>> 18];
        bArr2[i3 + 1] = bArr3[(i9 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i9 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i9 & 63];
        return bArr2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m5324(byte[] bArr) {
        int i = f2501 + 27;
        f2500 = i % 128;
        if (i % 2 != 0) {
            return m5320(bArr, bArr.length, f2502);
        }
        m5320(bArr, bArr.length, f2502);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m5325(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        ((Number) objArr[1]).intValue();
        int intValue = ((Number) objArr[2]).intValue();
        byte[] bArr2 = (byte[]) objArr[3];
        f2500 = (f2501 + 107) % 128;
        int i = ((intValue + 2) / 3) << 2;
        int i2 = i + (i / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < intValue - 2) {
            int i6 = ((bArr[i3] << 24) >>> 8) | ((bArr[i3 + 1] << 24) >>> 16) | ((bArr[i3 + 2] << 24) >>> 24);
            bArr3[i4] = bArr2[i6 >>> 18];
            int i7 = i4 + 1;
            bArr3[i7] = bArr2[(i6 >>> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i6 >>> 6) & 63];
            bArr3[i4 + 3] = bArr2[i6 & 63];
            int i8 = i5 + 4;
            int i9 = i4;
            i5 = i8;
            if (i8 == Integer.MAX_VALUE) {
                bArr3[i4 + 4] = 10;
                i5 = 0;
                i9 = i7;
            }
            i3 += 3;
            i4 = i9 + 4;
        }
        int i10 = i4;
        if (i3 < intValue) {
            f2501 = (f2500 + 111) % 128;
            m5322(bArr, i3, intValue - i3, bArr3, i4, bArr2);
            int i11 = i4;
            if (i5 + 4 == Integer.MAX_VALUE) {
                bArr3[i4 + 4] = 10;
                i11 = i4 + 1;
            }
            i10 = i11 + 4;
        }
        if (!f2505) {
            int i12 = f2501 + 83;
            f2500 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            if (i10 != i2) {
                throw new AssertionError();
            }
        }
        return bArr3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int m5326(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte b = bArr[2];
        if (b == 61) {
            int i2 = f2500 + 111;
            f2501 = i2 % 128;
            if (i2 % 2 != 0) {
                byte b2 = bArr3[bArr[0]];
                bArr2[i] = (byte) ((((b2 - 87) / 98) ^ (b2 << 30)) + 11);
                return 1;
            }
            bArr2[i] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b3 = bArr[3];
        if (b3 == 61) {
            f2501 = (f2500 + 21) % 128;
            int i3 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18);
            bArr2[i] = (byte) (i3 >>> 16);
            bArr2[i + 1] = (byte) (i3 >>> 8);
            return 2;
        }
        int i4 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b] << 24) >>> 18) | ((bArr3[b3] << 24) >>> 24);
        bArr2[i] = (byte) (i4 >> 16);
        bArr2[i + 1] = (byte) (i4 >> 8);
        bArr2[i + 2] = (byte) i4;
        return 3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5327() {
        f2504 = new char[]{37246, 37152, 37178, 37153, 37133, 37135, 37158, 37159, 37162, 37160, 37166, 37156, 37124, 37134, 37162, 37158, 37162, 37159, 37182, 37159, 37128, 37126, 37152, 37152, 37152, 37162, 37158, 37131, 37134, 37152, 37178, 37153, 37133, 37126, 37158, 37132, 37231, 37246, 37246, 37231, 37320, 37173, 37170, 37236, 37235, 37145, 37235, 37236, 37169, 37312, 37341, 37174, 37236, 37171, 37322, 37325, 37168, 37168, 37173, 37316, 37236, 37312, 37169, 37319, 37170, 37170, 37323, 37236, 37312, 37173, 37236, 37169, 37313, 37320, 37173, 37314, 37236, 37168, 37169, 37168, 37323, 37175, 37322, 37169, 37236, 37170, 37323, 37236, 37168, 37322, 37169, 37236, 37319, 37320, 37173, 37322, 37171, 37325, 37319, 37236, 37341, 37320, 37169, 37319, 37139, 37361, 37365, 37337, 37329, 37258, 37360, 37364, 37361, 37361, 37362, 37361, 37338, 37336, 37260, 37253, 37363, 37364, 37360, 37367, 37360, 37360, 37371, 37371, 37337, 37330, 37362, 37365, 37263, 37260, 37337, 37339, 37371, 37361, 37328, 37339, 37362, 37257, 37362, 37229, 37149, 37166, 37134, 37245, 37149, 37158, 37152, 37121, 37241, 37222, 37128, 37159, 37155, 37182, 37176, 37126, 37133, 37161, 37160, 37157, 37157, 37166, 37159, 37152, 37159, 37125, 37132, 37158, 37126, 37150, 37374, 37246, 37130, 37220, 37126, 37162, 37163, 37159, 37162, 37160, 37247, 37158, 37159, 37158, 37158, 37161, 37157, 37183, 37126, 37134, 37156, 37157, 37158, 37159, 37154, 37125, 37126, 37152, 37152, 37152, 37162, 37158, 37131, 37126, 37158, 37132, 37125, 37159, 37152, 37159, 37166, 37157, 37157, 37160, 37161, 37133};
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m5328(String str) throws ie {
        int i = f2500 + 85;
        f2501 = i % 128;
        if (i % 2 == 0) {
            byte[] bytes = str.getBytes();
            return m5329(bytes, bytes.length);
        }
        byte[] bytes2 = str.getBytes();
        m5329(bytes2, bytes2.length);
        throw new ArithmeticException("divide by zero");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m5329(byte[] bArr, int i) {
        f2500 = (f2501 + 91) % 128;
        byte[] m5321 = m5321(bArr, 0, i, f2503);
        int i2 = f2501 + 55;
        f2500 = i2 % 128;
        if (i2 % 2 != 0) {
            return m5321;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] m5330(byte[] bArr, int i, int i2, byte[] bArr2) {
        return (byte[]) m5325(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), bArr2});
    }
}
