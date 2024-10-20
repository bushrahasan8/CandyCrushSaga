package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.q6;

/* loaded from: r6.class */
public class r6 extends q6.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* loaded from: r6$a.class */
    class a implements Runnable {
        final String a;
        final ISDemandOnlyInterstitialListener b;
        final r6 c;

        a(r6 r6Var, String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.c = r6Var;
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.a);
        }
    }

    /* loaded from: r6$b.class */
    class b implements Runnable {
        final String a;
        final IronSourceError b;
        final ISDemandOnlyInterstitialListener c;
        final r6 d;

        b(r6 r6Var, String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.d = r6Var;
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.a(this.a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.a, this.b);
        }
    }

    /* loaded from: r6$c.class */
    class c implements Runnable {
        final String a;
        final ISDemandOnlyInterstitialListener b;
        final r6 c;

        c(r6 r6Var, String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.c = r6Var;
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.a);
        }
    }

    /* loaded from: r6$d.class */
    class d implements Runnable {
        final String a;
        final IronSourceError b;
        final ISDemandOnlyInterstitialListener c;
        final r6 d;

        d(r6 r6Var, String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.d = r6Var;
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.a(this.a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.a, this.b);
        }
    }

    /* loaded from: r6$e.class */
    class e implements Runnable {
        final String a;
        final ISDemandOnlyInterstitialListener b;
        final r6 c;

        e(r6 r6Var, String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.c = r6Var;
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.a);
        }
    }

    /* loaded from: r6$f.class */
    class f implements Runnable {
        final String a;
        final ISDemandOnlyInterstitialListener b;
        final r6 c;

        f(r6 r6Var, String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.c = r6Var;
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r6() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r6(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        a(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new e(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new f(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new b(this, str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new c(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new a(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new d(this, str, ironSourceError, a2), a2 != null);
    }
}
