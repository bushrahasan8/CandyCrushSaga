package com.king.core;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
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

    private Vibrator getActiveVibrator() {
        Vibrator vibrator;
        Context applicationContext = ActivityHelper.getInstance().getActivity().getApplicationContext();
        Vibrator vibrator2 = null;
        if (applicationContext == null || (vibrator = (Vibrator) applicationContext.getSystemService("vibrator")) == null) {
            return null;
        }
        try {
            if (vibrator.hasVibrator()) {
                vibrator2 = vibrator;
            }
        } catch (NoSuchMethodError e) {
        }
        return vibrator2;
    }

    private boolean hasVibratePermission() {
        Context applicationContext = ActivityHelper.getInstance().getActivity().getApplicationContext();
        boolean z = false;
        if (applicationContext != null) {
            z = false;
            if (applicationContext.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0) {
                z = true;
            }
        }
        return z;
    }

    public void Cancel() {
        Vibrator activeVibrator;
        if (hasVibratePermission() && (activeVibrator = getActiveVibrator()) != null) {
            activeVibrator.cancel();
        }
    }

    public void VibrateOneShot(int i, float f) {
        Vibrator activeVibrator;
        VibrationEffect createOneShot;
        if (hasVibratePermission() && (activeVibrator = getActiveVibrator()) != null) {
            if (Build.VERSION.SDK_INT < 26) {
                activeVibrator.vibrate(f * 1000);
            } else {
                createOneShot = VibrationEffect.createOneShot(f * 1000, (int) (i != 0 ? i != 1 ? i != 2 ? impact_medium[1] : impact_heavy[1] : impact_medium[1] : impact_light[1]));
                activeVibrator.vibrate(createOneShot);
            }
        }
    }

    public boolean hasVibrator() {
        return getActiveVibrator() != null;
    }

    public void vibrate(int i) {
        Vibrator activeVibrator;
        if (hasVibratePermission() && (activeVibrator = getActiveVibrator()) != null) {
            switch (i) {
                case 0:
                    activeVibrator.vibrate(impact_light, -1);
                    return;
                case 1:
                    activeVibrator.vibrate(impact_medium, -1);
                    return;
                case 2:
                    activeVibrator.vibrate(impact_heavy, -1);
                    return;
                case 3:
                    activeVibrator.vibrate(notification_success, -1);
                    return;
                case 4:
                    activeVibrator.vibrate(notification_warning, -1);
                    return;
                case 5:
                    activeVibrator.vibrate(notification_error, -1);
                    return;
                case 6:
                    activeVibrator.vibrate(selection_changed, -1);
                    return;
                default:
                    return;
            }
        }
    }
}
