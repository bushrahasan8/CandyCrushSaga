package com.facebook.appevents.iap;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: InAppPurchaseBillingClientWrapper.class */
public final class InAppPurchaseBillingClientWrapper {
    private static InAppPurchaseBillingClientWrapper instance;
    private final Object billingClient;
    private final Class billingClientClazz;
    private final Context context;
    private final Method getOriginalJsonMethod;
    private final Method getOriginalJsonPurchaseHistoryMethod;
    private final Method getOriginalJsonSkuMethod;
    private final Method getPurchaseListMethod;
    private final Set historyPurchaseSet;
    private final InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper;
    private final Class purchaseClazz;
    private final Class purchaseHistoryRecordClazz;
    private final Class purchaseHistoryResponseListenerClazz;
    private final Class purchaseResultClazz;
    private final Method queryPurchaseHistoryAsyncMethod;
    private final Method queryPurchasesMethod;
    private final Method querySkuDetailsAsyncMethod;
    private final Class skuDetailsClazz;
    private final Class skuDetailsResponseListenerClazz;
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean initialized = new AtomicBoolean(false);
    private static final AtomicBoolean isServiceConnected = new AtomicBoolean(false);
    private static final Map purchaseDetailsMap = new ConcurrentHashMap();
    private static final Map skuDetailsMap = new ConcurrentHashMap();

