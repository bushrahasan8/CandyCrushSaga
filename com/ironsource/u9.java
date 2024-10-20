package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: u9.class */
public class u9 {
    private static final String g = "u9";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final qd c;
    private Timer e;
    private final Object d = new Object();
    private final j9 f = new a(this);

    /* loaded from: u9$a.class */
    class a implements j9 {
        final u9 a;

        a(u9 u9Var) {
            this.a = u9Var;
        }

        @Override // com.ironsource.j9
        public void a() {
        }

        @Override // com.ironsource.j9
        public void b() {
            this.a.c.c(System.currentTimeMillis());
            this.a.c();
        }

        @Override // com.ironsource.j9
        public void c() {
            this.a.c.b(System.currentTimeMillis());
            u9 u9Var = this.a;
            u9Var.b(u9Var.c.a());
        }

        @Override // com.ironsource.j9
        public void d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: u9$b.class */
    public class b extends TimerTask {
        final u9 a;

        b(u9 u9Var) {
            this.a = u9Var;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.a.b(this.a.f);
            this.a.c.b();
            this.a.b.run();
        }
    }

    public u9(Runnable runnable, com.ironsource.lifecycle.b bVar, qd qdVar) {
        this.b = runnable;
        this.a = bVar;
        this.c = qdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(this), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            Timer timer = this.e;
            if (timer != null) {
                timer.cancel();
                this.e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.a.a(this.f);
        this.c.a(j);
        if (this.a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }
}
