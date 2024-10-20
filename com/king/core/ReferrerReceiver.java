package com.king.core;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;
import java.util.Iterator;

@Keep
/* loaded from: ReferrerReceiver.class */
public class ReferrerReceiver extends BroadcastReceiver {
    private static final String PREFS_FILE_NAME = "ReferrerPrefs";
    private static final String REFERRER_KEY = "referrer";
    private static final String TAG = "GamePlatform:BaseSdk:" + ReferrerReceiver.class.getSimpleName();
    private static volatile String referrer = null;

    public static String getReferrer() {
        if (referrer != null) {
            return referrer;
        }
        if (ActivityHelper.getInstance().getActivity() != null) {
            String str = TAG;
            Logging.logInfo(str, "Loading referrer from shared prefs");
            referrer = ActivityHelper.getInstance().getActivity().getSharedPreferences(PREFS_FILE_NAME, 0).getString(REFERRER_KEY, null);
            Logging.logInfo(str, "Loaded referrer from shared prefs - " + referrer);
        }
        return referrer;
    }

    private static void storeReferrer(Context context, String str) {
        Logging.logInfo(TAG, "Storing referrer in shared prefs - " + str);
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFS_FILE_NAME, 0).edit();
        edit.putString(REFERRER_KEY, str);
        edit.commit();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                referrer = extras.getString(REFERRER_KEY);
                if (referrer != null) {
                    storeReferrer(context, referrer);
                }
            }
        } catch (NullPointerException e) {
            Logging.logInfo(TAG, "Error forwarding referrer:" + e.getMessage());
        }
        Logging.logInfo(TAG, "Referrer is: " + referrer);
        try {
            Bundle bundle = context.getPackageManager().getReceiverInfo(new ComponentName(context, "com.king.core.ReferrerReceiver"), 128).metaData;
            if (bundle != null) {
                Iterator<String> it = bundle.keySet().iterator();
                while (it.hasNext()) {
                    String string = bundle.getString(it.next());
                    ((BroadcastReceiver) Class.forName(string).newInstance()).onReceive(context, intent);
                    Logging.logInfo(TAG, "Forwarding referrer to:" + string);
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Logging.logInfo(TAG, "Error forwarding referrer:" + e2.getMessage());
        } catch (ClassNotFoundException e3) {
            Logging.logInfo(TAG, "Error forwarding referrer:" + e3.getMessage());
        } catch (IllegalAccessException e4) {
            Logging.logInfo(TAG, "Error forwarding referrer:" + e4.getMessage());
        } catch (InstantiationException e5) {
            Logging.logInfo(TAG, "Error forwarding referrer:" + e5.getMessage());
        }
    }
}
