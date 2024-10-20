package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: JobRunnerThreadPriorityHelper.class */
public final class JobRunnerThreadPriorityHelper implements ThreadPriorityHelper {
    @Override // com.vungle.ads.internal.task.ThreadPriorityHelper
    public int makeAndroidThreadPriority(JobInfo jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
