package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* loaded from: ke.class */
public final class ke {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2989 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2990;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2991;

    /* loaded from: ke$c.class */
    public interface c {
        /* renamed from: ﻐ */
        void mo4650(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ke$e.class */
    public static final class e implements InvocationHandler {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static long f2992 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2993 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2994;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Object f2995;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private c f2996;

        static {
            m5666();
            MotionEvent.axisFromString("");
            f2994 = (f2993 + 27) % 128;
        }

        e(Object obj, c cVar) {
            this.f2995 = obj;
            this.f2996 = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x021f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
            /*
                Method dump skipped, instructions count: 583
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ke.e.a(java.lang.String, int, java.lang.Object[]):void");
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private Object m5664(Method method) {
            int i = f2994 + 77;
            f2993 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (method == null) {
                return null;
            }
            String name = method.getName();
            if (name.hashCode() != 1622498214) {
                return null;
            }
            Object[] objArr = new Object[1];
            a("攀蝙ꆥ숲\uec6eໃ⬪啨矞造늌�怒ᮙױ♞䂵洍轢꧍", 57947 - Color.argb(0, 0, 0, 0), objArr);
            if (!name.equals(((String) objArr[0]).intern())) {
                return null;
            }
            f2994 = (f2993 + 43) % 128;
            ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
            Object m5665 = m5665(new Object[]{this});
            int i2 = f2993 + 25;
            f2994 = i2 % 128;
            if (i2 % 2 == 0) {
                return m5665;
            }
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ Object m5665(Object[] objArr) {
            e eVar = (e) objArr[0];
            int i = f2994;
            int i2 = i + 103;
            f2993 = i2 % 128;
            Object obj = eVar.f2995;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            int i3 = i + 113;
            f2993 = i3 % 128;
            if (i3 % 2 != 0) {
                return obj;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        static void m5666() {
            f2992 = -2755482746476378487L;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static boolean m5667(Method method) {
            String name = method.getName();
            if (name.hashCode() == 1622498214) {
                Object[] objArr = new Object[1];
                a("攀蝙ꆥ숲\uec6eໃ⬪啨矞造늌�怒ᮙױ♞䂵洍轢꧍", (KeyEvent.getMaxKeyCode() >> 16) + 57947, objArr);
                if (name.equals(((String) objArr[0]).intern())) {
                    f2994 = (f2993 + 47) % 128;
                    return true;
                }
            }
            int i = f2994 + 13;
            f2993 = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static Object[] m5668(Object[] objArr) {
            int i = f2994 + 51;
            f2993 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : objArr) {
                        f2994 = (f2993 + 41) % 128;
                        if (Proxy.isProxyClass(obj.getClass())) {
                            arrayList.add(Proxy.getInvocationHandler(obj));
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th) {
                    Object[] objArr2 = new Object[1];
                    a("攷뼼텚\ueb64ය⟿秥鈑둃칥", 55849 - View.resolveSize(0, 0), objArr2);
                    String intern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    a("攢봢핻\uedad\u05c9屔瑊貃꒫ﳼᜨ⽔䞔龌똌츰\ue661㺯囚椓腟�\uf1b2৸\u206f硙邃\ua8cd쌐", TextUtils.getOffsetBefore("", 0) + 55351, objArr3);
                    kd.m5656(intern, ((String) objArr3[0]).intern(), th, true);
                }
            }
            return objArr;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String intern;
            if (m5667(method)) {
                try {
                    return m5664(method);
                } catch (Throwable th) {
                    Object[] objArr2 = new Object[1];
                    a("攷뼼텚\ueb64ය⟿秥鈑둃칥", TextUtils.getTrimmedLength("") + 55849, objArr2);
                    String intern2 = ((String) objArr2[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    a("攢Ὸ郏ᗏ躡Ϧ蒀㥲뉹㝝ꡎⴭꙛ嬏�囕쯂䲻송窙ﾗ灯\uf519湁\ue33a搶ᤝ鏷ᓯ覞", 31469 - View.MeasureSpec.getSize(0), objArr3);
                    sb.append(((String) objArr3[0]).intern());
                    sb.append(method.getName());
                    kd.m5656(intern2, sb.toString(), th, true);
                    return null;
                }
            }
            try {
                this.f2996.mo4650(obj, method, objArr);
                f2993 = (f2994 + 31) % 128;
            } catch (Throwable th2) {
                Object[] objArr4 = new Object[1];
                a("攷뼼텚\ueb64ය⟿秥鈑둃칥", 55849 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
                String intern3 = ((String) objArr4[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr5 = new Object[1];
                a("攢ᶖ鐓ಁ蜙㿈똜⺜ꄉ妓퀒䢣썣箬\uf224檹\ued23斱᰿钻༩蟢㸅", 30851 - TextUtils.indexOf("", ""), objArr5);
                sb2.append(((String) objArr5[0]).intern());
                Object obj2 = this.f2995;
                if (obj2 != null) {
                    intern = obj2.toString();
                } else {
                    Object[] objArr6 = new Object[1];
                    a("攉걫\uf7f9㥠", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 51576, objArr6);
                    intern = ((String) objArr6[0]).intern();
                }
                sb2.append(intern);
                Object[] objArr7 = new Object[1];
                a("敇촏㔈鴜씛ⴑ锝ﵾ", 43013 - TextUtils.getOffsetBefore("", 0), objArr7);
                sb2.append(((String) objArr7[0]).intern());
                sb2.append(method.getName());
                kd.m5656(intern3, sb2.toString(), th2, true);
            }
            Object obj3 = this.f2995;
            if (obj3 != null) {
                f2993 = (f2994 + 115) % 128;
                return method.invoke(obj3, objArr);
            }
            if (!Object.class.equals(method.getDeclaringClass())) {
                return null;
            }
            f2994 = (f2993 + 45) % 128;
            return method.invoke(this, m5668(objArr));
        }
    }

    static {
        m5659();
        ViewConfiguration.getMaximumFlingVelocity();
        int i = f2989 + 87;
        f2991 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static void m5659() {
        f2990 = 2382508165161394632L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m5660(Object obj) {
        int i = f2991 + 35;
        f2989 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(obj instanceof hg)) {
            return false;
        }
        int i2 = f2991 + 103;
        f2989 = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5661(Class<?> cls, Object obj, c cVar) {
        Object newProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hg.class}, new e(obj, cVar));
        int i = f2989 + 67;
        f2991 = i % 128;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return newProxyInstance;
    }
}
