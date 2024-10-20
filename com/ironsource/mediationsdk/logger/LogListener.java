package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: LogListener.class */
public interface LogListener {
    void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i);
}
