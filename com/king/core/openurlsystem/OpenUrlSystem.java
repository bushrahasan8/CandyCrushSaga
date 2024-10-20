package com.king.core.openurlsystem;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;

@Keep
/* loaded from: OpenUrlSystem.class */
public class OpenUrlSystem implements ActivityHelper.ActivityLifeCycleListener {
    private static final String TAG = "com.king.core.openurlsystem.OpenUrlSystem";
    private final ActivityHelper activityHelper;

    public OpenUrlSystem() {
        ActivityHelper activityHelper = ActivityHelper.getInstance();
        this.activityHelper = activityHelper;
        activityHelper.addActivityLifeCycleListener(this);
    }

    private void handleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        String str = stringExtra;
        if (stringExtra == null) {
            str = intent.getDataString();
        }
        if (str != null) {
            Logging.logInfo(TAG, "Handling application URL: " + str);
            this.activityHelper.getActivity().runOnUiThread(new Runnable(this, str) { // from class: com.king.core.openurlsystem.OpenUrlSystem.1
                final OpenUrlSystem this$0;
                final String val$url;

                {
                    this.this$0 = this;
                    this.val$url = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Logging.logInfo(OpenUrlSystem.TAG, "Running onURLOpen on UI thread, url " + this.val$url);
                    OpenUrlSystem.onURLOpen(this.val$url);
                }
            });
        }
    }

    public static native void onURLOpen(String str);

    @Override // com.king.core.activityhelper.ActivityHelper.ActivityLifeCycleListener
    public void onCreate(Bundle bundle) {
        handleIntent(this.activityHelper.getActivity().getIntent());
    }

    @Override // com.king.core.activityhelper.ActivityHelper.ActivityLifeCycleListener
    public void onDestroy() {
    }

    @Override // com.king.core.activityhelper.ActivityHelper.ActivityLifeCycleListener
    public void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    @Override // com.king.core.activityhelper.ActivityHelper.ActivityLifeCycleListener
    public void onPause() {
    }

    @Override // com.king.core.activityhelper.ActivityHelper.ActivityLifeCycleListener
    public void onResume() {
    }
}
