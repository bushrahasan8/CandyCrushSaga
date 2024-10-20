package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: b.class */
public class b extends IronSourceLogger {
    private LogListener c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: b$a.class */
    public class a implements Runnable {
        final String a;
        final IronSourceLogger.IronSourceTag b;
        final int c;
        final b d;

        a(b bVar, String str, IronSourceLogger.IronSourceTag ironSourceTag, int i) {
            this.d = bVar;
            this.a = str;
            this.b = ironSourceTag;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.c == null || this.a == null) {
                return;
            }
            this.d.c.onLog(this.b, this.a, this.c);
        }
    }

    private b() {
        super("publisher");
    }

    public b(LogListener logListener, int i) {
        super("publisher", i);
        this.c = logListener;
        this.d = false;
    }

    public void a(LogListener logListener) {
        this.c = logListener;
    }

    public void a(boolean z) {
        this.d = z;
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        a aVar = new a(this, str, ironSourceTag, i);
        if (this.d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
