package com.king.usdk.localnotification;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.annotation.Keep;
import com.king.usdk.logger.Logger;

@Keep
/* loaded from: JobScheduler.class */
public class JobScheduler implements NotificationScheduler {
    private final Context mContext;
    private final Logger mLogger;

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobScheduler(Context context, Logger logger) {
        this.mContext = context;
        this.mLogger = logger;
    }

    private android.app.job.JobScheduler getSchedulerService() {
        return (android.app.job.JobScheduler) this.mContext.getSystemService("jobscheduler");
    }

    private void scheduleJob(int i, long j, PersistableBundle persistableBundle) {
        long currentTimeMillis = System.currentTimeMillis() + j;
        this.mLogger.d(String.format("Scheduling Job: In: %d millis, At: %d, for: %d", Long.valueOf(j), Long.valueOf(System.currentTimeMillis()), Long.valueOf(currentTimeMillis)));
        if (j <= 0) {
            this.mLogger.w("Job " + i + " can't be scheduled. I set up for the past " + (-currentTimeMillis) + " millis.");
            return;
        }
        if (getSchedulerService().schedule(new JobInfo.Builder(i, new ComponentName(this.mContext, JobSchedulerService.class.getName())).setMinimumLatency(j).setExtras(persistableBundle).build()) <= 0) {
            this.mLogger.w("Something went wrong, Couldn't schedule the job " + i);
            return;
        }
        this.mLogger.d("Job " + i + " scheduled for next " + currentTimeMillis + " millis.");
    }

    @Override // com.king.usdk.localnotification.NotificationScheduler
    public void cancelAllNotifications() {
        getSchedulerService().cancelAll();
    }

    @Override // com.king.usdk.localnotification.NotificationScheduler
    public void scheduleLocalNotification(int i, long j, LocalNotification localNotification) {
        PersistableBundle persistableBundle = new PersistableBundle(9);
        persistableBundle.putString("title", localNotification.title);
        persistableBundle.putString(NotificationSchedulerKeys.KEY_MESSAGE, localNotification.message);
        persistableBundle.putString(NotificationSchedulerKeys.KEY_TRACKING_TYPE, localNotification.trackingType);
        persistableBundle.putString(NotificationSchedulerKeys.KEY_TITLE_KEY, localNotification.titleKey);
        persistableBundle.putString(NotificationSchedulerKeys.KEY_MEDIA_PATH, localNotification.mediaPath);
        persistableBundle.putString(NotificationSchedulerKeys.KEY_BACKGROUND_PATH, localNotification.backgroundPath);
        persistableBundle.putInt(NotificationSchedulerKeys.KEY_TEXT_COLOR, localNotification.textColor);
        persistableBundle.putString(NotificationSchedulerKeys.KEY_ACTIVITY_CLASS_NAME, this.mContext.getClass().getName());
        persistableBundle.putInt("id", i);
        scheduleJob(i, j, persistableBundle);
    }
}
