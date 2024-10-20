package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: bm.class */
public abstract class bm extends db implements cn {
    private static int $10 = 0;
    private static int $11 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f877;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f878 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static long f879 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f880 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f881;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f882;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f883;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f884;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map f885;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: bm$d.class */
    public interface d {
        /* renamed from: ﻛ */
        Object mo3630(List<Object> list, cp cpVar);
    }

    static {
        m3711();
        TypedValue.complexToFloat(0);
        Drawable.resolveOpacity(0, 0);
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionForChild(0, 0);
        Process.getThreadPriority(0);
        AudioTrack.getMaxVolume();
        ExpandableListView.getPackedPositionGroup(0L);
        SystemClock.uptimeMillis();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getScrollDefaultDelay();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf("", "", 0, 0);
        AndroidCharacter.getMirror('0');
        Color.red(0);
        Color.green(0);
        Color.argb(0, 0, 0, 0);
        ViewConfiguration.getKeyRepeatDelay();
        ExpandableListView.getPackedPositionChild(0L);
        TextUtils.lastIndexOf("", '0', 0, 0);
        Color.rgb(0, 0, 0);
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getKeyRepeatDelay();
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.getCapsMode("", 0, 0);
        Color.green(0);
        TextUtils.lastIndexOf("", '0');
        KeyEvent.getModifierMetaStateMask();
        SystemClock.elapsedRealtime();
        Process.myPid();
        ViewConfiguration.getTapTimeout();
        SystemClock.uptimeMillis();
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getMaximumFlingVelocity();
        f880 = (f878 + 15) % 128;
    }

