package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.q6;

/* loaded from: j1.class */
public class j1 extends q6.a<ISDemandOnlyBannerListener> {

    /* loaded from: j1$a.class */
    class a implements Runnable {
        final String a;
        final IronSourceError b;
        final ISDemandOnlyBannerListener c;
        final j1 d;

        a(j1 j1Var, String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.d = j1Var;
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.a(this.a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.a, this.b);
        }
    }

    /* loaded from: j1$b.class */
    class b implements Runnable {
        final String a;
        final ISDemandOnlyBannerListener b;
        final j1 c;

        b(j1 j1Var, String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.c = j1Var;
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.a);
        }
    }

    /* loaded from: j1$c.class */
    class c implements Runnable {
        final String a;
        final ISDemandOnlyBannerListener b;
        final j1 c;

        c(j1 j1Var, String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.c = j1Var;
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.a);
        }
    }

    /* loaded from: j1$d.class */
    class d implements Runnable {
        final String a;
        final ISDemandOnlyBannerListener b;
        final j1 c;

        d(j1 j1Var, String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.c = j1Var;
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.a);
        }
    }

    /* loaded from: j1$e.class */
    class e implements Runnable {
        final String a;
        final ISDemandOnlyBannerListener b;
        final j1 c;

        e(j1 j1Var, String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.c = j1Var;
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.a);
        }
    }

    public void a(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new d(this, str, a2), a2 != null);
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener a2 = a();
        a(new a(this, str, ironSourceError, a2), a2 != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new e(this, str, a2), a2 != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new b(this, str, a2), a2 != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new c(this, str, a2), a2 != null);
    }
}
