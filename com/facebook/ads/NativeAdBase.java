package com.facebook.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdRatingApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import org.json.JSONObject;

@Keep
/* loaded from: NativeAdBase.class */
public abstract class NativeAdBase implements Ad {
    final NativeAdBaseApi mNativeAdBaseApi;

    @Keep
    /* loaded from: NativeAdBase$Image.class */
    public static class Image {
        private final NativeAdImageApi mNativeAdImageApi;

        @Benchmark
        Image(NativeAdImageApi nativeAdImageApi) {
            this.mNativeAdImageApi = nativeAdImageApi;
        }

        @Benchmark
        public static Image fromJSONObject(JSONObject jSONObject) {
            NativeAdImageApi createNativeAdImageApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdImageApi(jSONObject);
            return createNativeAdImageApi == null ? null : new Image(createNativeAdImageApi);
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public int getHeight() {
            return this.mNativeAdImageApi.getHeight();
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public String getUrl() {
            return this.mNativeAdImageApi.getUrl();
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public int getWidth() {
            return this.mNativeAdImageApi.getWidth();
        }
    }

    @Keep
    /* loaded from: NativeAdBase$MediaCacheFlag.class */
    public enum MediaCacheFlag {
        NONE,
        ALL
    }

    @Keep
    /* loaded from: NativeAdBase$NativeAdLoadConfigBuilder.class */
    public interface NativeAdLoadConfigBuilder extends Ad.LoadConfigBuilder {
        public static final int UNKNOWN_IMAGE_SIZE = -1;

        /* loaded from: NativeAdBase$NativeAdLoadConfigBuilder$_CC.class */
        public abstract /* synthetic */ class _CC {
        }

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        /* bridge */ /* synthetic */ Ad.LoadAdConfig build();

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        NativeLoadAdConfig build();

        NativeAdLoadConfigBuilder withAdListener(NativeAdListener nativeAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        /* bridge */ /* synthetic */ Ad.LoadConfigBuilder withBid(String str);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        NativeAdLoadConfigBuilder withBid(String str);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        NativeAdLoadConfigBuilder withMediaCacheFlag(MediaCacheFlag mediaCacheFlag);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        NativeAdLoadConfigBuilder withPreloadedIconView(int i, int i2);
    }

    @Keep
    /* loaded from: NativeAdBase$NativeComponentTag.class */
    public enum NativeComponentTag {
        AD_ICON,
        AD_TITLE,
        AD_COVER_IMAGE,
        AD_SUBTITLE,
        AD_BODY,
        AD_CALL_TO_ACTION,
        AD_SOCIAL_CONTEXT,
        AD_CHOICES_ICON,
        AD_OPTIONS_VIEW,
        AD_MEDIA;

        public static void tagView(View view, NativeComponentTag nativeComponentTag) {
            DynamicLoaderFactory.makeLoader(view.getContext()).createNativeComponentTagApi().tagView(view, nativeComponentTag);
        }
    }

    @Keep
    /* loaded from: NativeAdBase$NativeLoadAdConfig.class */
    public interface NativeLoadAdConfig extends Ad.LoadAdConfig {
    }

    @Keep
    /* loaded from: NativeAdBase$Rating.class */
    public static class Rating {
        private final NativeAdRatingApi mNativeAdRatingApi;

        @Benchmark
        Rating(NativeAdRatingApi nativeAdRatingApi) {
            this.mNativeAdRatingApi = nativeAdRatingApi;
        }

        @Benchmark
        public static Rating fromJSONObject(JSONObject jSONObject) {
            NativeAdRatingApi createNativeAdRatingApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdRatingApi(jSONObject);
            return createNativeAdRatingApi == null ? null : new Rating(createNativeAdRatingApi);
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public double getScale() {
            return this.mNativeAdRatingApi.getScale();
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public double getValue() {
            return this.mNativeAdRatingApi.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Benchmark
    public NativeAdBase(Context context, NativeAdBase nativeAdBase) {
        this.mNativeAdBaseApi = DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(nativeAdBase.mNativeAdBaseApi);
    }

    @Benchmark
    public NativeAdBase(Context context, String str) {
        this.mNativeAdBaseApi = DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(context, str);
    }

    @Benchmark
    public NativeAdBase(NativeAdBaseApi nativeAdBaseApi) {
        this.mNativeAdBaseApi = nativeAdBaseApi;
    }

    @Benchmark
    public static NativeAdBase fromBidPayload(Context context, String str, String str2) throws Exception {
        return DynamicLoaderFactory.makeLoader(context).createNativeAdBaseFromBidPayload(context, str, str2);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public NativeAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mNativeAdBaseApi.buildLoadAdConfig(this);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mNativeAdBaseApi.destroy();
    }

    @Benchmark
    public void downloadMedia() {
        this.mNativeAdBaseApi.downloadMedia();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdBodyText() {
        return this.mNativeAdBaseApi.getAdBodyText();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdCallToAction() {
        return this.mNativeAdBaseApi.getAdCallToAction();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Image getAdChoicesIcon() {
        return this.mNativeAdBaseApi.getAdChoicesIcon() == null ? null : new Image(this.mNativeAdBaseApi.getAdChoicesIcon());
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdChoicesImageUrl() {
        return this.mNativeAdBaseApi.getAdChoicesImageUrl();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdChoicesLinkUrl() {
        return this.mNativeAdBaseApi.getAdChoicesLinkUrl();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdChoicesText() {
        return this.mNativeAdBaseApi.getAdChoicesText();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Image getAdCoverImage() {
        return this.mNativeAdBaseApi.getAdCoverImage() == null ? null : new Image(this.mNativeAdBaseApi.getAdCoverImage());
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdHeadline() {
        return this.mNativeAdBaseApi.getAdHeadline();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Image getAdIcon() {
        return this.mNativeAdBaseApi.getAdIcon() == null ? null : new Image(this.mNativeAdBaseApi.getAdIcon());
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdLinkDescription() {
        return this.mNativeAdBaseApi.getAdLinkDescription();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdSocialContext() {
        return this.mNativeAdBaseApi.getAdSocialContext();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public Rating getAdStarRating() {
        return this.mNativeAdBaseApi.getAdStarRating() == null ? null : new Rating(this.mNativeAdBaseApi.getAdStarRating());
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdTranslation() {
        return this.mNativeAdBaseApi.getAdTranslation();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdUntrimmedBodyText() {
        return this.mNativeAdBaseApi.getAdUntrimmedBodyText();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public NativeAdViewAttributes getAdViewAttributes() {
        return new NativeAdViewAttributes();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdvertiserName() {
        return this.mNativeAdBaseApi.getAdvertiserName();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public float getAspectRatio() {
        return this.mNativeAdBaseApi.getAspectRatio();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getId() {
        return this.mNativeAdBaseApi.getId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public NativeAdBaseApi getInternalNativeAd() {
        return this.mNativeAdBaseApi;
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mNativeAdBaseApi.getPlacementId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Drawable getPreloadedIconViewDrawable() {
        return this.mNativeAdBaseApi.getPreloadedIconViewDrawable();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getPromotedTranslation() {
        return this.mNativeAdBaseApi.getPromotedTranslation();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getSponsoredTranslation() {
        return this.mNativeAdBaseApi.getSponsoredTranslation();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean hasCallToAction() {
        return this.mNativeAdBaseApi.hasCallToAction();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        return this.mNativeAdBaseApi.isAdInvalidated();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        return this.mNativeAdBaseApi.isAdLoaded();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public boolean isNativeConfigEnabled() {
        return false;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        this.mNativeAdBaseApi.loadAd();
    }

    @Benchmark
    public void loadAd(NativeLoadAdConfig nativeLoadAdConfig) {
        this.mNativeAdBaseApi.loadAd(nativeLoadAdConfig);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public void onCtaBroadcast() {
        this.mNativeAdBaseApi.onCtaBroadcast();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mNativeAdBaseApi.setExtraHints(extraHints);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.mNativeAdBaseApi.setOnTouchListener(onTouchListener);
    }

    @Benchmark
    public void unregisterView() {
        this.mNativeAdBaseApi.unregisterView();
    }
}
