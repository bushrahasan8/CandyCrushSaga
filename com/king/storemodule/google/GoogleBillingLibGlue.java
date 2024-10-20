package com.king.storemodule.google;

import android.app.Activity;
import androidx.annotation.Keep;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;
import com.king.store.BillingManager;
import com.king.store.BillingManagerListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Keep
/* loaded from: GoogleBillingLibGlue.class */
public class GoogleBillingLibGlue implements BillingManagerListener {
    static final boolean $assertionsDisabled = false;
    public static final String TAG = "com.king.storemodule.google.GoogleBillingLibGlue";
    private BillingManager mBillingManager;
    private long mStoreAndroidObject;
    private Queue<Runnable> mMainThreadCallbacks = new ConcurrentLinkedQueue();
    private Activity mMainActivity = ActivityHelper.getInstance().getActivity();

    public GoogleBillingLibGlue(long j) {
        this.mStoreAndroidObject = j;
        BillingManager billingManager = new BillingManager(this.mMainActivity, this);
        this.mBillingManager = billingManager;
        billingManager.connect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onAcknowledgeFinished(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onConsumeFinished(int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onPurchaseFinished(int i, Purchase purchase);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onQueryPurchasesFinished(int i, Purchase[] purchaseArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void onQuerySkuDetailsFinished(int i, SkuDetails[] skuDetailsArr);

    private native void onSetupFinished(int i);

    public void acknowledge(String str) {
        this.mMainActivity.runOnUiThread(new Runnable(this, str) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.4
            final GoogleBillingLibGlue this$0;
            final String val$purchaseToken;

            {
                this.this$0 = this;
                this.val$purchaseToken = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mBillingManager.acknowledgePurchase(this.val$purchaseToken);
            }
        });
    }

    public void consume(String str) {
        this.mMainActivity.runOnUiThread(new Runnable(this, str) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.3
            final GoogleBillingLibGlue this$0;
            final String val$purchaseToken;

            {
                this.this$0 = this;
                this.val$purchaseToken = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mBillingManager.consumePurchase(this.val$purchaseToken);
            }
        });
    }

    public void disconnect() {
        BillingManager billingManager = this.mBillingManager;
        if (billingManager != null) {
            billingManager.disconnect();
        }
        this.mStoreAndroidObject = 0L;
    }

    @Override // com.king.store.BillingManagerListener
    public void onBillingAcknowledgeResponse(BillingResult billingResult) {
        this.mMainThreadCallbacks.add(new Runnable(this, billingResult) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.10
            final GoogleBillingLibGlue this$0;
            final BillingResult val$result;

            {
                this.this$0 = this;
                this.val$result = billingResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.onAcknowledgeFinished(this.val$result.getResponseCode());
            }
        });
    }

    @Override // com.king.store.BillingManagerListener
    public void onBillingConsumeResponse(BillingResult billingResult, String str) {
        this.mMainThreadCallbacks.add(new Runnable(this, billingResult, str) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.9
            final GoogleBillingLibGlue this$0;
            final String val$purchaseToken;
            final BillingResult val$result;

            {
                this.this$0 = this;
                this.val$result = billingResult;
                this.val$purchaseToken = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.onConsumeFinished(this.val$result.getResponseCode(), this.val$purchaseToken);
            }
        });
    }

    @Override // com.king.store.BillingManagerListener
    public void onBillingPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        if (billingResult.getResponseCode() != 0) {
            this.mMainThreadCallbacks.add(new Runnable(this, billingResult) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.8
                final GoogleBillingLibGlue this$0;
                final BillingResult val$result;

                {
                    this.this$0 = this;
                    this.val$result = billingResult;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.onPurchaseFinished(this.val$result.getResponseCode(), null);
                }
            });
            return;
        }
        Iterator<Purchase> it = list.iterator();
        while (it.hasNext()) {
            this.mMainThreadCallbacks.add(new Runnable(this, billingResult, it.next()) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.7
                final GoogleBillingLibGlue this$0;
                final Purchase val$purchase;
                final BillingResult val$result;

                {
                    this.this$0 = this;
                    this.val$result = billingResult;
                    this.val$purchase = r6;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.this$0.onPurchaseFinished(this.val$result.getResponseCode(), this.val$purchase);
                }
            });
        }
    }

    @Override // com.king.store.BillingManagerListener
    public void onBillingQueryPurchasesFinished(BillingResult billingResult, List<Purchase> list) {
        this.mMainThreadCallbacks.add(new Runnable(this, billingResult, list != null ? (Purchase[]) list.toArray(new Purchase[0]) : null) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.11
            final GoogleBillingLibGlue this$0;
            final Purchase[] val$purchases_f;
            final BillingResult val$result;

            {
                this.this$0 = this;
                this.val$result = billingResult;
                this.val$purchases_f = r6;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.onQueryPurchasesFinished(this.val$result.getResponseCode(), this.val$purchases_f);
            }
        });
    }

    @Override // com.king.store.BillingManagerListener
    public void onBillingQuerySkuDetailsFinished(BillingResult billingResult, List<SkuDetails> list) {
        this.mMainThreadCallbacks.add(new Runnable(this, list, billingResult) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.6
            final GoogleBillingLibGlue this$0;
            final List val$details;
            final BillingResult val$result;

            {
                this.this$0 = this;
                this.val$details = list;
                this.val$result = billingResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                List list2 = this.val$details;
                this.this$0.onQuerySkuDetailsFinished(this.val$result.getResponseCode(), list2 != null ? (SkuDetails[]) list2.toArray(new SkuDetails[0]) : null);
            }
        });
    }

    @Override // com.king.store.BillingManagerListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        onSetupFinished(billingResult.getResponseCode());
    }

    public void purchase(String str, String str2, String str3) {
        this.mMainActivity.runOnUiThread(new Runnable(this, str) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.5
            final GoogleBillingLibGlue this$0;
            final String val$sku;

            {
                this.this$0 = this;
                this.val$sku = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mBillingManager.purchase(this.val$sku);
            }
        });
    }

    public void queryPurchases() {
        this.mMainActivity.runOnUiThread(new Runnable(this) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.2
            final GoogleBillingLibGlue this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mBillingManager == null) {
                    Logging.logError(GoogleBillingLibGlue.TAG, "BillingManager null, cannot query for purchases.");
                } else {
                    this.this$0.mBillingManager.queryPurchases();
                }
            }
        });
    }

    public void querySkuDetails(String[] strArr) {
        this.mMainActivity.runOnUiThread(new Runnable(this, strArr) { // from class: com.king.storemodule.google.GoogleBillingLibGlue.1
            final GoogleBillingLibGlue this$0;
            final String[] val$skus;

            {
                this.this$0 = this;
                this.val$skus = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = GoogleBillingLibGlue.TAG;
                Logging.logInfo(str, "querySkuDetails with " + this.val$skus.length + " number of SKUs");
                if (this.this$0.mBillingManager == null) {
                    Logging.logError(str, "BillingManager null, cannot query for sku details.");
                } else {
                    this.this$0.mBillingManager.querySkuDetails(Arrays.asList(this.val$skus));
                }
            }
        });
    }

    public void update() {
        while (true) {
            Runnable poll = this.mMainThreadCallbacks.poll();
            if (poll == null) {
                return;
            } else {
                poll.run();
            }
        }
    }
}
