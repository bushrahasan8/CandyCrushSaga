package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.class */
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2 implements Application.ActivityLifecycleCallbacks {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResumed$lambda$0() {
        Object obj;
        Object obj2;
        Context applicationContext = FacebookSdk.getApplicationContext();
        obj = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        ArrayList purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, obj);
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = InAppPurchaseActivityLifecycleTracker.INSTANCE;
        inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, purchasesInapp, false);
        obj2 = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        inAppPurchaseActivityLifecycleTracker.logPurchase(applicationContext, InAppPurchaseEventManager.getPurchasesSubs(applicationContext, obj2), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityStopped$lambda$1() {
        Object obj;
        Object obj2;
        Context applicationContext = FacebookSdk.getApplicationContext();
        obj = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
        ArrayList purchasesInapp = InAppPurchaseEventManager.getPurchasesInapp(applicationContext, obj);
        ArrayList arrayList = purchasesInapp;
        if (purchasesInapp.isEmpty()) {
            obj2 = InAppPurchaseActivityLifecycleTracker.inAppBillingObj;
            arrayList = InAppPurchaseEventManager.getPurchaseHistoryInapp(applicationContext, obj2);
        }
        InAppPurchaseActivityLifecycleTracker.INSTANCE.logPurchase(applicationContext, arrayList, false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.onActivityResumed$lambda$0();
                }
            });
        } catch (Exception e) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            bool = InAppPurchaseActivityLifecycleTracker.hasBillingActivity;
            if (Intrinsics.areEqual(bool, Boolean.TRUE) && Intrinsics.areEqual(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2.onActivityStopped$lambda$1();
                    }
                });
            }
        } catch (Exception e) {
        }
    }
}
