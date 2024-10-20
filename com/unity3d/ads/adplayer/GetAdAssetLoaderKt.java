package com.unity3d.ads.adplayer;

import android.content.Context;
import android.webkit.WebResourceResponse;
import androidx.webkit.WebViewAssetLoader;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: GetAdAssetLoaderKt.class */
public final class GetAdAssetLoaderKt {
    public static final GetAdAssetLoader provideGetAdCacheAssetLoader(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GetAdAssetLoader(context) { // from class: com.unity3d.ads.adplayer.GetAdAssetLoaderKt$$ExternalSyntheticLambda0
            public final Context f$0;

            {
                this.f$0 = context;
            }

            @Override // com.unity3d.ads.adplayer.GetAdAssetLoader, kotlin.jvm.functions.Function0
            public final Object invoke() {
                WebViewAssetLoader provideGetAdCacheAssetLoader$lambda$1;
                provideGetAdCacheAssetLoader$lambda$1 = GetAdAssetLoaderKt.provideGetAdCacheAssetLoader$lambda$1(this.f$0);
                return provideGetAdCacheAssetLoader$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebViewAssetLoader provideGetAdCacheAssetLoader$lambda$1(final Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        WebViewAssetLoader build = new WebViewAssetLoader.Builder().addPathHandler(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, new WebViewAssetLoader.PathHandler(context) { // from class: com.unity3d.ads.adplayer.GetAdAssetLoaderKt$$ExternalSyntheticLambda1
            public final Context f$0;

            {
                this.f$0 = context;
            }

            public final WebResourceResponse handle(String str) {
                WebResourceResponse provideGetAdCacheAssetLoader$lambda$1$lambda$0;
                provideGetAdCacheAssetLoader$lambda$1$lambda$0 = GetAdAssetLoaderKt.provideGetAdCacheAssetLoader$lambda$1$lambda$0(this.f$0, str);
                return provideGetAdCacheAssetLoader$lambda$1$lambda$0;
            }
        }).setDomain("cdn-creatives-cf-prd.acquire.unity3dusercontent.com").build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .addPa…_DOMAIN)\n        .build()");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebResourceResponse provideGetAdCacheAssetLoader$lambda$1$lambda$0(Context context, String path) {
        WebResourceResponse webResourceResponse;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            webResourceResponse = new WebResourceResponse(GetWebViewAssetLoaderKt.guessMimeType(path), null, new FileInputStream(new File(context.getFilesDir(), "unityads/" + path)));
        } catch (Exception e) {
            DeviceLog.debug("Ad Asset not found: %s", path);
            webResourceResponse = null;
        }
        return webResourceResponse;
    }
}
