package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: av.class */
public final class av {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f396 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f397;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f398;

    static {
        m3317();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        f398 = (f396 + 69) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x017a, code lost:
    
        r0[r0] = (char) r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0184, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.b.f452;
        r9 = r0.get(-453221336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0195, code lost:
    
        if (r9 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019b, code lost:
    
        r9 = ((java.lang.Class) com.ironsource.adqualitysdk.sdk.i.b.m3371(android.text.TextUtils.getTrimmedLength(""), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 42 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)))).getMethod("F", java.lang.Object.class, java.lang.Object.class);
        r0.put(-453221336, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01d8, code lost:
    
        ((java.lang.reflect.Method) r9).invoke(null, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f7, code lost:
    
        throw new java.lang.ArithmeticException("divide by zero");
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.av.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void aG_(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        f398 = (f396 + 89) % 128;
        try {
            Object[] objArr = new Object[1];
            a("蛧ꅟ즬\uf1f1ᡚ䂊棪錮뮿\ue3d7ਠ㉵嫈蔀굢햦", MotionEvent.axisFromString("") + 10160, objArr);
            ((Method) kg.m5685(new Object[]{obj, ((String) objArr[0]).intern(), Arrays.asList(broadcastReceiver, intentFilter)}, 1693927874, -1693927874, (int) System.currentTimeMillis())).invoke(obj, broadcastReceiver, intentFilter);
            f396 = (f398 + 47) % 128;
        } catch (IllegalAccessException | InvocationTargetException e) {
        }
    }

    public static void aH_(Object obj, BroadcastReceiver broadcastReceiver) {
        int i = f398 + 99;
        f396 = i % 128;
        try {
            if (i % 2 == 0) {
                Object[] objArr = new Object[1];
                a("蛠笲絵羫燖爑瑐皞梸櫶漝慓掚旅昂堤婠岾", KeyEvent.normalizeMetaState(0) * 64969, objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[0];
                objArr2[1] = broadcastReceiver;
                Method method = (Method) kg.m5685(new Object[]{obj, intern, Arrays.asList(objArr2)}, 1693927874, -1693927874, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[1];
                objArr3[1] = broadcastReceiver;
                method.invoke(obj, objArr3);
            } else {
                Object[] objArr4 = new Object[1];
                a("蛠笲絵羫燖爑瑐皞梸櫶漝慓掚旅昂堤婠岾", 64969 - KeyEvent.normalizeMetaState(0), objArr4);
                ((Method) kg.m5685(new Object[]{obj, ((String) objArr4[0]).intern(), Arrays.asList(broadcastReceiver)}, 1693927874, -1693927874, (int) System.currentTimeMillis())).invoke(obj, broadcastReceiver);
            }
            int i2 = f398 + 95;
            f396 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m3316(Context context) {
        Object invoke;
        int i = f396 + 113;
        f398 = i % 128;
        try {
            if (i % 2 != 0) {
                Class m3318 = m3318();
                Object[] objArr = new Object[1];
                a("蛲\uaa3b�½㗗夑訣뽹\ue0a3ᗕ㤞", 3797 >>> ExpandableListView.getPackedPositionChild(1L), objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[0];
                objArr2[1] = context;
                Method method = (Method) kg.m5685(new Object[]{m3318, intern, Arrays.asList(objArr2)}, 1693927874, -1693927874, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[1];
                objArr3[1] = context;
                invoke = method.invoke(null, objArr3);
            } else {
                Class m33182 = m3318();
                Object[] objArr4 = new Object[1];
                a("蛲\uaa3b�½㗗夑訣뽹\ue0a3ᗕ㤞", ExpandableListView.getPackedPositionChild(0L) + 11468, objArr4);
                invoke = ((Method) kg.m5685(new Object[]{m33182, ((String) objArr4[0]).intern(), Arrays.asList(context)}, 1693927874, -1693927874, (int) System.currentTimeMillis())).invoke(null, context);
            }
            return invoke;
        } catch (IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m3317() {
        f397 = 7898865622281954683L;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Class m3318() {
        f398 = (f396 + 5) % 128;
        Object[] objArr = new Object[1];
        a("蛴먼ｿゲ痦ꤟ\uea5b⾜悃ꐆ�᩻徠郢퐕ॎ䪊迃쌏г㥸窵뿻\uf319㑜榔ꫂ\uee0f⌴摬駩�Ḛ卜钏짅ഇ丢茱쒈梨㴩繒뎔\uf4e3⠜洸깽\ue3a1ⓡ堪鵃�Ꮻ圎蠺쵼ຽ䏦蜺", (ViewConfiguration.getTouchSlop() >> 8) + 15559, objArr);
        Class m5695 = kg.m5695(((String) objArr[0]).intern(), false);
        int i = f398 + 11;
        f396 = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return m5695;
    }
}
