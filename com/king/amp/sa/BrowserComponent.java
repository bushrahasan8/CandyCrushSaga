package com.king.amp.sa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.drive.DriveFile;

@Keep
/* loaded from: BrowserComponent.class */
public class BrowserComponent {
    private static String TAG = "AdsBrowserComponent";
    private static Context sContext;
    private static BrowserComponent sInstance;
    private long mComponentAddress;

    public static BrowserComponent getInstance() {
        BrowserComponent browserComponent;
        synchronized (BrowserComponent.class) {
            try {
                if (sInstance == null) {
                    sInstance = new BrowserComponent();
                }
                browserComponent = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return browserComponent;
    }

    public static Intent getStartIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BrowserComponentActivity.class);
        intent.putExtra("url", str);
        return intent;
    }

    private static native void onAppeared(long j);

    private static native void onDismissed(long j);

    private static native void onError(long j, String str);

    public static void openUrl(long j, String str) {
        if (sContext == null) {
            Log.e(TAG, "context is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.i(TAG, "Url is invalid");
            return;
        }
        getInstance();
        sInstance.mComponentAddress = j;
        if (!AbmMediaPlayer.isActivityRunningInForeground(sContext, AbmMediaPlayerActivity.class)) {
            Intent startIntent = getStartIntent(sContext, str);
            startIntent.setFlags(DriveFile.MODE_READ_ONLY);
            sContext.getApplicationContext().startActivity(startIntent);
        } else {
            Log.i(TAG, "Player activity is running");
            Intent intent = new Intent();
            intent.setAction("com.king.amp.sa.UPDATE_PLAYER_ACTIVITY");
            intent.putExtra(AbmMediaPlayer.OPEN_URL, str);
            LocalBroadcastManager.getInstance(sContext).sendBroadcast(intent);
        }
    }

    public static void setContext(Activity activity) {
        sContext = activity.getApplicationContext();
    }

    public void browserAppeared() {
        onAppeared(this.mComponentAddress);
    }

    public void browserDismissed() {
        onDismissed(this.mComponentAddress);
        sContext = null;
        sInstance = null;
    }

    public void browserError(String str) {
        onError(this.mComponentAddress, str);
    }
}
