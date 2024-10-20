package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: SchedulingConfigModule.class */
public abstract class SchedulingConfigModule {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static SchedulerConfig config(Clock clock) {
        return SchedulerConfig.getDefault(clock);
    }
}
