package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CodelessLoggingEventListener.class */
public final class CodelessLoggingEventListener {
    public static final CodelessLoggingEventListener INSTANCE = new CodelessLoggingEventListener();

    /* loaded from: CodelessLoggingEventListener$AutoLoggingOnClickListener.class */
    public static final class AutoLoggingOnClickListener implements View.OnClickListener {
        private View.OnClickListener existingOnClickListener;
        private WeakReference hostView;
        private EventBinding mapping;
        private WeakReference rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnClickListener(EventBinding mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference(hostView);
            this.rootView = new WeakReference(rootView);
            this.existingOnClickListener = ViewHierarchy.getExistingOnClickListener(hostView);
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.existingOnClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.rootView.get();
            View view3 = (View) this.hostView.get();
            if (view2 == null || view3 == null) {
                return;
            }
            EventBinding eventBinding = this.mapping;
            Intrinsics.checkNotNull(eventBinding, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
            CodelessLoggingEventListener.logEvent$facebook_android_sdk_core_release(eventBinding, view2, view3);
        }
    }

    /* loaded from: CodelessLoggingEventListener$AutoLoggingOnItemClickListener.class */
    public static final class AutoLoggingOnItemClickListener implements AdapterView.OnItemClickListener {
        private AdapterView.OnItemClickListener existingOnItemClickListener;
        private WeakReference hostView;
        private EventBinding mapping;
        private WeakReference rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnItemClickListener(EventBinding mapping, View rootView, AdapterView hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference(hostView);
            this.rootView = new WeakReference(rootView);
            this.existingOnItemClickListener = hostView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = (View) this.rootView.get();
            AdapterView adapterView2 = (AdapterView) this.hostView.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            CodelessLoggingEventListener.logEvent$facebook_android_sdk_core_release(this.mapping, view2, adapterView2);
        }
    }

    private CodelessLoggingEventListener() {
    }

    public static final AutoLoggingOnClickListener getOnClickListener(EventBinding mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        return new AutoLoggingOnClickListener(mapping, rootView, hostView);
    }

    public static final AutoLoggingOnItemClickListener getOnItemClickListener(EventBinding mapping, View rootView, AdapterView hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        return new AutoLoggingOnItemClickListener(mapping, rootView, hostView);
    }

    public static final void logEvent$facebook_android_sdk_core_release(EventBinding mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        final String eventName = mapping.getEventName();
        final Bundle parameters = CodelessMatcher.Companion.getParameters(mapping, rootView, hostView);
        INSTANCE.updateParameters$facebook_android_sdk_core_release(parameters);
        FacebookSdk.getExecutor().execute(new Runnable(eventName, parameters) { // from class: com.facebook.appevents.codeless.CodelessLoggingEventListener$$ExternalSyntheticLambda0
            public final String f$0;
            public final Bundle f$1;

            {
                this.f$0 = eventName;
                this.f$1 = parameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CodelessLoggingEventListener.logEvent$lambda$0(this.f$0, this.f$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logEvent$lambda$0(String eventName, Bundle parameters) {
        Intrinsics.checkNotNullParameter(eventName, "$eventName");
        Intrinsics.checkNotNullParameter(parameters, "$parameters");
        AppEventsLogger.Companion.newLogger(FacebookSdk.getApplicationContext()).logEvent(eventName, parameters);
    }

    public final void updateParameters$facebook_android_sdk_core_release(Bundle parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        String string = parameters.getString("_valueToSum");
        if (string != null) {
            parameters.putDouble("_valueToSum", AppEventUtility.normalizePrice(string));
        }
        parameters.putString("_is_fb_codeless", "1");
    }
}
