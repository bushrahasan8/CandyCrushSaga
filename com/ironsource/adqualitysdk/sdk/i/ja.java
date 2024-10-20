package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: ja.class */
public class ja {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2706 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2707 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2708 = -5122771441445943087L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Handler f2709;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2710 = -919218910;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f2711 = 54562;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Cif f2712;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ja$4, reason: invalid class name */
    /* loaded from: ja$4.class */
    public final class AnonymousClass4 extends is {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ja f2719;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f2720;

        /* renamed from: ﾇ, reason: contains not printable characters */
        final e f2721;

        AnonymousClass4(ja jaVar, String str, e eVar) {
            this.f2719 = jaVar;
            this.f2720 = str;
            this.f2721 = eVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.is
        /* renamed from: ﻐ */
        public final void mo3016() {
            ad.m3027(new is(this, this.f2719.m5447(this.f2720)) { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4.5

                /* renamed from: ｋ, reason: contains not printable characters */
                private AnonymousClass4 f2722;

                /* renamed from: ﾇ, reason: contains not printable characters */
                private String f2723;

                {
                    this.f2722 = this;
                    this.f2723 = r5;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.is
                /* renamed from: ﻐ */
                public final void mo3016() {
                    this.f2722.f2721.mo5456(this.f2723);
                }
            });
        }
    }

    /* loaded from: ja$d.class */
    public interface d {
    }

    /* loaded from: ja$e.class */
    public interface e {
        /* renamed from: ｋ, reason: contains not printable characters */
        void mo5456(String str);
    }

    public ja(Context context, String str, String str2) {
        this.f2712 = new Cif(context, str, str2);
    }

    private static void a(char c, int i, String str, String str2, String str3, Object[] objArr) {
        int i2 = $10 + 73;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $11 = ($10 + 25) % 128;
        }
        char[] cArr2 = cArr;
        if (str2 != null) {
            $10 = ($11 + 37) % 128;
            str2 = str2.toCharArray();
            $10 = ($11 + 21) % 128;
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
        while (gVar.f2182 < length3) {
            $11 = ($10 + 121) % 128;
            try {
                Map map = b.f452;
                Object obj = map.get(844572084);
                if (obj == null) {
                    obj = ((Class) b.m3371((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getScrollBarSize() >> 8), 40 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("B", Object.class);
                    map.put(844572084, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, gVar)).intValue();
                Object obj2 = map.get(-204678676);
                if (obj2 == null) {
                    obj2 = ((Class) b.m3371(ViewConfiguration.getWindowTouchSlop() >> 8, (char) Drawable.resolveOpacity(0, 0), 41 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("z", Object.class);
                    map.put(-204678676, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, gVar)).intValue();
                char c2 = cArr5[gVar.f2182 % 4];
                char c3 = cArr6[intValue];
                Object obj3 = map.get(786100179);
                if (obj3 == null) {
                    Class cls = (Class) b.m3371((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) ((Process.getThreadPriority(0) + 20) >> 6), 41 - KeyEvent.normalizeMetaState(0));
                    Class<?> cls2 = Integer.TYPE;
                    obj3 = cls.getMethod("A", Object.class, cls2, cls2);
                    map.put(786100179, obj3);
                }
                ((Method) obj3).invoke(null, gVar, Integer.valueOf(c2 * 32718), Integer.valueOf(c3));
                char c4 = cArr5[intValue2];
                char c5 = cArr6[intValue];
                Object obj4 = map.get(1393811622);
                if (obj4 == null) {
                    Class cls3 = (Class) b.m3371(TextUtils.getCapsMode("", 0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (-16777175) - Color.rgb(0, 0, 0));
                    Class<?> cls4 = Integer.TYPE;
                    obj4 = cls3.getMethod("D", cls4, cls4);
                    map.put(1393811622, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, Integer.valueOf(c4 * 32718), Integer.valueOf(c5))).charValue();
                cArr5[intValue2] = gVar.f2183;
                int i3 = gVar.f2182;
                cArr7[i3] = (char) ((((r0 ^ cArr2[i3]) ^ (f2708 ^ (-6542782394566060766L))) ^ ((int) (f2710 ^ (-6542782394566060766L)))) ^ ((char) (f2711 ^ (-6542782394566060766L))));
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

    public static Handler cU_() {
        Handler handler;
        synchronized (ja.class) {
            try {
                if (f2709 == null) {
                    Object[] objArr = new Object[1];
                    a((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 15714), ((Process.getThreadPriority(0) + 20) >> 6) - 1306501144, "鷳㘬Აᷛ", "\ue849\u205f抲ḽ", "姆턢쥤调쇺殜ℨ톮檪\u2fdf\u2073В㑴�뭩", objArr);
                    HandlerThread handlerThread = new HandlerThread(((String) objArr[0]).intern());
                    handlerThread.start();
                    f2709 = new Handler(handlerThread.getLooper());
                }
                handler = f2709;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5441(d dVar) {
        int i = f2706 + 117;
        f2707 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (dVar != null) {
            ad.m3027(new is(this, dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.ja.3

                /* renamed from: ﾇ, reason: contains not printable characters */
                private d f2717;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private ja f2718;

                {
                    this.f2718 = this;
                    this.f2717 = dVar;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.is
                /* renamed from: ﻐ */
                public final void mo3016() {
                }
            });
            f2706 = (f2707 + 69) % 128;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5442(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.rgb(0, 0, 0) - 131863828, "鷳㘬Აᷛ", "\uecaa⏪\u1af7纝", "�탯⋍쯪覸㲠\uec9a检龾㘨쉧", objArr);
        sb.append(((String) objArr[0]).intern());
        String obj = sb.toString();
        int i = f2707 + 99;
        f2706 = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5443(ja jaVar, d dVar) {
        f2706 = (f2707 + 123) % 128;
        jaVar.m5441(dVar);
        f2707 = (f2706 + 91) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m5444(Object[] objArr) {
        cU_().post(new AnonymousClass4((ja) objArr[0], (String) objArr[1], (e) objArr[2]));
        int i = f2706 + 45;
        f2707 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m5445(Object[] objArr) {
        ja jaVar = (ja) objArr[0];
        String str = (String) objArr[1];
        f2707 = (f2706 + 9) % 128;
        int m5338 = jaVar.f2712.m5338(str);
        int i = f2706 + 77;
        f2707 = i % 128;
        if (i % 2 != 0) {
            return Integer.valueOf(m5338);
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m5446(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i4 | i2;
        int i6 = i3 ^ (-1);
        return ((((i * 755) + (i2 * (-753))) + ((((i5 ^ (-1)) | ((i4 | i3) ^ (-1))) | ((i2 | i3) ^ (-1))) * (-754))) + (((((i | i6) | i2) ^ (-1)) | ((i5 | i3) ^ (-1))) * (-754))) + ((i4 | i6) * 754) != 1 ? m5445(objArr) : m5444(objArr);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m5447(String str) {
        int i = f2706 + 33;
        f2707 = i % 128;
        if (i % 2 == 0) {
            this.f2712.m5339(str);
            throw null;
        }
        String m5339 = this.f2712.m5339(str);
        f2707 = (f2706 + 123) % 128;
        return m5339;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5448(String str, String str2) {
        cU_().post(new is(this, str, str2, null) { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2

            /* renamed from: ﻐ, reason: contains not printable characters */
            private String f2713;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private d f2714 = null;

            /* renamed from: ｋ, reason: contains not printable characters */
            private ja f2715;

            /* renamed from: ﾇ, reason: contains not printable characters */
            private String f2716;

            {
                this.f2715 = this;
                this.f2716 = str;
                this.f2713 = str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* renamed from: ﻐ */
            public final void mo3016() {
                this.f2715.m5449(this.f2716, this.f2713);
                ja.m5443(this.f2715, this.f2714);
            }
        });
        f2706 = (f2707 + 27) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5449(String str, String str2) {
        int i = f2707 + 87;
        f2706 = i % 128;
        if (i % 2 != 0) {
            m5455(str, str2);
            m5455(m5442(str), Long.toString(jv.m5591()));
            throw null;
        }
        m5455(str, str2);
        m5455(m5442(str), Long.toString(jv.m5591()));
        f2706 = (f2707 + 41) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m5450(String str) {
        return ((Integer) m5446(new Object[]{this, str}, -894031167, 894031167, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue())).intValue();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m5451(String str, int i) {
        f2707 = (f2706 + 83) % 128;
        HashMap<String, String> m5336 = this.f2712.m5336(str, i);
        int i2 = f2706 + 33;
        f2707 = i2 % 128;
        if (i2 % 2 != 0) {
            return m5336;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5452(String str) {
        f2706 = (f2707 + 65) % 128;
        this.f2712.m5337(str);
        f2706 = (f2707 + 93) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5453(String str, String str2) {
        cU_().post(new is(this, str, str2, null) { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5

            /* renamed from: ﻐ, reason: contains not printable characters */
            private String f2724;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private ja f2725;

            /* renamed from: ｋ, reason: contains not printable characters */
            private d f2726 = null;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private String f2727;

            {
                this.f2725 = this;
                this.f2727 = str;
                this.f2724 = str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* renamed from: ﻐ */
            public final void mo3016() {
                this.f2725.m5455(this.f2727, this.f2724);
                ja.m5443(this.f2725, this.f2726);
            }
        });
        int i = f2707 + 89;
        f2706 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5454(String str, e eVar) {
        m5446(new Object[]{this, str, eVar}, 2005710951, -2005710950, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5455(String str, String str2) {
        int i = f2707 + 83;
        f2706 = i % 128;
        if (i % 2 != 0) {
            this.f2712.m5340(str, str2);
            throw new ArithmeticException("divide by zero");
        }
        this.f2712.m5340(str, str2);
        f2706 = (f2707 + 95) % 128;
    }
}
