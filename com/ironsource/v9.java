package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: v9.class */
public class v9 implements j9 {
    private Timer b;
    private long e;
    private Runnable f;
    private String a = "INTERNAL";
    private boolean c = false;
    private Long d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: v9$a.class */
    public class a extends TimerTask {
        final v9 a;

        a(v9 v9Var) {
            this.a = v9Var;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.f.run();
        }
    }

    public v9(long j, Runnable runnable, boolean z) {
        this.e = j;
        this.f = runnable;
        if (z) {
            g();
        }
    }

    private void f() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
        }
    }

    private void h() {
        if (this.b == null) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(this), this.e);
            Calendar.getInstance().setTimeInMillis(this.d.longValue());
        }
    }

    @Override // com.ironsource.j9
    public void a() {
    }

    @Override // com.ironsource.j9
    public void b() {
        if (this.b != null) {
            f();
        }
    }

    @Override // com.ironsource.j9
    public void c() {
        Long l;
        if (this.b == null && (l = this.d) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.e = longValue;
            if (longValue > 0) {
                h();
            } else {
                e();
                this.f.run();
            }
        }
    }

    @Override // com.ironsource.j9
    public void d() {
    }

    public void e() {
        f();
        this.c = false;
        this.d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.c) {
            return;
        }
        this.c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.d = Long.valueOf(System.currentTimeMillis() + this.e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }
}
