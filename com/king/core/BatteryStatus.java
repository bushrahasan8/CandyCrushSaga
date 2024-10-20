package com.king.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: BatteryStatus.class */
public class BatteryStatus extends BroadcastReceiver {
    private static final String TAG = "com.king.core.BatteryStatus";
    private Context mContext = ActivityHelper.getInstance().getActivity();
    private boolean mUpdated;

    public BatteryStatus() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        this.mContext.registerReceiver(this, intentFilter);
        this.mUpdated = false;
    }

    private Intent getBatteryIntent() {
        Logging.logInfo(TAG, "getBatteryIntent");
        return this.mContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private float getBatteryLevel(Intent intent) {
        return intent.getIntExtra("level", -1) / intent.getIntExtra("scale", 1);
    }

    private boolean isCharging(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public float getBatteryLevel() {
        return getBatteryLevel(getBatteryIntent());
    }

    public boolean getFlagUpdated() {
        boolean z = this.mUpdated;
        this.mUpdated = false;
        return z;
    }

    public boolean isCharging() {
        return isCharging(getBatteryIntent());
    }

    public void onBatteryStatusNotify(boolean z, float f) {
        this.mUpdated = true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent batteryIntent = getBatteryIntent();
        float batteryLevel = getBatteryLevel(batteryIntent);
        ActivityHelper.getInstance().getActivity().runOnUiThread(new Runnable(this, isCharging(batteryIntent), batteryLevel) { // from class: com.king.core.BatteryStatus.1
            final BatteryStatus this$0;
            final float val$batteryLevel;
            final boolean val$isCharging;

            {
                this.this$0 = this;
                this.val$isCharging = r5;
                this.val$batteryLevel = batteryLevel;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.onBatteryStatusNotify(this.val$isCharging, this.val$batteryLevel);
            }
        });
    }

    public void release() {
        Logging.logInfo(TAG, "unregistering receiver");
        this.mContext.unregisterReceiver(this);
    }
}
