package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: VungleJobRunner.class */
public final class VungleJobRunner implements JobRunner {
    private final JobCreator creator;
    private final Executor executor;
    private long nextCheck;
    private final List<PendingJob> pendingJobs;
    private final Runnable pendingRunnable;
    private final ThreadPriorityHelper threadPriorityHelper;
    public static final Companion Companion = new Companion(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = VungleJobRunner.class.getSimpleName();

    /* loaded from: VungleJobRunner$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: VungleJobRunner$PendingJob.class */
    public static final class PendingJob {
        private JobInfo info;
        private final long uptimeMillis;

        public PendingJob(long j, JobInfo jobInfo) {
            this.uptimeMillis = j;
            this.info = jobInfo;
        }

        public final JobInfo getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(JobInfo jobInfo) {
            this.info = jobInfo;
        }
    }

    /* loaded from: VungleJobRunner$PendingRunnable.class */
    private static final class PendingRunnable implements Runnable {
        private WeakReference<VungleJobRunner> runner;

        public PendingRunnable(WeakReference<VungleJobRunner> runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }

        public final WeakReference<VungleJobRunner> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }

        public final void setRunner(WeakReference<VungleJobRunner> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    public VungleJobRunner(JobCreator creator, Executor executor, ThreadPriorityHelper threadPriorityHelper) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new PendingRunnable(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executePendingJobs() {
        synchronized (this) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = Long.MAX_VALUE;
            for (PendingJob pendingJob : this.pendingJobs) {
                if (uptimeMillis >= pendingJob.getUptimeMillis()) {
                    this.pendingJobs.remove(pendingJob);
                    JobInfo info = pendingJob.getInfo();
                    if (info != null) {
                        this.executor.execute(new JobRunnable(info, this.creator, this, this.threadPriorityHelper));
                    }
                } else {
                    j = Math.min(j, pendingJob.getUptimeMillis());
                }
            }
            if (j != Long.MAX_VALUE && j != this.nextCheck) {
                Handler handler2 = handler;
                handler2.removeCallbacks(this.pendingRunnable);
                handler2.postAtTime(this.pendingRunnable, TAG, j);
            }
            this.nextCheck = j;
        }
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public void cancelPendingJob(String tag) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            ArrayList arrayList = new ArrayList();
            for (PendingJob pendingJob : this.pendingJobs) {
                JobInfo info = pendingJob.getInfo();
                if (Intrinsics.areEqual(info != null ? info.getJobTag() : null, tag)) {
                    arrayList.add(pendingJob);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        }
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public void execute(JobInfo jobInfo) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
            JobInfo copy = jobInfo.copy();
            if (copy != null) {
                String jobTag = copy.getJobTag();
                long delay = copy.getDelay();
                copy.setDelay(0L);
                if (copy.getUpdateCurrent()) {
                    for (PendingJob pendingJob : this.pendingJobs) {
                        JobInfo info = pendingJob.getInfo();
                        if (Intrinsics.areEqual(info != null ? info.getJobTag() : null, jobTag)) {
                            Log.d(TAG, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(pendingJob);
                        }
                    }
                }
                this.pendingJobs.add(new PendingJob(SystemClock.uptimeMillis() + delay, copy));
                executePendingJobs();
            }
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
