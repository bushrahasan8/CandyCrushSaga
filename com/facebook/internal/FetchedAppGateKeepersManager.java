package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import com.ironsource.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: FetchedAppGateKeepersManager.class */
public final class FetchedAppGateKeepersManager {
    private static GateKeeperRuntimeCache gateKeeperRuntimeCache;
    private static Long timestamp;
    public static final FetchedAppGateKeepersManager INSTANCE = new FetchedAppGateKeepersManager();
    private static final String TAG = Reflection.getOrCreateKotlinClass(FetchedAppGateKeepersManager.class).getSimpleName();
    private static final AtomicBoolean isLoading = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue callbacks = new ConcurrentLinkedQueue();
    private static final Map fetchedAppGateKeepers = new ConcurrentHashMap();

    /* loaded from: FetchedAppGateKeepersManager$Callback.class */
    public interface Callback {
        void onCompleted();
    }

    private FetchedAppGateKeepersManager() {
    }

    private final JSONObject getAppGateKeepersQueryResponse(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", FacebookSdk.getSdkVersion());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.Companion companion = GraphRequest.Companion;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        GraphRequest newGraphPathRequest = companion.newGraphPathRequest((AccessToken) null, format, (GraphRequest.Callback) null);
        newGraphPathRequest.setParameters(bundle);
        JSONObject jsonObject = newGraphPathRequest.executeAndWait().getJsonObject();
        JSONObject jSONObject = jsonObject;
        if (jsonObject == null) {
            jSONObject = new JSONObject();
        }
        return jSONObject;
    }

    public static final boolean getGateKeeperForKey(String name, String str, boolean z) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map gateKeepersForApplication = INSTANCE.getGateKeepersForApplication(str);
        if (gateKeepersForApplication.containsKey(name) && (bool = (Boolean) gateKeepersForApplication.get(name)) != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    private final boolean isTimestampValid(Long l) {
        boolean z = false;
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000) {
            z = true;
        }
        return z;
    }

