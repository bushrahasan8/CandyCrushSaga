package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: RCTCodelessLoggingEventListener.class */
public final class RCTCodelessLoggingEventListener {
    public static final RCTCodelessLoggingEventListener INSTANCE = new RCTCodelessLoggingEventListener();

    /* loaded from: RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener.class */
    public static final class AutoLoggingOnTouchListener implements View.OnTouchListener {
        private final View.OnTouchListener existingOnTouchListener;
        private final WeakReference hostView;
        private final EventBinding mapping;
        private final WeakReference rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnTouchListener(EventBinding mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference(hostView);
            this.rootView = new WeakReference(rootView);
            this.existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(hostView);
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = (View) this.rootView.get();
            View view3 = (View) this.hostView.get();
            boolean z = true;
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                CodelessLoggingEventListener.logEvent$facebook_android_sdk_core_release(this.mapping, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.existingOnTouchListener;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                z = false;
            }
            return z;
        }
    }

    private RCTCodelessLoggingEventListener() {
    }

    public static final AutoLoggingOnTouchListener getOnTouchListener(EventBinding mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        return new AutoLoggingOnTouchListener(mapping, rootView, hostView);
    }
}
