package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bm;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* loaded from: cb.class */
public final class cb extends bm {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1150 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1151;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1152;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1153;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1154;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1155;

    static {
        m4086();
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.indexOf("", "", 0);
        Process.myPid();
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getDoubleTapTimeout();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getMaximumDrawingCacheSize();
        f1150 = (f1154 + 77) % 128;
    }

    public cb(String str) {
        super(str);
    }

    private static void a(int[] iArr, String str, int i, String str2, Object[] objArr) {
        String str3 = str2;
        if (str2 != null) {
            $11 = ($10 + 77) % 128;
            str3 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str3;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        r rVar = new r();
        char[] cArr2 = f1151;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                char c = cArr2[i2];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122475841);
                    if (obj == null) {
                        obj = ((Class) b.m3371(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 41 - TextUtils.getOffsetBefore("", 0))).getMethod("b", Integer.TYPE);
                        map.put(122475841, obj);
                    }
                    cArr4[i2] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                    i2++;
                    $10 = ($11 + 91) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        int i3 = f1155;
        Map map2 = b.f452;
        Object obj2 = map2.get(122565214);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(View.MeasureSpec.getSize(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 41 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("e", Integer.TYPE);
            map2.put(122565214, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, Integer.valueOf(i3))).intValue();
        if (f1153) {
            int length2 = bArr.length;
            rVar.f3052 = length2;
            char[] cArr5 = new char[length2];
            rVar.f3051 = 0;
            while (true) {
                int i4 = rVar.f3051;
                int i5 = rVar.f3052;
                if (i4 >= i5) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i4] = (char) (cArr3[bArr[(i5 - 1) - i4] + i] - intValue);
                Map map3 = b.f452;
                Object obj3 = map3.get(-1176441533);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(ViewConfiguration.getScrollBarSize() >> 8, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Process.getGidForName("") + 42)).getMethod("a", Object.class, Object.class);
                    map3.put(-1176441533, obj3);
                }
                ((Method) obj3).invoke(null, rVar, rVar);
            }
        } else {
            if (f1152) {
                int length3 = cArr.length;
                rVar.f3052 = length3;
                char[] cArr6 = new char[length3];
                rVar.f3051 = 0;
                while (true) {
                    int i6 = rVar.f3051;
                    int i7 = rVar.f3052;
                    if (i6 >= i7) {
                        break;
                    }
                    cArr6[i6] = (char) (cArr3[cArr[(i7 - 1) - i6] - i] - intValue);
                    Map map4 = b.f452;
                    Object obj4 = map4.get(-1176441533);
                    if (obj4 == null) {
                        obj4 = ((Class) b.m3371(Drawable.resolveOpacity(0, 0), (char) Color.green(0), 41 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("a", Object.class, Object.class);
                        map4.put(-1176441533, obj4);
                    }
                    ((Method) obj4).invoke(null, rVar, rVar);
                }
                String str4 = new String(cArr6);
                int i8 = $10 + 75;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int length4 = iArr.length;
            rVar.f3052 = length4;
            char[] cArr7 = new char[length4];
            rVar.f3051 = 0;
            while (true) {
                int i9 = rVar.f3051;
                int i10 = rVar.f3052;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    $10 = ($11 + 85) % 128;
                    cArr7[i9] = (char) (cArr3[iArr[(i10 - 1) - i9] - i] - intValue);
                    rVar.f3051 = i9 + 1;
                }
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ void m4085(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = f1154 + 9;
        f1150 = i % 128;
        m4087(maioAdsListenerInterface);
        if (i % 2 == 0) {
            throw null;
        }
        f1150 = (f1154 + 61) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m4086() {
        f1152 = true;
        f1151 = new char[]{6518, 6498, 6298, 6292, 6466, 6497, 6288, 6527, 6286, 6297, 6496, 6291, 6302, 6295, 6289, 6287, 6282, 6299, 6293, 6487, 6294, 6296, 6525, 6467, 6522, 6521, 6303};
        f1153 = true;
        f1155 = 343349509;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m4087(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = f1154 + 87;
        f1150 = i % 128;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        if (i % 2 == 0) {
            throw null;
        }
        f1150 = (f1154 + 87) % 128;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x022a, code lost:
    
        if ((!r0.equals(((java.lang.String) r0[0]).intern())) != true) goto L30;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m4088(java.lang.Object[] r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cb.m4088(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Class mo3627(String str) {
        return (Class) m4088(new Object[]{this, str}, -1395833881, 1395833881, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾇ */
    final Map mo3628() {
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        a(null, null, 127 - Drawable.resolveOpacity(0, 0), "\u008c\u008d\u008e\u008d\u008f\u0087\u0083\u009a\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008f\u008d\u0087", objArr);
        hashMap.put(((String) objArr[0]).intern(), new bm.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.cb.1

            /* renamed from: ｋ, reason: contains not printable characters */
            private cb f1156;

            {
                this.f1156 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                cb.m4085((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i = f1150 + 37;
        f1154 = i % 128;
        if (i % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bm
    /* renamed from: ﾒ */
    public final String mo3629() {
        int i = f1154 + 17;
        f1150 = i % 128;
        if (i % 2 != 0) {
            return MaioAds.getSdkVersion();
        }
        MaioAds.getSdkVersion();
        throw new ArithmeticException("divide by zero");
    }
}
