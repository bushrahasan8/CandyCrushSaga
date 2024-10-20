package com.ironsource;

import com.ironsource.d0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: e0.class */
public class e0 {
    private final d0 a;
    private final y9 b;
    private final u9 c = b();
    private Timer d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: e0$a.class */
    public class a implements Runnable {
        final e0 a;

        a(e0 e0Var) {
            this.a = e0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: e0$b.class */
    public class b extends TimerTask {
        final e0 a;

        b(e0 e0Var) {
            this.a = e0Var;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.b.a();
        }
    }

    public e0(d0 d0Var, y9 y9Var) {
        this.a = d0Var;
        this.b = y9Var;
    }

    private void a(long j) {
        this.c.a(j);
    }

    private u9 b() {
        return new u9(new a(this), com.ironsource.lifecycle.b.d(), new qd());
    }

    private void b(long j) {
        h();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(this), j);
    }

    private void g() {
        this.c.b();
    }

    private void h() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    public void a() {
        if (this.a.a() == d0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            g();
        }
    }

    public void c() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.a.c());
        }
    }

    public void d() {
        if (this.a.a() == d0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.a.d());
        }
    }

    public void e() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void f() {
        if (this.a.a() == d0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            IronLog.INTERNAL.verbose();
            b(this.a.d());
        }
    }

    public void i() {
        if (this.a.a() != d0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.a.b());
    }
}
