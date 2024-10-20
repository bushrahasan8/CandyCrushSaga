package androidx.webkit;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.core.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: WebViewAssetLoader.class */
public final class WebViewAssetLoader {
    private final List mMatchers;

    /* loaded from: WebViewAssetLoader$Builder.class */
    public static final class Builder {
        private String mDomain = "appassets.androidplatform.net";
        private final List mHandlerList = new ArrayList();
        private boolean mHttpAllowed;

        public Builder addPathHandler(String str, PathHandler pathHandler) {
            this.mHandlerList.add(Pair.create(str, pathHandler));
            return this;
        }

        public WebViewAssetLoader build() {
            ArrayList arrayList = new ArrayList();
            for (Pair pair : this.mHandlerList) {
                arrayList.add(new PathMatcher(this.mDomain, (String) pair.first, this.mHttpAllowed, (PathHandler) pair.second));
            }
            return new WebViewAssetLoader(arrayList);
        }

        public Builder setDomain(String str) {
            this.mDomain = str;
            return this;
        }
    }

    /* loaded from: WebViewAssetLoader$PathHandler.class */
    public interface PathHandler {
        WebResourceResponse handle(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: WebViewAssetLoader$PathMatcher.class */
    public static class PathMatcher {
        final String mAuthority;
        final PathHandler mHandler;
        final boolean mHttpEnabled;
        final String mPath;

        PathMatcher(String str, String str2, boolean z, PathHandler pathHandler) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.mAuthority = str;
            this.mPath = str2;
            this.mHttpEnabled = z;
            this.mHandler = pathHandler;
        }

        public String getSuffixPath(String str) {
            return str.replaceFirst(this.mPath, "");
        }

        public PathHandler match(Uri uri) {
            if (uri.getScheme().equals("http") && !this.mHttpEnabled) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && uri.getAuthority().equals(this.mAuthority) && uri.getPath().startsWith(this.mPath)) {
                return this.mHandler;
            }
            return null;
        }
    }

    WebViewAssetLoader(List list) {
        this.mMatchers = list;
    }

    public WebResourceResponse shouldInterceptRequest(Uri uri) {
        WebResourceResponse handle;
        for (PathMatcher pathMatcher : this.mMatchers) {
            PathHandler match = pathMatcher.match(uri);
            if (match != null && (handle = match.handle(pathMatcher.getSuffixPath(uri.getPath()))) != null) {
                return handle;
            }
        }
        return null;
    }
}
