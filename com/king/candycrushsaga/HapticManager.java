package com.king.candycrushsaga;

import android.content.Context;
import android.os.Vibrator;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: HapticManager.class */
public class HapticManager {
    static final long[] impact_light = {0, 10};
    static final long[] impact_medium = {0, 20};
    static final long[] impact_heavy = {0, 30};
    static final long[] notification_success = {0, 20, 70, 30};
    static final long[] notification_warning = {0, 30, 100, 20};
    static final long[] notification_error = {0, 30, 60, 30, 60, 40, 60, 15};
    static final long[] selection_changed = {0, 10};

    public static void vibrate(int i) {
        Vibrator vibrator;
        long[] jArr;
        Context applicationContext = ActivityHelper.getInstance().getActivity().getApplicationContext();
        if (applicationContext == null || applicationContext.checkCallingOrSelfPermission("android.permission.VIBRATE") != 0 || (vibrator = (Vibrator) applicationContext.getSystemService("vibrator")) == null) {
            return;
        }
        try {
            vibrator.hasVibrator();
            switch (i) {
                case 0:
                    jArr = impact_light;
                    break;
                case 1:
                    jArr = impact_medium;
                    break;
                case 2:
                    jArr = impact_heavy;
                    break;
                case 3:
                    jArr = notification_success;
                    break;
                case 4:
                    jArr = notification_warning;
                    break;
                case 5:
                    jArr = notification_error;
                    break;
                case 6:
                    jArr = selection_changed;
                    break;
                default:
                    return;
            }
            vibrator.vibrate(jArr, -1);
        } catch (NoSuchMethodError e) {
        }
    }
}
