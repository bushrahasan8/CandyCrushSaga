package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: InAppPurchaseAutoLogger.class */
public final class InAppPurchaseAutoLogger {
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();

    private InAppPurchaseAutoLogger() {
    }

    private final void logPurchase() {
        InAppPurchaseBillingClientWrapper.Companion companion = InAppPurchaseBillingClientWrapper.Companion;
        InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getPurchaseDetailsMap(), companion.getSkuDetailsMap());
        companion.getPurchaseDetailsMap().clear();
    }

    public static final void startIapLogging(Context context) {
        InAppPurchaseBillingClientWrapper.Companion companion;
        InAppPurchaseBillingClientWrapper orCreateInstance;
        Intrinsics.checkNotNullParameter(context, "context");
        if (InAppPurchaseUtils.getClass("com.android.billingclient.api.Purchase") == null || (orCreateInstance = (companion = InAppPurchaseBillingClientWrapper.Companion).getOrCreateInstance(context)) == null || !companion.isServiceConnected().get()) {
            return;
        }
        if (InAppPurchaseLoggerManager.eligibleQueryPurchaseHistory()) {
            orCreateInstance.queryPurchaseHistory("inapp", new Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseAutoLogger.startIapLogging$lambda$0();
                }
            });
        } else {
            orCreateInstance.queryPurchase("inapp", new Runnable() { // from class: com.facebook.appevents.iap.InAppPurchaseAutoLogger$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    InAppPurchaseAutoLogger.startIapLogging$lambda$1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$0() {
        INSTANCE.logPurchase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1() {
        INSTANCE.logPurchase();
    }
}
