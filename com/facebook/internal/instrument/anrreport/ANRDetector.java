package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ANRDetector.class */
public final class ANRDetector {
    public static final ANRDetector INSTANCE = new ANRDetector();
    private static final int myUid = Process.myUid();
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    private static String previousStackTrace = "";
    private static final Runnable anrDetectorRunnable = new Runnable() { // from class: com.facebook.internal.instrument.anrreport.ANRDetector$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            ANRDetector.anrDetectorRunnable$lambda$0();
        }
    };

    private ANRDetector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void anrDetectorRunnable$lambda$0() {
        try {
            Object systemService = FacebookSdk.getApplicationContext().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            checkProcessError((ActivityManager) systemService);
        } catch (Exception e) {
        }
    }

    public static final void checkProcessError(ActivityManager activityManager) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return;
        }
        for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
            if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                Thread thread = Looper.getMainLooper().getThread();
                Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                String stackTrace = InstrumentUtility.getStackTrace(thread);
                if (!Intrinsics.areEqual(stackTrace, previousStackTrace) && InstrumentUtility.isSDKRelatedThread(thread)) {
                    previousStackTrace = stackTrace;
                    InstrumentData.Builder.build(processErrorStateInfo.shortMsg, stackTrace).save();
                }
            }
        }
    }

    public static final void start() {
        scheduledExecutorService.scheduleAtFixedRate(anrDetectorRunnable, 0L, 500L, TimeUnit.MILLISECONDS);
    }
}