    public static final void loadAppGateKeepersAsync(Callback callback) {
        synchronized (FetchedAppGateKeepersManager.class) {
            if (callback != null) {
                try {
                    callbacks.add(callback);
                } finally {
                }
            }
            final String applicationId = FacebookSdk.getApplicationId();
            FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
            if (fetchedAppGateKeepersManager.isTimestampValid(timestamp) && fetchedAppGateKeepers.containsKey(applicationId)) {
                fetchedAppGateKeepersManager.pollCallbacks();
                return;
            }
            final Context applicationContext = FacebookSdk.getApplicationContext();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            if (applicationContext == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!Utility.isNullOrEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    Utility.logd("FacebookSDK", e);
                }
                if (jSONObject != null) {
                    parseAppGateKeepersFromJSON$facebook_android_sdk_core_release(applicationId, jSONObject);
                }
            }
            Executor executor = FacebookSdk.getExecutor();
            if (executor == null) {
                return;
            }
            if (isLoading.compareAndSet(false, true)) {
                executor.execute(new Runnable(applicationId, applicationContext, format) { // from class: com.facebook.internal.FetchedAppGateKeepersManager$$ExternalSyntheticLambda0
                    public final String f$0;
                    public final Context f$1;
                    public final String f$2;

                    {
                        this.f$0 = applicationId;
                        this.f$1 = applicationContext;
                        this.f$2 = format;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FetchedAppGateKeepersManager.loadAppGateKeepersAsync$lambda$0(this.f$0, this.f$1, this.f$2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadAppGateKeepersAsync$lambda$0(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager = INSTANCE;
        JSONObject appGateKeepersQueryResponse = fetchedAppGateKeepersManager.getAppGateKeepersQueryResponse(applicationId);
        if (appGateKeepersQueryResponse.length() != 0) {
            parseAppGateKeepersFromJSON$facebook_android_sdk_core_release(applicationId, appGateKeepersQueryResponse);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, appGateKeepersQueryResponse.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        fetchedAppGateKeepersManager.pollCallbacks();
        isLoading.set(false);
    }

    public static final JSONObject parseAppGateKeepersFromJSON$facebook_android_sdk_core_release(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (FetchedAppGateKeepersManager.class) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                JSONObject jSONObject3 = (JSONObject) fetchedAppGateKeepers.get(applicationId);
                jSONObject2 = jSONObject3;
                if (jSONObject3 == null) {
                    jSONObject2 = new JSONObject();
                }
                JSONObject optJSONObject = (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null) ? null : optJSONArray.optJSONObject(0);
                JSONObject jSONObject4 = optJSONObject;
                if (optJSONObject == null) {
                    jSONObject4 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject4.optJSONArray("gatekeepers");
                JSONArray jSONArray = optJSONArray2;
                if (optJSONArray2 == null) {
                    jSONArray = new JSONArray();
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                        jSONObject2.put(jSONObject5.getString(t2.h.W), jSONObject5.getBoolean("value"));
                    } catch (JSONException e) {
                        Utility.logd("FacebookSDK", e);
                    }
                }
                fetchedAppGateKeepers.put(applicationId, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    private final void pollCallbacks() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final Callback callback = (Callback) concurrentLinkedQueue.poll();
            if (callback != null) {
                handler.post(new Runnable(callback) { // from class: com.facebook.internal.FetchedAppGateKeepersManager$$ExternalSyntheticLambda1
                    public final FetchedAppGateKeepersManager.Callback f$0;

                    {
                        this.f$0 = callback;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.onCompleted();
                    }
                });
            }
        }
    }

    public static final JSONObject queryAppGateKeepers(String applicationId, boolean z) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z) {
            Map map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = (JSONObject) map.get(applicationId);
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject == null) {
                    jSONObject2 = new JSONObject();
                }
                return jSONObject2;
            }
        }
        JSONObject appGateKeepersQueryResponse = INSTANCE.getAppGateKeepersQueryResponse(applicationId);
        Context applicationContext = FacebookSdk.getApplicationContext();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        applicationContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, appGateKeepersQueryResponse.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_android_sdk_core_release(applicationId, appGateKeepersQueryResponse);
    }

    public final Map getGateKeepersForApplication(String str) {
        HashMap hashMap;
        loadAppGateKeepersAsync();
        if (str != null) {
            Map map = fetchedAppGateKeepers;
            if (map.containsKey(str)) {
                GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
                List dumpGateKeepers = gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.dumpGateKeepers(str) : null;
                if (dumpGateKeepers != null) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it = dumpGateKeepers.iterator();
                    while (true) {
                        hashMap = hashMap2;
                        if (!it.hasNext()) {
                            break;
                        }
                        GateKeeper gateKeeper = (GateKeeper) it.next();
                        hashMap2.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
                    }
                } else {
                    HashMap hashMap3 = new HashMap();
                    JSONObject jSONObject = (JSONObject) map.get(str);
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject == null) {
                        jSONObject2 = new JSONObject();
                    }
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap3.put(key, Boolean.valueOf(jSONObject2.optBoolean(key)));
                    }
                    GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
                    GateKeeperRuntimeCache gateKeeperRuntimeCache4 = gateKeeperRuntimeCache3;
                    if (gateKeeperRuntimeCache3 == null) {
                        gateKeeperRuntimeCache4 = new GateKeeperRuntimeCache();
                    }
                    ArrayList arrayList = new ArrayList(hashMap3.size());
                    for (Map.Entry entry : hashMap3.entrySet()) {
                        arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                    }
                    gateKeeperRuntimeCache4.setGateKeepers(str, arrayList);
                    gateKeeperRuntimeCache = gateKeeperRuntimeCache4;
                    hashMap = hashMap3;
                }
                return hashMap;
            }
        }
        return new HashMap();
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync(null);
    }
}
