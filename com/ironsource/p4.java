package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: p4.class */
public abstract class p4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new h9(i);
        }
        if ("outcome".equals(str)) {
            return new ib(i);
        }
        if (i == 2) {
            return new h9(i);
        }
        if (i == 3) {
            return new ib(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
