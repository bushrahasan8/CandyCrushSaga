package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* loaded from: SchedulingConfigModule_ConfigFactory.class */
public final class SchedulingConfigModule_ConfigFactory implements Factory {
    private final Provider clockProvider;

    public SchedulingConfigModule_ConfigFactory(Provider provider) {
        this.clockProvider = provider;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(Provider provider) {
        return new SchedulingConfigModule_ConfigFactory(provider);
    }

    @Override // javax.inject.Provider
    public SchedulerConfig get() {
        return config((Clock) this.clockProvider.get());
    }
}
