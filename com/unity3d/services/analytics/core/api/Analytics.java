package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.AnalyticsError;
import com.unity3d.services.analytics.interfaces.IAnalytics;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: Analytics.class */
public class Analytics {
    public static IAnalytics analyticsInterface;

    @WebViewExposed
    public static void addExtras(String str, WebViewCallback webViewCallback) {
        if (analyticsInterface == null) {
            webViewCallback.error(AnalyticsError.API_NOT_FOUND, str);
        } else {
            Utilities.runOnUiThread(new Runnable(str) { // from class: com.unity3d.services.analytics.core.api.Analytics.1
                final String val$extras;

                {
                    this.val$extras = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Analytics.analyticsInterface.onAddExtras(this.val$extras);
                }
            });
            webViewCallback.invoke(new Object[0]);
        }
    }

    public static void setAnalyticsInterface(IAnalytics iAnalytics) {
        analyticsInterface = iAnalytics;
    }
}
