package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* loaded from: AutoValue_SchedulerConfig.class */
final class AutoValue_SchedulerConfig extends SchedulerConfig {
    private final Clock clock;
    private final Map values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SchedulerConfig(Clock clock, Map map) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.clock = clock;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.values = map;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.clock.equals(schedulerConfig.getClock()) || !this.values.equals(schedulerConfig.getValues())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    Map getValues() {
        return this.values;
    }

    public int hashCode() {
        return ((this.clock.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.clock + ", values=" + this.values + "}";
    }
}
