package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* loaded from: v6.class */
public class v6 extends a2 {
    private static final v6 e = new v6();
    private InterstitialListener b = null;
    private LevelPlayInterstitialListener c;
    private LevelPlayInterstitialListener d;

    /* loaded from: v6$a.class */
    class a implements Runnable {
        final AdInfo a;
        final v6 b;

        a(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdClosed(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: v6$b.class */
    class b implements Runnable {
        final v6 a;

        b(v6 v6Var) {
            this.a = v6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onInterstitialAdClosed();
                this.a.a("onInterstitialAdClosed()");
            }
        }
    }

    /* loaded from: v6$c.class */
    class c implements Runnable {
        final AdInfo a;
        final v6 b;

        c(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdClosed(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: v6$d.class */
    class d implements Runnable {
        final AdInfo a;
        final v6 b;

        d(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdShowSucceeded(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: v6$e.class */
    class e implements Runnable {
        final v6 a;

        e(v6 v6Var) {
            this.a = v6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onInterstitialAdShowSucceeded();
                this.a.a("onInterstitialAdShowSucceeded()");
            }
        }
    }

    /* loaded from: v6$f.class */
    class f implements Runnable {
        final AdInfo a;
        final v6 b;

        f(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdShowSucceeded(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: v6$g.class */
    public class g implements Runnable {
        final IronSourceError a;
        final AdInfo b;
        final v6 c;

        g(v6 v6Var, IronSourceError ironSourceError, AdInfo adInfo) {
            this.c = v6Var;
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.d != null) {
                this.c.d.onAdShowFailed(this.a, this.c.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + this.c.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: v6$h.class */
    public class h implements Runnable {
        final IronSourceError a;
        final v6 b;

        h(v6 v6Var, IronSourceError ironSourceError) {
            this.b = v6Var;
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.b != null) {
                this.b.b.onInterstitialAdShowFailed(this.a);
                this.b.a("onInterstitialAdShowFailed() error=" + this.a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: v6$i.class */
    public class i implements Runnable {
        final IronSourceError a;
        final AdInfo b;
        final v6 c;

        i(v6 v6Var, IronSourceError ironSourceError, AdInfo adInfo) {
            this.c = v6Var;
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.c != null) {
                this.c.c.onAdShowFailed(this.a, this.c.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + this.c.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* loaded from: v6$j.class */
    class j implements Runnable {
        final AdInfo a;
        final v6 b;

        j(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
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

    /* loaded from: v6$k.class */
    class k implements Runnable {
        final AdInfo a;
        final v6 b;

        k(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdReady(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: v6$l.class */
    class l implements Runnable {
        final v6 a;

        l(v6 v6Var) {
            this.a = v6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onInterstitialAdClicked();
                this.a.a("onInterstitialAdClicked()");
            }
        }
    }

    /* loaded from: v6$m.class */
    class m implements Runnable {
        final AdInfo a;
        final v6 b;

        m(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
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

    /* loaded from: v6$n.class */
    class n implements Runnable {
        final v6 a;

        n(v6 v6Var) {
            this.a = v6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onInterstitialAdReady();
                this.a.a("onInterstitialAdReady()");
            }
        }
    }

    /* loaded from: v6$o.class */
    class o implements Runnable {
        final AdInfo a;
        final v6 b;

        o(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdReady(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: v6$p.class */
    class p implements Runnable {
        final IronSourceError a;
        final v6 b;

        p(v6 v6Var, IronSourceError ironSourceError) {
            this.b = v6Var;
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

    /* loaded from: v6$q.class */
    class q implements Runnable {
        final IronSourceError a;
        final v6 b;

        q(v6 v6Var, IronSourceError ironSourceError) {
            this.b = v6Var;
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.b != null) {
                this.b.b.onInterstitialAdLoadFailed(this.a);
                this.b.a("onInterstitialAdLoadFailed() error=" + this.a.getErrorMessage());
            }
        }
    }

    /* loaded from: v6$r.class */
    class r implements Runnable {
        final IronSourceError a;
        final v6 b;

        r(v6 v6Var, IronSourceError ironSourceError) {
            this.b = v6Var;
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

    /* loaded from: v6$s.class */
    class s implements Runnable {
        final AdInfo a;
        final v6 b;

        s(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.d != null) {
                this.b.d.onAdOpened(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + this.b.a(this.a));
            }
        }
    }

    /* loaded from: v6$t.class */
    class t implements Runnable {
        final v6 a;

        t(v6 v6Var) {
            this.a = v6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.b != null) {
                this.a.b.onInterstitialAdOpened();
                this.a.a("onInterstitialAdOpened()");
            }
        }
    }

    /* loaded from: v6$u.class */
    class u implements Runnable {
        final AdInfo a;
        final v6 b;

        u(v6 v6Var, AdInfo adInfo) {
            this.b = v6Var;
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b.c != null) {
                this.b.c.onAdOpened(this.b.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + this.b.a(this.a));
            }
        }
    }

    private v6() {
    }

    public static v6 a() {
        v6 v6Var;
        synchronized (v6.class) {
            try {
                v6Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public void a(IronSourceError ironSourceError) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(this, ironSourceError));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new q(this, ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new r(this, ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(this, ironSourceError, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(this, ironSourceError));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(this, ironSourceError, adInfo));
        }
    }

    public void a(InterstitialListener interstitialListener) {
        synchronized (this) {
            this.b = interstitialListener;
        }
    }

    public void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        synchronized (this) {
            this.c = levelPlayInterstitialListener;
        }
    }

    public InterstitialListener b() {
        InterstitialListener interstitialListener;
        synchronized (this) {
            interstitialListener = this.b;
        }
        return interstitialListener;
    }

    public void b(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(this, adInfo));
        }
    }

    public void b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        synchronized (this) {
            this.d = levelPlayInterstitialListener;
        }
    }

    public void c(AdInfo adInfo) {
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

    public void d(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new s(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new t(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new u(this, adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.d != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(this, adInfo));
            return;
        }
        if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(this));
        }
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(this, adInfo));
        }
    }

    public void f(AdInfo adInfo) {
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
}
