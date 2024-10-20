package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: IronSourceAdapterUtils.class */
public abstract class IronSourceAdapterUtils {
    public static boolean canLoadIronSourceAdInstance(String str, ConcurrentHashMap concurrentHashMap) {
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(str);
        return weakReference == null || weakReference.get() == null;
    }

    public static String getAdapterVersion() {
        return "7.9.0.0";
    }

    public static ISBannerSize getISBannerSizeFromGoogleAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.MEDIUM_RECTANGLE;
        arrayList.add(adSize3);
        AdSize adSize4 = AdSize.LARGE_BANNER;
        arrayList.add(adSize4);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        return adSize2.equals(findClosestSize) ? ISBannerSize.BANNER : adSize3.equals(findClosestSize) ? ISBannerSize.RECTANGLE : adSize4.equals(findClosestSize) ? ISBannerSize.LARGE : new ISBannerSize(findClosestSize.getWidth(), findClosestSize.getHeight());
    }

    public static AdError validateIronSourceAdLoadParams(Context context, String str) {
        if (!(context instanceof Activity)) {
            return new AdError(102, "IronSource requires an Activity context to load ads.", IronSourceMediationAdapter.ERROR_DOMAIN);
        }
        if (TextUtils.isEmpty(str)) {
            return new AdError(101, "Missing or invalid instance ID.", IronSourceMediationAdapter.ERROR_DOMAIN);
        }
        return null;
    }
}
