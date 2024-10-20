package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: BackgroundWorker.class */
public final class BackgroundWorker {
    private final WorkManager workManager;

    public BackgroundWorker(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        WorkManager workManager = WorkManager.getInstance(applicationContext);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(applicationContext)");
        this.workManager = workManager;
    }

    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        Intrinsics.checkNotNullParameter(universalRequestWorkerData, "universalRequestWorkerData");
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…TED)\n            .build()");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        OneTimeWorkRequest build2 = new OneTimeWorkRequest.Builder(ListenableWorker.class).setConstraints(build).setInputData(universalRequestWorkerData.invoke()).build();
        Intrinsics.checkNotNullExpressionValue(build2, "OneTimeWorkRequestBuilde…a())\n            .build()");
        getWorkManager().enqueue(build2);
    }
}
