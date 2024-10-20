package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: f.class */
public abstract class f<T> {
    private Timer a;
    protected long b;
    protected Object c;

    /* loaded from: f$a.class */
    class a extends TimerTask {
        final f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.b();
        }
    }

    public f() {
    }

    public f(long j) {
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Object obj) {
        if (a() || obj == null) {
            return;
        }
        this.c = obj;
        c();
        Timer timer = new Timer();
        this.a = timer;
        timer.schedule(new a(this), this.b);
    }

    protected boolean a() {
        return this.b <= 0;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
            this.a = null;
        }
    }

    public void d() {
        this.c = null;
    }
}
