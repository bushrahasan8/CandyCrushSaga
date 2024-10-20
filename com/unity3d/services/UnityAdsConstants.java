package com.unity3d.services;

/* loaded from: UnityAdsConstants.class */
public final class UnityAdsConstants {
    public static final UnityAdsConstants INSTANCE = new UnityAdsConstants();

    /* loaded from: UnityAdsConstants$AdOperations.class */
    public static final class AdOperations {
        public static final int GET_TOKEN_TIMEOUT_MS = 5000;
        public static final AdOperations INSTANCE = new AdOperations();
        public static final int LOAD_TIMEOUT_MS = 30000;
        public static final int SHOW_TIMEOUT_MS = 10000;

        private AdOperations() {
        }
    }

    /* loaded from: UnityAdsConstants$Cache.class */
    public static final class Cache {
        public static final String CACHE_SCHEME = "unity-ads-cache";
        public static final Cache INSTANCE = new Cache();

        private Cache() {
        }
    }

    /* loaded from: UnityAdsConstants$ClientInfo.class */
    public static final class ClientInfo {
        public static final ClientInfo INSTANCE = new ClientInfo();
        public static final int SDK_VERSION = 41201;
        public static final String SDK_VERSION_NAME = "4.12.1";

        private ClientInfo() {
        }
    }

    /* loaded from: UnityAdsConstants$DefaultUrls.class */
    public static final class DefaultUrls {
        public static final String AD_ASSET_DOMAIN = "unity.ads.asset";
        public static final String AD_ASSET_PATH = "/";
        public static final String AD_CACHE_DOMAIN = "unity.ads.cache";
        public static final String AD_MARKUP_URL = "https://gateway.unityads.unity3d.com/tools/convert_ad_response_to_ad_markup";
        public static final String AD_PLAYER_QUERY_PARAMS = "?platform=android&";
        public static final String ASSET_DOMAIN = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
        public static final String CACHE_DIR_NAME = "UnityAdsCache";
        public static final String GATEWAY_URL = "https://gateway.unityads.unity3d.com/v1";
        public static final String HTTP_CACHE_DIR_NAME = "UnityAdsHttpCache";
        public static final DefaultUrls INSTANCE = new DefaultUrls();
        public static final String WEBVIEW_ASSET_PATH = "/unity-ads-sdk-webview/";
        public static final String WEBVIEW_DOMAIN = "config.unityads.unity3d.com";

        private DefaultUrls() {
        }
    }

    /* loaded from: UnityAdsConstants$Messages.class */
    public static final class Messages {
        public static final Messages INSTANCE = new Messages();
        public static final String MSG_INTERNAL_ERROR = "Internal error";
        public static final String MSG_UNITY_BASE = "[Unity Ads] ";

        private Messages() {
        }
    }

    /* loaded from: UnityAdsConstants$OpenMeasurement.class */
    public static final class OpenMeasurement {
        public static final OpenMeasurement INSTANCE = new OpenMeasurement();
        public static final String OM_JS_SERVICE_FILENAME = "ad-viewer/omsdk-v1.js";
        public static final String OM_JS_SESSION_FILENAME = "ad-viewer/omid-session-client-v1.js";
        public static final String OM_JS_URL_SERVICE = "unity-ads-cache://unity.ads.asset/ad-viewer/omsdk-v1.js";
        public static final String OM_JS_URL_SESSION = "unity-ads-cache://unity.ads.asset/ad-viewer/omid-session-client-v1.js";
        public static final String OM_PARTNER_NAME = "Unity3d";
        public static final String OM_PARTNER_VERSION = "1";
        public static final long OM_SESSION_FINISH_DELAY_MS = 1000;

        private OpenMeasurement() {
        }
    }

    /* loaded from: UnityAdsConstants$Preferences.class */
    public static final class Preferences {
        public static final Preferences INSTANCE = new Preferences();
        public static final String PREF_KEY_AUID = "auid";
        public static final String PREF_KEY_IDFI = "unityads-idfi";
        public static final String PREF_NAME_AUID = "supersonic_shared_preferen";
        public static final String PREF_NAME_IDFI = "unityads-installinfo";

        private Preferences() {
        }
    }

    /* loaded from: UnityAdsConstants$RequestPolicy.class */
    public static final class RequestPolicy {
        public static final int CONNECT_TIMEOUT_MS = 10000;
        public static final RequestPolicy INSTANCE = new RequestPolicy();
        public static final int OVERALL_TIMEOUT_MS = 10000;
        public static final int READ_TIMEOUT_MS = 10000;
        public static final float RETRY_JITTER_PCT = 0.1f;
        public static final int RETRY_MAX_DURATION = 20000;
        public static final int RETRY_MAX_INTERVAL = 1000;
        public static final float RETRY_SCALING_FACTOR = 2.0f;
        public static final int RETRY_WAIT_BASE = 500;
        public static final boolean SHOULD_STORE_LOCALLY = false;
        public static final int WRITE_TIMEOUT_MS = 10000;

        private RequestPolicy() {
        }
    }

    /* loaded from: UnityAdsConstants$SharedFlow.class */
    public static final class SharedFlow {
        public static final int EXTRA_CAPACITY = 10;
        public static final SharedFlow INSTANCE = new SharedFlow();
        public static final int REPLAY = 10;

        private SharedFlow() {
        }
    }

    /* loaded from: UnityAdsConstants$Timeout.class */
    public static final class Timeout {
        public static final long GET_TOKEN_TIMEOUT_MS = 5000;
        public static final long INIT_TIMEOUT_MS = 10000;
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    private UnityAdsConstants() {
    }
}
