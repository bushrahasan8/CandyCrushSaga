package com.vungle.ads.internal.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: WebViewUtil.class */
public final class WebViewUtil {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = WebViewUtil.class.getSimpleName();
    private final Context context;

    /* loaded from: WebViewUtil$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebViewUtil(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void getUserAgent(Consumer consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            consumer.accept(WebSettings.getDefaultUserAgent(this.context));
        } catch (Exception e) {
            if (e instanceof AndroidRuntimeException) {
                Log.e(TAG, "WebView could be missing here");
            }
            consumer.accept((Object) null);
        }
    }
}
