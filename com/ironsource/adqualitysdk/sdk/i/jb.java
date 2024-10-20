package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashMap;

/* loaded from: jb.class */
public final class jb {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f2728 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2729 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2730 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f2731;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static jb f2732;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private ji f2733;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2734;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2736;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private HashMap f2735 = new HashMap();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2737 = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jb$1, reason: invalid class name */
    /* loaded from: jb$1.class */
    public final class AnonymousClass1 extends is {

        /* renamed from: ﻛ, reason: contains not printable characters */
        final jb f2738;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.jb$1$2, reason: invalid class name */
        /* loaded from: jb$1$2.class */
        final class AnonymousClass2 extends ji {

            /* renamed from: ｋ, reason: contains not printable characters */
            final AnonymousClass1 f2739;

            AnonymousClass2(AnonymousClass1 anonymousClass1) {
                this.f2739 = anonymousClass1;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ji, com.ironsource.adqualitysdk.sdk.i.jj
            public final void dG_(Activity activity) {
                ad.m3024(new is(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.1.2.4

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private AnonymousClass2 f2740;

                    {
                        this.f2740 = this;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.is
                    /* renamed from: ﻐ */
                    public final void mo3016() {
                        jb.m5468(this.f2740.f2739.f2738);
                    }
                });
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ji, com.ironsource.adqualitysdk.sdk.i.jj
            public final void dH_(Activity activity) {
                ad.m3024(new is(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.1.2.5

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private AnonymousClass2 f2741;

                    {
                        this.f2741 = this;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.is
                    /* renamed from: ﻐ */
                    public final void mo3016() {
                        jb.m5466(this.f2741.f2739.f2738);
                    }
                });
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.jb$1$5, reason: invalid class name */
        /* loaded from: jb$1$5.class */
        final class AnonymousClass5 extends is {

            /* renamed from: ﻛ, reason: contains not printable characters */
            final AnonymousClass1 f2742;

            AnonymousClass5(AnonymousClass1 anonymousClass1) {
                this.f2742 = anonymousClass1;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* renamed from: ﻐ */
            public final void mo3016() {
                jh.m5535().m5538(jb.m5461(this.f2742.f2738));
                ad.m3024(new is(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.1.5.1

                    /* renamed from: ﾇ, reason: contains not printable characters */
                    private AnonymousClass5 f2743;

                    {
                        this.f2743 = this;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.is
                    /* renamed from: ﻐ */
                    public final void mo3016() {
                        jb.m5466(this.f2743.f2742.f2738);
                    }
                });
            }
        }

        AnonymousClass1(jb jbVar) {
            this.f2738 = jbVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.is
        /* renamed from: ﻐ */
        public final void mo3016() {
            if (jb.m5461(this.f2738) == null) {
                jb.m5462(this.f2738, new AnonymousClass2(this));
                ((Handler) jb.m5465(new Object[]{this.f2738}, -485448915, 485448916, (int) System.currentTimeMillis())).post(new AnonymousClass5(this));
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jb$2, reason: invalid class name */
    /* loaded from: jb$2.class */
    final class AnonymousClass2 extends is {

        /* renamed from: ﻐ, reason: contains not printable characters */
        final ip f2744;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private jb f2745;

        AnonymousClass2(jb jbVar, ip ipVar) {
            this.f2745 = jbVar;
            this.f2744 = ipVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.is
        /* renamed from: ﻐ */
        public final void mo3016() {
            jb.m5471(this.f2745).put(this.f2744, new is(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.2.3

                /* renamed from: ﻛ, reason: contains not printable characters */
                private AnonymousClass2 f2746;

                {
                    this.f2746 = this;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.is
                /* renamed from: ﻐ */
                public final void mo3016() {
                    this.f2746.f2744.mo4648();
                }
            });
            jb.m5466(this.f2745);
        }
    }

    static {
        m5472();
        View.MeasureSpec.getMode(0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getTapTimeout();
        f2729 = (f2730 + 111) % 128;
    }

    private jb() {
    }

    static /* synthetic */ Choreographer.FrameCallback cX_(jb jbVar) {
        int i = f2730 + 59;
        int i2 = i % 128;
        f2729 = i2;
        Choreographer.FrameCallback frameCallback = jbVar.f2734;
        if (i % 2 != 0) {
            throw null;
        }
        f2730 = (i2 + 101) % 128;
        return frameCallback;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    static /* synthetic */ boolean m5458(jb jbVar) {
        int i = f2729 + 3;
        f2730 = i % 128;
        boolean z = jbVar.f2736;
        if (i % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return z;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private HashMap m5459() {
        HashMap hashMap = new HashMap(this.f2735);
        f2729 = (f2730 + 1) % 128;
        return hashMap;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    static /* synthetic */ boolean m5460(jb jbVar) {
        int i = f2730 + 73;
        int i2 = i % 128;
        f2729 = i2;
        boolean z = i % 2 != 0;
        jbVar.f2736 = z;
        int i3 = i2 + 85;
        f2730 = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ji m5461(jb jbVar) {
        int i = (f2730 + 47) % 128;
        f2729 = i;
        ji jiVar = jbVar.f2733;
        int i2 = i + 71;
        f2730 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return jiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ ji m5462(jb jbVar, ji jiVar) {
        int i = f2730;
        int i2 = i + 55;
        f2729 = i2 % 128;
        jbVar.f2733 = jiVar;
        if (i2 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        int i3 = i + 43;
        f2729 = i3 % 128;
        if (i3 % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        return jiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m5463() {
        if (!this.f2736) {
            f2729 = (f2730 + 43) % 128;
            if (!m5459().isEmpty()) {
                this.f2736 = true;
                ad.m3024(new is(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.3

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private jb f2747;

                    {
                        this.f2747 = this;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.is
                    /* renamed from: ﻐ */
                    public final void mo3016() {
                        if (!jb.m5458(this.f2747)) {
                            return;
                        }
                        HashMap hashMap = (HashMap) jb.m5465(new Object[]{this.f2747}, 462751615, -462751615, (int) System.currentTimeMillis());
                        for (ip ipVar : hashMap.keySet()) {
                            ((Handler) jb.m5465(new Object[]{this.f2747}, -485448915, 485448916, (int) System.currentTimeMillis())).post((Runnable) hashMap.get(ipVar));
                        }
                        if (jb.cX_(this.f2747) == null) {
                        }
                        Choreographer.getInstance().postFrameCallback(jb.cX_(this.f2747));
                    }
                });
                return;
            }
        }
        f2730 = (f2729 + 119) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static jb m5464() {
        jb jbVar;
        synchronized (jb.class) {
            try {
                f2730 = (f2729 + 125) % 128;
                if (f2732 == null) {
                    f2732 = new jb();
                }
                jbVar = f2732;
                f2730 = (f2729 + 71) % 128;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jbVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5465(Object[] objArr, int i, int i2, int i3) {
        Object m5467;
        int i4 = ((i ^ (-1)) | (i2 ^ (-1))) ^ (-1);
        int i5 = i | i2;
        int i6 = (i * (-755)) + (i2 * (-755)) + (i4 * 1512) + ((((i5 | i3) ^ (-1)) | i4) * (-756)) + ((i5 | (i3 ^ (-1))) * 756);
        if (i6 == 1) {
            m5467 = m5467(objArr);
        } else if (i6 != 2) {
            m5467 = m5470(objArr);
        } else {
            jb jbVar = (jb) objArr[0];
            Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) objArr[1];
            int i7 = f2730;
            f2729 = (i7 + 85) % 128;
            jbVar.f2734 = frameCallback;
            f2729 = (i7 + 65) % 128;
            m5467 = frameCallback;
        }
        return m5467;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ void m5466(jb jbVar) {
        int i = f2730 + 23;
        f2729 = i % 128;
        jbVar.m5463();
        if (i % 2 != 0) {
            throw null;
        }
        f2729 = (f2730 + 117) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static /* synthetic */ Object m5467(Object[] objArr) {
        jb jbVar = (jb) objArr[0];
        int i = f2730 + 31;
        int i2 = i % 128;
        f2729 = i2;
        Handler handler = jbVar.f2737;
        if (i % 2 != 0) {
            throw new ArithmeticException("divide by zero");
        }
        f2730 = (i2 + 91) % 128;
        return handler;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ void m5468(jb jbVar) {
        f2730 = (f2729 + 11) % 128;
        jbVar.m5469();
        f2729 = (f2730 + 57) % 128;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m5469() {
        ad.m3024(new is(this) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.5

            /* renamed from: ﾇ, reason: contains not printable characters */
            private jb f2752;

            {
                this.f2752 = this;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* renamed from: ﻐ */
            public final void mo3016() {
                jb.m5460(this.f2752);
            }
        });
        int i = f2730 + 81;
        f2729 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static /* synthetic */ Object m5470(Object[] objArr) {
        jb jbVar = (jb) objArr[0];
        f2730 = (f2729 + 77) % 128;
        HashMap m5459 = jbVar.m5459();
        int i = f2730 + 113;
        f2729 = i % 128;
        if (i % 2 == 0) {
            return m5459;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ HashMap m5471(jb jbVar) {
        int i = f2729;
        f2730 = (i + 25) % 128;
        HashMap hashMap = jbVar.f2735;
        f2730 = (i + 99) % 128;
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m5472() {
        f2731 = new char[]{3437, 61813, 62755, 63953, 64903, 57785, 58462, 59453, 60627, 53388, 54449, 56151, 57127, 50126, 51092, 52146, 52852, 45612, 46798, 47792, 48819, 48503, 41278, 42454, 43393, 44468};
        f2728 = -8277253872732278503L;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5473(ip ipVar) {
        ad.m3024(new AnonymousClass2(this, ipVar));
        f2730 = (f2729 + 1) % 128;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5474() {
        synchronized (this) {
            ad.m3024(new AnonymousClass1(this));
            f2730 = (f2729 + 87) % 128;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5475(ip ipVar) {
        ad.m3024(new is(this, ipVar) { // from class: com.ironsource.adqualitysdk.sdk.i.jb.4

            /* renamed from: ﻐ, reason: contains not printable characters */
            private ip f2750;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private jb f2751;

            {
                this.f2751 = this;
                this.f2750 = ipVar;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.is
            /* renamed from: ﻐ */
            public final void mo3016() {
                jb.m5471(this.f2751).remove(this.f2750);
            }
        });
        int i = f2730 + 3;
        f2729 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
