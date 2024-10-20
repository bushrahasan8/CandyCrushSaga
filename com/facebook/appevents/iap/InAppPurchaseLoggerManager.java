package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: InAppPurchaseLoggerManager.class */
public final class InAppPurchaseLoggerManager {
    private static SharedPreferences sharedPreferences;
    public static final InAppPurchaseLoggerManager INSTANCE = new InAppPurchaseLoggerManager();
    private static final Set cachedPurchaseSet = new CopyOnWriteArraySet();
    private static final Map cachedPurchaseMap = new ConcurrentHashMap();

    private InAppPurchaseLoggerManager() {
    }

    public static final boolean eligibleQueryPurchaseHistory() {
        INSTANCE.readPurchaseCache();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences3 = null;
        }
        long j = sharedPreferences3.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
        if (j != 0 && currentTimeMillis - j < 86400) {
            return false;
        }
        SharedPreferences sharedPreferences4 = sharedPreferences;
        if (sharedPreferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences4 = null;
        }
        sharedPreferences4.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
        return true;
    }

    public static final void filterPurchaseLogging(Map purchaseDetailsMap, Map skuDetailsMap) {
        Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
        Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
        InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
        inAppPurchaseLoggerManager.readPurchaseCache();
        inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_android_sdk_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_android_sdk_core_release(purchaseDetailsMap), skuDetailsMap));
    }

    private final void logPurchases(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null && str2 != null) {
                AutomaticAnalyticsLogger.logPurchase(str, str2, false);
            }
        }
    }

    private final void readPurchaseCache() {
        SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
        SharedPreferences sharedPreferences3 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
        if (sharedPreferences2.contains("LAST_CLEARED_TIME")) {
            sharedPreferences2.edit().clear().apply();
            sharedPreferences3.edit().clear().apply();
        }
        SharedPreferences sharedPreferences4 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences4, "getApplicationContext().…RE, Context.MODE_PRIVATE)");
        sharedPreferences = sharedPreferences4;
        Set set = cachedPurchaseSet;
        SharedPreferences sharedPreferences5 = sharedPreferences4;
        if (sharedPreferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences5 = null;
        }
        Set<String> stringSet = sharedPreferences5.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
        set.addAll(stringSet == null ? new HashSet() : stringSet);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            List split$default = StringsKt.split$default((CharSequence) it.next(), new String[]{";"}, false, 2, 2, (Object) null);
            cachedPurchaseMap.put(split$default.get(0), Long.valueOf(Long.parseLong((String) split$default.get(1))));
        }
        clearOutdatedProductInfoInCache$facebook_android_sdk_core_release();
    }

    public final Map cacheDeDupPurchase$facebook_android_sdk_core_release(Map purchaseDetailsMap) {
        Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        for (Map.Entry entry : MapsKt.toMap(purchaseDetailsMap).entrySet()) {
            String str = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            try {
                if (jSONObject.has("purchaseToken")) {
                    String string = jSONObject.getString("purchaseToken");
                    if (cachedPurchaseMap.containsKey(string)) {
                        purchaseDetailsMap.remove(str);
                    } else {
                        cachedPurchaseSet.add(string + ';' + currentTimeMillis);
                    }
                }
            } catch (Exception e) {
            }
        }
        SharedPreferences sharedPreferences2 = sharedPreferences;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences3 = null;
        }
        sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", cachedPurchaseSet).apply();
        return new HashMap(purchaseDetailsMap);
    }

    public final void clearOutdatedProductInfoInCache$facebook_android_sdk_core_release() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        if (sharedPreferences2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences3 = null;
        }
        long j = sharedPreferences3.getLong("LAST_CLEARED_TIME", 0L);
        if (j == 0) {
            SharedPreferences sharedPreferences4 = sharedPreferences;
            if (sharedPreferences4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences4 = null;
            }
            sharedPreferences4.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            return;
        }
        if (currentTimeMillis - j > 604800) {
            for (Map.Entry entry : MapsKt.toMap(cachedPurchaseMap).entrySet()) {
                String str = (String) entry.getKey();
                long longValue = ((Number) entry.getValue()).longValue();
                if (currentTimeMillis - longValue > 86400) {
                    cachedPurchaseSet.remove(str + ';' + longValue);
                    cachedPurchaseMap.remove(str);
                }
            }
            SharedPreferences sharedPreferences5 = sharedPreferences;
            if (sharedPreferences5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences5 = null;
            }
            sharedPreferences5.edit().putStringSet("PURCHASE_DETAILS_SET", cachedPurchaseSet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    public final Map constructLoggingReadyMap$facebook_android_sdk_core_release(Map purchaseDetailsMap, Map skuDetailsMap) {
        Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
        Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
            String str = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
            if (jSONObject != null && jSONObject.has("purchaseTime")) {
                try {
                    if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                        String jSONObject3 = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject3, "purchaseDetail.toString()");
                        String jSONObject4 = jSONObject2.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONObject4, "skuDetail.toString()");
                        linkedHashMap.put(jSONObject3, jSONObject4);
                    }
                } catch (Exception e) {
                }
            }
        }
        return linkedHashMap;
    }
}
