package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: BoltsMeasurementEventListener.class */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
    private static BoltsMeasurementEventListener singleton;
    private final Context applicationContext;

    /* loaded from: BoltsMeasurementEventListener$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BoltsMeasurementEventListener getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BoltsMeasurementEventListener.singleton != null) {
                return BoltsMeasurementEventListener.singleton;
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            boltsMeasurementEventListener.open();
            BoltsMeasurementEventListener.singleton = boltsMeasurementEventListener;
            return BoltsMeasurementEventListener.singleton;
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void close() {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
        localBroadcastManager.unregisterReceiver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void open() {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.applicationContext);
        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
        localBroadcastManager.registerReceiver(this, new IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
    }

    public final void finalize() {
        close();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        StringBuilder sb = new StringBuilder();
        sb.append("bf_");
        sb.append(intent != null ? intent.getStringExtra("event_name") : null);
        String sb2 = sb.toString();
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
        Bundle bundle = new Bundle();
        Set<String> keySet = bundleExtra != null ? bundleExtra.keySet() : null;
        if (keySet != null) {
            for (String key : keySet) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
            }
        }
        internalAppEventsLogger.logEvent(sb2, bundle);
    }
}
