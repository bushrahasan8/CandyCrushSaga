package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: v4.class */
public class v4 {
    public static final int e = -1;
    private Runnable a = new a(this);
    private int b;
    private m c;
    private v9 d;

    /* loaded from: v4$a.class */
    class a implements Runnable {
        final v4 a;

        a(v4 v4Var) {
            this.a = v4Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            if (this.a.c != null) {
                this.a.c.b();
            }
        }
    }

    public v4(int i, m mVar) {
        this.c = mVar;
        this.b = i;
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }

    public void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.b) - Math.max(j, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.c.b();
                return;
            }
            a();
            this.d = new v9(millis, this.a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public boolean b() {
        return this.b > 0;
    }
}
