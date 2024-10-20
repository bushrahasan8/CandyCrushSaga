package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: jh.class */
public abstract class jh {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2847 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static jh f2848;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2849;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2850;

    /* renamed from: ﾒ, reason: contains not printable characters */
    boolean f2852 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Set f2851 = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: jh$b.class */
    public static final class b extends jh implements Application.ActivityLifecycleCallbacks {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char f2853 = 49569;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f2854 = 0;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f2855 = 56579;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2856 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static char f2857 = 50237;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2858 = 62094;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private WeakReference f2859;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private Map f2860;

        /* renamed from: ｋ, reason: contains not printable characters */
        private WeakReference f2861;

        private b() {
            this.f2860 = new WeakHashMap();
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v93, types: [int] */
        private static void a(String str, int i, Object[] objArr) {
            boolean z = 3;
            if (str != null) {
                str = str.toCharArray();
            }
            char[] cArr = (char[]) str;
            p pVar = new p();
            char[] cArr2 = new char[cArr.length];
            pVar.f3046 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i2 = pVar.f3046;
                if (i2 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                $11 = ($10 + 55) % 128;
                cArr3[0] = cArr[i2];
                cArr3[1] = cArr[i2 + 1];
                char c = 58224;
                int i3 = 0;
                boolean z2 = z;
                while (i3 < 16) {
                    $11 = ($10 + 33) % 128;
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    char c4 = (char) (f2853 ^ 8584761702560213004L);
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[z2 ? 1 : 0] = Integer.valueOf(f2857);
                        objArr2[2] = Integer.valueOf(c3 >>> 5);
                        objArr2[1] = Integer.valueOf((c3 + c) ^ ((c3 << 4) + c4));
                        objArr2[0] = Integer.valueOf(c2);
                        Map map = com.ironsource.adqualitysdk.sdk.i.b.f452;
                        Object obj = map.get(-952725446);
                        if (obj == null) {
                            Class cls = (Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(TextUtils.getOffsetBefore("", 0), (char) (Process.myTid() >> 22), KeyEvent.getDeadChar(0, 0) + 41);
                            Class<?>[] clsArr = new Class[4];
                            Class<?> cls2 = Integer.TYPE;
                            clsArr[0] = cls2;
                            clsArr[1] = cls2;
                            clsArr[2] = cls2;
                            clsArr[3] = cls2;
                            obj = cls.getMethod("x", clsArr);
                            map.put(-952725446, obj);
                        }
                        char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        cArr3[1] = charValue;
                        char c5 = cArr3[0];
                        char c6 = (char) (f2858 ^ 8584761702560213004L);
                        char c7 = f2855;
                        Object obj2 = map.get(-952725446);
                        if (obj2 == null) {
                            Class cls3 = (Class) com.ironsource.adqualitysdk.sdk.i.b.m3371((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.getOffsetBefore("", 0), 42 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            Class<?> cls4 = Integer.TYPE;
                            obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                            map.put(-952725446, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c5), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c6)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c7))).charValue();
                        c -= 40503;
                        i3++;
                        z2 = 3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i4 = pVar.f3046;
                cArr2[i4] = cArr3[0];
                cArr2[i4 + 1] = cArr3[1];
                Map map2 = com.ironsource.adqualitysdk.sdk.i.b.f452;
                Object obj3 = map2.get(-1234941609);
                if (obj3 == null) {
                    obj3 = ((Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(View.resolveSize(0, 0), (char) View.resolveSize(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 40)).getMethod("u", Object.class, Object.class);
                    map2.put(-1234941609, obj3);
                }
                ((Method) obj3).invoke(null, pVar, pVar);
                z = z2;
            }
        }

        private void de_(Activity activity) {
            this.f2861 = new WeakReference(activity);
            is isVar = new is(this, activity) { // from class: com.ironsource.adqualitysdk.sdk.i.jh.b.5

                /* renamed from: ﻛ, reason: contains not printable characters */
                private Activity f2862;

                /* renamed from: ﾒ, reason: contains not printable characters */
                private b f2863;

                {
                    this.f2863 = this;
                    this.f2862 = activity;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.is
                /* renamed from: ﻐ */
                public final void mo3016() throws Exception {
                    kc.ev_(this.f2862);
                }
            };
            ad.m3021(new Object[]{isVar});
            int i = f2856 + 65;
            f2854 = i % 128;
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
        }

        private void dg_(Activity activity) {
            int i = f2856 + 113;
            f2854 = i % 128;
            if (i % 2 != 0) {
                m5540().iterator();
                throw new ArithmeticException("divide by zero");
            }
            Iterator it = m5540().iterator();
            while (it.hasNext()) {
                ((jj) it.next()).dH_(activity);
            }
            int i2 = f2856 + 121;
            f2854 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static /* synthetic */ Object m5542(Object[] objArr) {
            b bVar = (b) objArr[0];
            Activity activity = (Activity) objArr[1];
            f2854 = (f2856 + 97) % 128;
            Iterator it = bVar.m5540().iterator();
            while (it.hasNext()) {
                f2854 = (f2856 + 81) % 128;
                ((jj) it.next()).dG_(activity);
            }
            int i = f2856 + 61;
            f2854 = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ Object m5543(Object[] objArr, int i, int i2, int i3) {
            int i4 = i2 ^ (-1);
            return ((((i * 367) + (i2 * 367)) + ((i | i2) * (-366))) + ((((i4 | i3) ^ (-1)) | i) * (-366))) + (((((i | i4) | i3) ^ (-1)) | ((i2 | (i ^ (-1))) ^ (-1))) * 366) != 1 ? m5544(objArr) : m5542(objArr);
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static /* synthetic */ Object m5544(Object[] objArr) {
            b bVar = (b) objArr[0];
            Activity activity = (Activity) objArr[1];
            int i = f2856 + 103;
            f2854 = i % 128;
            try {
                if (i % 2 != 0) {
                    bVar.m5540().iterator();
                    throw null;
                }
                Iterator it = bVar.m5540().iterator();
                f2854 = (f2856 + 57) % 128;
                while (it.hasNext()) {
                    int i2 = f2854 + 59;
                    f2856 = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((jj) it.next()).onActivityPaused(activity);
                        throw new ArithmeticException("divide by zero");
                    }
                    ((jj) it.next()).onActivityPaused(activity);
                }
                return null;
            } catch (Exception e) {
                Object[] objArr2 = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", Color.blue(0) + 30, objArr2);
                String intern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭ℋ┭绉裪贠\u1af1䝂䵎", 24 - TextUtils.lastIndexOf("", '0'), objArr3);
                kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
                return null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh
        public final void dh_(Application application, Activity activity) {
            synchronized (this) {
                if (this.f2859 == null) {
                    this.f2859 = new WeakReference(application);
                    if (activity != null) {
                        de_(activity);
                        synchronized (this) {
                            this.f2860.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh
        public final Activity di_() {
            int i = f2856 + 37;
            f2854 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            WeakReference weakReference = this.f2861;
            if (weakReference == null) {
                return null;
            }
            Activity activity = (Activity) weakReference.get();
            f2854 = (f2856 + 113) % 128;
            return activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jh.class) {
                    try {
                        if (this.f2861 == null) {
                            de_(activity);
                            jh.class.notifyAll();
                        }
                    } finally {
                    }
                }
                Iterator it = m5540().iterator();
                while (it.hasNext()) {
                    ((jj) it.next()).onActivityCreated(activity, bundle);
                }
            } catch (Exception e) {
                Object[] objArr = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", 30 - Color.argb(0, 0, 0, 0), objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭㭒ਬ鏈\uf474ਏ돩ꊻ\uf19c", TextUtils.indexOf("", "", 0) + 26, objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            int i = f2854 + 11;
            f2856 = i % 128;
            try {
                if (i % 2 == 0) {
                    m5540().iterator();
                    throw null;
                }
                Iterator it = m5540().iterator();
                while (it.hasNext()) {
                    ((jj) it.next()).onActivityDestroyed(activity);
                    f2854 = (f2856 + 15) % 128;
                }
                int i2 = f2856 + 53;
                f2854 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (Exception e) {
                Object[] objArr = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", 30 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭峢镜嵨⒭貪Ⅸ伇䩐ꊻ\uf19c", TextUtils.indexOf("", "", 0, 0) + 28, objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            m5543(new Object[]{this, activity}, 1146030979, -1146030979, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                de_(activity);
                Iterator it = m5540().iterator();
                while (it.hasNext()) {
                    f2854 = (f2856 + 67) % 128;
                    ((jj) it.next()).onActivityResumed(activity);
                }
                int i = f2854 + 17;
                f2856 = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            } catch (Exception e) {
                Object[] objArr = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", 30 - KeyEvent.keyCodeFromString(""), objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭軁ꫩ嵨⒭⽢‘ꊻ\uf19c", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26, objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f2856 = (f2854 + 79) % 128;
            try {
                Iterator it = m5540().iterator();
                while (it.hasNext()) {
                    ((jj) it.next()).onActivitySaveInstanceState(activity, bundle);
                }
                int i = f2856 + 31;
                f2854 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            } catch (Exception e) {
                Object[] objArr = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", View.MeasureSpec.getMode(0) + 30, objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭폨繳\ue3c7篿\u009f넢컒洠嬥ᆴ䢋鱛⯸ꋦ嬥ᆴ虼烡", Color.alpha(0) + 36, objArr2);
                kd.m5656(intern, ((String) objArr2[0]).intern(), e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2861 == null) {
                    de_(activity);
                }
                synchronized (this) {
                    this.f2860.put(activity, Boolean.TRUE);
                }
                Iterator it = m5540().iterator();
                while (it.hasNext()) {
                    ((jj) it.next()).onActivityStarted(activity);
                }
                String localClassName = activity.getLocalClassName();
                Object[] objArr = new Object[1];
                a("\uedc0椇晎辟휇\uf3e5\ue260䧭䜶쎒싊폃瀂兂믠꘎⠓延쇞퓃嗆\ueb2b꿵팎ତῠ믠꘎⠓延ꨜ葕\uf0a7\uaad6ꊬ䝝儞ၠ띾픜\ue260䧭蚘ￜ", 43 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                if (localClassName.equals(((String) objArr[0]).intern())) {
                    return;
                }
                synchronized (this) {
                    if (this.f2860.size() == 1 && !this.f2852) {
                        dg_(activity);
                    }
                }
            } catch (Exception e) {
                Object[] objArr2 = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", 30 - KeyEvent.keyCodeFromString(""), objArr2);
                String intern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭폨繳嬥ᆴᔺ鞜ꊻ\uf19c", 26 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr3);
                kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int i;
            try {
                Iterator it = m5540().iterator();
                while (it.hasNext()) {
                    ((jj) it.next()).onActivityStopped(activity);
                }
                this.f2852 = activity.isChangingConfigurations();
                synchronized (this) {
                    if (this.f2860.containsKey(activity)) {
                        String localClassName = activity.getLocalClassName();
                        Object[] objArr = new Object[1];
                        a("\uedc0椇晎辟휇\uf3e5\ue260䧭䜶쎒싊폃瀂兂믠꘎⠓延쇞퓃嗆\ueb2b꿵팎ତῠ믠꘎⠓延ꨜ葕\uf0a7\uaad6ꊬ䝝儞ၠ띾픜\ue260䧭蚘ￜ", 43 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                        if (!localClassName.equals(((String) objArr[0]).intern())) {
                            this.f2860.remove(activity);
                            i = this.f2860.size();
                        }
                    }
                    i = -1;
                }
                if (i < 0 || i != 0 || this.f2852) {
                    return;
                }
                m5543(new Object[]{this, activity}, -519042888, 519042889, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
            } catch (Exception e) {
                Object[] objArr2 = new Object[1];
                a("誄�᩻ୢ畋�ꎬ㿲䷼ᶝ\ue4bcང䵘ꌦ飼塜칱鷺虼烡傻耿ῌቲ⠓延樒泻�\ue334", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30, objArr2);
                String intern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                a("ੲ궺㍺㕷뀱툕\uefa7\ueb6fށ럜쩊㉣儞ၠ띾픜\ue260䧭폨繳茂�篒ᒥꊻ\uf19c", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, objArr3);
                kd.m5656(intern, ((String) objArr3[0]).intern(), e, false);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh
        /* renamed from: ﾇ */
        public final boolean mo5539() {
            synchronized (this) {
                if (this.f2860.size() <= 0) {
                    return false;
                }
                int i = (f2854 + 63) % 128;
                f2856 = i;
                int i2 = i + 89;
                f2854 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new ArithmeticException("divide by zero");
                }
                return true;
            }
        }
    }

    static {
        m5536();
        TypedValue.complexToFloat(0);
        f2850 = (f2847 + 19) % 128;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static jh m5534() {
        f2847 = (f2850 + 7) % 128;
        b bVar = new b((byte) 0);
        f2847 = (f2850 + 9) % 128;
        return bVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static jh m5535() {
        jh jhVar;
        synchronized (jh.class) {
            try {
                int i = (f2850 + 85) % 128;
                f2847 = i;
                if (f2848 == null) {
                    int i2 = i + 117;
                    f2850 = i2 % 128;
                    if (i2 % 2 != 0) {
                        f2848 = m5534();
                        throw new ArithmeticException("divide by zero");
                    }
                    f2848 = m5534();
                }
                jhVar = f2848;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jhVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m5536() {
        f2849 = new int[]{9024655, 1582615470, -586460116, 319393973, -1603142956, 334237470, -1591679742, 1949123640, 44256950, -1080056985, -1278490904, 180976735, -1020559435, 54597128, -101086780, 1241294331, 1402895054, 1032920786};
    }

    public abstract void dh_(Application application, Activity activity);

    public abstract Activity di_();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5537(jj jjVar) {
        synchronized (this) {
            f2850 = (f2847 + 31) % 128;
            this.f2851.remove(jjVar);
            f2847 = (f2850 + 17) % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5538(jj jjVar) {
        synchronized (this) {
            int i = f2850 + 7;
            f2847 = i % 128;
            if (i % 2 == 0) {
                this.f2851.add(jjVar);
                throw null;
            }
            this.f2851.add(jjVar);
            int i2 = f2850 + 81;
            f2847 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo5539();

    /* renamed from: ﾒ, reason: contains not printable characters */
    protected final List m5540() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f2851);
            f2850 = (f2847 + 83) % 128;
        }
        return arrayList;
    }
}
