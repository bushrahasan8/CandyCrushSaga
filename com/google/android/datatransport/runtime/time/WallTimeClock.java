package com.google.android.datatransport.runtime.time;

/* loaded from: WallTimeClock.class */
public class WallTimeClock implements Clock {
    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return System.currentTimeMillis();
    }
}
