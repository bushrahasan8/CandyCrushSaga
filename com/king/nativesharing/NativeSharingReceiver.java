package com.king.nativesharing;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.king.logging.Logging;

/* loaded from: NativeSharingReceiver.class */
public class NativeSharingReceiver extends BroadcastReceiver {
    private static final String TAG = "NativeSharingReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (componentName != null) {
            String packageName = componentName.getPackageName();
            Logging.logInfo(TAG, "Selected package is " + packageName);
            NativeSharing.SharedToNetwork(packageName, intent.getStringExtra(NativeSharing.sFunnelIdKey), intent.getStringExtra(NativeSharing.sExternalIdKey));
        }
    }
}
