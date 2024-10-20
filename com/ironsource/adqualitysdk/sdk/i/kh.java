package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: kh.class */
public final class kh {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3013 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3014;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Rect f3015;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f3016;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3017;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f3018;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3019;

    static {
        m5710();
        Process.myTid();
        f3015 = new Rect();
        f3014 = (f3013 + 1) % 128;
    }

    public static <E extends View> E eA_(Activity activity, Class<E> cls, int i, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        eC_(activity, cls, i, str, true, false, null, list, arrayList);
        if (arrayList.size() <= 0) {
            f3013 = (f3014 + 103) % 128;
            return null;
        }
        E e = (E) arrayList.get(0);
        int i2 = f3014 + 63;
        f3013 = i2 % 128;
        if (i2 % 2 != 0) {
            return e;
        }
        throw null;
    }

    public static <E extends View> void eB_(Activity activity, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        f3014 = (f3013 + 81) % 128;
        eC_(activity, cls, -1, null, false, z, list, list2, list3);
        int i = f3014 + 27;
        f3013 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
    }

    public static <E extends View> void eC_(Activity activity, Class<E> cls, int i, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        f3014 = (f3013 + 69) % 128;
        if (i != -1) {
            View findViewById = activity.findViewById(i);
            if (cls.isInstance(findViewById)) {
                list3.add(findViewById);
                if (z) {
                    return;
                }
            }
            eG_(findViewById, cls, str, z, z2, list, list2, list3);
            if (list3.size() > 0 && z) {
                return;
            }
        }
        View ez_ = ez_(activity);
        if (ez_ != null) {
            int i2 = f3014 + 93;
            f3013 = i2 % 128;
            if (i2 % 2 == 0) {
                m5706(new Object[]{ez_, cls, str, Boolean.valueOf(z), Boolean.valueOf(z2), list, list2, list3}, 588227550, -588227548, (int) System.currentTimeMillis());
                throw null;
            }
            m5706(new Object[]{ez_, cls, str, Boolean.valueOf(z), Boolean.valueOf(z2), list, list2, list3}, 588227550, -588227548, (int) System.currentTimeMillis());
            f3013 = (f3014 + 117) % 128;
        }
    }

