package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.UnityAds;
import java.util.HashMap;

/* loaded from: AdOperationMetric.class */
public class AdOperationMetric {
    private static final String AD_IS_HEADER_BIDDING = "is_header_bidding";
    private static final String AD_LOAD_FAIL = "native_load_time_failure";
    private static final String AD_LOAD_START = "native_load_started";
    private static final String AD_LOAD_SUCCESS = "native_load_time_success";
    private static final String AD_LOAD_TYPE = "type";
    private static final String AD_SHOW_FAIL = "native_show_time_failure";
    private static final String AD_SHOW_START = "native_show_started";
    private static final String AD_SHOW_SUCCESS = "native_show_time_success";
    private static final String AD_TYPE_BANNER = "banner";
    private static final String AD_TYPE_VIDEO = "video";
    public static final String INIT_STATE = "state";
    public static final String REASON = "reason";
    private static final String UNKNOWN = "unknown";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.services.core.request.metrics.AdOperationMetric$2, reason: invalid class name */
    /* loaded from: AdOperationMetric$2.class */
    public static /* synthetic */ class AnonymousClass2 {
        static final int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:72:0x00bd
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsShowError[] r0 = com.unity3d.ads.UnityAds.UnityAdsShowError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = r0
                r0 = r4
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L14:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L1f:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L2a:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> La1 java.lang.NoSuchFieldError -> La5
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT     // Catch: java.lang.NoSuchFieldError -> La5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            L35:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> La5 java.lang.NoSuchFieldError -> La9
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
            L40:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> La9 java.lang.NoSuchFieldError -> Lad
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING     // Catch: java.lang.NoSuchFieldError -> Lad
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lad
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lad
            L4c:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> Lad java.lang.NoSuchFieldError -> Lb1
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb1
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb1
            L58:
                com.unity3d.ads.UnityAds$UnityAdsLoadError[] r0 = com.unity3d.ads.UnityAds.UnityAdsLoadError.values()     // Catch: java.lang.NoSuchFieldError -> Lb1
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = r0
                r0 = r4
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch: java.lang.NoSuchFieldError -> Lb5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb5
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb5
            L6c:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lb5 java.lang.NoSuchFieldError -> Lb9
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb9
            L77:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lb9 java.lang.NoSuchFieldError -> Lbd
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch: java.lang.NoSuchFieldError -> Lbd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbd
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lbd
            L82:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lbd java.lang.NoSuchFieldError -> Lc1
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch: java.lang.NoSuchFieldError -> Lc1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            L8d:
                int[] r0 = com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lc1 java.lang.NoSuchFieldError -> Lc5
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
            L98:
                return
            L99:
                r4 = move-exception
                goto L14
            L9d:
                r4 = move-exception
                goto L1f
            La1:
                r4 = move-exception
                goto L2a
            La5:
                r4 = move-exception
                goto L35
            La9:
                r4 = move-exception
                goto L40
            Lad:
                r4 = move-exception
                goto L4c
            Lb1:
                r4 = move-exception
                goto L58
            Lb5:
                r4 = move-exception
                goto L6c
            Lb9:
                r4 = move-exception
                goto L77
            Lbd:
                r4 = move-exception
                goto L82
            Lc1:
                r4 = move-exception
                goto L8d
            Lc5:
                r4 = move-exception
                goto L98
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.request.metrics.AdOperationMetric.AnonymousClass2.m6644clinit():void");
        }
    }

    private static HashMap<String, String> getTags(AdOperationError adOperationError, boolean z, boolean z2, Boolean bool) {
        return new HashMap<String, String>(z, adOperationError == null ? "unknown" : adOperationError.toString(), z2 ? AD_TYPE_BANNER : "video", bool) { // from class: com.unity3d.services.core.request.metrics.AdOperationMetric.1
            final String val$errorMetric;
            final boolean val$isFailure;
            final Boolean val$isHb;
            final String val$type;

            {
                this.val$isFailure = z;
                this.val$errorMetric = r6;
                this.val$type = r7;
                this.val$isHb = bool;
                if (z) {
                    put("reason", r6);
                }
                put("type", r7);
                if (bool != null) {
                    put(AdOperationMetric.AD_IS_HEADER_BIDDING, String.valueOf(bool));
                }
            }
        };
    }

    private static AdOperationError mapUnityAdsLoadError(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return AdOperationError.init_failed;
        }
        if (i == 2) {
            return AdOperationError.internal;
        }
        if (i == 3) {
            return AdOperationError.invalid;
        }
        if (i == 4) {
            return AdOperationError.no_fill;
        }
        if (i != 5) {
            return null;
        }
        return AdOperationError.timeout;
    }

    private static AdOperationError mapUnityAdsShowError(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (AnonymousClass2.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                return AdOperationError.init_failed;
            case 2:
                return AdOperationError.not_ready;
            case 3:
                return AdOperationError.player;
            case 4:
                return AdOperationError.invalid;
            case 5:
                return AdOperationError.no_connection;
            case 6:
                return AdOperationError.already_showing;
            case 7:
                return AdOperationError.internal;
            default:
                return null;
        }
    }

    public static Metric newAdLoadFailure(UnityAds.UnityAdsLoadError unityAdsLoadError, Long l, boolean z, boolean z2) {
        return newAdLoadFailure(mapUnityAdsLoadError(unityAdsLoadError), l, z, z2);
    }

    public static Metric newAdLoadFailure(AdOperationError adOperationError, Long l, boolean z, boolean z2) {
        return new Metric(AD_LOAD_FAIL, l, getTags(adOperationError, true, z, Boolean.valueOf(z2)));
    }

    public static Metric newAdLoadStart(boolean z, boolean z2) {
        return new Metric("native_load_started", null, getTags(null, false, z, Boolean.valueOf(z2)));
    }

    public static Metric newAdLoadSuccess(Long l, boolean z, boolean z2) {
        return new Metric(AD_LOAD_SUCCESS, l, getTags(null, false, z, Boolean.valueOf(z2)));
    }

    public static Metric newAdShowFailure(UnityAds.UnityAdsShowError unityAdsShowError, Long l) {
        return newAdShowFailure(mapUnityAdsShowError(unityAdsShowError), l);
    }

    public static Metric newAdShowFailure(AdOperationError adOperationError, Long l) {
        return new Metric(AD_SHOW_FAIL, l, getTags(adOperationError, true, false, null));
    }

    public static Metric newAdShowStart() {
        return new Metric("native_show_started", null, getTags(null, false, false, null));
    }

    public static Metric newAdShowSuccess(Long l) {
        return new Metric(AD_SHOW_SUCCESS, l, getTags(null, false, false, null));
    }
}
