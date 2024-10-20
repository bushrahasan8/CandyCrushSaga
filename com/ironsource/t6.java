package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.q6;

/* loaded from: t6.class */
public class t6 extends q6.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* loaded from: t6$a.class */
    class a implements Runnable {
        final String a;
        final ISDemandOnlyRewardedVideoListener b;
        final t6 c;

        a(t6 t6Var, String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.c = t6Var;
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onRewardedVideoAdLoadSuccess()");
            this.b.onRewardedVideoAdLoadSuccess(this.a);
        }
    }

    /* loaded from: t6$b.class */
    class b implements Runnable {
        final String a;
        final IronSourceError b;
        final ISDemandOnlyRewardedVideoListener c;
        final t6 d;

        b(t6 t6Var, String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.d = t6Var;
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.a(this.a, "onRewardedVideoAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdLoadFailed(this.a, this.b);
        }
    }

    /* loaded from: t6$c.class */
    class c implements Runnable {
        final String a;
        final ISDemandOnlyRewardedVideoListener b;
        final t6 c;

        c(t6 t6Var, String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.c = t6Var;
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onRewardedVideoAdOpened()");
            this.b.onRewardedVideoAdOpened(this.a);
        }
    }

    /* loaded from: t6$d.class */
    class d implements Runnable {
        final String a;
        final IronSourceError b;
        final ISDemandOnlyRewardedVideoListener c;
        final t6 d;

        d(t6 t6Var, String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.d = t6Var;
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.a(this.a, "onRewardedVideoAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onRewardedVideoAdShowFailed(this.a, this.b);
        }
    }

    /* loaded from: t6$e.class */
    class e implements Runnable {
        final String a;
        final ISDemandOnlyRewardedVideoListener b;
        final t6 c;

        e(t6 t6Var, String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.c = t6Var;
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onRewardedVideoAdClicked()");
            this.b.onRewardedVideoAdClicked(this.a);
        }
    }

    /* loaded from: t6$f.class */
    class f implements Runnable {
        final String a;
        final ISDemandOnlyRewardedVideoListener b;
        final t6 c;

        f(t6 t6Var, String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.c = t6Var;
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onRewardedVideoAdRewarded()");
            this.b.onRewardedVideoAdRewarded(this.a);
        }
    }

    /* loaded from: t6$g.class */
    class g implements Runnable {
        final String a;
        final ISDemandOnlyRewardedVideoListener b;
        final t6 c;

        g(t6 t6Var, String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.c = t6Var;
            this.a = str;
            this.b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c.a(this.a, "onRewardedVideoAdClosed()");
            this.b.onRewardedVideoAdClosed(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        a(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new e(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new g(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new b(this, str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new a(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new c(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new f(this, str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener a2 = a();
        a(new d(this, str, ironSourceError, a2), a2 != null);
    }
}