    public static <E extends View> E eE_(View view, Class<E> cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        eF_(view, cls, true, z, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        f3013 = (f3014 + 13) % 128;
        E e = (E) arrayList.get(0);
        int i = f3014 + 9;
        f3013 = i % 128;
        if (i % 2 != 0) {
            return e;
        }
        throw null;
    }

    public static <E extends View> void eF_(View view, Class<E> cls, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        int i = f3013 + 113;
        f3014 = i % 128;
        if (i % 2 != 0) {
            eG_(view, cls, null, z, z2, list, list2, list3);
            throw null;
        }
        eG_(view, cls, null, z, z2, list, list2, list3);
        f3014 = (f3013 + 105) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends View> void eG_(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        int i = f3014 + 115;
        f3013 = i % 128;
        if (i % 2 == 0) {
            boolean z3 = view instanceof ViewGroup;
            throw null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (eH_(childAt, cls, str, list, list2)) {
                    list3.add(childAt);
                    if (z) {
                        f3014 = (f3013 + 7) % 128;
                        return;
                    } else if (z2) {
                        f3014 = (f3013 + 49) % 128;
                        eG_(childAt, cls, str, z, z2, list, list2, list3);
                    }
                } else {
                    eG_(childAt, cls, str, z, z2, list, list2, list3);
                    if (list3 != 0 && list3.size() > 0) {
                        int i3 = f3014 + 9;
                        f3013 = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static <E extends View> boolean eH_(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        int i = f3013 + 43;
        f3014 = i % 128;
        if (i % 2 != 0) {
            m5707(list);
            throw null;
        }
        if (!(m5707(list) || list.contains(Integer.valueOf(view.getId()))) || eI_(list2, view)) {
            return false;
        }
        int i2 = f3013 + 9;
        f3014 = i2 % 128;
        if (i2 % 2 == 0) {
            return str == null || !(view.getClass().getName().startsWith(str) ^ true);
        }
        throw null;
    }

    private static boolean eI_(List list, View view) {
        int i = f3013 + 49;
        f3014 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (list != null && list.contains(view.getClass().getName())) {
            return true;
        }
        f3014 = (f3013 + 99) % 128;
        return false;
    }

    public static View eJ_(View view) {
        while (view.getParent() instanceof View) {
            int i = f3013 + 17;
            f3014 = i % 128;
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
            view = (View) view.getParent();
            f3014 = (f3013 + 89) % 128;
        }
        return view;
    }

    public static Activity eK_(View view) {
        if (view == null) {
            return null;
        }
        int i = f3014 + 57;
        f3013 = i % 128;
        if (i % 2 == 0) {
            ((View) m5706(new Object[]{view}, -998473038, 998473039, (int) System.currentTimeMillis())).getContext();
            throw new ArithmeticException("divide by zero");
        }
        Context context = ((View) m5706(new Object[]{view}, -998473038, 998473039, (int) System.currentTimeMillis())).getContext();
        while (true) {
            Context context2 = context;
            if (!(context2 instanceof ContextWrapper)) {
                return (Activity) m5706(new Object[]{view}, 854745514, -854745514, (int) System.currentTimeMillis());
            }
            if (context2 instanceof Activity) {
                f3014 = (f3013 + 11) % 128;
                return (Activity) context2;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }

    public static boolean eL_(View view) {
        f3013 = (f3014 + 109) % 128;
        view.getHitRect(f3015);
        boolean globalVisibleRect = view.getGlobalVisibleRect(f3015);
        int i = f3013 + 33;
        f3014 = i % 128;
        if (i % 2 == 0) {
            return globalVisibleRect;
        }
        throw null;
    }

    public static View ez_(Activity activity) {
        f3014 = (f3013 + 105) % 128;
        View findViewById = activity.findViewById(R.id.content);
        int i = f3014 + 81;
        f3013 = i % 128;
        if (i % 2 != 0) {
            return findViewById;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.kh.f3013 = (com.ironsource.adqualitysdk.sdk.i.kh.f3014 + 9) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return r0;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object m5705(java.lang.Object[] r3) {
        /*
            r0 = r3
            r1 = 0
            r0 = r0[r1]
            android.view.View r0 = (android.view.View) r0
            r3 = r0
        L7:
            r0 = r3
            int r0 = r0.getId()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            if (r0 == r1) goto L47
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            if (r0 == r1) goto L47
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f3014
            r1 = 83
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.ironsource.adqualitysdk.sdk.i.kh.f3013 = r0
            r0 = r4
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L3d
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            goto L7
        L3d:
            r0 = r3
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r3 = r0
            r0 = 0
            throw r0
        L47:
            int r0 = com.ironsource.adqualitysdk.sdk.i.kh.f3014
            r1 = 9
            int r0 = r0 + r1
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.ironsource.adqualitysdk.sdk.i.kh.f3013 = r0
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kh.m5705(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5706(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        int i6 = i3 ^ (-1);
        int i7 = (i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * 184) + ((((i | i2) ^ (-1)) | ((i6 | i) ^ (-1)) | ((i4 | i5) ^ (-1))) * 184);
        return i7 != 1 ? i7 != 2 ? m5708(objArr) : m5709(objArr) : m5705(objArr);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m5707(List list) {
        int i = f3013;
        f3014 = (i + 5) % 128;
        if (list == null) {
            return true;
        }
        int i2 = i + 9;
        f3014 = i2 % 128;
        if (i2 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            return true;
        }
        f3013 = (f3014 + 3) % 128;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ Object m5708(Object[] objArr) {
        View findViewById;
        View view = (View) objArr[0];
        if (view != null && (findViewById = view.findViewById(R.id.content)) != null) {
            int i = f3014 + 11;
            f3013 = i % 128;
            if (i % 2 == 0) {
                boolean z = findViewById.getContext() instanceof Activity;
                throw null;
            }
            if (!(!(findViewById.getContext() instanceof Activity))) {
                return (Activity) findViewById.getContext();
            }
        }
        f3014 = (f3013 + 13) % 128;
        return null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static /* synthetic */ Object m5709(Object[] objArr) {
        View view;
        View view2 = (View) objArr[0];
        Class cls = (Class) objArr[1];
        String str = (String) objArr[2];
        boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
        boolean booleanValue2 = ((Boolean) objArr[4]).booleanValue();
        List list = (List) objArr[5];
        List list2 = (List) objArr[6];
        List list3 = (List) objArr[7];
        View view3 = view2;
        while (true) {
            view = view3;
            if (view.getParent() == null) {
                break;
            }
            int i = f3013 + 97;
            f3014 = i % 128;
            if (i % 2 != 0) {
                boolean z = view.getParent() instanceof ViewGroup;
                throw null;
            }
            if (!(view.getParent() instanceof ViewGroup)) {
                break;
            }
            view3 = (View) view.getParent();
        }
        eG_(view, cls, str, booleanValue, booleanValue2, list, list2, list3);
        int i2 = f3013 + 105;
        f3014 = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5710() {
        f3017 = (char) 59311;
        f3019 = (char) 50234;
        f3016 = (char) 6629;
        f3018 = (char) 4482;
    }
}
