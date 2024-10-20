package com.google.android.datatransport.runtime.time;

/* loaded from: TimeModule.class */
public abstract class TimeModule {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Clock eventClock() {
        return new WallTimeClock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Clock uptimeClock() {
        return new UptimeClock();
    }
}
