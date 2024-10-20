package com.king.core;

import android.app.Activity;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;

@Keep
/* loaded from: AppNotRespondingTaskProcessor.class */
public class AppNotRespondingTaskProcessor {
    private Activity mActivity;
    private volatile Boolean mIsActive = Boolean.TRUE;
    private final long mNativeHandler;

    public AppNotRespondingTaskProcessor(long j) {
        this.mActivity = null;
        this.mNativeHandler = j;
        this.mActivity = ActivityHelper.getInstance().getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleTaskOnUiThread$0() {
        synchronized (this.mIsActive) {
            if (this.mIsActive.booleanValue()) {
                onTaskRunOnUiThread(this.mNativeHandler);
            }
        }
    }

    private native void onTaskRunOnUiThread(long j);

    public void scheduleTaskOnUiThread() {
        this.mActivity.runOnUiThread(new Runnable(this) { // from class: com.king.core.AppNotRespondingTaskProcessor$$ExternalSyntheticLambda0
            public final AppNotRespondingTaskProcessor f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$scheduleTaskOnUiThread$0();
            }
        });
    }

    public void setActive(boolean z) {
        synchronized (this.mIsActive) {
            this.mIsActive = Boolean.valueOf(z);
        }
    }
}
