package com.unity3d.services.banners;

import com.unity3d.ads.UnityAds;

/* loaded from: BannerErrorInfo.class */
public class BannerErrorInfo {
    public BannerErrorCode errorCode;
    public String errorMessage;

    /* renamed from: com.unity3d.services.banners.BannerErrorInfo$1, reason: invalid class name */
    /* loaded from: BannerErrorInfo$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:44:0x007f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsLoadError[] r0 = com.unity3d.ads.UnityAds.UnityAdsLoadError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = r0
                r0 = r4
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch: java.lang.NoSuchFieldError -> L6b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6b
            L14:
                int[] r0 = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> L6b java.lang.NoSuchFieldError -> L6f
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch: java.lang.NoSuchFieldError -> L6f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6f
            L1f:
                int[] r0 = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> L6f java.lang.NoSuchFieldError -> L73
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch: java.lang.NoSuchFieldError -> L73
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L73
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L73
            L2a:
                int[] r0 = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> L73 java.lang.NoSuchFieldError -> L77
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch: java.lang.NoSuchFieldError -> L77
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L77
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L77
            L35:
                int[] r0 = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> L77 java.lang.NoSuchFieldError -> L7b
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch: java.lang.NoSuchFieldError -> L7b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            L40:
                com.unity3d.services.banners.BannerErrorCode[] r0 = com.unity3d.services.banners.BannerErrorCode.values()     // Catch: java.lang.NoSuchFieldError -> L7b
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode = r0
                r0 = r4
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
            L54:
                int[] r0 = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode     // Catch: java.lang.NoSuchFieldError -> L7f java.lang.NoSuchFieldError -> L83
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NO_FILL     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L5f:
                int[] r0 = com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode     // Catch: java.lang.NoSuchFieldError -> L83 java.lang.NoSuchFieldError -> L87
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR     // Catch: java.lang.NoSuchFieldError -> L87
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L87
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L87
            L6a:
                return
            L6b:
                r4 = move-exception
                goto L14
            L6f:
                r4 = move-exception
                goto L1f
            L73:
                r4 = move-exception
                goto L2a
            L77:
                r4 = move-exception
                goto L35
            L7b:
                r4 = move-exception
                goto L40
            L7f:
                r4 = move-exception
                goto L54
            L83:
                r4 = move-exception
                goto L5f
            L87:
                r4 = move-exception
                goto L6a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.banners.BannerErrorInfo.AnonymousClass1.m6519clinit():void");
        }
    }

    public BannerErrorInfo(String str, BannerErrorCode bannerErrorCode) {
        this.errorCode = bannerErrorCode;
        this.errorMessage = str;
    }

    public static BannerErrorInfo fromLoadError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? new BannerErrorInfo(str, BannerErrorCode.NATIVE_ERROR) : i != 4 ? i != 5 ? new BannerErrorInfo(str, BannerErrorCode.UNKNOWN) : new BannerErrorInfo(str, BannerErrorCode.NO_FILL) : new BannerErrorInfo(str, BannerErrorCode.WEBVIEW_ERROR);
    }

    public UnityAds.UnityAdsLoadError toLoadError() {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[this.errorCode.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? UnityAds.UnityAdsLoadError.INTERNAL_ERROR : UnityAds.UnityAdsLoadError.INTERNAL_ERROR : UnityAds.UnityAdsLoadError.NO_FILL : UnityAds.UnityAdsLoadError.INVALID_ARGUMENT;
    }
}
