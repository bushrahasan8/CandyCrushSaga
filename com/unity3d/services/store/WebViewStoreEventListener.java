package com.unity3d.services.store;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: WebViewStoreEventListener.class */
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i, StoreWebViewEventSender storeWebViewEventSender, boolean z) {
        Intrinsics.checkNotNullParameter(storeWebViewEventSender, "storeWebViewEventSender");
        this.operationId = i;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z;
    }

    public /* synthetic */ WebViewStoreEventListener(int i, StoreWebViewEventSender storeWebViewEventSender, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, storeWebViewEventSender, (i2 & 4) != 0 ? false : z);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(BillingResultBridge billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.INITIALIZATION_REQUEST_RESULT;
            BillingResultResponseCode responseCode = billingResult.getResponseCode();
            Intrinsics.checkNotNullExpressionValue(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.INITIALIZATION_REQUEST_FAILED;
        BillingResultResponseCode responseCode2 = billingResult.getResponseCode();
        Intrinsics.checkNotNullExpressionValue(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode2);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int i) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(i));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPurchaseHistoryUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge r8, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge> r9) {
        /*
            r7 = this;
            r0 = r8
            java.lang.String r1 = "billingResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            com.unity3d.services.store.StoreWebViewEventSender r0 = r0.storeWebViewEventSender
            r12 = r0
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT
            r11 = r0
            r0 = r7
            int r0 = r0.getOperationId()
            r10 = r0
            r0 = r8
            com.unity3d.services.store.gpbl.BillingResultResponseCode r0 = r0.getResponseCode()
            r13 = r0
            r0 = r13
            java.lang.String r1 = "billingResult.responseCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r9
            if (r0 == 0) goto L32
            r0 = r9
            org.json.JSONArray r0 = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(r0)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L3a
        L32:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r8 = r0
        L3a:
            r0 = r12
            r1 = r11
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r8
            r3[r4] = r5
            r0.send(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.WebViewStoreEventListener.onPurchaseHistoryUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r0 == null) goto L11;
     */
    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPurchaseResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge r6, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> r7) {
        /*
            r5 = this;
            r0 = r6
            java.lang.String r1 = "billingResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            int r0 = r0.getOperationId()
            r1 = -1
            if (r0 == r1) goto L22
            r0 = r8
            r1 = r5
            int r1 = r1.getOperationId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L22:
            r0 = r6
            com.unity3d.services.store.gpbl.BillingResultResponseCode r0 = r0.getResponseCode()
            com.unity3d.services.store.gpbl.BillingResultResponseCode r1 = com.unity3d.services.store.gpbl.BillingResultResponseCode.OK
            if (r0 != r1) goto L79
            r0 = r7
            if (r0 == 0) goto L3b
            r0 = r7
            org.json.JSONArray r0 = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(r0)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L43
        L3b:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r6 = r0
        L43:
            r0 = r8
            r1 = r6
            boolean r0 = r0.add(r1)
            r0 = r5
            com.unity3d.services.store.StoreWebViewEventSender r0 = r0.storeWebViewEventSender
            r7 = r0
            r0 = r5
            boolean r0 = r0.isLifecycleListener
            if (r0 == 0) goto L5c
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASES_ON_RESUME_RESULT
            r6 = r0
            goto L60
        L5c:
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASES_REQUEST_RESULT
            r6 = r0
        L60:
            r0 = r8
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = r8
            r3 = r8
            int r3 = r3.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.send(r1, r2)
            goto Laf
        L79:
            r0 = r8
            r1 = r6
            com.unity3d.services.store.gpbl.BillingResultResponseCode r1 = r1.getResponseCode()
            boolean r0 = r0.add(r1)
            r0 = r5
            com.unity3d.services.store.StoreWebViewEventSender r0 = r0.storeWebViewEventSender
            r7 = r0
            r0 = r5
            boolean r0 = r0.isLifecycleListener
            if (r0 == 0) goto L95
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASES_ON_RESUME_ERROR
            r6 = r0
            goto L99
        L95:
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASES_REQUEST_ERROR
            r6 = r0
        L99:
            r0 = r8
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            r8 = r0
            r0 = r7
            r1 = r6
            r2 = r8
            r3 = r8
            int r3 = r3.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.send(r1, r2)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.WebViewStoreEventListener.onPurchaseResponse(com.unity3d.services.store.gpbl.bridges.BillingResultBridge, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPurchaseUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge r8, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.PurchaseBridge> r9) {
        /*
            r7 = this;
            r0 = r8
            java.lang.String r1 = "billingResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r8
            com.unity3d.services.store.gpbl.BillingResultResponseCode r0 = r0.getResponseCode()
            com.unity3d.services.store.gpbl.BillingResultResponseCode r1 = com.unity3d.services.store.gpbl.BillingResultResponseCode.OK
            if (r0 != r1) goto L42
            r0 = r7
            com.unity3d.services.store.StoreWebViewEventSender r0 = r0.storeWebViewEventSender
            r10 = r0
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASES_UPDATED_RESULT
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L29
            r0 = r9
            org.json.JSONArray r0 = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(r0)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L31
        L29:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r8 = r0
        L31:
            r0 = r10
            r1 = r11
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r0.send(r1, r2)
            goto L63
        L42:
            r0 = r7
            com.unity3d.services.store.StoreWebViewEventSender r0 = r0.storeWebViewEventSender
            r10 = r0
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.PURCHASES_UPDATED_ERROR
            r9 = r0
            r0 = r8
            com.unity3d.services.store.gpbl.BillingResultResponseCode r0 = r0.getResponseCode()
            r8 = r0
            r0 = r8
            java.lang.String r1 = "billingResult.responseCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r10
            r1 = r9
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r0.send(r1, r2)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.WebViewStoreEventListener.onPurchaseUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSkuDetailsUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge r8, java.util.List<? extends com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge> r9) {
        /*
            r7 = this;
            r0 = r8
            java.lang.String r1 = "billingResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r7
            com.unity3d.services.store.StoreWebViewEventSender r0 = r0.storeWebViewEventSender
            r12 = r0
            com.unity3d.services.store.StoreEvent r0 = com.unity3d.services.store.StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT
            r11 = r0
            r0 = r7
            int r0 = r0.getOperationId()
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L25
            r0 = r9
            org.json.JSONArray r0 = com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt.toJsonArray(r0)
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L2d
        L25:
            org.json.JSONArray r0 = new org.json.JSONArray
            r1 = r0
            r1.<init>()
            r8 = r0
        L2d:
            r0 = r12
            r1 = r11
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r8
            r3[r4] = r5
            r0.send(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.store.WebViewStoreEventListener.onSkuDetailsUpdated(com.unity3d.services.store.gpbl.bridges.BillingResultBridge, java.util.List):void");
    }
}
