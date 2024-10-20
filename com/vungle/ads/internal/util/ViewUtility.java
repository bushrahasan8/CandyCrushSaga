package com.vungle.ads.internal.util;

import android.content.Context;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ViewUtility.class */
public final class ViewUtility {
    public static final ViewUtility INSTANCE = new ViewUtility();

    private ViewUtility() {
    }

    public final int dpToPixels(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final WebView getWebView(Context context) throws InstantiationException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return new WebView(context);
        } catch (Exception e) {
            throw new InstantiationException(e.getMessage());
        }
    }
}
