package com.king.popupwebview.internal;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.annotation.Keep;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: ActivityWrapper.class */
public final class ActivityWrapper {
    private volatile WeakReference<Activity> weakActivity;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ActivityWrapper(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("invalid null activity");
        }
        this.weakActivity = new WeakReference<>(activity);
    }

    public WebView createWebView() {
        Activity activity = this.weakActivity.get();
        if (activity == null || activity.isDestroyed()) {
            return null;
        }
        return new WebView(activity);
    }

    public View getActivityDecorView() {
        Window window;
        Activity activity = this.weakActivity.get();
        if (activity == null || activity.isDestroyed() || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    public void runOnUIThread(Runnable runnable) {
        Activity activity;
        if (runnable == null || (activity = this.weakActivity.get()) == null) {
            return;
        }
        activity.runOnUiThread(runnable);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.weakActivity = new WeakReference<>(activity);
        }
    }
}
