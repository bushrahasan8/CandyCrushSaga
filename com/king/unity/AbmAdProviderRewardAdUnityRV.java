package com.king.unity;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.Keep;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.t2;
import com.king.amp.sa.AbmAdProviderRewardAd;
import com.king.amp.sa.AbmAdProviderRewardedAdListener;
import com.king.amp.sa.AdProviderNameValuePairs;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import java.util.HashMap;
import java.util.UUID;

@Keep
/* loaded from: AbmAdProviderRewardAdUnityRV.class */
public class AbmAdProviderRewardAdUnityRV implements AbmAdProviderRewardAd {
    private String LOG_TAG;
    private Activity mActivity;
    private AbmAdProviderRewardedAdListener mListener;
    private String mObjectId;
    private HashMap<String, String> mObjectIdMap = new HashMap<>();
    private String mPlacementId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.unity.AbmAdProviderRewardAdUnityRV$3, reason: invalid class name */
    /* loaded from: AbmAdProviderRewardAdUnityRV$3.class */
    public static abstract /* synthetic */ class AnonymousClass3 {
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
                com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError = r0
                r0 = r4
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L14:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> L99 java.lang.NoSuchFieldError -> L9d
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_READY     // Catch: java.lang.NoSuchFieldError -> L9d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9d
            L1f:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> L9d java.lang.NoSuchFieldError -> La1
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La1
            L2a:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> La1 java.lang.NoSuchFieldError -> La5
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT     // Catch: java.lang.NoSuchFieldError -> La5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La5
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La5
            L35:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> La5 java.lang.NoSuchFieldError -> La9
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.NO_CONNECTION     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
            L40:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> La9 java.lang.NoSuchFieldError -> Lad
                com.unity3d.ads.UnityAds$UnityAdsShowError r1 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING     // Catch: java.lang.NoSuchFieldError -> Lad
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lad
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lad
            L4c:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError     // Catch: java.lang.NoSuchFieldError -> Lad java.lang.NoSuchFieldError -> Lb1
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
                com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError = r0
                r0 = r4
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch: java.lang.NoSuchFieldError -> Lb5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb5
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb5
            L6c:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lb5 java.lang.NoSuchFieldError -> Lb9
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb9
            L77:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lb9 java.lang.NoSuchFieldError -> Lbd
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch: java.lang.NoSuchFieldError -> Lbd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbd
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lbd
            L82:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lbd java.lang.NoSuchFieldError -> Lc1
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch: java.lang.NoSuchFieldError -> Lc1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc1
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc1
            L8d:
                int[] r0 = com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError     // Catch: java.lang.NoSuchFieldError -> Lc1 java.lang.NoSuchFieldError -> Lc5
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
            throw new UnsupportedOperationException("Method not decompiled: com.king.unity.AbmAdProviderRewardAdUnityRV.AnonymousClass3.m6255clinit():void");
        }
    }

    static int getMediationErrorCode(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return 401;
        }
        if (i == 2) {
            return 402;
        }
        if (i == 3) {
            return 403;
        }
        if (i != 4) {
            return i != 5 ? 400 : 405;
        }
        return 404;
    }

    static int getMediationErrorCode(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (AnonymousClass3.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
            case 1:
                return IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE;
            case 2:
                return IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION;
            case 3:
                return 503;
            case 4:
                return 504;
            case 5:
                return IronSourceError.ERROR_CODE_KEY_NOT_SET;
            case 6:
                return IronSourceError.ERROR_CODE_INVALID_KEY_VALUE;
            case 7:
                return 507;
            default:
                return 500;
        }
    }

    public void destroy() {
        this.mListener = null;
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public String getProperty(String str) {
        return (str.equals("isMetadataRequired") || str.equals("isPaidEventRequired")) ? "NO" : "";
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public void load(AdProviderNameValuePairs adProviderNameValuePairs) {
        this.mPlacementId = (String) adProviderNameValuePairs.getValue("adUnitId", "");
        Object value = adProviderNameValuePairs.getValue("targetingKeyValues");
        String str = "";
        if (value != null) {
            this.mListener.logBreadcrumb(this.LOG_TAG, "fetch payload from config");
            String[] strArr = (String[]) value;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                str = "";
                if (i2 >= strArr.length) {
                    break;
                }
                if (strArr[i].equals("unity_bid_payload")) {
                    str = strArr[i2];
                    break;
                }
                i += 2;
            }
        }
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String uuid = UUID.randomUUID().toString();
        this.mObjectId = uuid;
        this.mObjectIdMap.put(uuid, this.mPlacementId);
        unityAdsLoadOptions.setAdMarkup(str);
        unityAdsLoadOptions.setObjectId(this.mObjectId);
        UnityAds.load(this.mPlacementId, unityAdsLoadOptions, new IUnityAdsLoadListener(this) { // from class: com.king.unity.AbmAdProviderRewardAdUnityRV.1
            final AbmAdProviderRewardAdUnityRV this$0;

            {
                this.this$0 = this;
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String str2) {
                if (str2.equals(this.this$0.mPlacementId)) {
                    synchronized (this) {
                        this.this$0.mListener.logBreadcrumb(this.this$0.LOG_TAG, "Internal Unity RV - onUnityAdsAdLoaded to onAdLoaded " + this.this$0.mPlacementId);
                        AdProviderNameValuePairs adProviderNameValuePairs2 = new AdProviderNameValuePairs();
                        adProviderNameValuePairs2.add(t2.k, str2);
                        this.this$0.mListener.onAdLoaded(adProviderNameValuePairs2);
                    }
                }
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String str2, UnityAds.UnityAdsLoadError unityAdsLoadError, String str3) {
                this.this$0.mListener.logBreadcrumb(this.this$0.LOG_TAG, "Internal Unity RV - onUnityAdsFailedToLoad to onLoadFailed " + this.this$0.mPlacementId);
                this.this$0.mListener.onLoadFailed(AbmAdProviderRewardAdUnityRV.getMediationErrorCode(unityAdsLoadError), str3);
            }
        });
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public void setListener(AbmAdProviderRewardedAdListener abmAdProviderRewardedAdListener) {
        this.mListener = abmAdProviderRewardedAdListener;
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public void setLogTag(String str) {
        this.LOG_TAG = "ads_provider_" + str;
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public void setProperty(String str, String str2) {
    }

    @Override // com.king.amp.sa.AbmAdProviderRewardAd
    public void show() {
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(this.mObjectId);
        UnityAds.show(this.mActivity, this.mPlacementId, unityAdsShowOptions, new IUnityAdsShowListener(this) { // from class: com.king.unity.AbmAdProviderRewardAdUnityRV.2
            final AbmAdProviderRewardAdUnityRV this$0;

            {
                this.this$0 = this;
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowClick(String str) {
                this.this$0.mListener.logBreadcrumb(this.this$0.LOG_TAG, "External Unity RV IUnityAdsShowListener - onUnityAdsShowClick " + this.this$0.mPlacementId);
                this.this$0.mListener.onEndCardInfoClicked();
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                    this.this$0.mListener.logBreadcrumb(this.this$0.LOG_TAG, "External Unity RV IUnityAdsShowListener - onUnityAdsShowComplete " + this.this$0.mPlacementId);
                    this.this$0.mListener.onPlayCompleted();
                    this.this$0.mListener.onClosed(true);
                    return;
                }
                if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.SKIPPED) {
                    this.this$0.mListener.onClosed(false);
                    return;
                }
                Log.e(this.this$0.LOG_TAG, "Unhandled UnityAdsShowCompletionState: " + unityAdsShowCompletionState.toString() + "placementID" + this.this$0.mPlacementId);
                this.this$0.mListener.onClosed(false);
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                this.this$0.mListener.logBreadcrumb(this.this$0.LOG_TAG, "External Unity RV IUnityAdsShowListener - onUnityAdsShowFailure " + this.this$0.mPlacementId);
                this.this$0.mListener.onShowFailed(AbmAdProviderRewardAdUnityRV.getMediationErrorCode(unityAdsShowError), str2);
            }

            @Override // com.unity3d.ads.IUnityAdsShowListener
            public void onUnityAdsShowStart(String str) {
                this.this$0.mListener.logBreadcrumb(this.this$0.LOG_TAG, "External Unity RV IUnityAdsShowListener - onUnityAdsShowStart " + this.this$0.mPlacementId);
            }
        });
    }
}
