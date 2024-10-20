package com.king.core.activityhelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$;
import androidx.annotation.Keep;
import com.king.logging.Logging;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: ActivityHelper.class */
public class ActivityHelper {
    private static final int CACHE_TIME_OUT = 120;
    private static final String TAG = "ActivityHelper";
    private static final ActivityHelper instance = new ActivityHelper();
    private Activity activity;
    private List<ActivityResultListener> activityResultListeners = new CopyOnWriteArrayList();
    private List<ActivityLifeCycleListener> activityLifeCycleListeners = new CopyOnWriteArrayList();
    private List<ActivityLifeCycleExtrasListener> activityLifeCycleExtrasListeners = new CopyOnWriteArrayList();
    private List<ActivityPermissionListener> activityPermissionListeners = new CopyOnWriteArrayList();
    private Cache newIntentCache = new Cache(120);
    private Cache onCreateCache = new Cache(120);
    private Cache onResumeCache = new Cache(120);
    private Cache onStartCache = new Cache(120);
    private Cache onRestartCache = new Cache(120);

    /* loaded from: ActivityHelper$ActivityLifeCycleExtrasListener.class */
    public interface ActivityLifeCycleExtrasListener {
        void onRestart();

        void onStart();
    }

    /* loaded from: ActivityHelper$ActivityLifeCycleListener.class */
    public interface ActivityLifeCycleListener {
        void onCreate(Bundle bundle);

        void onDestroy();

        void onNewIntent(Intent intent);

        void onPause();

        void onResume();
    }

    /* loaded from: ActivityHelper$ActivityPermissionListener.class */
    public interface ActivityPermissionListener {
    }

    /* loaded from: ActivityHelper$ActivityResultListener.class */
    public interface ActivityResultListener {
        void onActivityResult(int i, int i2, Intent intent);
    }

    /* loaded from: ActivityHelper$Cache.class */
    private static class Cache {
        private List entries = new ArrayList();
        private final long maxCacheAgeNanos;