    public bm(String str) {
        this.f882 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bm.c(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r8, int r9, char r10, java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bm.d(int, int, char, java.lang.Object[]):void");
    }

    /* renamed from: Ꮧ, reason: contains not printable characters */
    static /* synthetic */ Object m3710(List list, Class cls) {
        f878 = (f880 + 83) % 128;
        return db.m4587(list, 0, cls);
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static void m3711() {
        f881 = 287397385;
        f877 = new char[]{3395, 53875, 45880, 36897, 29166, 22164, 14213, 5992, 62481, 54534, 47851, 39830, 30881, 22625, 14601, 7730, 65497, 56453, 48554, 25212, 48468, 56379, 65318, 7903, 14760, 22676, 30798, 34823, 22310, 13911, 5502, 62630, 54229, 45818, 3439, 53874, 45836, 36923, 29168, 22232, 14259, 6004, 62495, 54579, 47867, 39824, 30907, 22630, 14593, 7804, 65508, 56449, 48554, 40285, 25108, 17213, 8342, 385, 59071, 50756, 42758, 33835, 26070, 19144, 11233, 3406, 53871, 45835, 36918, 29166, 22173, 47137, 26374, 1656, 9553, 16637, 40924, 65195, 56722, 12056, 61481, 37210, 45665, 3420, 53871, 45847, 36912, 3338, 53870, 45841, 36896, 29090, 22174, 14265, 6009, 62484, 54580};
        f879 = 2172636560367276544L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static /* synthetic */ Object m3712(Object[] objArr) {
        bm bmVar = (bm) objArr[0];
        String str = (String) objArr[1];
        List<Object> list = (List) objArr[2];
        cp cpVar = (cp) objArr[3];
        d dVar = (d) bmVar.f885.get(str);
        try {
            if (dVar != null) {
                f880 = (f878 + 113) % 128;
                Object mo3630 = dVar.mo3630(list, cpVar);
                f878 = (f880 + 107) % 128;
                return mo3630;
            }
            String str2 = bmVar.f882;
            StringBuilder sb = new StringBuilder();
            int blue = Color.blue(0);
            int normalizeMetaState = KeyEvent.normalizeMetaState(0);
            Object[] objArr2 = new Object[1];
            d(31 - blue, normalizeMetaState + 34, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(str);
            Object[] objArr3 = new Object[1];
            c(View.combineMeasuredStates(0, 0) + 23, 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), true, 129 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0010ￂ\u0006\u0011\n\u0016\u0007\u000fￂￜ\uffc9\u0006\u0007\u0016\u0014\u0011\u0012\u0012\u0017\u0015ￂ\u0016\u0011", objArr3);
            sb.append(((String) objArr3[0]).intern());
            cu.m4502(str2, sb.toString(), null);
            return null;
        } catch (Exception e) {
            String str3 = bmVar.f882;
            StringBuilder sb2 = new StringBuilder();
            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
            long packedPositionForGroup = ExpandableListView.getPackedPositionForGroup(0);
            Object[] objArr4 = new Object[1];
            d((longPressTimeout >> 16) + 31, 34 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr4);
            sb2.append(((String) objArr4[0]).intern());
            sb2.append(str);
            Object[] objArr5 = new Object[1];
            c(TextUtils.getOffsetBefore("", 0) + 1, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 74, "��", objArr5);
            sb2.append(((String) objArr5[0]).intern());
            cu.m4502(str3, sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ String m3713(bm bmVar) {
        int i = f880 + 25;
        int i2 = i % 128;
        f878 = i2;
        String str = bmVar.f884;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i3 = i2 + 3;
        f880 = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m3714(Object[] objArr, int i, int i2, int i3) {
        int i4 = i ^ (-1);
        int i5 = i2 ^ (-1);
        int i6 = i3 ^ (-1);
        return ((((i * (-209)) + (i2 * (-209))) + (((i4 | i5) ^ (-1)) * 210)) + ((((i5 | i6) ^ (-1)) | ((i4 | i3) ^ (-1))) * 210)) + (((((i | i5) | i3) ^ (-1)) | ((i2 | (i4 | i6)) ^ (-1))) * 210) != 1 ? m3716(objArr) : m3712(objArr);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ Class m3715(bm bmVar, String str) {
        f878 = (f880 + 61) % 128;
        Boolean bool = Boolean.FALSE;
        Class cls = (Class) m3714(new Object[]{bmVar, str, bool}, -29688530, 29688530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, bmVar)).intValue());
        f878 = (f880 + 7) % 128;
        return cls;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m3716(Object[] objArr) {
        boolean z;
        bm bmVar = (bm) objArr[0];
        String str = (String) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        try {
            Object[] objArr2 = new Object[1];
            c(1 - KeyEvent.keyCodeFromString(""), 1 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, 82 - View.resolveSize(0, 0), "��", objArr2);
            if (str.contains(((String) objArr2[0]).intern())) {
                f880 = (f878 + 79) % 128;
                return kg.m5695(str, booleanValue);
            }
            switch (str.hashCode()) {
                case -1325958191:
                    Object[] objArr3 = new Object[1];
                    d(5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65, (char) KeyEvent.keyCodeFromString(""), objArr3);
                    if (str.equals(((String) objArr3[0]).intern())) {
                        f878 = (f880 + 101) % 128;
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 104431:
                    Object[] objArr4 = new Object[1];
                    c(3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1 - Gravity.getAbsoluteGravity(0, 0), false, TextUtils.getOffsetAfter("", 0) + 146, "\u0006\ufffb��", objArr4);
                    if (str.equals(((String) objArr4[0]).intern())) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 3029738:
                    Object[] objArr5 = new Object[1];
                    d((ViewConfiguration.getEdgeSlop() >> 16) + 4, 70 - MotionEvent.axisFromString(""), (char) (46441 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr5);
                    if (str.equals(((String) objArr5[0]).intern())) {
                        z = 4;
                        break;
                    } else {
                        z = -1;
                        break;
                    }
                case 3039496:
                    Object[] objArr6 = new Object[1];
                    d(3 - TextUtils.lastIndexOf("", '0', 0, 0), 79 - View.MeasureSpec.getMode(0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8785), objArr6);
                    if (str.equals(((String) objArr6[0]).intern())) {
                        z = 6;
                        break;
                    }
                    z = -1;
                    break;
                case 3052374:
                    Object[] objArr7 = new Object[1];
                    d(5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 76, (char) (19891 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr7);
                    if (str.equals(((String) objArr7[0]).intern())) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                case 3327612:
                    c(4 - (Process.myTid() >> 22), 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, KeyEvent.keyCodeFromString("") + 144, "\u0003\u0002\ufffb��", new Object[1]);
                    if (!(!str.equals(((String) r0[0]).intern()))) {
                        f880 = (f878 + 23) % 128;
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 3625364:
                    Object[] objArr8 = new Object[1];
                    d(4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 82 - Process.getGidForName(""), (char) TextUtils.getTrimmedLength(""), objArr8);
                    if (str.equals(((String) objArr8[0]).intern())) {
                        z = 7;
                        break;
                    }
                    z = -1;
                    break;
                case 97526364:
                    Object[] objArr9 = new Object[1];
                    c((ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, 3 - TextUtils.indexOf("", "", 0, 0), true, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 142, "\u0005\u0002￼\n\ufff7", objArr9);
                    if (str.equals(((String) objArr9[0]).intern())) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 109413500:
                    Object[] objArr10 = new Object[1];
                    c((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, ((byte) KeyEvent.getModifierMetaStateMask()) + 4, true, (ViewConfiguration.getPressedStateDuration() >> 16) + 148, "\uffff\ufff8\u0003\u0004\u0002", objArr10);
                    if (str.equals(((String) objArr10[0]).intern())) {
                        z = 8;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    return Integer.TYPE;
                case true:
                    return Long.TYPE;
                case true:
                    return Double.TYPE;
                case true:
                    return Float.TYPE;
                case true:
                    return Boolean.TYPE;
                case true:
                    return Character.TYPE;
                case true:
                    return Byte.TYPE;
                case true:
                    return Void.TYPE;
                case true:
                    return Short.TYPE;
                default:
                    return bmVar.mo3627(str);
            }
        } catch (Throwable th) {
            if (!booleanValue) {
                return null;
            }
            String str2 = bmVar.f882;
            StringBuilder sb = new StringBuilder();
            Object[] objArr11 = new Object[1];
            c((ViewConfiguration.getEdgeSlop() >> 16) + 6, View.MeasureSpec.makeMeasureSpec(0, 0) + 4, false, KeyEvent.normalizeMetaState(0) + 125, "\b\u001a\u001aￇ￪\u0013", objArr11);
            sb.append(((String) objArr11[0]).intern());
            sb.append(str);
            Object[] objArr12 = new Object[1];
            d(9 - TextUtils.lastIndexOf("", '0', 0, 0), 87 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
            sb.append(((String) objArr12[0]).intern());
            cu.m4502(str2, sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ﮐ */
    public String mo3703() {
        int i = f878 + 71;
        f880 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        String str = this.f884;
        if (str != null) {
            return str;
        }
        String m3718 = m3718();
        f880 = (f878 + 89) % 128;
        return m3718;
    }

    /* renamed from: ﱡ */
    public boolean mo3642() {
        f880 = (f878 + 77) % 128;
        return false;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m3717() {
        int i = f878;
        int i2 = i + 111;
        f880 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.f884 == null) {
            return false;
        }
        f880 = (i + 125) % 128;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L9;
     */
    /* renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m3718() {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            int r0 = com.ironsource.adqualitysdk.sdk.i.bm.f878     // Catch: java.lang.Throwable -> L6e
            r1 = 43
            int r0 = r0 + r1
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.ironsource.adqualitysdk.sdk.i.bm.f880 = r0     // Catch: java.lang.Throwable -> L6e
            r0 = r5
            java.lang.String r0 = r0.f883     // Catch: java.lang.Throwable -> L6e
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L1c
            goto L63
        L1c:
            r0 = r5
            java.lang.String r0 = r0.f883     // Catch: java.lang.Throwable -> L6e
            r9 = r0
            r0 = 0
            r1 = 0
            int r0 = android.view.KeyEvent.getDeadChar(r0, r1)     // Catch: java.lang.Throwable -> L6e
            r7 = r0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            int r0 = android.graphics.Color.argb(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L6e
            r8 = r0
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r1)     // Catch: java.lang.Throwable -> L6e
            r1 = 34152(0x8568, float:4.7857E-41)
            int r0 = r0 + r1
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L6e
            r6 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6e
            r10 = r0
            r0 = 7
            r1 = r7
            int r0 = r0 - r1
            r1 = r8
            r2 = 27
            int r1 = r1 + r2
            r2 = r6
            r3 = r10
            d(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L6e
            r0 = r9
            r1 = r10
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L73
        L63:
            r0 = r5
            r1 = r5
            java.lang.String r1 = r1.mo3629()     // Catch: java.lang.Throwable -> L6e
            r0.f883 = r1     // Catch: java.lang.Throwable -> L6e
            goto L73
        L6e:
            r9 = move-exception
            goto La3
        L73:
            r0 = r5
            java.lang.String r0 = r0.f883     // Catch: java.lang.Throwable -> L6e
            r9 = r0
            int r0 = com.ironsource.adqualitysdk.sdk.i.bm.f880     // Catch: java.lang.Throwable -> L6e
            r1 = 89
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 % r1
            com.ironsource.adqualitysdk.sdk.i.bm.f878 = r0     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L9e
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException     // Catch: java.lang.Throwable -> L99
            r1 = r0
            java.lang.String r2 = "divide by zero"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99
            throw r0     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L6e
        L9e:
            r0 = r5
            monitor-exit(r0)
            r0 = r9
            return r0
        La3:
            r0 = r5
            monitor-exit(r0)
            r0 = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bm.m3718():java.lang.String");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cn
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object mo3719(String str, List<Object> list, cp cpVar) {
        return m3714(new Object[]{this, str, list, cpVar}, 660079890, -660079889, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3720(String str) {
        int i = f880 + 95;
        f878 = i % 128;
        this.f884 = str;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Class m3721(String str) {
        f878 = (f880 + 125) % 128;
        try {
            if (!(!Prode.m2992())) {
                Class mo3627 = mo3627(str);
                f878 = (f880 + 115) % 128;
                return mo3627;
            }
            int i = f880 + 11;
            f878 = i % 128;
            if (i % 2 != 0) {
                return (Class) m3714(new Object[]{this, str, Boolean.FALSE}, -29688530, 29688530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
            }
            return (Class) m3714(new Object[]{this, str, Boolean.FALSE}, -29688530, 29688530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m3722() {
        Map mo3628 = mo3628();
        this.f885 = mo3628;
        Object[] objArr = new Object[1];
        c(17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Gravity.getAbsoluteGravity(0, 0) + 5, false, (ViewConfiguration.getPressedStateDuration() >> 16) + 139, "\u000b\f\u0002\b\u0007\f\ufffe\r\uffdf\u000e\u0005\u0005￬�\u0004\uffef\ufffe", objArr);
        mo3628.put(((String) objArr[0]).intern(), new d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4

            /* renamed from: ｋ, reason: contains not printable characters */
            private bm f887;

            {
                this.f887 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                this.f887.m3720((String) bm.m3710(list, String.class));
                return bm.m3713(this.f887);
            }
        });
        Map map = this.f885;
        int combineMeasuredStates = View.combineMeasuredStates(0, 0);
        Object[] objArr2 = new Object[1];
        d(combineMeasuredStates + 19, View.getDefaultSize(0, 0), (char) TextUtils.indexOf("", "", 0), objArr2);
        map.put(((String) objArr2[0]).intern(), new d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3

            /* renamed from: ﾒ, reason: contains not printable characters */
            private bm f886;

            {
                this.f886 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return Boolean.valueOf(this.f886.m3717());
            }
        });
        Map map2 = this.f885;
        int offsetAfter = TextUtils.getOffsetAfter("", 0);
        int lastIndexOf = TextUtils.lastIndexOf("", '0');
        Object[] objArr3 = new Object[1];
        d(offsetAfter + 8, 18 - lastIndexOf, (char) (28465 - ExpandableListView.getPackedPositionGroup(0L)), objArr3);
        map2.put(((String) objArr3[0]).intern(), new d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5

            /* renamed from: ｋ, reason: contains not printable characters */
            private bm f888;

            {
                this.f888 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.bm.d
            /* renamed from: ﻛ */
            public final Object mo3630(List<Object> list, cp cpVar) {
                return bm.m3715(this.f888, (String) list.get(0));
            }
        });
        f880 = (f878 + 41) % 128;
    }

    /* renamed from: ﾇ */
    abstract Class mo3627(String str);

    /* renamed from: ﾇ */
    abstract Map mo3628();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3723(hg hgVar, cp cpVar, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, hgVar);
            cpVar.mo4454(str, arrayList);
            int i = f880 + 81;
            f878 = i % 128;
            if (i % 2 != 0) {
                throw new ArithmeticException("divide by zero");
            }
        } catch (Throwable th) {
            String str2 = this.f882;
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            c(TextUtils.indexOf((CharSequence) "", '0', 0) + 10, (ViewConfiguration.getPressedStateDuration() >> 16) + 5, true, TextUtils.getOffsetBefore("", 0) + 125, "\u0019\u0016\u0019\u0019￬ￇ\u0015\u0010ￇ", objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(this);
            cu.m4502(str2, sb.toString(), th);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Class m3724(String str) {
        Object m3714;
        int i = f880 + 25;
        f878 = i % 128;
        Object[] objArr = new Object[3];
        if (i % 2 != 0) {
            objArr[0] = this;
            objArr[1] = str;
            objArr[2] = Boolean.TRUE;
            m3714 = m3714(objArr, -29688530, 29688530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
        } else {
            objArr[0] = this;
            objArr[1] = str;
            objArr[2] = Boolean.TRUE;
            m3714 = m3714(objArr, -29688530, 29688530, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
        }
        return (Class) m3714;
    }

    /* renamed from: ﾒ */
    abstract String mo3629();
}
