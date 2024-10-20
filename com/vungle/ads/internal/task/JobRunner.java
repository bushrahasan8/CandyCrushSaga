package com.vungle.ads.internal.task;

/* loaded from: JobRunner.class */
public interface JobRunner {
    void cancelPendingJob(String str);

    void execute(JobInfo jobInfo);
}
