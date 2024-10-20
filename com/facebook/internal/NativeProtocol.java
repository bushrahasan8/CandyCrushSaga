package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.ironsource.mediationsdk.metadata.a;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: NativeProtocol.class */
public final class NativeProtocol {
    public static final NativeProtocol INSTANCE;
    private static final Integer[] KNOWN_PROTOCOL_VERSIONS;
    private static final String TAG;
    private static final Map actionToAppInfoMap;
    private static final List effectCameraAppInfoList;
    private static final List facebookAppInfoList;
    private static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: NativeProtocol$EffectTestAppInfo.class */
    public static final class EffectTestAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ String getLoginActivity() {
            return (String) m176getLoginActivity();
        }

        /* renamed from: getLoginActivity, reason: collision with other method in class */
        public Void m176getLoginActivity() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getPackage() {
            return "com.facebook.arstudio.player";
        }
    }

    /* loaded from: NativeProtocol$InstagramAppInfo.class */
    private static final class InstagramAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getLoginActivity() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getPackage() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getResponseType() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: NativeProtocol$KatanaAppInfo.class */
    public static final class KatanaAppInfo extends NativeAppInfo {
        private final boolean isAndroidAPIVersionNotLessThan30() {
            return FacebookSdk.getApplicationContext().getApplicationInfo().targetSdkVersion >= 30;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getLoginActivity() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getPackage() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public void onAvailableVersionsNullOrEmpty() {
            if (isAndroidAPIVersionNotLessThan30()) {
                Log.w(NativeProtocol.TAG, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: NativeProtocol$MessengerAppInfo.class */
    public static final class MessengerAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ String getLoginActivity() {
            return (String) m177getLoginActivity();
        }

        /* renamed from: getLoginActivity, reason: collision with other method in class */
        public Void m177getLoginActivity() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getPackage() {
            return "com.facebook.orca";
        }
    }

    /* loaded from: NativeProtocol$NativeAppInfo.class */
    public static abstract class NativeAppInfo {
        private TreeSet availableVersions;

        public final void fetchAvailableVersions(boolean z) {
            TreeSet treeSet;
            synchronized (this) {
                if (!z) {
                    TreeSet treeSet2 = this.availableVersions;
                    if (treeSet2 != null && treeSet2 != null && !treeSet2.isEmpty()) {
                        treeSet = this.availableVersions;
                        if (treeSet != null || treeSet.isEmpty()) {
                            onAvailableVersionsNullOrEmpty();
                        }
                    }
                }
                this.availableVersions = NativeProtocol.INSTANCE.fetchAllAvailableProtocolVersionsForAppInfo(this);
                treeSet = this.availableVersions;
                if (treeSet != null) {
                }
                onAvailableVersionsNullOrEmpty();
            }
        }

        public final TreeSet getAvailableVersions() {
            TreeSet treeSet = this.availableVersions;
            if (treeSet == null || treeSet == null || treeSet.isEmpty()) {
                fetchAvailableVersions(false);
            }
            return this.availableVersions;
        }

        public abstract String getLoginActivity();

        public abstract String getPackage();

        public String getResponseType() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void onAvailableVersionsNullOrEmpty() {
        }
    }

    /* loaded from: NativeProtocol$ProtocolVersionQueryResult.class */
    public static final class ProtocolVersionQueryResult {
        public static final Companion Companion = new Companion(null);
        private NativeAppInfo appInfo;
        private int protocolVersion;

        /* loaded from: NativeProtocol$ProtocolVersionQueryResult$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ProtocolVersionQueryResult create(NativeAppInfo nativeAppInfo, int i) {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.appInfo = nativeAppInfo;
                protocolVersionQueryResult.protocolVersion = i;
                return protocolVersionQueryResult;
            }

            public final ProtocolVersionQueryResult createEmpty() {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.protocolVersion = -1;
                return protocolVersionQueryResult;
            }
        }

        private ProtocolVersionQueryResult() {
        }

        public /* synthetic */ ProtocolVersionQueryResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getProtocolVersion() {
            return this.protocolVersion;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: NativeProtocol$WakizashiAppInfo.class */
    public static final class WakizashiAppInfo extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getLoginActivity() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public String getPackage() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        NativeProtocol nativeProtocol = new NativeProtocol();
        INSTANCE = nativeProtocol;
        TAG = NativeProtocol.class.getName();
        facebookAppInfoList = nativeProtocol.buildFacebookAppList();
        effectCameraAppInfoList = nativeProtocol.buildEffectCameraAppInfoList();
        actionToAppInfoMap = nativeProtocol.buildActionToAppInfoMap();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    private NativeProtocol() {
    }

    private final Map buildActionToAppInfoMap() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessengerAppInfo());
        List list = facebookAppInfoList;
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
        return hashMap;
    }

    private final List buildEffectCameraAppInfoList() {
        ArrayList arrayListOf = CollectionsKt.arrayListOf(new EffectTestAppInfo());
        arrayListOf.addAll(buildFacebookAppList());
        return arrayListOf;
    }

    private final List buildFacebookAppList() {
        return CollectionsKt.arrayListOf(new KatanaAppInfo(), new WakizashiAppInfo());
    }

    private final Uri buildPlatformProviderVersionURI(NativeAppInfo nativeAppInfo) {
        Uri parse = Uri.parse("content://" + nativeAppInfo.getPackage() + ".provider.PlatformProvider/versions");
        Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
        return parse;
    }

    public static final int computeLatestAvailableVersionFromVersionSpec(TreeSet treeSet, int i, int[] versionSpec) {
        int i2;
        Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
        if (treeSet == null) {
            return -1;
        }
        int length = versionSpec.length - 1;
        Iterator descendingIterator = treeSet.descendingIterator();
        int i3 = -1;
        while (true) {
            i2 = -1;
            if (!descendingIterator.hasNext()) {
                break;
            }
            Integer fbAppVersion = (Integer) descendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
            int max = Math.max(i3, fbAppVersion.intValue());
            int i4 = length;
            while (i4 >= 0 && versionSpec[i4] > fbAppVersion.intValue()) {
                i4--;
            }
            if (i4 < 0) {
                return -1;
            }
            length = i4;
            i3 = max;
            if (versionSpec[i4] == fbAppVersion.intValue()) {
                i2 = -1;
                if (i4 % 2 == 0) {
                    i2 = Math.min(max, i);
                }
            }
        }
        return i2;
    }

    public static final Bundle createBundleForException(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static final Intent createInstagramIntent(Context context, String applicationId, Collection permissions, String e2e, boolean z, boolean z2, DefaultAudience defaultAudience, String clientState, String authType, String str, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(e2e, "e2e");
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(authType, "authType");
        InstagramAppInfo instagramAppInfo = new InstagramAppInfo();
        return validateActivityIntent(context, INSTANCE.createNativeAppIntent(instagramAppInfo, applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, false, str, z3, LoginTargetApp.INSTAGRAM, z4, z5, "", null, null), instagramAppInfo);
    }

    private final Intent createNativeAppIntent(NativeAppInfo nativeAppInfo, String str, Collection collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2, String str5, boolean z3, LoginTargetApp loginTargetApp, boolean z4, boolean z5, String str6, String str7, String str8) {
        String loginActivity = nativeAppInfo.getLoginActivity();
        if (loginActivity == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(nativeAppInfo.getPackage(), loginActivity).putExtra("client_id", str);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
        putExtra.putExtra("facebook_sdk_version", FacebookSdk.getSdkVersion());
        if (!Utility.isNullOrEmpty(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!Utility.isNullOrEmpty(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", nativeAppInfo.getResponseType());
        putExtra.putExtra("nonce", str6);
        putExtra.putExtra("return_scopes", a.g);
        if (z) {
            putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
        }
        putExtra.putExtra("legacy_override", FacebookSdk.getGraphApiVersion());
        putExtra.putExtra("auth_type", str4);
        if (z2) {
            putExtra.putExtra("fail_on_logged_out", true);
        }
        putExtra.putExtra("messenger_page_id", str5);
        putExtra.putExtra("reset_messenger_state", z3);
        if (z4) {
            putExtra.putExtra("fx_app", loginTargetApp.toString());
        }
        if (z5) {
            putExtra.putExtra("skip_dedupe", true);
        }
        return putExtra;
    }

    public static final Intent createPlatformServiceIntent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (NativeAppInfo nativeAppInfo : facebookAppInfoList) {
            Intent validateServiceIntent = validateServiceIntent(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(nativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), nativeAppInfo);
            if (validateServiceIntent != null) {
                return validateServiceIntent;
            }
        }
        return null;
    }

    public static final Intent createProtocolResultIntent(Intent requestIntent, Bundle bundle, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
        UUID callIdFromIntent = getCallIdFromIntent(requestIntent);
        if (callIdFromIntent == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", getProtocolVersionFromIntent(requestIntent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", callIdFromIntent.toString());
        if (facebookException != null) {
            bundle2.putBundle(MRAIDPresenter.ERROR, createBundleForException(facebookException));
        }
        intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent;
    }

    public static final List createProxyAuthIntents(Context context, String applicationId, Collection permissions, String e2e, boolean z, boolean z2, DefaultAudience defaultAudience, String clientState, String authType, boolean z3, String str, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(e2e, "e2e");
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(authType, "authType");
        List list = facebookAppInfoList;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Intent createNativeAppIntent = INSTANCE.createNativeAppIntent((NativeAppInfo) it.next(), applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, z3, str, z4, LoginTargetApp.FACEBOOK, z5, z6, str2, str3, str4);
            if (createNativeAppIntent != null) {
                arrayList.add(createNativeAppIntent);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TreeSet fetchAllAvailableProtocolVersionsForAppInfo(NativeAppInfo nativeAppInfo) {
        ProviderInfo providerInfo;
        Cursor cursor;
        TreeSet treeSet = new TreeSet();
        ContentResolver contentResolver = FacebookSdk.getApplicationContext().getContentResolver();
        Uri buildPlatformProviderVersionURI = buildPlatformProviderVersionURI(nativeAppInfo);
        Cursor cursor2 = null;
        Cursor cursor3 = null;
        try {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            StringBuilder sb = new StringBuilder();
            sb.append(nativeAppInfo.getPackage());
            sb.append(".provider.PlatformProvider");
            cursor3 = null;
            try {
                providerInfo = packageManager.resolveContentProvider(sb.toString(), 0);
            } catch (RuntimeException e) {
                Log.e(TAG, "Failed to query content resolver.", e);
                providerInfo = null;
            }
            if (providerInfo != null) {
                cursor3 = null;
                try {
                    try {
                        cursor = contentResolver.query(buildPlatformProviderVersionURI, new String[]{"version"}, null, null, null);
                    } catch (NullPointerException e2) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursor = null;
                    }
                } catch (IllegalArgumentException e3) {
                    Log.e(TAG, "Failed to query content resolver.");
                    cursor = null;
                } catch (SecurityException e4) {
                    Log.e(TAG, "Failed to query content resolver.");
                    cursor = null;
                }
                cursor2 = cursor;
                if (cursor != null) {
                    while (true) {
                        cursor3 = cursor;
                        cursor2 = cursor;
                        if (!cursor.moveToNext()) {
                            break;
                        }
                        Cursor cursor4 = cursor;
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version"))));
                    }
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            return treeSet;
        } catch (Throwable th) {
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    public static final Bundle getBridgeArgumentsFromIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return !isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)) ? null : intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
    }

    public static final UUID getCallIdFromIntent(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        UUID uuid = null;
        if (stringExtra != null) {
            try {
                uuid = UUID.fromString(stringExtra);
            } catch (IllegalArgumentException e) {
                uuid = null;
            }
        }
        return uuid;
    }

    public static final Bundle getErrorDataFromResultIntent(Intent resultIntent) {
        Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
        if (!isErrorResult(resultIntent)) {
            return null;
        }
        Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
        return bridgeArgumentsFromIntent != null ? bridgeArgumentsFromIntent.getBundle(MRAIDPresenter.ERROR) : resultIntent.getExtras();
    }

    public static final FacebookException getExceptionFromErrorData(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        String str = string;
        if (string == null) {
            str = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        String str2 = string2;
        if (string2 == null) {
            str2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        return (str == null || !StringsKt.equals(str, "UserCanceled", true)) ? new FacebookException(str2) : new FacebookOperationCanceledException(str2);
    }

    private final ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List list, int[] iArr) {
        updateAllAvailableProtocolVersionsAsync();
        if (list == null) {
            return ProtocolVersionQueryResult.Companion.createEmpty();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NativeAppInfo nativeAppInfo = (NativeAppInfo) it.next();
            int computeLatestAvailableVersionFromVersionSpec = computeLatestAvailableVersionFromVersionSpec(nativeAppInfo.getAvailableVersions(), getLatestKnownVersion(), iArr);
            if (computeLatestAvailableVersionFromVersionSpec != -1) {
                return ProtocolVersionQueryResult.Companion.create(nativeAppInfo, computeLatestAvailableVersionFromVersionSpec);
            }
        }
        return ProtocolVersionQueryResult.Companion.createEmpty();
    }

    public static final int getLatestAvailableProtocolVersionForService(int i) {
        return INSTANCE.getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[]{i}).getProtocolVersion();
    }

    public static final int getLatestKnownVersion() {
        return KNOWN_PROTOCOL_VERSIONS[0].intValue();
    }

    public static final Bundle getMethodArgumentsFromIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return !isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    public static final int getProtocolVersionFromIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    public static final Bundle getSuccessResultsFromIntent(Intent resultIntent) {
        Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
        int protocolVersionFromIntent = getProtocolVersionFromIntent(resultIntent);
        Bundle extras = resultIntent.getExtras();
        Bundle bundle = extras;
        if (isVersionCompatibleWithBucketedIntent(protocolVersionFromIntent)) {
            bundle = extras == null ? extras : extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        }
        return bundle;
    }

    public static final boolean isErrorResult(Intent resultIntent) {
        Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
        Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
        return bridgeArgumentsFromIntent != null ? bridgeArgumentsFromIntent.containsKey(MRAIDPresenter.ERROR) : resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
    }

    public static final boolean isVersionCompatibleWithBucketedIntent(int i) {
        return ArraysKt.contains(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(i)) && i >= 20140701;
    }

    public static final void setupProtocolRequestIntent(Intent intent, String str, String str2, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String applicationId = FacebookSdk.getApplicationId();
        String applicationName = FacebookSdk.getApplicationName();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", applicationId);
        if (!isVersionCompatibleWithBucketedIntent(i)) {
            intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
            if (!Utility.isNullOrEmpty(applicationName)) {
                intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", applicationName);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
                return;
            }
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", str);
        Utility.putNonEmptyString(bundle2, "app_name", applicationName);
        intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        Bundle bundle3 = bundle;
        if (bundle == null) {
            bundle3 = new Bundle();
        }
        intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle3);
    }

    public static final void updateAllAvailableProtocolVersionsAsync() {
        if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.NativeProtocol$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NativeProtocol.updateAllAvailableProtocolVersionsAsync$lambda$1();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateAllAvailableProtocolVersionsAsync$lambda$1() {
        try {
            Iterator it = facebookAppInfoList.iterator();
            while (it.hasNext()) {
                ((NativeAppInfo) it.next()).fetchAvailableVersions(true);
            }
        } finally {
            protocolVersionsAsyncUpdating.set(false);
        }
    }

    public static final Intent validateActivityIntent(Context context, Intent intent, NativeAppInfo nativeAppInfo) {
        ResolveInfo resolveActivity;
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
            return null;
        }
        String str = resolveActivity.activityInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
        if (!FacebookSignatureValidator.validateSignature(context, str)) {
            intent = null;
        }
        return intent;
    }

    public static final Intent validateServiceIntent(Context context, Intent intent, NativeAppInfo nativeAppInfo) {
        ResolveInfo resolveService;
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
            return null;
        }
        String str = resolveService.serviceInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
        if (!FacebookSignatureValidator.validateSignature(context, str)) {
            intent = null;
        }
        return intent;
    }
}
