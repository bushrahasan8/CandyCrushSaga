package com.king.store;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.king.store.BillingManager;
import com.king.store.BillingScheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: BillingManager.class */
public class BillingManager implements PurchasesUpdatedListener, ConsumeResponseListener, BillingClientStateListener, SkuDetailsResponseListener, AcknowledgePurchaseResponseListener, PurchasesResponseListener {
    private static final String TAG = "com.king.store.BillingManager";
    private Activity mActivity;
    private BillingClient mBillingClient;
    private BillingManagerListener mBillingManagerListener;
    private Map<String, SkuDetails> mSkuDetails = new HashMap();
    private BillingQueue mBillingQueue = new BillingQueue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.store.BillingManager$8, reason: invalid class name */
    /* loaded from: BillingManager$8.class */
    public class AnonymousClass8 implements Runnable {
        final BillingManager this$0;
        final BillingResult val$billingResult;
        final List val$list;

        AnonymousClass8(BillingManager billingManager, BillingResult billingResult, List list) {
            this.this$0 = billingManager;
            this.val$billingResult = billingResult;
            this.val$list = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(BillingResult billingResult, List list) {
            ArrayList arrayList;
            if (billingResult.getResponseCode() == 0) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Purchase purchase = (Purchase) it.next();
                            if (purchase.getPurchaseState() == 2) {
                                Log.e(BillingManager.TAG, "Support for pending purchases is disabled. We shouldn't be in this state!");
                            }
                            if (purchase.getPurchaseState() == 1) {
                                arrayList2.add(purchase);
                            }
                        }
                        arrayList = arrayList2;
                    } catch (Exception e) {
                        arrayList = arrayList2;
                        e = e;
                        Log.e(BillingManager.TAG, "Got exception while processing purchase: " + e.getMessage());
                        this.this$0.mBillingManagerListener.onBillingPurchasesUpdated(billingResult, arrayList);
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = null;
                }
            } else {
                Log.e(BillingManager.TAG, "Something went very wrong when purchasing. Error code: " + billingResult.getResponseCode());
                Log.e(BillingManager.TAG, "Debug message: " + billingResult.getDebugMessage());
                arrayList = null;
            }
            this.this$0.mBillingManagerListener.onBillingPurchasesUpdated(billingResult, arrayList);
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler findUiHandler = this.this$0.findUiHandler();
            final BillingResult billingResult = this.val$billingResult;
            final List list = this.val$list;
            findUiHandler.post(new Runnable(this, billingResult, list) { // from class: com.king.store.BillingManager$8$$ExternalSyntheticLambda0
                public final BillingManager.AnonymousClass8 f$0;
                public final BillingResult f$1;
                public final List f$2;

                {
                    this.f$0 = this;
                    this.f$1 = billingResult;
                    this.f$2 = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$run$0(this.f$1, this.f$2);
                }
            });
        }
    }

    public BillingManager(Activity activity, BillingManagerListener billingManagerListener) {
        this.mActivity = activity;
        this.mBillingManagerListener = billingManagerListener;
    }

    private void connectToGooglePlayService() {
        Log.i(TAG, "Connecting to Google Play");
        this.mBillingClient.startConnection(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Handler findUiHandler() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAcknowledgePurchaseResponse$2(BillingResult billingResult) {
        if (billingResult.getResponseCode() != 0) {
            String str = TAG;
            Log.e(str, "Something went very wrong when acknowledging. Error code: " + billingResult.getResponseCode());
            Log.e(str, "Debug message: " + billingResult.getDebugMessage());
        }
        this.mBillingManagerListener.onBillingAcknowledgeResponse(billingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConsumeResponse$1(BillingResult billingResult, String str) {
        if (billingResult.getResponseCode() != 0) {
            String str2 = TAG;
            Log.e(str2, "Something went very wrong when consuming. Error code: " + billingResult.getResponseCode());
            Log.e(str2, "Debug message: " + billingResult.getDebugMessage());
        } else {
            Log.i(TAG, "Purchase successfully consumed with token: " + str);
        }
        this.mBillingManagerListener.onBillingConsumeResponse(billingResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onQueryPurchasesResponse$3(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() != 0) {
            String str = TAG;
            Log.e(str, "Something went very wrong when querying purchases. Error code: " + billingResult.getResponseCode());
            Log.e(str, "Debug message: " + billingResult.getDebugMessage());
        }
        this.mBillingManagerListener.onBillingQueryPurchasesFinished(billingResult, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSkuDetailsResponse$0(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SkuDetails skuDetails = (SkuDetails) it.next();
                this.mSkuDetails.put(skuDetails.getSku(), skuDetails);
            }
        } else {
            String str = TAG;
            Log.e(str, "Something went very wrong when querying for sku details. Error code: " + billingResult.getResponseCode());
            Log.e(str, "Debug message: " + billingResult.getDebugMessage());
        }
        this.mBillingManagerListener.onBillingQuerySkuDetailsFinished(billingResult, list);
    }

    public void acknowledgePurchase(String str) {
        throw new UnsupportedOperationException("The Acknowledge feature is not yet supported!");
    }

    public void connect() {
        Log.i(TAG, "Business layer wants to connect.");
        try {
            this.mBillingClient = BillingClient.newBuilder(this.mActivity).setListener(this).enablePendingPurchases().build();
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        connectToGooglePlayService();
    }

    public void consumePurchase(String str) {
        BillingClient billingClient = this.mBillingClient;
        if (billingClient == null || !billingClient.isReady()) {
            Log.e(TAG, "Billing client is not ready or setup properly! Will abort action.");
            return;
        }
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this, str) { // from class: com.king.store.BillingManager.4
            final BillingManager this$0;
            final String val$purchaseToken;

            {
                this.this$0 = this;
                this.val$purchaseToken = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.this$0.mBillingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(this.val$purchaseToken).build(), this.this$0);
                } catch (Exception e) {
                    Log.e(BillingManager.TAG, "Could not consume purchase token(" + this.val$purchaseToken + ") with exception: " + e.getMessage());
                }
            }
        });
        billingScheduler.submit(this.mBillingQueue);
    }

    public void disconnect() {
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this) { // from class: com.king.store.BillingManager.3
            final BillingManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i(BillingManager.TAG, "Business layer wants to disconnect.");
                if (this.this$0.mBillingClient.isReady()) {
                    this.this$0.mBillingClient.endConnection();
                } else {
                    Log.e(BillingManager.TAG, "Billing client not ready to end connection.");
                }
            }
        });
        billingScheduler.willChangeStateTo(BillingScheduler.BillingState.DISCONNECTED);
        billingScheduler.submit(this.mBillingQueue);
    }

    public void onAcknowledgePurchaseResponse(final BillingResult billingResult) {
        findUiHandler().post(new Runnable(this, billingResult) { // from class: com.king.store.BillingManager$$ExternalSyntheticLambda2
            public final BillingManager f$0;
            public final BillingResult f$1;

            {
                this.f$0 = this;
                this.f$1 = billingResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onAcknowledgePurchaseResponse$2(this.f$1);
            }
        });
    }

    public void onBillingServiceDisconnected() {
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this) { // from class: com.king.store.BillingManager.2
            final BillingManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Log.i(BillingManager.TAG, "Disconnected from Google Play.");
            }
        });
        billingScheduler.willChangeStateTo(BillingScheduler.BillingState.DISCONNECTED);
        billingScheduler.submit(this.mBillingQueue);
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this, billingResult) { // from class: com.king.store.BillingManager.1
            final BillingManager this$0;
            final BillingResult val$billingResult;

            {
                this.this$0 = this;
                this.val$billingResult = billingResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mBillingClient.isReady()) {
                    Log.i(BillingManager.TAG, "Connected to Google Play.");
                } else {
                    Log.e(BillingManager.TAG, "Billing client not ready to start a new connection");
                }
                this.this$0.mBillingManagerListener.onBillingSetupFinished(this.val$billingResult);
            }
        });
        billingScheduler.willChangeStateTo(BillingScheduler.BillingState.CONNECTED);
        billingScheduler.submit(this.mBillingQueue);
    }

    public void onConsumeResponse(final BillingResult billingResult, final String str) {
        findUiHandler().post(new Runnable(this, billingResult, str) { // from class: com.king.store.BillingManager$$ExternalSyntheticLambda3
            public final BillingManager f$0;
            public final BillingResult f$1;
            public final String f$2;

            {
                this.f$0 = this;
                this.f$1 = billingResult;
                this.f$2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onConsumeResponse$1(this.f$1, this.f$2);
            }
        });
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new AnonymousClass8(this, billingResult, list));
        billingScheduler.willChangeStateTo(BillingScheduler.BillingState.PURCHASE_FINISHED);
        billingScheduler.submit(this.mBillingQueue);
    }

    public void onQueryPurchasesResponse(final BillingResult billingResult, final List<Purchase> list) {
        findUiHandler().post(new Runnable(this, billingResult, list) { // from class: com.king.store.BillingManager$$ExternalSyntheticLambda1
            public final BillingManager f$0;
            public final BillingResult f$1;
            public final List f$2;

            {
                this.f$0 = this;
                this.f$1 = billingResult;
                this.f$2 = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onQueryPurchasesResponse$3(this.f$1, this.f$2);
            }
        });
    }

    public void onSkuDetailsResponse(final BillingResult billingResult, final List<SkuDetails> list) {
        findUiHandler().post(new Runnable(this, billingResult, list) { // from class: com.king.store.BillingManager$$ExternalSyntheticLambda0
            public final BillingManager f$0;
            public final BillingResult f$1;
            public final List f$2;

            {
                this.f$0 = this;
                this.f$1 = billingResult;
                this.f$2 = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onSkuDetailsResponse$0(this.f$1, this.f$2);
            }
        });
    }

    public void purchase(String str) {
        BillingClient billingClient = this.mBillingClient;
        if (billingClient == null || !billingClient.isReady()) {
            Log.e(TAG, "Billing client is not ready or setup properly! Will abort action.");
            return;
        }
        SkuDetails skuDetails = this.mSkuDetails.get(str);
        if (skuDetails == null) {
            Log.e(TAG, "The SKU that you're trying to use when purchasing doesn't exist in  the internal cache. Did you run querySkuDetails before?");
            return;
        }
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this, skuDetails, str) { // from class: com.king.store.BillingManager.5
            final BillingManager this$0;
            final SkuDetails val$details;
            final String val$sku;

            {
                this.this$0 = this;
                this.val$details = skuDetails;
                this.val$sku = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
                    newBuilder.setSkuDetails(this.val$details);
                    if (this.this$0.mBillingClient.launchBillingFlow(this.this$0.mActivity, newBuilder.build()) == null) {
                        Log.e(BillingManager.TAG, "Result from purchase with sku=" + this.val$sku + " is null!");
                    }
                } catch (Exception e) {
                    Log.e(BillingManager.TAG, "Could not purchase sku: " + this.val$sku);
                }
            }
        });
        billingScheduler.willChangeStateTo(BillingScheduler.BillingState.PURCHASE_ONGOING);
        billingScheduler.submit(this.mBillingQueue);
    }

    public void queryPurchases() {
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this) { // from class: com.king.store.BillingManager.7
            final BillingManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.mBillingClient != null && this.this$0.mBillingClient.isReady()) {
                    this.this$0.mBillingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), this.this$0);
                    return;
                }
                BillingResult.Builder newBuilder = BillingResult.newBuilder();
                newBuilder.setResponseCode(6);
                newBuilder.setDebugMessage("Billing client is not ready or setup properly!");
                BillingResult build = newBuilder.build();
                Log.e(BillingManager.TAG, "Debug message: " + build.getDebugMessage());
                this.this$0.mBillingManagerListener.onBillingQueryPurchasesFinished(build, null);
            }
        });
        billingScheduler.submit(this.mBillingQueue);
    }

    public void querySkuDetails(List<String> list) {
        BillingClient billingClient = this.mBillingClient;
        if (billingClient == null || !billingClient.isReady()) {
            Log.e(TAG, "Billing client is not ready or setup properly! Will abort action.");
            return;
        }
        BillingScheduler billingScheduler = new BillingScheduler();
        billingScheduler.enableDebugLogging(false);
        billingScheduler.addAction(new Runnable(this, list) { // from class: com.king.store.BillingManager.6
            final BillingManager this$0;
            final List val$SKUs;

            {
                this.this$0 = this;
                this.val$SKUs = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    SkuDetailsParams.Builder newBuilder = SkuDetailsParams.newBuilder();
                    newBuilder.setSkusList(this.val$SKUs).setType("inapp");
                    newBuilder.build();
                    this.this$0.mBillingClient.querySkuDetailsAsync(newBuilder.build(), this.this$0);
                } catch (Exception e) {
                    Log.e(BillingManager.TAG, "Failed to querySkuDetails with exception: " + e.getMessage());
                }
            }
        });
        billingScheduler.submit(this.mBillingQueue);
    }
}