        public Cache(long j) {
            this.maxCacheAgeNanos = TimeUnit.NANOSECONDS.convert(j, TimeUnit.SECONDS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List getUnseenEntriesAndMarkAsSeen(Object obj) {
            Iterator it = this.entries.iterator();
            while (it.hasNext()) {
                if (System.nanoTime() - ((CacheEntry) it.next()).nanoTimeStamp >= this.maxCacheAgeNanos) {
                    it.remove();
                }
            }
            int hashCode = obj.hashCode();
            ArrayList arrayList = new ArrayList();
            for (CacheEntry cacheEntry : this.entries) {
                if (!cacheEntry.isSeenBy(hashCode)) {
                    cacheEntry.markAsSeenBy(hashCode);
                    arrayList.add(cacheEntry.item);
                }
            }
            return arrayList;
        }

        public void add(Object obj) {
            if (obj != null) {
                this.entries.add(new CacheEntry(obj, System.nanoTime()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: ActivityHelper$CacheEntry.class */
    public static class CacheEntry {
        private final Object item;
        private final long nanoTimeStamp;
        private ArrayList seenBy = new ArrayList();

        public CacheEntry(Object obj, long j) {
            this.item = obj;
            this.nanoTimeStamp = j;
        }

        public boolean isSeenBy(int i) {
            return this.seenBy.contains(Integer.valueOf(i));
        }

        public void markAsSeenBy(int i) {
            this.seenBy.add(Integer.valueOf(i));
        }
    }

    private ActivityHelper() {
    }

    public static ActivityHelper getInstance() {
        return instance;
    }

    public void addActivityLifeCycleExtrasListener(ActivityLifeCycleExtrasListener activityLifeCycleExtrasListener) {
        this.activityLifeCycleExtrasListeners.add(activityLifeCycleExtrasListener);
        List unseenEntriesAndMarkAsSeen = this.onStartCache.getUnseenEntriesAndMarkAsSeen(activityLifeCycleExtrasListener);
        for (int i = 0; i < unseenEntriesAndMarkAsSeen.size(); i++) {
            activityLifeCycleExtrasListener.onStart();
        }
        List unseenEntriesAndMarkAsSeen2 = this.onRestartCache.getUnseenEntriesAndMarkAsSeen(activityLifeCycleExtrasListener);
        for (int i2 = 0; i2 < unseenEntriesAndMarkAsSeen2.size(); i2++) {
            activityLifeCycleExtrasListener.onRestart();
        }
    }

    public void addActivityLifeCycleListener(ActivityLifeCycleListener activityLifeCycleListener) {
        this.activityLifeCycleListeners.add(activityLifeCycleListener);
        Iterator it = this.onCreateCache.getUnseenEntriesAndMarkAsSeen(activityLifeCycleListener).iterator();
        while (it.hasNext()) {
            activityLifeCycleListener.onCreate((Bundle) it.next());
        }
        Iterator it2 = this.newIntentCache.getUnseenEntriesAndMarkAsSeen(activityLifeCycleListener).iterator();
        while (it2.hasNext()) {
            activityLifeCycleListener.onNewIntent((Intent) it2.next());
        }
        List unseenEntriesAndMarkAsSeen = this.onResumeCache.getUnseenEntriesAndMarkAsSeen(activityLifeCycleListener);
        for (int i = 0; i < unseenEntriesAndMarkAsSeen.size(); i++) {
            activityLifeCycleListener.onResume();
        }
    }

    public void addActivityPermissionListener(ActivityPermissionListener activityPermissionListener) {
        this.activityPermissionListeners.add(activityPermissionListener);
    }

    public void addActivityResultListener(ActivityResultListener activityResultListener) {
        this.activityResultListeners.add(activityResultListener);
    }

    public void deinit() {
        this.activity = null;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public void init(Activity activity) {
        this.activity = activity;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Iterator<ActivityResultListener> it = this.activityResultListeners.iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Logging.logInfo(TAG, "onCreate " + bundle);
        if (bundle == null) {
            this.onCreateCache.add(new Bundle());
        } else {
            this.onCreateCache.add(bundle);
        }
        Iterator<ActivityLifeCycleListener> it = this.activityLifeCycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onCreate(bundle);
        }
    }

    public void onDestroy() {
        Iterator<ActivityLifeCycleListener> it = this.activityLifeCycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        this.activityLifeCycleListeners.clear();
    }

    public void onNewIntent(Intent intent) {
        Logging.logInfo(TAG, "onNewIntent " + intent);
        this.newIntentCache.add(intent);
        Iterator<ActivityLifeCycleListener> it = this.activityLifeCycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onNewIntent(intent);
        }
    }

    public void onPause() {
        Iterator<ActivityLifeCycleListener> it = this.activityLifeCycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Iterator<ActivityPermissionListener> it = this.activityPermissionListeners.iterator();
        if (it.hasNext()) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }

    public void onRestart() {
        this.onRestartCache.add("dummy");
        Iterator<ActivityLifeCycleExtrasListener> it = this.activityLifeCycleExtrasListeners.iterator();
        if (it.hasNext()) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }

    public void onResume() {
        this.onResumeCache.add("dummy");
        Iterator<ActivityLifeCycleListener> it = this.activityLifeCycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public void onStart() {
        this.onStartCache.add("dummy");
        Iterator<ActivityLifeCycleExtrasListener> it = this.activityLifeCycleExtrasListeners.iterator();
        if (it.hasNext()) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }

    public void onStop() {
        Iterator<ActivityLifeCycleExtrasListener> it = this.activityLifeCycleExtrasListeners.iterator();
        if (it.hasNext()) {
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$.ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        this.activityLifeCycleExtrasListeners.clear();
    }

    public void removeActivityLifeCycleListener(ActivityLifeCycleExtrasListener activityLifeCycleExtrasListener) {
        this.activityLifeCycleExtrasListeners.remove(activityLifeCycleExtrasListener);
    }

    public void removeActivityLifeCycleListener(ActivityLifeCycleListener activityLifeCycleListener) {
        this.activityLifeCycleListeners.remove(activityLifeCycleListener);
    }

    public void removeActivityPermissionListener(ActivityPermissionListener activityPermissionListener) {
        this.activityPermissionListeners.remove(activityPermissionListener);
    }

    public void removeActivityResultListener(ActivityResultListener activityResultListener) {
        this.activityResultListeners.remove(activityResultListener);
    }
}
