package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: fc.class */
public class fc {
    private com.ironsource.mediationsdk.utils.a a;
    private gc b;
    private Timer c = null;

    /* loaded from: fc$a.class */
    class a extends TimerTask {
        final fc a;

        a(fc fcVar) {
            this.a = fcVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.b.a();
        }
    }

    /* loaded from: fc$b.class */
    class b extends TimerTask {
        final fc a;

        b(fc fcVar) {
            this.a = fcVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.b.a();
        }
    }

    public fc(com.ironsource.mediationsdk.utils.a aVar, gc gcVar) {
        this.a = aVar;
        this.b = gcVar;
    }

    private void d() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c = null;
        }
    }

    public void a() {
        synchronized (this) {
            d();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new b(this), this.a.b());
        }
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.b.a();
    }

    public void c() {
        synchronized (this) {
            d();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new a(this), this.a.j());
        }
    }
}
