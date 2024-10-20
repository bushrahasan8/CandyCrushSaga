package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: CustomTabUtils.class */
public final class CustomTabUtils {
    public static final CustomTabUtils INSTANCE = new CustomTabUtils();
    private static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    private CustomTabUtils() {
    }

    public static final String getChromePackage() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        List<ResolveInfo> queryIntentServices = applicationContext.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
        HashSet hashSet = ArraysKt.toHashSet(CHROME_PACKAGES);
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    public static final String getDefaultRedirectURI() {
        return "fbconnect://cct." + FacebookSdk.getApplicationContext().getPackageName();
    }

    public static final String getValidRedirectURI(String developerDefinedRedirectURI) {
        Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
        return Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), getDefaultRedirectURI()) ? getDefaultRedirectURI() : "";
    }
}
