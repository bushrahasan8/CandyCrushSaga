package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: IronSourceLoggerManager.class */
public class IronSourceLoggerManager extends IronSourceLogger implements LogListener {
    private static IronSourceLoggerManager d;
    private ArrayList c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.c = new ArrayList();
        c();
    }

    private IronSourceLogger a(String str) {
        IronSourceLogger ironSourceLogger;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                ironSourceLogger = null;
                break;
            }
            IronSourceLogger ironSourceLogger2 = (IronSourceLogger) it.next();
            if (ironSourceLogger2.b().equals(str)) {
                ironSourceLogger = ironSourceLogger2;
                break;
            }
        }
        return ironSourceLogger;
    }

    private void c() {
        this.c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            try {
                if (d == null) {
                    d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                }
                ironSourceLoggerManager = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ironSourceLoggerManager;
    }

    public static IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager ironSourceLoggerManager;
        synchronized (IronSourceLoggerManager.class) {
            try {
                IronSourceLoggerManager ironSourceLoggerManager2 = d;
                if (ironSourceLoggerManager2 == null) {
                    d = new IronSourceLoggerManager(IronSourceLoggerManager.class.getSimpleName());
                } else {
                    ironSourceLoggerManager2.a = i;
                }
                ironSourceLoggerManager = d;
            } finally {
            }
        }
        return ironSourceLoggerManager;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        synchronized (this) {
            if (i < this.a) {
                return;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                IronSourceLogger ironSourceLogger = (IronSourceLogger) it.next();
                if (ironSourceLogger.a() <= i) {
                    ironSourceLogger.log(ironSourceTag, str, i);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        synchronized (this) {
            if (th == null) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((IronSourceLogger) it.next()).log(ironSourceTag, str, 3);
                }
            } else {
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    ((IronSourceLogger) it2.next()).logException(ironSourceTag, str, th);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.logger.LogListener
    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        synchronized (this) {
            log(ironSourceTag, str, i);
        }
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger a = a(str);
        if (a == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i < 0 || i > 3) {
            this.c.remove(a);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        a.setDebugLevel(i);
    }
}
