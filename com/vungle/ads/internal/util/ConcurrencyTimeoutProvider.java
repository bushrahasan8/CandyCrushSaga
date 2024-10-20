package com.vungle.ads.internal.util;

import java.util.concurrent.TimeUnit;

/* loaded from: ConcurrencyTimeoutProvider.class */
public final class ConcurrencyTimeoutProvider {
    private final long OPERATION_TIMEOUT = TimeUnit.SECONDS.toMillis(4);

    public final long getTimeout() {
        return ThreadUtil.INSTANCE.isMainThread() ? this.OPERATION_TIMEOUT : Long.MAX_VALUE;
    }
}
