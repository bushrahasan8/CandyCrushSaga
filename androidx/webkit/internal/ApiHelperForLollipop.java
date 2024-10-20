package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* loaded from: ApiHelperForLollipop.class */
public abstract class ApiHelperForLollipop {
    public static Uri getUrl(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean isForMainFrame(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
