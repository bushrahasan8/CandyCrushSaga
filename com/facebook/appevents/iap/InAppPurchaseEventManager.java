package com.facebook.appevents.iap;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: InAppPurchaseEventManager.class */
public final class InAppPurchaseEventManager {
    public static final InAppPurchaseEventManager INSTANCE = new InAppPurchaseEventManager();
    private static final HashMap methodMap = new HashMap();
    private static final HashMap classMap = new HashMap();
    private static final String PACKAGE_NAME = FacebookSdk.getApplicationContext().getPackageName();
    private static final SharedPreferences skuDetailSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences purchaseInappSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private InAppPurchaseEventManager() {
    }

    public static final Object asInterface(Context context, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.invokeMethod(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    public static final void clearSkuDetailsCache() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = skuDetailSharedPrefs;
        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
        if (j == 0) {
            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    private final ArrayList filterPurchases(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        SharedPreferences.Editor edit = purchaseInappSharedPrefs.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400 && !Intrinsics.areEqual(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                    edit.putString(string, string2);
                    arrayList2.add(str);
                }
            } catch (JSONException e) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    private final Class getClass(Context context, String str) {
        HashMap hashMap = classMap;
        Class cls = (Class) hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        Class classFromContext$facebook_android_sdk_core_release = InAppPurchaseUtils.getClassFromContext$facebook_android_sdk_core_release(context, str);
        if (classFromContext$facebook_android_sdk_core_release != null) {
            hashMap.put(str, classFromContext$facebook_android_sdk_core_release);
        }
        return classFromContext$facebook_android_sdk_core_release;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Method getMethod(Class cls, String str) {
        Class[] clsArr;
        HashMap hashMap = methodMap;
        Method method = (Method) hashMap.get(str);
        if (method != null) {
            return method;
        }
        switch (str.hashCode()) {
            case -1801122596:
                if (str.equals("getPurchases")) {
                    Class TYPE = Integer.TYPE;
                    Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    break;
                }
                clsArr = null;
                break;
            case -1450694211:
                if (str.equals("isBillingSupported")) {
                    Class TYPE2 = Integer.TYPE;
                    Intrinsics.checkNotNullExpressionValue(TYPE2, "TYPE");
                    clsArr = new Class[]{TYPE2, String.class, String.class};
                    break;
                }
                clsArr = null;
                break;
            case -1123215065:
                if (str.equals("asInterface")) {
                    clsArr = new Class[]{IBinder.class};
                    break;
                }
                clsArr = null;
                break;
            case -594356707:
                if (str.equals("getPurchaseHistory")) {
                    Class TYPE3 = Integer.TYPE;
                    Intrinsics.checkNotNullExpressionValue(TYPE3, "TYPE");
                    clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                    break;
                }
                clsArr = null;
                break;
            case -573310373:
                if (str.equals("getSkuDetails")) {
                    Class TYPE4 = Integer.TYPE;
                    Intrinsics.checkNotNullExpressionValue(TYPE4, "TYPE");
                    clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                    break;
                }
                clsArr = null;
                break;
            default:
                clsArr = null;
                break;
        }
        Method declaredMethod$facebook_android_sdk_core_release = clsArr == null ? InAppPurchaseUtils.getDeclaredMethod$facebook_android_sdk_core_release(cls, str, null) : InAppPurchaseUtils.getDeclaredMethod$facebook_android_sdk_core_release(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        if (declaredMethod$facebook_android_sdk_core_release != null) {
            hashMap.put(str, declaredMethod$facebook_android_sdk_core_release);
        }
        return declaredMethod$facebook_android_sdk_core_release;
    }

    private final ArrayList getPurchaseHistory(Context context, Object obj, String str) {
        boolean z;
        ArrayList<String> stringArrayList;
        ArrayList arrayList = new ArrayList();
        if (isBillingSupported(context, obj, str)) {
            int i = 0;
            boolean z2 = false;
            String str2 = null;
            do {
                Object invokeMethod = invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, PACKAGE_NAME, str, str2, new Bundle()});
                if (invokeMethod != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) invokeMethod;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            z = z2;
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                z = true;
                                break;
                            }
                            arrayList.add(next);
                            i++;
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i < 30 || str2 == null) {
                            break;
                            break;
                        }
                        z2 = z;
                    }
                }
                str2 = null;
                z = z2;
                if (i < 30) {
                    break;
                }
                z2 = z;
            } while (!z);
        }
        return arrayList;
    }

    public static final ArrayList getPurchaseHistoryInapp(Context context, Object obj) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        Class cls;
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        if (obj != null && (cls = (inAppPurchaseEventManager = INSTANCE).getClass(context, "com.android.vending.billing.IInAppBillingService")) != null && inAppPurchaseEventManager.getMethod(cls, "getPurchaseHistory") != null) {
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchaseHistory(context, obj, "inapp"));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[EDGE_INSN: B:22:0x009c->B:25:0x009c BREAK  A[LOOP:0: B:9:0x0020->B:21:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList getPurchases(android.content.Context r11, java.lang.Object r12, java.lang.String r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r12
            if (r0 != 0) goto L10
            r0 = r17
            return r0
        L10:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            boolean r0 = r0.isBillingSupported(r1, r2, r3)
            if (r0 == 0) goto L9c
            r0 = 0
            r14 = r0
            r0 = 0
            r16 = r0
        L20:
            r0 = r10
            r1 = r11
            java.lang.String r2 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r3 = "getPurchases"
            r4 = r12
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = r5
            r7 = 0
            r8 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r6 = r5
            r7 = 1
            java.lang.String r8 = com.facebook.appevents.iap.InAppPurchaseEventManager.PACKAGE_NAME
            r6[r7] = r8
            r6 = r5
            r7 = 2
            r8 = r13
            r6[r7] = r8
            r6 = r5
            r7 = 3
            r8 = r16
            r6[r7] = r8
            java.lang.Object r0 = r0.invokeMethod(r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L89
            r0 = r15
            android.os.Bundle r0 = (android.os.Bundle) r0
            r16 = r0
            r0 = r16
            java.lang.String r1 = "RESPONSE_CODE"
            int r0 = r0.getInt(r1)
            if (r0 != 0) goto L89
            r0 = r16
            java.lang.String r1 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L9c
            r0 = r14
            r1 = r15
            int r1 = r1.size()
            int r0 = r0 + r1
            r14 = r0
            r0 = r17
            r1 = r15
            boolean r0 = r0.addAll(r1)
            r0 = r16
            java.lang.String r1 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r0 = r0.getString(r1)
            r15 = r0
            goto L8c
        L89:
            r0 = 0
            r15 = r0
        L8c:
            r0 = r14
            r1 = 30
            if (r0 >= r1) goto L9c
            r0 = r15
            r16 = r0
            r0 = r15
            if (r0 != 0) goto L20
        L9c:
            r0 = r17
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseEventManager.getPurchases(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList getPurchasesInapp(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
        return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, obj, "inapp"));
    }

    public static final ArrayList getPurchasesSubs(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
        return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, obj, "subs"));
    }

    public static final Map getSkuDetails(Context context, ArrayList skuList, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skuList, "skuList");
        Map readSkuDetailsFromCache = INSTANCE.readSkuDetailsFromCache(skuList);
        ArrayList arrayList = new ArrayList();
        Iterator it = skuList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!readSkuDetailsFromCache.containsKey(str)) {
                arrayList.add(str);
            }
        }
        readSkuDetailsFromCache.putAll(INSTANCE.getSkuDetailsFromGoogle(context, arrayList, obj, z));
        return readSkuDetailsFromCache;
    }

    private final Map getSkuDetailsFromGoogle(Context context, ArrayList arrayList, Object obj, boolean z) {
        Map linkedHashMap = new LinkedHashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object invokeMethod = invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, PACKAGE_NAME, z ? "subs" : "inapp", bundle});
            if (invokeMethod != null) {
                Bundle bundle2 = (Bundle) invokeMethod;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList.get(i);
                            Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                            String str = stringArrayList.get(i);
                            Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                            linkedHashMap.put(obj2, str);
                        }
                    }
                    writeSkuDetailsToCache(linkedHashMap);
                }
            }
        }
        return linkedHashMap;
    }

    private final Object invokeMethod(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method method;
        Class cls = getClass(context, str);
        if (cls == null || (method = getMethod(cls, str2)) == null) {
            return null;
        }
        return InAppPurchaseUtils.invokeMethod(cls, method, obj, Arrays.copyOf(objArr, objArr.length));
    }

    private final boolean isBillingSupported(Context context, Object obj, String str) {
        boolean z = true;
        if (obj == null) {
            return false;
        }
        Object invokeMethod = invokeMethod(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, PACKAGE_NAME, str});
        if (invokeMethod == null || ((Integer) invokeMethod).intValue() != 0) {
            z = false;
        }
        return z;
    }

    private final Map readSkuDetailsFromCache(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String sku = (String) it.next();
            String string = skuDetailSharedPrefs.getString(sku, null);
            if (string != null) {
                List split$default = StringsKt.split$default((CharSequence) string, new String[]{";"}, false, 2, 2, (Object) null);
                if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                    Intrinsics.checkNotNullExpressionValue(sku, "sku");
                    linkedHashMap.put(sku, split$default.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    private final void writeSkuDetailsToCache(Map map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = skuDetailSharedPrefs.edit();
        for (Map.Entry entry : map.entrySet()) {
            edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
        }
        edit.apply();
    }

    public final boolean hasFreeTrialPeirod(String skuDetail) {
        boolean z;
        Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
        try {
            String optString = new JSONObject(skuDetail).optString("freeTrialPeriod");
            z = false;
            if (optString != null) {
                z = false;
                if (optString.length() > 0) {
                    z = true;
                }
            }
        } catch (JSONException e) {
            z = false;
        }
        return z;
    }
}
