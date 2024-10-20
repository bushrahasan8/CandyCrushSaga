package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@Deprecated
/* loaded from: StatsUtils.class */
public class StatsUtils {
    @KeepForSdk
    public static String getEventKey(PowerManager.WakeLock wakeLock, String str) {
        long myPid = Process.myPid();
        long identityHashCode = System.identityHashCode(wakeLock);
        String str2 = str;
        if (true == TextUtils.isEmpty(str)) {
            str2 = "";
        }
        return String.valueOf(String.valueOf((myPid << 32) | identityHashCode)).concat(String.valueOf(str2));
    }
}
