package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ImpressionTracker.class */
public final class ImpressionTracker {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, TrackingInfo> trackedViews;
    private final Handler visibilityHandler;
    private final VisibilityRunnable visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ImpressionTracker.class.getSimpleName();

    /* loaded from: ImpressionTracker$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: ImpressionTracker$ImpressionListener.class */
    public interface ImpressionListener {
        void onImpression(View view);
    }

    /* loaded from: ImpressionTracker$TrackingInfo.class */
    public static final class TrackingInfo {
        private ImpressionListener impressionListener;
        private int minViewablePercent;

        public final ImpressionListener getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(ImpressionListener impressionListener) {
            this.impressionListener = impressionListener;
        }

        public final void setMinViewablePercent(int i) {
            this.minViewablePercent = i;
        }
    }

    /* loaded from: ImpressionTracker$VisibilityRunnable.class */
    public final class VisibilityRunnable implements Runnable {
        final ImpressionTracker this$0;
        private final ArrayList<View> visibleViews = new ArrayList<>();

        public VisibilityRunnable(ImpressionTracker impressionTracker) {
            this.this$0 = impressionTracker;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImpressionListener impressionListener;
            this.this$0.isVisibilityScheduled = false;
            for (Map.Entry entry : this.this$0.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (this.this$0.isVisible(view, ((TrackingInfo) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                }
            }
            Iterator<View> it = this.visibleViews.iterator();
            while (it.hasNext()) {
                View view2 = it.next();
                TrackingInfo trackingInfo = (TrackingInfo) this.this$0.trackedViews.get(view2);
                if (trackingInfo != null && (impressionListener = trackingInfo.getImpressionListener()) != null) {
                    impressionListener.onImpression(view2);
                }
                ImpressionTracker impressionTracker = this.this$0;
                Intrinsics.checkNotNullExpressionValue(view2, "view");
                impressionTracker.removeView(view2);
            }
            this.visibleViews.clear();
            if (!(!this.this$0.trackedViews.isEmpty()) || this.this$0.setViewTreeObserverSucceed) {
                return;
            }
            this.this$0.scheduleVisibilityCheck();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImpressionTracker(Context context) {
        this(context, new WeakHashMap(10), new Handler());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public ImpressionTracker(Context context, Map<View, TrackingInfo> trackedViews, Handler visibilityHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedViews, "trackedViews");
        Intrinsics.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new VisibilityRunnable(this);
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener(this) { // from class: com.vungle.ads.internal.ImpressionTracker$$ExternalSyntheticLambda0
            public final ImpressionTracker f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m6738_init_$lambda0;
                m6738_init_$lambda0 = ImpressionTracker.m6738_init_$lambda0(this.f$0);
                return m6738_init_$lambda0;
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m6738_init_$lambda0(ImpressionTracker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    private final View getTopView(Context context, View view) {
        View findViewById = context instanceof Activity ? ((Activity) context).getWindow().getDecorView().findViewById(R.id.content) : null;
        View view2 = findViewById;
        if (findViewById == null) {
            view2 = findViewById;
            if (view != null) {
                if (!ViewCompat.isAttachedToWindow(view)) {
                    Log.w(TAG, "Trying to call View#rootView() on an unattached View.");
                }
                View rootView = view.getRootView();
                if (rootView != null) {
                    findViewById = rootView.findViewById(R.id.content);
                }
                view2 = findViewById;
                if (findViewById == null) {
                    view2 = rootView;
                }
            }
        }
        return view2;
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i) {
        boolean z = false;
        if (view != null) {
            z = false;
            if (view.getVisibility() == 0) {
                if (view.getParent() == null) {
                    z = false;
                } else {
                    if (!view.getGlobalVisibleRect(this.clipRect)) {
                        return false;
                    }
                    long height = this.clipRect.height();
                    long width = this.clipRect.width();
                    long height2 = view.getHeight() * view.getWidth();
                    if (height2 <= 0) {
                        z = false;
                    } else {
                        z = false;
                        if (100 * height * width >= i * height2) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            Log.d(TAG, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            Log.d(TAG, "The root view tree observer was not alive");
            return false;
        }
        this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
        return true;
    }

    public final void addView(View view, ImpressionListener impressionListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        TrackingInfo trackingInfo = this.trackedViews.get(view);
        TrackingInfo trackingInfo2 = trackingInfo;
        if (trackingInfo == null) {
            trackingInfo2 = new TrackingInfo();
            this.trackedViews.put(view, trackingInfo2);
            scheduleVisibilityCheck();
        }
        trackingInfo2.setMinViewablePercent(1);
        trackingInfo2.setImpressionListener(impressionListener);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }
}