    /* loaded from: InAppPurchaseBillingClientWrapper$BillingClientStateListenerWrapper.class */
    public static final class BillingClientStateListenerWrapper implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m, "m");
            if (Intrinsics.areEqual(m.getName(), "onBillingSetupFinished")) {
                InAppPurchaseBillingClientWrapper.Companion.isServiceConnected().set(true);
                return null;
            }
            String name = m.getName();
            Intrinsics.checkNotNullExpressionValue(name, "m.name");
            if (!StringsKt.endsWith$default(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                return null;
            }
            InAppPurchaseBillingClientWrapper.Companion.isServiceConnected().set(false);
            return null;
        }
    }

    /* loaded from: InAppPurchaseBillingClientWrapper$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object createBillingClient(Context context, Class cls) {
            Class cls2 = InAppPurchaseUtils.getClass("com.android.billingclient.api.BillingClient$Builder");
            Class cls3 = InAppPurchaseUtils.getClass("com.android.billingclient.api.PurchasesUpdatedListener");
            Object obj = null;
            if (cls2 != null) {
                if (cls3 == null) {
                    obj = null;
                } else {
                    Method method = InAppPurchaseUtils.getMethod(cls, "newBuilder", Context.class);
                    Method method2 = InAppPurchaseUtils.getMethod(cls2, "enablePendingPurchases", new Class[0]);
                    Method method3 = InAppPurchaseUtils.getMethod(cls2, "setListener", cls3);
                    Method method4 = InAppPurchaseUtils.getMethod(cls2, "build", new Class[0]);
                    obj = null;
                    if (method != null) {
                        obj = null;
                        if (method2 != null) {
                            obj = null;
                            if (method3 != null) {
                                if (method4 == null) {
                                    obj = null;
                                } else {
                                    Object invokeMethod = InAppPurchaseUtils.invokeMethod(cls, method, null, context);
                                    if (invokeMethod == null) {
                                        return null;
                                    }
                                    Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(cls2, method3, invokeMethod, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new PurchasesUpdatedListenerWrapper()));
                                    if (invokeMethod2 == null) {
                                        return null;
                                    }
                                    Object invokeMethod3 = InAppPurchaseUtils.invokeMethod(cls2, method2, invokeMethod2, new Object[0]);
                                    obj = invokeMethod3 == null ? null : InAppPurchaseUtils.invokeMethod(cls2, method4, invokeMethod3, new Object[0]);
                                }
                            }
                        }
                    }
                }
            }
            return obj;
        }

        private final void createInstance(Context context) {
            Object createBillingClient;
            InAppPurchaseSkuDetailsWrapper orCreateInstance = InAppPurchaseSkuDetailsWrapper.Companion.getOrCreateInstance();
            if (orCreateInstance == null) {
                return;
            }
            Class cls = InAppPurchaseUtils.getClass("com.android.billingclient.api.BillingClient");
            Class cls2 = InAppPurchaseUtils.getClass("com.android.billingclient.api.Purchase");
            Class cls3 = InAppPurchaseUtils.getClass("com.android.billingclient.api.Purchase$PurchasesResult");
            Class cls4 = InAppPurchaseUtils.getClass("com.android.billingclient.api.SkuDetails");
            Class cls5 = InAppPurchaseUtils.getClass("com.android.billingclient.api.PurchaseHistoryRecord");
            Class cls6 = InAppPurchaseUtils.getClass("com.android.billingclient.api.SkuDetailsResponseListener");
            Class cls7 = InAppPurchaseUtils.getClass("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (cls == null || cls3 == null || cls2 == null || cls4 == null || cls6 == null || cls5 == null || cls7 == null) {
                return;
            }
            Method method = InAppPurchaseUtils.getMethod(cls, "queryPurchases", String.class);
            Method method2 = InAppPurchaseUtils.getMethod(cls3, "getPurchasesList", new Class[0]);
            Method method3 = InAppPurchaseUtils.getMethod(cls2, "getOriginalJson", new Class[0]);
            Method method4 = InAppPurchaseUtils.getMethod(cls4, "getOriginalJson", new Class[0]);
            Method method5 = InAppPurchaseUtils.getMethod(cls5, "getOriginalJson", new Class[0]);
            Method method6 = InAppPurchaseUtils.getMethod(cls, "querySkuDetailsAsync", orCreateInstance.getSkuDetailsParamsClazz(), cls6);
            Method method7 = InAppPurchaseUtils.getMethod(cls, "queryPurchaseHistoryAsync", String.class, cls7);
            if (method == null || method2 == null || method3 == null || method4 == null || method5 == null || method6 == null || method7 == null || (createBillingClient = createBillingClient(context, cls)) == null) {
                return;
            }
            InAppPurchaseBillingClientWrapper.instance = new InAppPurchaseBillingClientWrapper(context, createBillingClient, cls, cls3, cls2, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, orCreateInstance, null);
            InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper = InAppPurchaseBillingClientWrapper.instance;
            Intrinsics.checkNotNull(inAppPurchaseBillingClientWrapper, "null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            inAppPurchaseBillingClientWrapper.startConnection();
        }

        public final InAppPurchaseBillingClientWrapper getOrCreateInstance(Context context) {
            synchronized (this) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (InAppPurchaseBillingClientWrapper.initialized.get()) {
                    return InAppPurchaseBillingClientWrapper.instance;
                }
                createInstance(context);
                InAppPurchaseBillingClientWrapper.initialized.set(true);
                return InAppPurchaseBillingClientWrapper.instance;
            }
        }

        public final Map getPurchaseDetailsMap() {
            return InAppPurchaseBillingClientWrapper.purchaseDetailsMap;
        }

        public final Map getSkuDetailsMap() {
            return InAppPurchaseBillingClientWrapper.skuDetailsMap;
        }

        public final AtomicBoolean isServiceConnected() {
            return InAppPurchaseBillingClientWrapper.isServiceConnected;
        }
    }

    /* loaded from: InAppPurchaseBillingClientWrapper$PurchaseHistoryResponseListenerWrapper.class */
    public final class PurchaseHistoryResponseListenerWrapper implements InvocationHandler {
        private Runnable runnable;
        final InAppPurchaseBillingClientWrapper this$0;

        public PurchaseHistoryResponseListenerWrapper(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.this$0 = inAppPurchaseBillingClientWrapper;
            this.runnable = runnable;
        }

        private final void getPurchaseHistoryRecord(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.this$0.purchaseHistoryRecordClazz, this.this$0.getOriginalJsonPurchaseHistoryMethod, it.next(), new Object[0]);
                    String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.this$0.context.getPackageName());
                        if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                            String skuID = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                            this.this$0.historyPurchaseSet.add(skuID);
                            Map purchaseDetailsMap = InAppPurchaseBillingClientWrapper.Companion.getPurchaseDetailsMap();
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            purchaseDetailsMap.put(skuID, jSONObject);
                        }
                    }
                } catch (Exception e) {
                }
            }
            this.runnable.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (!Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                return null;
            }
            Object obj = objArr != null ? objArr[1] : null;
            if (obj == null || !(obj instanceof List)) {
                return null;
            }
            getPurchaseHistoryRecord((List) obj);
            return null;
        }
    }

    /* loaded from: InAppPurchaseBillingClientWrapper$PurchasesUpdatedListenerWrapper.class */
    public static final class PurchasesUpdatedListenerWrapper implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m, "m");
            return null;
        }
    }

    /* loaded from: InAppPurchaseBillingClientWrapper$SkuDetailsResponseListenerWrapper.class */
    public final class SkuDetailsResponseListenerWrapper implements InvocationHandler {
        private Runnable runnable;
        final InAppPurchaseBillingClientWrapper this$0;

        public SkuDetailsResponseListenerWrapper(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.this$0 = inAppPurchaseBillingClientWrapper;
            this.runnable = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(m, "m");
            if (!Intrinsics.areEqual(m.getName(), "onSkuDetailsResponse")) {
                return null;
            }
            Object obj = objArr != null ? objArr[1] : null;
            if (obj == null || !(obj instanceof List)) {
                return null;
            }
            parseSkuDetails((List) obj);
            return null;
        }

        public final void parseSkuDetails(List skuDetailsObjectList) {
            Intrinsics.checkNotNullParameter(skuDetailsObjectList, "skuDetailsObjectList");
            Iterator it = skuDetailsObjectList.iterator();
            while (it.hasNext()) {
                try {
                    Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.this$0.skuDetailsClazz, this.this$0.getOriginalJsonSkuMethod, it.next(), new Object[0]);
                    String str = invokeMethod instanceof String ? (String) invokeMethod : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                            String skuID = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                            Map skuDetailsMap = InAppPurchaseBillingClientWrapper.Companion.getSkuDetailsMap();
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            skuDetailsMap.put(skuID, jSONObject);
                        }
                    }
                } catch (Exception e) {
                }
            }
            this.runnable.run();
        }
    }

    private InAppPurchaseBillingClientWrapper(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper) {
        this.context = context;
        this.billingClient = obj;
        this.billingClientClazz = cls;
        this.purchaseResultClazz = cls2;
        this.purchaseClazz = cls3;
        this.skuDetailsClazz = cls4;
        this.purchaseHistoryRecordClazz = cls5;
        this.skuDetailsResponseListenerClazz = cls6;
        this.purchaseHistoryResponseListenerClazz = cls7;
        this.queryPurchasesMethod = method;
        this.getPurchaseListMethod = method2;
        this.getOriginalJsonMethod = method3;
        this.getOriginalJsonSkuMethod = method4;
        this.getOriginalJsonPurchaseHistoryMethod = method5;
        this.querySkuDetailsAsyncMethod = method6;
        this.queryPurchaseHistoryAsyncMethod = method7;
        this.inAppPurchaseSkuDetailsWrapper = inAppPurchaseSkuDetailsWrapper;
        this.historyPurchaseSet = new CopyOnWriteArraySet();
    }

    public /* synthetic */ InAppPurchaseBillingClientWrapper(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, InAppPurchaseSkuDetailsWrapper inAppPurchaseSkuDetailsWrapper, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, inAppPurchaseSkuDetailsWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryPurchaseHistory$lambda$0(InAppPurchaseBillingClientWrapper this$0, Runnable queryPurchaseHistoryRunnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
        this$0.querySkuDetailsAsync("inapp", new ArrayList(this$0.historyPurchaseSet), queryPurchaseHistoryRunnable);
    }

    private final void queryPurchaseHistoryAsync(String str, Runnable runnable) {
        InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchaseHistoryAsyncMethod, this.billingClient, str, Proxy.newProxyInstance(this.purchaseHistoryResponseListenerClazz.getClassLoader(), new Class[]{this.purchaseHistoryResponseListenerClazz}, new PurchaseHistoryResponseListenerWrapper(this, runnable)));
    }

    private final void querySkuDetailsAsync(String str, List list, Runnable runnable) {
        Object newProxyInstance = Proxy.newProxyInstance(this.skuDetailsResponseListenerClazz.getClassLoader(), new Class[]{this.skuDetailsResponseListenerClazz}, new SkuDetailsResponseListenerWrapper(this, runnable));
        InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.querySkuDetailsAsyncMethod, this.billingClient, this.inAppPurchaseSkuDetailsWrapper.getSkuDetailsParams(str, list), newProxyInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConnection() {
        Method method;
        Class cls = InAppPurchaseUtils.getClass("com.android.billingclient.api.BillingClientStateListener");
        if (cls == null || (method = InAppPurchaseUtils.getMethod(this.billingClientClazz, "startConnection", cls)) == null) {
            return;
        }
        InAppPurchaseUtils.invokeMethod(this.billingClientClazz, method, this.billingClient, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new BillingClientStateListenerWrapper()));
    }

    public final void queryPurchase(String skuType, Runnable querySkuRunnable) {
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
        Object invokeMethod = InAppPurchaseUtils.invokeMethod(this.purchaseResultClazz, this.getPurchaseListMethod, InAppPurchaseUtils.invokeMethod(this.billingClientClazz, this.queryPurchasesMethod, this.billingClient, "inapp"), new Object[0]);
        List list = invokeMethod instanceof List ? (List) invokeMethod : null;
        if (list == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object invokeMethod2 = InAppPurchaseUtils.invokeMethod(this.purchaseClazz, this.getOriginalJsonMethod, it.next(), new Object[0]);
                String str = invokeMethod2 instanceof String ? (String) invokeMethod2 : null;
                if (str != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
                        String skuID = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                        arrayList.add(skuID);
                        Map map = purchaseDetailsMap;
                        Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                        map.put(skuID, jSONObject);
                    }
                }
            }
            querySkuDetailsAsync(skuType, arrayList, querySkuRunnable);
        } catch (JSONException e) {
        }
    }

    public final void queryPurchaseHistory(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        Intrinsics.checkNotNullParameter(skuType, "skuType");
        Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
        queryPurchaseHistoryAsync(skuType, new Runnable(this, queryPurchaseHistoryRunnable) { // from class: com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper$$ExternalSyntheticLambda0
            public final InAppPurchaseBillingClientWrapper f$0;
            public final Runnable f$1;

            {
                this.f$0 = this;
                this.f$1 = queryPurchaseHistoryRunnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InAppPurchaseBillingClientWrapper.queryPurchaseHistory$lambda$0(this.f$0, this.f$1);
            }
        });
    }
}
