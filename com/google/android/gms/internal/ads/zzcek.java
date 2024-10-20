package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: zzcek.class */
final class zzcek extends ScheduledThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcek(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
