package com.unity3d.ads.adplayer;

import android.content.Context;
import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import java.io.InputStream;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GetWebViewAssetLoaderKt.class */
public final class GetWebViewAssetLoaderKt {
    public static final String guessMimeType(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(filePath);
        Intrinsics.checkNotNullExpressionValue(guessContentTypeFromName, "guessContentTypeFromName(filePath)");
        return guessContentTypeFromName;
    }

    public static final GetWebViewCacheAssetLoader provideGetWebViewCacheAssetLoader(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GetWebViewCacheAssetLoader(context) { // from class: com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt$$ExternalSyntheticLambda0
            public final Context f$0;

            {
                this.f$0 = context;
            }

            @Override // com.unity3d.ads.adplayer.GetWebViewCacheAssetLoader, kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewAssetLoader provideGetWebViewCacheAssetLoader$lambda$1;
                provideGetWebViewCacheAssetLoader$lambda$1 = GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader$lambda$1(this.f$0);
                return provideGetWebViewCacheAssetLoader$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewAssetLoader provideGetWebViewCacheAssetLoader$lambda$1(final Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        WebViewAssetLoader build = new WebViewAssetLoader.Builder().addPathHandler(UnityAdsConstants.DefaultUrls.WEBVIEW_ASSET_PATH, new WebViewAssetLoader.PathHandler(context) { // from class: com.unity3d.ads.adplayer.GetWebViewAssetLoaderKt$$ExternalSyntheticLambda1
            public final Context f$0;

            {
                this.f$0 = context;
            }

            public final WebResourceResponse handle(String str) {
                WebResourceResponse provideGetWebViewCacheAssetLoader$lambda$1$lambda$0;
                provideGetWebViewCacheAssetLoader$lambda$1$lambda$0 = GetWebViewAssetLoaderKt.provideGetWebViewCacheAssetLoader$lambda$1$lambda$0(this.f$0, str);
                return provideGetWebViewCacheAssetLoader$lambda$1$lambda$0;
            }
        }).setDomain(UnityAdsConstants.DefaultUrls.WEBVIEW_DOMAIN).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .addPa…_DOMAIN)\n        .build()");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse provideGetWebViewCacheAssetLoader$lambda$1$lambda$0(Context context, String path) {
        WebResourceResponse webResourceResponse;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            InputStream open = context.getAssets().open(path);
            Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(path)");
            webResourceResponse = new WebResourceResponse(guessMimeType(path), null, open);
        } catch (Exception e) {
            DeviceLog.debug("Webview Asset not found: %s", path);
            webResourceResponse = null;
        }
        return webResourceResponse;
    }
}
