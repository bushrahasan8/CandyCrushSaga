package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: SchedulerConfig.class */
public abstract class SchedulerConfig {

    /* loaded from: SchedulerConfig$Builder.class */
    public static class Builder {
        private Clock clock;
        private Map values = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.values.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.clock == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.values.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.values;
            this.values = new HashMap();
            return SchedulerConfig.create(this.clock, map);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }
    }

    /* loaded from: SchedulerConfig$ConfigValue.class */
    public static abstract class ConfigValue {

        /* loaded from: SchedulerConfig$ConfigValue$Builder.class */
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j);

            public abstract Builder setFlags(Set set);

            public abstract Builder setMaxAllowedDelay(long j);
        }

        public static Builder builder() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long getDelta();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set getFlags();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long getMaxAllowedDelay();
    }

    /* loaded from: SchedulerConfig$Flag.class */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long adjustedExponentialBackoff(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * r10)));
    }

    public static Builder builder() {
        return new Builder();
    }

    static SchedulerConfig create(Clock clock, Map map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(immutableSetOf(Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    private static Set immutableSetOf(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void populateFlags(JobInfo.Builder builder, Set set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(priority, j, i));
        populateFlags(builder, ((ConfigValue) getValues().get(priority)).getFlags());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Clock getClock();

    public long getScheduleDelay(Priority priority, long j, int i) {
        long time = getClock().getTime();
        ConfigValue configValue = (ConfigValue) getValues().get(priority);
        return Math.min(Math.max(adjustedExponentialBackoff(i, configValue.getDelta()), j - time), configValue.getMaxAllowedDelay());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map getValues();
}
