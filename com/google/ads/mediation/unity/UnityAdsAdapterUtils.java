package com.google.ads.mediation.unity;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.ArrayList;

/* loaded from: UnityAdsAdapterUtils.class */
public abstract class UnityAdsAdapterUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.ads.mediation.unity.UnityAdsAdapterUtils$1, reason: invalid class name */
    /* loaded from: UnityAdsAdapterUtils$1.class */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError;
        static final int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError;
        static final int[] $SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError;
        static final int[] $SwitchMap$com$unity3d$services$banners$BannerErrorCode;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:101:0x012c
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                Method dump skipped, instructions count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.unity.UnityAdsAdapterUtils.AnonymousClass1.m261clinit():void");
        }
    }

    /* loaded from: UnityAdsAdapterUtils$AdEvent.class */
    public enum AdEvent {
        LOADED,
        OPENED,
        CLICKED,
        CLOSED,
        LEFT_APPLICATION,
        IMPRESSION,
        VIDEO_START,
        REWARD,
        VIDEO_COMPLETE
    }

    public static boolean areValidIds(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError createAdError(int i, String str) {
        return new AdError(i, str, "com.unity3d.ads");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError createSDKError(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        return createAdError(getMediationErrorCode(unityAdsInitializationError), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError createSDKError(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        return createAdError(getMediationErrorCode(unityAdsLoadError), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdError createSDKError(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        return createAdError(getMediationErrorCode(unityAdsShowError), str);
    }

    static int getMediationErrorCode(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsInitializationError[unityAdsInitializationError.ordinal()];
        if (i == 1) {
            return 301;
        }
        if (i != 2) {
            return i != 3 ? 300 : 303;
        }
        return 302;
    }

    static int getMediationErrorCode(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsLoadError[unityAdsLoadError.ordinal()];
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
        switch (AnonymousClass1.$SwitchMap$com$unity3d$ads$UnityAds$UnityAdsShowError[unityAdsShowError.ordinal()]) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getMediationErrorCode(BannerErrorInfo bannerErrorInfo) {
        int i = AnonymousClass1.$SwitchMap$com$unity3d$services$banners$BannerErrorCode[bannerErrorInfo.errorCode.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? 200 : 204 : 203 : 202 : 201;
    }

    public static UnityBannerSize getUnityBannerSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize != null) {
            return new UnityBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
        }
        return null;
    }

    public static void setCoppa(int i, Context context) {
        MetaData metaData = new MetaData(context);
        if (i == 0) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }
}
