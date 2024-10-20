package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hq;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: hs.class */
public class hs extends hq {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private int f2430;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private List f2431 = new ArrayList();

    /* renamed from: ﱡ, reason: contains not printable characters */
    private List f2432;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f2433;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private Class f2434;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int f2435;

    /* loaded from: hs$d.class */
    public static final class d extends hq.b implements cn {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2436 = 1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f2437;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2438;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2439;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2440;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2441;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f2442;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private hs f2443 = new hs();

        static {
            m5195();
            TextUtils.getOffsetBefore("", 0);
            Color.alpha(0);
            TextUtils.indexOf("", "");
            View.MeasureSpec.getSize(0);
            TextUtils.indexOf("", "");
            ExpandableListView.getPackedPositionChild(0L);
            Process.getThreadPriority(0);
            Process.getElapsedCpuTime();
            ViewConfiguration.getScrollFriction();
            Process.getElapsedCpuTime();
            f2436 = (f2438 + 51) % 128;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x027b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
            /*
                Method dump skipped, instructions count: 673
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hs.d.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v94, types: [int] */
        private static void b(String str, int i, Object[] objArr) {
            boolean z = 3;
            if (str != null) {
                str = str.toCharArray();
                $11 = ($10 + 39) % 128;
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
                int i3 = ($10 + 99) % 128;
                $11 = i3;
                cArr3[0] = cArr[i2];
                cArr3[1] = cArr[i2 + 1];
                $10 = (i3 + 101) % 128;
                char c = 58224;
                int i4 = 0;
                boolean z2 = z;
                while (i4 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[0];
                    char c4 = (char) (f2442 ^ 8584761702560213004L);
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[z2 ? 1 : 0] = Integer.valueOf(f2437);
                        objArr2[2] = Integer.valueOf(c3 >>> 5);
                        objArr2[1] = Integer.valueOf((c3 + c) ^ ((c3 << 4) + c4));
                        objArr2[0] = Integer.valueOf(c2);
                        Map map = b.f452;
                        Object obj = map.get(-952725446);
                        if (obj == null) {
                            Class cls = (Class) b.m3371(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 41 - TextUtils.getCapsMode("", 0, 0));
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
                        char c6 = (char) (f2439 ^ 8584761702560213004L);
                        char c7 = f2440;
                        Object obj2 = map.get(-952725446);
                        if (obj2 == null) {
                            Class cls3 = (Class) b.m3371(TextUtils.lastIndexOf("", '0', 0) + 1, (char) (AndroidCharacter.getMirror('0') - '0'), 41 - (ViewConfiguration.getEdgeSlop() >> 16));
                            Class<?> cls4 = Integer.TYPE;
                            obj2 = cls3.getMethod("x", cls4, cls4, cls4, cls4);
                            map.put(-952725446, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, Integer.valueOf(c5), Integer.valueOf((charValue + c) ^ ((charValue << 4) + c6)), Integer.valueOf(charValue >>> 5), Integer.valueOf(c7))).charValue();
                        c -= 40503;
                        i4++;
                        z2 = 3;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i5 = pVar.f3046;
                cArr2[i5] = cArr3[0];
                cArr2[i5 + 1] = cArr3[1];
                Map map2 = b.f452;
                Object obj3 = map2.get(-1234941609);
                if (obj3 == null) {
                    obj3 = ((Class) b.m3371(View.resolveSize(0, 0), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41)).getMethod("u", Object.class, Object.class);
                    map2.put(-1234941609, obj3);
                }
                ((Method) obj3).invoke(null, pVar, pVar);
                z = z2;
            }
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private d m5186(int i) {
            f2436 = (f2438 + 3) % 128;
            this.f2443.f2430 = i;
            f2436 = (f2438 + 3) % 128;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private d m5187(int i) {
            hs hsVar;
            int i2;
            int i3 = f2438 + 49;
            f2436 = i3 % 128;
            if (i3 % 2 == 0) {
                hsVar = this.f2443;
                i2 = i & hsVar.f2426;
            } else {
                hsVar = this.f2443;
                i2 = i | hsVar.f2426;
            }
            hsVar.f2426 = i2;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private d m5188(Class cls) {
            int i = f2438 + 5;
            f2436 = i % 128;
            if (i % 2 == 0) {
                this.f2443.f2431.add(cls);
                throw new ArithmeticException("divide by zero");
            }
            this.f2443.f2431.add(cls);
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private d m5189(boolean z, int i) {
            int i2 = f2438 + 13;
            f2436 = i2 % 128;
            if (i2 % 2 != 0) {
                hs hsVar = this.f2443;
                hsVar.f2424 = z;
                hsVar.f2423 = i;
                return this;
            }
            hs hsVar2 = this.f2443;
            hsVar2.f2424 = z;
            hsVar2.f2423 = i;
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ Object m5190(Object[] objArr, int i, int i2, int i3) {
            int i4 = i2 ^ (-1);
            int i5 = ((i3 ^ (-1)) | i2) ^ (-1);
            int i6 = i ^ (-1);
            return ((((i * (-1939)) + (i2 * 971)) + ((((i4 | i) ^ (-1)) | i5) * (-970))) + (((i2 | i6) ^ (-1)) * 1940)) + ((((i6 | i4) ^ (-1)) | i5) * 970) != 1 ? m5198(objArr) : m5192(objArr);
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private hs m5191() {
            int i = f2438 + 73;
            f2436 = i % 128;
            if (i % 2 != 0) {
                return this.f2443;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private static /* synthetic */ Object m5192(Object[] objArr) {
            d dVar = (d) objArr[0];
            int i = f2436 + 113;
            f2438 = i % 128;
            if (i % 2 == 0) {
                dVar.f2443.mo5152();
                return dVar;
            }
            dVar.f2443.mo5152();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private d m5193(int i) {
            int i2 = (f2438 + 73) % 128;
            f2436 = i2;
            hs hsVar = this.f2443;
            hsVar.f2425 = i | hsVar.f2425;
            f2438 = (i2 + 123) % 128;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private d m5194(List list) {
            int i = f2436 + 45;
            f2438 = i % 128;
            if (i % 2 != 0) {
                this.f2443.f2432 = list;
                throw new ArithmeticException("divide by zero");
            }
            this.f2443.f2432 = list;
            int i2 = f2438 + 25;
            f2436 = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        static void m5195() {
            f2441 = 287397520;
            f2442 = (char) 61790;
            f2440 = (char) 58583;
            f2437 = (char) 15131;
            f2439 = (char) 37779;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private d m5196(int i) {
            f2436 = (f2438 + 45) % 128;
            this.f2443.f2435 = i;
            int i2 = f2438 + 57;
            f2436 = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private d m5197(boolean z) {
            int i = f2438 + 57;
            f2436 = i % 128;
            if (i % 2 != 0) {
                this.f2443.f2433 = z;
                return this;
            }
            this.f2443.f2433 = z;
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static /* synthetic */ Object m5198(Object[] objArr) {
            d dVar = (d) objArr[0];
            Class cls = (Class) objArr[1];
            int i = f2438 + 35;
            f2436 = i % 128;
            if (i % 2 == 0) {
                dVar.f2443.f2434 = cls;
                throw new ArithmeticException("divide by zero");
            }
            dVar.f2443.f2434 = cls;
            f2438 = (f2436 + 13) % 128;
            return dVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn
        /* renamed from: ﻐ */
        public final Object mo3719(String str, List<Object> list, cp cpVar) {
            while (true) {
                boolean z = 3;
                switch (str.hashCode()) {
                    case -2020212392:
                        Object[] objArr = new Object[1];
                        a(TextUtils.getOffsetAfter("", 0) + 21, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), true, 291 - Color.argb(0, 0, 0, 0), "￣\t￮\uffff\n\u0013￮\b\f\u000f\u000e\uffff￬\ufffe\ufffe\ufffb\uffff\f\t\b\u0001", objArr);
                        if (str.equals(((String) objArr[0]).intern())) {
                            z = 8;
                            break;
                        }
                        break;
                    case -600792781:
                        b("\u0df8ﳦ怑ᚰ匈藍ꔁ↛\ue88d\uf04e歐꭫", TextUtils.indexOf("", "", 0) + 11, new Object[1]);
                        if (!(!str.equals(((String) r0[0]).intern()))) {
                            f2438 = (f2436 + 125) % 128;
                            break;
                        }
                        break;
                    case 94094958:
                        Object[] objArr2 = new Object[1];
                        a(4 - ExpandableListView.getPackedPositionChild(0L), 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, Color.alpha(0) + 294, "\u0003\ufffb\ufff9\f��", objArr2);
                        if (str.equals(((String) objArr2[0]).intern())) {
                            z = 10;
                            break;
                        }
                        break;
                    case 108404047:
                        Object[] objArr3 = new Object[1];
                        a(5 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 1, true, View.MeasureSpec.getSize(0) + 298, "\u0005\u0007\ufff8\u0006\ufff8", objArr3);
                        if (str.equals(((String) objArr3[0]).intern())) {
                            z = 9;
                            break;
                        }
                        break;
                    case 132643084:
                        Object[] objArr4 = new Object[1];
                        b("�龐რ䧏�葒Ҁ楽㮶ᒩ焌Y骋켑ᒂ鶒空톛ꀷ䣍歐꭫", 21 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
                        if (str.equals(((String) objArr4[0]).intern())) {
                            f2438 = (f2436 + 29) % 128;
                            z = 2;
                            break;
                        }
                        break;
                    case 200590504:
                        Object[] objArr5 = new Object[1];
                        b("�龐骋켑싂ᓼ鏆獮닑放獀༣ꌘ�확璘헠벢䤆ㄝ맿ᰣ멸灼", Gravity.getAbsoluteGravity(0, 0) + 24, objArr5);
                        if (str.equals(((String) objArr5[0]).intern())) {
                            int i = f2436 + 93;
                            f2438 = i % 128;
                            if (i % 2 == 0) {
                                z = 4;
                                break;
                            }
                        }
                        break;
                    case 387034026:
                        Object[] objArr6 = new Object[1];
                        a(18 - View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0', 0, 0) + 16, true, 293 - TextUtils.indexOf("", ""), "\u0004\ufffb\n�\b\r￫\u0006￡��\ufffb\n\ufff9�\u000b\u000b\u000b\ufff9", objArr6);
                        if (str.equals(((String) objArr6[0]).intern())) {
                            f2438 = (f2436 + 51) % 128;
                            z = 7;
                            break;
                        }
                        break;
                    case 391966482:
                        Object[] objArr7 = new Object[1];
                        b("螉嘻\ue915嵽\ue88d\uf04e溺靥躪쑚햘⺦⚡疇췴⟣㫤〃锿߯秚럿", 21 - TextUtils.getTrimmedLength(""), objArr7);
                        if (str.equals(((String) objArr7[0]).intern())) {
                            z = 5;
                            break;
                        }
                        break;
                    case 393987200:
                        Object[] objArr8 = new Object[1];
                        a(TextUtils.getOffsetAfter("", 0) + 19, 6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), true, (ViewConfiguration.getScrollBarSize() >> 8) + 292, "\ufffe￫\r\ufffe\f�\u0007\u0002\uffdf\b￭\ufffe\t\u0012￭\u0007\u000b\u000e\r", objArr8);
                        if (str.equals(((String) objArr8[0]).intern())) {
                            f2438 = (f2436 + 107) % 128;
                            z = false;
                            break;
                        }
                        break;
                    case 1423210564:
                        Object[] objArr9 = new Object[1];
                        a(21 - (ViewConfiguration.getScrollBarSize() >> 8), 2 - Color.alpha(0), false, ((byte) KeyEvent.getModifierMetaStateMask()) + 291, "\uffff��￼\uffff\uffff￨\n\uffff\u0004\u0001\u0004��\r\u000e\uffef\n￠\u0013\ufffe\u0007\u0010", objArr9);
                        if (str.equals(((String) objArr9[0]).intern())) {
                            z = 6;
                            break;
                        }
                        break;
                    case 1773646829:
                        Object[] objArr10 = new Object[1];
                        b("�龐⊉\ue395骋켑ᒂ鶒空톛ꀷ䣍⃑ꊑ龠ቒ덫䀶", 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
                        if (str.equals(((String) objArr10[0]).intern())) {
                            f2436 = (f2438 + 109) % 128;
                            z = true;
                            break;
                        }
                        break;
                }
                z = -1;
                switch (z) {
                    case false:
                        return (d) m5190(new Object[]{this, (Class) db.m4587(list, 0, Class.class)}, -803644266, 803644266, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
                    case true:
                        return m5194((List) db.m4587(list, 0, List.class));
                    case true:
                        return m5186(((Integer) db.m4587(list, 0, Integer.class)).intValue());
                    case true:
                        return m5196(((Integer) db.m4587(list, 0, Integer.class)).intValue());
                    case true:
                        return m5197(((Boolean) db.m4587(list, 0, Boolean.class)).booleanValue());
                    case true:
                        return m5193(((Integer) db.m4587(list, 0, Integer.class)).intValue());
                    case true:
                        return m5187(((Integer) db.m4587(list, 0, Integer.class)).intValue());
                    case true:
                        boolean booleanValue = ((Boolean) db.m4587(list, 0, Boolean.class)).booleanValue();
                        int i2 = -1;
                        if (list.size() > 1) {
                            i2 = ((Integer) db.m4587(list, 1, Integer.class)).intValue();
                            f2438 = (f2436 + 71) % 128;
                        }
                        return m5189(booleanValue, i2);
                    case true:
                        return m5188((Class) db.m4587(list, 0, Class.class));
                    case true:
                        return (d) m5190(new Object[]{this}, -474017258, 474017259, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
                    case true:
                        return m5191();
                }
            }
        }
    }

    public hs() {
        mo5152();
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final int m5179() {
        return this.f2430;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m5180() {
        return this.f2432;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Class m5181() {
        return this.f2434;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final int m5182() {
        return this.f2435;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final List<Class> m5183() {
        return this.f2431;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m5184() {
        return this.f2433;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.adqualitysdk.sdk.i.hq
    /* renamed from: ﾒ */
    public final void mo5152() {
        super.mo5152();
        this.f2434 = null;
        this.f2435 = 0;
        this.f2433 = true;
        this.f2431.clear();
        this.f2432 = null;
        this.f2430 = -1;
    }
}
