package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ActivityManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ActivityManager.class */
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {
    private Handler handler;
    private boolean isInitialized;
    private int resumed;
    private int started;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ActivityManager.class.getSimpleName();
    private static final ActivityManager instance = new ActivityManager();
    private static final long TIMEOUT = 3000;
    private static final long CONFIG_CHANGE_DELAY = 700;
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();
    private final ConcurrentHashMap<LeftApplicationCallback, LifeCycleCallback> adLeftCallbacks = new ConcurrentHashMap<>();
    private boolean paused = true;
    private boolean stopped = true;
    private final Runnable configChangeRunnable = new Runnable(this) { // from class: com.vungle.ads.internal.util.ActivityManager$$ExternalSyntheticLambda0
        public final ActivityManager f$0;

        {
            this.f$0 = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActivityManager.m6942configChangeRunnable$lambda0(this.f$0);
        }
    };

    /* loaded from: ActivityManager$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCONFIG_CHANGE_DELAY$annotations() {
        }

        public static /* synthetic */ void getTIMEOUT$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean startActivityHandleException(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            if (intent == null && intent2 == null) {
                return false;
            }
            try {
                if (intent == null) {
                    context.startActivity(intent2);
                    return true;
                }
                context.startActivity(intent);
                if (presenterAdOpenCallback == null) {
                    return true;
                }
                presenterAdOpenCallback.onDeeplinkClick(true);
                return true;
            } catch (Exception e) {
                Log.e(getTAG(), "Cannot launch/find activity to handle the Implicit intent: " + e);
                if (intent != null) {
                    try {
                        AnalyticsClient.logError$vungle_ads_release$default(AnalyticsClient.INSTANCE, 312, "Fail to open " + intent.getDataString(), "", (String) null, (String) null, 24, (Object) null);
                        if (presenterAdOpenCallback != null) {
                            presenterAdOpenCallback.onDeeplinkClick(false);
                        }
                    } catch (Exception e2) {
                        return false;
                    }
                }
                if (intent == null || intent2 == null) {
                    return false;
                }
                context.startActivity(intent2);
                return true;
            }
        }

        public final void addLifecycleListener(LifeCycleCallback listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            getInstance().addListener(listener);
        }

        public final long getCONFIG_CHANGE_DELAY() {
            return ActivityManager.CONFIG_CHANGE_DELAY;
        }

        public final ActivityManager getInstance() {
            return ActivityManager.instance;
        }

        public final String getTAG() {
            return ActivityManager.TAG;
        }

        public final long getTIMEOUT() {
            return ActivityManager.TIMEOUT;
        }

        public final void startWhenForeground(Context context, Intent intent, Intent intent2, LeftApplicationCallback leftApplicationCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            startWhenForeground(context, intent, intent2, leftApplicationCallback, null);
        }

        public final void startWhenForeground(Context context, final Intent intent, final Intent intent2, final LeftApplicationCallback leftApplicationCallback, final PresenterAdOpenCallback presenterAdOpenCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            final WeakReference weakReference = new WeakReference(context);
            if (!getInstance().inForeground()) {
                getInstance().addListener(new LifeCycleCallback(weakReference, intent, intent2, presenterAdOpenCallback, leftApplicationCallback) { // from class: com.vungle.ads.internal.util.ActivityManager$Companion$startWhenForeground$1
                    final PresenterAdOpenCallback $adOpenCallback;
                    final Intent $deepLinkOverrideIntent;
                    final Intent $defaultIntent;
                    final ActivityManager.LeftApplicationCallback $leftCallback;
                    final WeakReference<Context> $weakContext;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.$weakContext = weakReference;
                        this.$deepLinkOverrideIntent = intent;
                        this.$defaultIntent = intent2;
                        this.$adOpenCallback = presenterAdOpenCallback;
                        this.$leftCallback = leftApplicationCallback;
                    }

                    @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
                    public void onStart() {
                        boolean startActivityHandleException;
                        super.onStart();
                        ActivityManager.Companion companion = ActivityManager.Companion;
                        companion.getInstance().removeListener(this);
                        Context context2 = this.$weakContext.get();
                        if (context2 != null) {
                            startActivityHandleException = companion.startActivityHandleException(context2, this.$deepLinkOverrideIntent, this.$defaultIntent, this.$adOpenCallback);
                            if (startActivityHandleException) {
                                companion.getInstance().addOnNextAppLeftCallback(this.$leftCallback);
                            }
                        }
                    }
                });
            } else if (startActivityHandleException(context, intent, intent2, presenterAdOpenCallback)) {
                getInstance().addOnNextAppLeftCallback(leftApplicationCallback);
            }
        }
    }

    /* loaded from: ActivityManager$LeftApplicationCallback.class */
    public interface LeftApplicationCallback {
        void onLeftApplication();
    }

    /* loaded from: ActivityManager$LifeCycleCallback.class */
    public static class LifeCycleCallback {
        public void onPause() {
        }

        public void onResume() {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configChangeRunnable$lambda-0, reason: not valid java name */
    public static final void m6942configChangeRunnable$lambda0(ActivityManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.resumed == 0 && !this$0.paused) {
            this$0.paused = true;
            Iterator<LifeCycleCallback> it = this$0.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onPause();
            }
        }
        if (this$0.started == 0 && this$0.paused && !this$0.stopped) {
            this$0.stopped = true;
            Iterator<LifeCycleCallback> it2 = this$0.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.remove(lifeCycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnNextAppLeftCallback(LeftApplicationCallback leftApplicationCallback) {
        LifeCycleCallback remove;
        if (leftApplicationCallback == null || (remove = this.adLeftCallbacks.remove(leftApplicationCallback)) == null) {
            return;
        }
        removeListener(remove);
    }

    public final void addListener(LifeCycleCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.add(callback);
    }

    public final void addOnNextAppLeftCallback(LeftApplicationCallback leftApplicationCallback) {
        if (leftApplicationCallback == null) {
            return;
        }
        if (!this.isInitialized) {
            leftApplicationCallback.onLeftApplication();
            return;
        }
        final WeakReference weakReference = new WeakReference(leftApplicationCallback);
        final Runnable runnable = new Runnable(this, weakReference) { // from class: com.vungle.ads.internal.util.ActivityManager$addOnNextAppLeftCallback$cancelRunnable$1
            final WeakReference<ActivityManager.LeftApplicationCallback> $weakCallback;
            final ActivityManager this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
                this.$weakCallback = weakReference;
            }

            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                handler = this.this$0.handler;
                if (handler != null) {
                    handler.removeCallbacks(this);
                }
                this.this$0.removeOnNextAppLeftCallback(this.$weakCallback.get());
            }
        };
        LifeCycleCallback lifeCycleCallback = new LifeCycleCallback(weakReference, this, runnable) { // from class: com.vungle.ads.internal.util.ActivityManager$addOnNextAppLeftCallback$callback$1
            final Runnable $cancelRunnable;
            final WeakReference<ActivityManager.LeftApplicationCallback> $weakCallback;
            final ActivityManager this$0;
            private boolean wasPaused;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$weakCallback = weakReference;
                this.this$0 = this;
                this.$cancelRunnable = runnable;
            }

            public final boolean getWasPaused() {
                return this.wasPaused;
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onPause() {
                Handler handler;
                super.onPause();
                this.wasPaused = true;
                handler = this.this$0.handler;
                if (handler != null) {
                    handler.removeCallbacks(this.$cancelRunnable);
                }
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onResume() {
                Handler handler;
                super.onResume();
                handler = this.this$0.handler;
                if (handler != null) {
                    handler.postDelayed(this.$cancelRunnable, ActivityManager.Companion.getCONFIG_CHANGE_DELAY() * 2);
                }
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onStop() {
                Handler handler;
                ConcurrentHashMap concurrentHashMap;
                super.onStop();
                ActivityManager.LeftApplicationCallback leftApplicationCallback2 = this.$weakCallback.get();
                if (this.wasPaused && leftApplicationCallback2 != null) {
                    concurrentHashMap = this.this$0.adLeftCallbacks;
                    if (concurrentHashMap.containsKey(leftApplicationCallback2)) {
                        leftApplicationCallback2.onLeftApplication();
                    }
                }
                this.this$0.removeOnNextAppLeftCallback(leftApplicationCallback2);
                handler = this.this$0.handler;
                if (handler != null) {
                    handler.removeCallbacks(this.$cancelRunnable);
                }
            }

            public final void setWasPaused(boolean z) {
                this.wasPaused = z;
            }
        };
        this.adLeftCallbacks.put(leftApplicationCallback, lifeCycleCallback);
        if (!inForeground()) {
            instance.addListener(new LifeCycleCallback(this, weakReference, runnable) { // from class: com.vungle.ads.internal.util.ActivityManager$addOnNextAppLeftCallback$1
                final Runnable $cancelRunnable;
                final WeakReference<ActivityManager.LeftApplicationCallback> $weakCallback;
                final ActivityManager this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.this$0 = this;
                    this.$weakCallback = weakReference;
                    this.$cancelRunnable = runnable;
                }

                @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
                public void onStart() {
                    ConcurrentHashMap concurrentHashMap;
                    Handler handler;
                    ActivityManager.Companion companion = ActivityManager.Companion;
                    companion.getInstance().removeListener(this);
                    concurrentHashMap = this.this$0.adLeftCallbacks;
                    ActivityManager.LifeCycleCallback lifeCycleCallback2 = (ActivityManager.LifeCycleCallback) concurrentHashMap.get(this.$weakCallback.get());
                    if (lifeCycleCallback2 != null) {
                        handler = this.this$0.handler;
                        if (handler != null) {
                            handler.postDelayed(this.$cancelRunnable, companion.getTIMEOUT());
                        }
                        this.this$0.addListener(lifeCycleCallback2);
                    }
                }
            });
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(runnable, TIMEOUT);
        }
        addListener(lifeCycleCallback);
    }

    public final void deInit(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.started = 0;
        this.resumed = 0;
        this.paused = true;
        this.stopped = true;
        this.isInitialized = false;
        this.callbacks.clear();
        this.adLeftCallbacks.clear();
    }

    protected final boolean inForeground() {
        return !this.isInitialized || this.started > 0;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.isInitialized) {
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        this.isInitialized = true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.resumed = Math.max(0, this.resumed - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = this.resumed + 1;
        this.resumed = i;
        if (i == 1) {
            if (this.paused) {
                this.paused = false;
                Iterator<LifeCycleCallback> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onResume();
                }
                return;
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = this.started + 1;
        this.started = i;
        if (i == 1 && this.stopped) {
            this.stopped = false;
            Iterator<LifeCycleCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.started = Math.max(0, this.started - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }
}
