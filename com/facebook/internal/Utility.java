package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.google.android.gms.drive.ExecutionOptions;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.t2;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: Utility.class */
public final class Utility {
    private static int numCPUCores;
    public static final Utility INSTANCE = new Utility();
    private static long timestampOfLastCheck = -1;
    private static long totalExternalStorageGB = -1;
    private static long availableExternalStorageGB = -1;
    private static String deviceTimezoneAbbreviation = "";
    private static String deviceTimeZoneName = "";
    private static String carrierName = "NoCarrier";

    /* loaded from: Utility$GraphMeRequestWithCacheCallback.class */
    public interface GraphMeRequestWithCacheCallback {
        void onFailure(FacebookException facebookException);

        void onSuccess(JSONObject jSONObject);
    }

    private Utility() {
    }

    private final void appendAnonIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (attributionIdentifiers.isTrackingLimited()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    private final void appendAttributionIdUnderCompliance(JSONObject jSONObject, AttributionIdentifiers attributionIdentifiers, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !isGooglePlayServicesAvailable(context)) {
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        } else {
            if (attributionIdentifiers.isTrackingLimited()) {
                return;
            }
            jSONObject.put("attribution", attributionIdentifiers.getAttributionId());
        }
    }

    public static final boolean areObjectsEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.areEqual(obj, obj2);
    }

    public static final JSONObject awaitGetGraphMeRequestWithCache(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            return profileInformation;
        }
        GraphResponse executeAndWait = INSTANCE.getGraphMeRequestWithCache(accessToken).executeAndWait();
        return executeAndWait.getError() != null ? null : executeAndWait.getJsonObject();
    }

    public static final Uri buildUri(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(HttpRequest.DEFAULT_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    private final void clearCookiesForDomain(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0])) {
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) str2, new String[]{t2.i.b}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) str3.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final void clearFacebookCookies(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Utility utility = INSTANCE;
            utility.clearCookiesForDomain(context, "facebook.com");
            utility.clearCookiesForDomain(context, ".facebook.com");
            utility.clearCookiesForDomain(context, "https://facebook.com");
            utility.clearCookiesForDomain(context, "https://.facebook.com");
        } catch (Exception e) {
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static final String coerceValueIfNullOrEmpty(String str, String str2) {
        String str3 = str;
        if (isNullOrEmpty(str)) {
            str3 = str2;
        }
        return str3;
    }

    private final long convertBytesToGB(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    public static final List convertJSONArrayToList(JSONArray jsonArray) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList2 = new ArrayList();
            int length = jsonArray.length();
            int i = 0;
            while (true) {
                arrayList = arrayList2;
                if (i >= length) {
                    break;
                }
                String string = jsonArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList2.add(string);
                i++;
            }
        } catch (JSONException e) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public static final Map convertJSONObjectToHashMap(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        for (int i = 0; i < length; i++) {
            try {
                String string = names.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                Object obj = jsonObject.get(string);
                Object obj2 = obj;
                if (obj instanceof JSONObject) {
                    obj2 = convertJSONObjectToHashMap((JSONObject) obj);
                }
                Object value = obj2;
                Intrinsics.checkNotNullExpressionValue(value, "value");
                hashMap.put(string, obj2);
            } catch (JSONException e) {
            }
        }
        return hashMap;
    }

    public static final Map convertJSONObjectToStringMap(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final int copyAndCloseInputStream(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        int i;
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                i = i2;
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i2 = i + read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final void disconnectQuietly(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    private final boolean externalStorageExists() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    public static final String generateRandomString(int i) {
        String bigInteger = new BigInteger(i * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final String getActivityName(Context context) {
        String simpleName;
        if (context == null) {
            simpleName = "null";
        } else if (context == context.getApplicationContext()) {
            simpleName = "unknown";
        } else {
            simpleName = context.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        }
        return simpleName;
    }

    public static final String getAppName(Context context) {
        String str;
        String applicationName;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            applicationName = FacebookSdk.getApplicationName();
        } catch (Exception e) {
            str = "";
        }
        if (applicationName != null) {
            return applicationName;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            str = applicationInfo.nonLocalizedLabel.toString();
        } else {
            str = context.getString(i);
            Intrinsics.checkNotNullExpressionValue(str, "context.getString(stringId)");
        }
        return str;
    }

    public static final String getAppVersion() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    public static final Date getBundleLongAsDate(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return parseLong == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (parseLong * 1000));
    }

    public static final long getContentSize(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            Cursor query = FacebookSdk.getApplicationContext().getContentResolver().query(contentUri, null, null, null, null);
            if (query == null) {
                return 0L;
            }
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            cursor = query;
            long j = query.getLong(columnIndex);
            query.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static final Locale getCurrentLocale() {
        Locale resourceLocale = getResourceLocale();
        Locale locale = resourceLocale;
        if (resourceLocale == null) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return locale;
    }

    private final String getCurrentTokenDomainWithDefault() {
        AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
        return (currentAccessToken == null || currentAccessToken.getGraphDomain() == null) ? "facebook" : currentAccessToken.getGraphDomain();
    }

    public static final JSONObject getDataProcessingOptions() {
        String string = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            return null;
        }
    }

    public static final String getGraphDomainFromTokenDomain(String str) {
        String str2;
        String facebookDomain = FacebookSdk.getFacebookDomain();
        if (str == null) {
            return facebookDomain;
        }
        if (Intrinsics.areEqual(str, "gaming")) {
            str2 = StringsKt.replace$default(facebookDomain, "facebook.com", "fb.gg", false, 4, (Object) null);
        } else {
            str2 = facebookDomain;
            if (Intrinsics.areEqual(str, "instagram")) {
                str2 = StringsKt.replace$default(facebookDomain, "facebook.com", "instagram.com", false, 4, (Object) null);
            }
        }
        return str2;
    }

    private final GraphRequest getGraphMeRequestWithCache(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", getProfileFieldsForGraphDomain(getCurrentTokenDomainWithDefault()));
        bundle.putString("access_token", str);
        GraphRequest newMeRequest = GraphRequest.Companion.newMeRequest((AccessToken) null, (GraphRequest.GraphJSONObjectCallback) null);
        newMeRequest.setParameters(bundle);
        newMeRequest.setHttpMethod(HttpMethod.GET);
        return newMeRequest;
    }

    public static final void getGraphMeRequestWithCacheAsync(final String accessToken, final GraphMeRequestWithCacheCallback callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject profileInformation = ProfileInformationCache.getProfileInformation(accessToken);
        if (profileInformation != null) {
            callback.onSuccess(profileInformation);
            return;
        }
        GraphRequest.Callback callback2 = new GraphRequest.Callback(callback, accessToken) { // from class: com.facebook.internal.Utility$$ExternalSyntheticLambda5
            public final Utility.GraphMeRequestWithCacheCallback f$0;
            public final String f$1;

            {
                this.f$0 = callback;
                this.f$1 = accessToken;
            }

            public final void onCompleted(GraphResponse graphResponse) {
                Utility.getGraphMeRequestWithCacheAsync$lambda$3(this.f$0, this.f$1, graphResponse);
            }
        };
        GraphRequest graphMeRequestWithCache = INSTANCE.getGraphMeRequestWithCache(accessToken);
        graphMeRequestWithCache.setCallback(callback2);
        graphMeRequestWithCache.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGraphMeRequestWithCacheAsync$lambda$3(GraphMeRequestWithCacheCallback callback, String accessToken, GraphResponse response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getError() != null) {
            callback.onFailure(response.getError().getException());
            return;
        }
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        ProfileInformationCache.putProfileInformation(accessToken, jsonObject);
        callback.onSuccess(response.getJsonObject());
    }

    public static final String getMetadataApplicationId(Context context) {
        Validate.notNull(context, "context");
        return FacebookSdk.getApplicationId();
    }

    public static final Method getMethodQuietly(Class clazz, String methodName, Class... parameterTypes) {
        Method method;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            method = clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException e) {
            method = null;
        }
        return method;
    }

    public static final Method getMethodQuietly(String className, String methodName, Class... parameterTypes) {
        Method method;
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            method = getMethodQuietly(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException e) {
            method = null;
        }
        return method;
    }

    private final String getProfileFieldsForGraphDomain(String str) {
        return Intrinsics.areEqual(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public static final Locale getResourceLocale() {
        Locale locale;
        try {
            locale = FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
        } catch (Exception e) {
            locale = null;
        }
        return locale;
    }

    public static final Object getStringPropertyAsJSON(JSONObject jsonObject, String str, String str2) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        Object obj = opt;
        if (opt != null) {
            obj = opt;
            if (opt instanceof String) {
                obj = new JSONTokener((String) opt).nextValue();
            }
        }
        Object obj2 = obj;
        if (obj != null) {
            obj2 = obj;
            if (!(obj instanceof JSONObject)) {
                obj2 = obj;
                if (!(obj instanceof JSONArray)) {
                    if (str2 == null) {
                        throw new FacebookException("Got an unexpected non-JSON object.");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt(str2, obj);
                    obj2 = jSONObject;
                }
            }
        }
        return obj2;
    }

    private final String hashBytes(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    private final String hashWithAlgorithm(String str, String str2) {
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return hashWithAlgorithm(str, bytes);
    }

    private final String hashWithAlgorithm(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return hashBytes(hash, bArr);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static final Object invokeMethodQuietly(Object obj, Method method, Object... args) {
        Object obj2;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            obj2 = method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException e) {
            obj2 = null;
        }
        return obj2;
    }

    public static final boolean isAutoAppLinkSetup() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            intent.setData(Uri.parse(format));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            do {
                if (!it.hasNext()) {
                    return false;
                }
            } while (!Intrinsics.areEqual(packageName, it.next().activityInfo.packageName));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static final boolean isAutofillAvailable(Context context) {
        boolean isAutofillSupported;
        boolean isEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager m = Utility$$ExternalSyntheticApiModelOutline1.m(context.getSystemService(Utility$$ExternalSyntheticApiModelOutline0.m()));
        boolean z = false;
        if (m != null) {
            z = false;
            isAutofillSupported = m.isAutofillSupported();
            if (isAutofillSupported) {
                z = false;
                isEnabled = m.isEnabled();
                if (isEnabled) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static final boolean isChromeOS(Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            z = context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        } else {
            String DEVICE = Build.DEVICE;
            if (DEVICE != null) {
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                if (new Regex(".+_cheets|cheets_.+").matches(DEVICE)) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (kotlin.text.StringsKt.equals(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, r4.getScheme(), true) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isContentUri(android.net.Uri r4) {
        /*
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r4
            java.lang.String r0 = r0.getScheme()
            r4 = r0
            r0 = 1
            r5 = r0
            java.lang.String r0 = "content"
            r1 = r4
            r2 = 1
            boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            r5 = r0
        L1b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.isContentUri(android.net.Uri):boolean");
    }

    public static final boolean isCurrentAccessToken(AccessToken accessToken) {
        return accessToken != null && Intrinsics.areEqual(accessToken, AccessToken.Companion.getCurrentAccessToken());
    }

    public static final boolean isDataProcessingRestricted() {
        JSONObject dataProcessingOptions = getDataProcessingOptions();
        if (dataProcessingOptions == null) {
            return false;
        }
        try {
            JSONArray jSONArray = dataProcessingOptions.getJSONArray("data_processing_options");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                String lowerCase = string.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                if (Intrinsics.areEqual(lowerCase, "ldu")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (kotlin.text.StringsKt.equals(com.ironsource.t2.h.b, r4.getScheme(), true) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isFileUri(android.net.Uri r4) {
        /*
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r4
            java.lang.String r0 = r0.getScheme()
            r4 = r0
            r0 = 1
            r5 = r0
            java.lang.String r0 = "file"
            r1 = r4
            r2 = 1
            boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            r5 = r0
        L1b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.isFileUri(android.net.Uri):boolean");
    }

    private final boolean isGooglePlayServicesAvailable(Context context) {
        boolean z = true;
        Method methodQuietly = getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQuietly == null) {
            return false;
        }
        Object invokeMethodQuietly = invokeMethodQuietly(null, methodQuietly, context);
        if (!(invokeMethodQuietly instanceof Integer) || !Intrinsics.areEqual(invokeMethodQuietly, 0)) {
            z = false;
        }
        return z;
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean isWebUri(Uri uri) {
        boolean z;
        if (uri != null) {
            z = true;
            if (!StringsKt.equals("http", uri.getScheme(), true)) {
                z = true;
                if (!StringsKt.equals(HttpRequest.DEFAULT_SCHEME, uri.getScheme(), true)) {
                    if (StringsKt.equals("fbstaging", uri.getScheme(), true)) {
                        z = true;
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public static final Set jsonArrayToSet(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            String string = jsonArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final List jsonArrayToStringList(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }

    public static final Map jsonStrToMap(String str) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            hashMap = new HashMap();
        } else {
            try {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    String string = jSONObject.getString(key);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                    hashMap2.put(key, string);
                }
                hashMap = hashMap2;
            } catch (JSONException e) {
                hashMap = new HashMap();
            }
        }
        return hashMap;
    }

    public static final void logd(String str, Exception exc) {
        if (!FacebookSdk.isDebugEnabled() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
    }

    public static final void logd(String str, String str2) {
        if (!FacebookSdk.isDebugEnabled() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final void logd(String str, String str2, Throwable th) {
        if (!FacebookSdk.isDebugEnabled() || isNullOrEmpty(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static final String mapToJsonStr(Map map) {
        String str;
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            str = "";
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException e) {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final String md5hash(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.hashWithAlgorithm("MD5", key);
    }

    public static final boolean mustFixWindowParamsForAutofill(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return isAutofillAvailable(context);
    }

    public static final Bundle parseUrlQueryString(String str) {
        Bundle bundle = new Bundle();
        if (!isNullOrEmpty(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            for (String str2 : (String[]) StringsKt.split$default((CharSequence) str, new String[]{t2.i.c}, false, 0, 6, (Object) null).toArray(new String[0])) {
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) str2, new String[]{t2.i.b}, false, 0, 6, (Object) null).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    logd("FacebookSDK", e);
                }
            }
        }
        return bundle;
    }

    public static final void putCommaSeparatedStringList(Bundle b, String str, List list) {
        Intrinsics.checkNotNullParameter(b, "b");
        if (list != null) {
            b.putString(str, TextUtils.join(",", list));
        }
    }

    public static final boolean putJSONValueInBundle(Bundle bundle, String str, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    public static final void putNonEmptyString(Bundle b, String str, String str2) {
        Intrinsics.checkNotNullParameter(b, "b");
        if (isNullOrEmpty(str2)) {
            return;
        }
        b.putString(str, str2);
    }

    public static final Map readNonnullStringMapFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (readString != null && readString2 != null) {
                hashMap.put(readString, readString2);
            }
        }
        return hashMap;
    }

    public static final String readStreamToString(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                char[] cArr = new char[a.m];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        String sb2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(sb2, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                        closeQuietly(bufferedInputStream);
                        closeQuietly(inputStreamReader);
                        return sb2;
                    }
                    sb.append(cArr, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                closeQuietly(bufferedInputStream);
                closeQuietly(inputStreamReader);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            inputStreamReader = null;
        }
    }

    public static final Map readStringMapFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    private final void refreshAvailableExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                availableExternalStorageGB = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
        } catch (Exception e) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0043
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private final int refreshBestGuessNumberOfCPUCores() {
        /*
            r3 = this;
            int r0 = com.facebook.internal.Utility.numCPUCores
            r4 = r0
            r0 = r4
            if (r0 <= 0) goto La
            r0 = r4
            return r0
        La:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L43
            r5 = r0
            r0 = r5
            java.lang.String r1 = "/sys/devices/system/cpu/"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L43
            com.facebook.internal.Utility$$ExternalSyntheticLambda4 r0 = new com.facebook.internal.Utility$$ExternalSyntheticLambda4     // Catch: java.lang.Exception -> L43
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Exception -> L43
            r0 = r5
            r1 = r6
            java.io.File[] r0 = r0.listFiles(r1)     // Catch: java.lang.Exception -> L43
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r5
            int r0 = r0.length     // Catch: java.lang.Exception -> L43
            com.facebook.internal.Utility.numCPUCores = r0     // Catch: java.lang.Exception -> L43
        L2c:
            int r0 = com.facebook.internal.Utility.numCPUCores     // Catch: java.lang.Exception -> L43
            if (r0 > 0) goto L3f
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            com.facebook.internal.Utility.numCPUCores = r0
        L3f:
            int r0 = com.facebook.internal.Utility.numCPUCores
            return r0
        L43:
            r5 = move-exception
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.Utility.refreshBestGuessNumberOfCPUCores():int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshBestGuessNumberOfCPUCores$lambda$4(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    private final void refreshCarrierName(Context context) {
        if (Intrinsics.areEqual(carrierName, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                carrierName = networkOperatorName;
            } catch (Exception e) {
            }
        }
    }

    private final void refreshPeriodicExtendedDeviceInfo(Context context) {
        if (timestampOfLastCheck == -1 || System.currentTimeMillis() - timestampOfLastCheck >= 1800000) {
            timestampOfLastCheck = System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(context);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private final void refreshTimezone() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            deviceTimezoneAbbreviation = displayName;
            String id = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            deviceTimeZoneName = id;
        } catch (AssertionError | Exception e) {
        }
    }

    private final void refreshTotalExternalStorage() {
        try {
            if (externalStorageExists()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                totalExternalStorageGB = statFs.getBlockCount() * statFs.getBlockSize();
            }
            totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
        } catch (Exception e) {
        }
    }

    public static final void runOnNonUiThread(Runnable runnable) {
        try {
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception e) {
        }
    }

    public static final void setAppEventAttributionParameters(JSONObject params, AttributionIdentifiers attributionIdentifiers, String str, boolean z, Context context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
        if (!FeatureManager.isEnabled(feature)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z);
        params.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        if (attributionIdentifiers != null) {
            if (FeatureManager.isEnabled(feature)) {
                INSTANCE.appendAnonIdUnderCompliance(params, attributionIdentifiers, str, context);
            }
            if (attributionIdentifiers.getAttributionId() != null) {
                if (FeatureManager.isEnabled(feature)) {
                    INSTANCE.appendAttributionIdUnderCompliance(params, attributionIdentifiers, context);
                } else {
                    params.put("attribution", attributionIdentifiers.getAttributionId());
                }
            }
            if (attributionIdentifiers.getAndroidAdvertiserId() != null) {
                params.put("advertiser_id", attributionIdentifiers.getAndroidAdvertiserId());
                params.put("advertiser_tracking_enabled", !attributionIdentifiers.isTrackingLimited());
            }
            if (!attributionIdentifiers.isTrackingLimited()) {
                String allHashedUserData = UserDataStore.getAllHashedUserData();
                if (allHashedUserData.length() != 0) {
                    params.put("ud", allHashedUserData);
                }
            }
            if (attributionIdentifiers.getAndroidInstallerPackage() != null) {
                params.put("installer_package", attributionIdentifiers.getAndroidInstallerPackage());
            }
        }
    }

    public static final void setAppEventExtendedDeviceInfoParameters(JSONObject params, Context appContext) {
        String str;
        Locale locale;
        int i;
        int i2;
        Display display;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        INSTANCE.refreshPeriodicExtendedDeviceInfo(appContext);
        String packageName = appContext.getPackageName();
        int i3 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            str = "";
        }
        if (packageInfo == null) {
            return;
        }
        int i4 = packageInfo.versionCode;
        i3 = i4;
        str = packageInfo.versionName;
        i3 = i4;
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception e2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
        jSONArray.put(deviceTimezoneAbbreviation);
        jSONArray.put(carrierName);
        double d = 0.0d;
        try {
            Object systemService = appContext.getSystemService(t2.h.d);
            display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception e3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i5 = displayMetrics.widthPixels;
            i = 0;
            try {
                int i6 = displayMetrics.heightPixels;
                i = i6;
                d = displayMetrics.density;
                i = i6;
            } catch (Exception e4) {
            }
            i2 = i5;
            jSONArray.put(i2);
            jSONArray.put(i);
            jSONArray.put(new DecimalFormat("#.##").format(d));
            jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
            jSONArray.put(totalExternalStorageGB);
            jSONArray.put(availableExternalStorageGB);
            jSONArray.put(deviceTimeZoneName);
            params.put("extinfo", jSONArray.toString());
        }
        i = 0;
        i2 = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(INSTANCE.refreshBestGuessNumberOfCPUCores());
        jSONArray.put(totalExternalStorageGB);
        jSONArray.put(availableExternalStorageGB);
        jSONArray.put(deviceTimeZoneName);
        params.put("extinfo", jSONArray.toString());
    }

    public static final String sha1hash(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return INSTANCE.hashWithAlgorithm(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1, bytes);
    }

    public static final String sha256hash(String str) {
        return str == null ? null : INSTANCE.hashWithAlgorithm("SHA-256", str);
    }

    public static final void writeNonnullStringMapToParcel(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final void writeStringMapToParcel(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
