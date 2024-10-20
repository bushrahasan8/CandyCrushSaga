package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: he.class */
public final class he extends hf<View.OnClickListener> implements View.OnClickListener {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2348 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2349;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2350;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2351;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private d f2352;

    /* loaded from: he$d.class */
    public interface d {
        void cG_(he heVar, View view);
    }

    static {
        m5107();
        ViewConfiguration.getLongPressTimeout();
        Drawable.resolveOpacity(0, 0);
        int i = f2350 + 47;
        f2348 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public he(View.OnClickListener onClickListener, d dVar) {
        super(onClickListener);
        this.f2352 = dVar;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        int length;
        int i3;
        $10 = ($11 + 125) % 128;
        if (str != null) {
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        s sVar = new s();
        char[] cArr2 = f2349;
        char[] cArr3 = cArr2;
        if (cArr2 != null) {
            int i4 = $10 + 45;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr2.length;
                cArr3 = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr3 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                char c = cArr2[i3];
                try {
                    Map map = b.f452;
                    Object obj = map.get(122714169);
                    if (obj == null) {
                        obj = ((Class) b.m3371(KeyEvent.keyCodeFromString(""), (char) TextUtils.getCapsMode("", 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 41)).getMethod("j", Integer.TYPE);
                        map.put(122714169, obj);
                    }
                    cArr3[i3] = ((Character) ((Method) obj).invoke(null, Integer.valueOf(c))).charValue();
                    i3++;
                    $10 = ($11 + 105) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        char c2 = f2351;
        Map map2 = b.f452;
        Object obj2 = map2.get(122714169);
        if (obj2 == null) {
            obj2 = ((Class) b.m3371(TextUtils.getTrimmedLength(""), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 40 - TextUtils.indexOf((CharSequence) "", '0', 0))).getMethod("j", Integer.TYPE);
            map2.put(122714169, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c2))).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            $11 = ($10 + 5) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 1;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                sVar.f3058 = 1;
            } else {
                sVar.f3058 = 0;
            }
            while (true) {
                int i6 = sVar.f3058;
                if (i6 >= i2) {
                    break;
                }
                char c3 = cArr[i6];
                sVar.f3059 = c3;
                char c4 = cArr[i6 + 1];
                sVar.f3055 = c4;
                if (c3 == c4) {
                    cArr4[i6] = (char) (c3 - b);
                    cArr4[i6 + 1] = (char) (c4 - b);
                } else {
                    Map map3 = b.f452;
                    Object obj3 = map3.get(-707600991);
                    if (obj3 == null) {
                        Class cls = (Class) b.m3371((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((Process.getThreadPriority(0) + 20) >> 6), 41 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        Class<?> cls2 = Integer.TYPE;
                        obj3 = cls.getMethod("o", Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class);
                        map3.put(-707600991, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), sVar)).intValue();
                    int i7 = sVar.f3054;
                    if (intValue == i7) {
                        Object obj4 = map3.get(1018245111);
                        if (obj4 == null) {
                            Class cls3 = (Class) b.m3371((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 41);
                            Class<?> cls4 = Integer.TYPE;
                            obj4 = cls3.getMethod("l", Object.class, Object.class, cls4, cls4, Object.class, Object.class, cls4, cls4, Object.class, cls4, Object.class);
                            map3.put(1018245111, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, sVar, Integer.valueOf(charValue), Integer.valueOf(charValue), sVar, Integer.valueOf(charValue), sVar)).intValue();
                        int i8 = sVar.f3057;
                        int i9 = sVar.f3054;
                        int i10 = sVar.f3058;
                        cArr4[i10] = cArr3[intValue2];
                        cArr4[i10 + 1] = cArr3[(i8 * charValue) + i9];
                    } else {
                        int i11 = sVar.f3056;
                        int i12 = sVar.f3057;
                        if (i11 == i12) {
                            int i13 = ((sVar.f3053 + charValue) - 1) % charValue;
                            sVar.f3053 = i13;
                            int i14 = ((i7 + charValue) - 1) % charValue;
                            sVar.f3054 = i14;
                            int i15 = sVar.f3058;
                            cArr4[i15] = cArr3[(i11 * charValue) + i13];
                            cArr4[i15 + 1] = cArr3[(i12 * charValue) + i14];
                        } else {
                            int i16 = sVar.f3053;
                            int i17 = sVar.f3058;
                            cArr4[i17] = cArr3[(i11 * charValue) + i7];
                            cArr4[i17 + 1] = cArr3[(i12 * charValue) + i16];
                        }
                    }
                }
                sVar.f3058 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5107() {
        f2351 = (char) 44291;
        f2349 = new char[]{39167, 39155, 39123, 39135, 39163, 39129, 39160, 39150, 39164, 39152, 39112, 39162, 39686, 39157, 39161, 39165, 39166, 39144, 39151, 39159, 39154, 39153, 39128, 39100, 39120};
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f2352.cG_(this, view);
            f2348 = (f2350 + 73) % 128;
        } catch (Throwable th) {
            Object[] objArr = new Object[1];
            a((byte) (105 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "��\u0016\u0004\b\n\u0003\u0018\u0004\u0012\u0017\u0013\f\u0018\n\f\u0002\n\u0004\u0002\u0006\u0010\u0012\u0002\u0006", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((byte) (View.resolveSize(0, 0) + 61), "\u0006\b\u0006\u0002\b\u0016\n\u0017\u0018\u0016\u000b\u000f\u0017\u000e\u0013\u0012\n\u0018\f\t\u0015\u0003\u0017��\b\u000e\u0004\u000f", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, objArr2);
            kd.m5656(intern, ((String) objArr2[0]).intern(), th, false);
        }
        if (mo3633() != null) {
            int i = f2348 + 51;
            f2350 = i % 128;
            if (i % 2 != 0) {
                mo3633().onClick(view);
                throw new ArithmeticException("divide by zero");
            }
            mo3633().onClick(view);
        }
    }
}
