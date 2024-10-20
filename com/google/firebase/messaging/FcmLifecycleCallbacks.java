package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: FcmLifecycleCallbacks.class */
public class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final Set seenIntents = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: logNotificationOpen, reason: merged with bridge method [inline-methods] */
    public void lambda$onActivityCreated$0(Intent intent) {
        Bundle bundle;
        try {
            Bundle extras = intent.getExtras();
            bundle = null;
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
            bundle = null;
        }
        if (MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            MessagingAnalytics.logNotificationOpen(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null || !this.seenIntents.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this, intent) { // from class: com.google.firebase.messaging.FcmLifecycleCallbacks$$ExternalSyntheticLambda0
                public final FcmLifecycleCallbacks f$0;
                public final Intent f$1;

                {
                    this.f$0 = this;
                    this.f$1 = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$onActivityCreated$0(this.f$1);
                }
            });
        } else {
            lambda$onActivityCreated$0(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.seenIntents.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
