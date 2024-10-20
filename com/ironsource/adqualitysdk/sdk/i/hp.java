package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: hp.class */
public class hp extends hq {

    /* renamed from: ﱡ, reason: contains not printable characters */
    private List f2415 = new ArrayList();

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f2416;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private int f2417;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Class f2418;

    /* loaded from: hp$b.class */
    public static final class b extends hq.b implements cn {
        private static int $10 = 0;
        private static int $11 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2419 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2420 = 1;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2421;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private hp f2422 = new hp();

        static {
            m5161();
            ExpandableListView.getPackedPositionForChild(0, 0);
            TextUtils.getOffsetBefore("", 0);
            View.MeasureSpec.makeMeasureSpec(0, 0);
            TextUtils.indexOf("", "", 0, 0);
            TextUtils.indexOf("", "");
            PointF.length(0.0f, 0.0f);
            ViewConfiguration.getScrollBarFadeDuration();
            TextUtils.getOffsetBefore("", 0);
            TypedValue.complexToFraction(0, 0.0f, 0.0f);
            TypedValue.complexToFloat(0);
            TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            MotionEvent.axisFromString("");
            int i = f2420 + 121;
            f2419 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x027d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0280  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, int r8, boolean r9, int r10, java.lang.String r11, java.lang.Object[] r12) {
            /*
                Method dump skipped, instructions count: 661
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hp.b.a(int, int, boolean, int, java.lang.String, java.lang.Object[]):void");
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private b m5154(boolean z, int i) {
            int i2 = (f2419 + 97) % 128;
            f2420 = i2;
            hp hpVar = this.f2422;
            hpVar.f2424 = z;
            hpVar.f2423 = i;
            f2419 = (i2 + 15) % 128;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private b m5155(int i) {
            f2419 = (f2420 + 125) % 128;
            this.f2422.f2417 = i;
            f2420 = (f2419 + 15) % 128;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private b m5156(boolean z) {
            int i = f2419 + 57;
            f2420 = i % 128;
            if (i % 2 != 0) {
                this.f2422.f2416 = z;
                return this;
            }
            this.f2422.f2416 = z;
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x014e, code lost:
        
            if (r0.equals(((java.lang.String) r0[0]).intern()) != false) goto L37;
         */
        /* renamed from: ﾇ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object m5157(java.lang.Object[] r7) {
            /*
                Method dump skipped, instructions count: 1125
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hp.b.m5157(java.lang.Object[]):java.lang.Object");
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ Object m5158(Object[] objArr, int i, int i2, int i3) {
            int i4 = i ^ (-1);
            return ((((i * (-623)) + (i2 * (-623))) + (i4 * (-624))) + ((i4 | i2) * 624)) + ((i | i2) * 624) != 1 ? m5160(objArr) : m5157(objArr);
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private b m5159(Class cls) {
            f2420 = (f2419 + 65) % 128;
            this.f2422.f2415.add(cls);
            f2419 = (f2420 + 61) % 128;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static /* synthetic */ Object m5160(Object[] objArr) {
            b bVar = (b) objArr[0];
            f2419 = (f2420 + 87) % 128;
            bVar.f2422.mo5152();
            int i = f2420 + 91;
            f2419 = i % 128;
            if (i % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        static void m5161() {
            f2421 = 287397459;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cn
        /* renamed from: ﻐ */
        public final Object mo3719(String str, List<Object> list, cp cpVar) {
            return m5158(new Object[]{this, str, list, cpVar}, -151207880, 151207881, ((Integer) System.class.getMethod("identityHashCode", Object.class).invoke(null, this)).intValue());
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final b m5162(int i) {
            int i2 = f2420;
            f2419 = (i2 + 121) % 128;
            hp hpVar = this.f2422;
            hpVar.f2426 = i | hpVar.f2426;
            f2419 = (i2 + 121) % 128;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final b m5163(Class cls) {
            f2419 = (f2420 + 105) % 128;
            this.f2422.f2418 = cls;
            f2420 = (f2419 + 55) % 128;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final hp m5164() {
            int i = f2420 + 85;
            f2419 = i % 128;
            if (i % 2 == 0) {
                return this.f2422;
            }
            hp hpVar = this.f2422;
            throw new ArithmeticException("divide by zero");
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final b m5165(int i) {
            int i2 = f2419;
            f2420 = (i2 + 75) % 128;
            hp hpVar = this.f2422;
            hpVar.f2425 = i | hpVar.f2425;
            f2420 = (i2 + 83) % 128;
            return this;
        }
    }

    public hp() {
        super.mo5152();
        this.f2418 = null;
        this.f2417 = 0;
        this.f2416 = true;
        this.f2415.clear();
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m5147() {
        return this.f2416;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final int m5148() {
        return this.f2417;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Class m5149() {
        return this.f2418;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final List<Class> m5150() {
        return this.f2415;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5151(Class cls) {
        this.f2418 = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.adqualitysdk.sdk.i.hq
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5152() {
        super.mo5152();
        this.f2418 = null;
        this.f2417 = 0;
        this.f2416 = true;
        this.f2415.clear();
    }
}
