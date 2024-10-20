package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: k1.class */
public class k1 extends a2 {
    private static final k1 e = new k1();
    private BannerListener b = null;
    private LevelPlayBannerListener c = null;
    private LevelPlayBannerListener d = null;

    /* loaded from: k1$a.class */
    class a implements Runnable {
        final AdInfo a;
        final k1 b;

        a(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdScreenDismissed(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$b.class */
    class b implements Runnable {
        final k1 a;

        b(k1 k1Var) {
            this.a = k1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onBannerAdScreenDismissed();
                IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
            }
        }
    }

    /* loaded from: k1$c.class */
    class c implements Runnable {
        final AdInfo a;
        final k1 b;

        c(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdScreenDismissed(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$d.class */
    class d implements Runnable {
        final AdInfo a;
        final k1 b;

        d(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdLeftApplication(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$e.class */
    class e implements Runnable {
        final k1 a;

        e(k1 k1Var) {
            this.a = k1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onBannerAdLeftApplication();
                IronLog.CALLBACK.info("onBannerAdLeftApplication()");
            }
        }
    }

    /* loaded from: k1$f.class */
    class f implements Runnable {
        final AdInfo a;
        final k1 b;

        f(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdLeftApplication(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$g.class */
    class g implements Runnable {
        final AdInfo a;
        final k1 b;

        g(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdClicked(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$h.class */
    class h implements Runnable {
        final k1 a;

        h(k1 k1Var) {
            this.a = k1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onBannerAdClicked();
                IronLog.CALLBACK.info("onBannerAdClicked()");
            }
        }
    }

    /* loaded from: k1$i.class */
    class i implements Runnable {
        final AdInfo a;
        final k1 b;

        i(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdClicked(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$j.class */
    class j implements Runnable {
        final AdInfo a;
        final k1 b;

        j(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdLoaded(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$k.class */
    class k implements Runnable {
        final k1 a;

        k(k1 k1Var) {
            this.a = k1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onBannerAdLoaded();
                IronLog.CALLBACK.info("onBannerAdLoaded()");
            }
        }
    }

    /* loaded from: k1$l.class */
    class l implements Runnable {
        final AdInfo a;
        final k1 b;

        l(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdLoaded(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$m.class */
    class m implements Runnable {
        final IronSourceError a;
        final k1 b;

        m(k1 k1Var, IronSourceError ironSourceError) {
            this.b = k1Var;
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* loaded from: k1$n.class */
    class n implements Runnable {
        final IronSourceError a;
        final k1 b;

        n(k1 k1Var, IronSourceError ironSourceError) {
            this.b = k1Var;
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.b != null) {
                this.b.b.onBannerAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onBannerAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* loaded from: k1$o.class */
    class o implements Runnable {
        final IronSourceError a;
        final k1 b;

        o(k1 k1Var, IronSourceError ironSourceError) {
            this.b = k1Var;
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdLoadFailed(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* loaded from: k1$p.class */
    class p implements Runnable {
        final AdInfo a;
        final k1 b;

        p(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdScreenPresented(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: k1$q.class */
    class q implements Runnable {
        final k1 a;

        q(k1 k1Var) {
            this.a = k1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onBannerAdScreenPresented();
                IronLog.CALLBACK.info("onBannerAdScreenPresented()");
            }
        }
    }

    /* loaded from: k1$r.class */
    class r implements Runnable {
        final AdInfo a;
        final k1 b;

        r(k1 k1Var, AdInfo adInfo) {
            this.b = k1Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdScreenPresented(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + this.b.a(this.a));
            }
        }
    }

    private k1() {
    }

    public static k1 a() {
        return e;
    }

    public void a(AdInfo adInfo, boolean z) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(this, adInfo));
            return;
        }
        if (this.b != null && !z) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(this, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, boolean z) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(this, ironSourceError));
            return;
        }
        if (this.b != null && !z) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(this, ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(this, ironSourceError));
        }
    }

    public void a(BannerListener bannerListener) {
        this.b = bannerListener;
    }

    public void a(LevelPlayBannerListener levelPlayBannerListener) {
        this.c = levelPlayBannerListener;
    }

    public LevelPlayBannerListener b() {
        return this.c;
    }

    public void b(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(this, adInfo));
        }
    }

    public void b(LevelPlayBannerListener levelPlayBannerListener) {
        this.d = levelPlayBannerListener;
    }

    public BannerListener c() {
        return this.b;
    }

    public void c(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(this, adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(this, adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r(this, adInfo));
        }
    }
}
