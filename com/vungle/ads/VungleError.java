package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: VungleError.class */
public abstract class VungleError extends Exception {
    public static final int AD_ALREADY_FAILED = 206;
    public static final int AD_ALREADY_LOADED = 204;
    public static final int AD_CLOSED_MISSING_HEARTBEAT = 318;
    public static final int AD_CLOSED_TEMPLATE_ERROR = 317;
    public static final int AD_CONSUMED = 202;
    public static final int AD_EXPIRED = 304;
    public static final int AD_EXPIRED_ON_PLAY = 307;
    public static final int AD_FAILED_TO_DOWNLOAD = 10011;
    public static final int AD_HTML_FAILED_TO_LOAD = 310;
    public static final int AD_IS_LOADING = 203;
    public static final int AD_IS_PLAYING = 205;
    public static final int AD_LOAD_FAIL_RETRY_AFTER = 221;
    public static final int AD_MARKUP_INVALID = 10040;
    public static final int AD_NOT_LOADED = 210;
    public static final int AD_RENDER_NETWORK_ERROR = 10038;
    public static final int AD_RESPONSE_EMPTY = 215;
    public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE = 216;
    public static final int AD_RESPONSE_RETRY_AFTER = 220;
    public static final int AD_RESPONSE_TIMED_OUT = 217;
    public static final int AD_UNABLE_TO_PLAY = 10010;
    public static final int AD_WIN_NOTIFICATION_ERROR = 308;
    public static final int ALREADY_INITIALIZED = 4;
    public static final int ALREADY_PLAYING_ANOTHER_AD = 10015;
    public static final int API_FAILED_STATUS_CODE = 104;
    public static final int API_REQUEST_ERROR = 101;
    public static final int API_RESPONSE_DATA_ERROR = 102;
    public static final int API_RESPONSE_DECODE_ERROR = 103;
    public static final int ASSET_DOWNLOAD_ERROR = 10024;
    public static final int ASSET_FAILED_INSUFFICIENT_SPACE = 126;
    public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED = 127;
    public static final int ASSET_FAILED_STATUS_CODE = 117;
    public static final int ASSET_FAILED_TO_DELETE = 309;
    public static final int ASSET_REQUEST_ERROR = 112;
    public static final int ASSET_RESPONSE_DATA_ERROR = 113;
    public static final int ASSET_WRITE_ERROR = 114;
    public static final int BANNER_VIEW_INVALID_SIZE = 500;
    public static final int CONCURRENT_PLAYBACK_UNSUPPORTED = 400;
    public static final int CONFIGURATION_ERROR = 10003;
    public static final int CREATIVE_ERROR = 10041;
    public static final int CURRENTLY_INITIALIZING = 3;
    public static final Companion Companion = new Companion(null);
    public static final int DEEPLINK_OPEN_FAILED = 312;
    public static final int DEFAULT = 10000;
    public static final int EMPTY_TPAT_ERROR = 129;
    public static final int EVALUATE_JAVASCRIPT_FAILED = 313;
    private static final Map<Integer, String> EXCEPTION_CODE_TO_MESSAGE_MAP;
    public static final int GENERATE_JSON_DATA_ERROR = 316;
    public static final int GZIP_ENCODE_ERROR = 116;
    public static final int HEARTBEAT_ERROR = 10043;
    public static final int INVALID_ADS_ENDPOINT = 122;
    public static final int INVALID_ADUNIT_BID_PAYLOAD = 213;
    public static final int INVALID_AD_STATE = 10042;
    public static final int INVALID_APP_ID = 2;
    public static final int INVALID_ASSET_URL = 111;
    public static final int INVALID_BID_PAYLOAD = 208;
    public static final int INVALID_CONFIG_RESPONSE = 135;
    public static final int INVALID_CTA_URL = 110;
    public static final int INVALID_EVENT_ID_ERROR = 200;
    public static final int INVALID_GZIP_BID_PAYLOAD = 214;
    public static final int INVALID_IFA_STATUS = 302;
    public static final int INVALID_INDEX_URL = 115;
    public static final int INVALID_JSON_BID_PAYLOAD = 209;
    public static final int INVALID_LOG_ERROR_ENDPOINT = 124;
    public static final int INVALID_METRICS_ENDPOINT = 125;
    public static final int INVALID_PLACEMENT_ID = 201;
    public static final int INVALID_REQUEST_BUILDER_ERROR = 106;
    public static final int INVALID_RI_ENDPOINT = 123;
    public static final int INVALID_SIZE = 10028;
    public static final int INVALID_TEMPLATE_URL = 105;
    public static final int INVALID_TPAT_KEY = 128;
    public static final int INVALID_WATERFALL_PLACEMENT = 222;
    public static final int JSON_ENCODE_ERROR = 119;
    public static final int JSON_PARAMS_ENCODE_ERROR = 315;
    public static final int LINK_COMMAND_OPEN_FAILED = 314;
    public static final int MRAID_BRIDGE_ERROR = 305;
    public static final int MRAID_DOWNLOAD_JS_ERROR = 130;
    public static final int MRAID_ERROR = 301;
    public static final int MRAID_JS_CALL_EMPTY = 311;
    public static final int MRAID_JS_COPY_FAILED = 219;
    public static final int MRAID_JS_DOES_NOT_EXIST = 218;
    public static final int MRAID_JS_WRITE_FAILED = 131;
    public static final int NATIVE_ASSET_ERROR = 600;
    public static final int NETWORK_ERROR = 10020;
    public static final int NETWORK_PERMISSIONS_NOT_GRANTED = 10034;
    public static final int NETWORK_TIMEOUT = 10047;
    public static final int NETWORK_UNREACHABLE = 10033;
    public static final int NO_SERVE = 10001;
    public static final int NO_SPACE_TO_DOWNLOAD_ASSETS = 10019;
    public static final int OMSDK_COPY_ERROR = 2003;
    public static final int OMSDK_DOWNLOAD_JS_ERROR = 132;
    public static final int OMSDK_JS_WRITE_FAILED = 133;
    public static final int OUT_OF_MEMORY = 3001;
    public static final int PLACEMENT_AD_TYPE_MISMATCH = 207;
    public static final int PLACEMENT_NOT_FOUND = 10013;
    public static final int PLACEMENT_SLEEP = 212;
    public static final int PRIVACY_URL_ERROR = 136;
    public static final int PROTOBUF_SERIALIZATION_ERROR = 118;
    public static final int REACHABILITY_INITIALIZATION_FAILED = 2005;
    public static final int SDK_NOT_INITIALIZED = 6;
    public static final int SDK_VERSION_BELOW_REQUIRED_VERSION = 10035;
    public static final int SERVER_RETRY_ERROR = 10014;
    public static final int STORE_KIT_LOAD_ERROR = 2002;
    public static final int STORE_OVERLAY_LOAD_ERROR = 2004;
    public static final int STORE_REGION_CODE_ERROR = 134;
    public static final int TEMPLATE_UNZIP_ERROR = 109;
    public static final int TPAT_ERROR = 121;
    public static final int TPAT_RETRY_FAILED = 137;
    public static final int UNKNOWN_ERROR = 0;
    public static final int UNKNOWN_EXCEPTION_CODE = 10048;
    public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY = 2006;
    public static final int UNRECOGNIZED = -1;
    public static final int USER_AGENT_ERROR = 7;
    public static final int WEBVIEW_RENDER_UNRESPONSIVE = 10032;
    public static final int WEB_CRASH = 10031;
    public static final int WEB_VIEW_FAILED_NAVIGATION = 2001;
    public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE = 2000;
    private final int code;
    private String creativeId;
    private final String errorMessage;
    private String eventId;
    private final Sdk$SDKError.Reason loggableReason;
    private String placementId;

    /* loaded from: VungleError$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Sdk$SDKError.Reason codeToLoggableReason(int i) {
            Sdk$SDKError.Reason forNumber = Sdk$SDKError.Reason.forNumber(i);
            Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(errorCode)");
            return forNumber;
        }

        public final String getLocalizedMessage(int i) {
            String str = (String) VungleError.EXCEPTION_CODE_TO_MESSAGE_MAP.get(Integer.valueOf(i));
            if (str == null) {
                new UnknownExceptionCode("No adequate description for exceptionCode=" + i).logErrorNoReturnValue$vungle_ads_release();
            }
            String str2 = str;
            if (str == null) {
                str2 = "Unknown Exception Code";
            }
            return str2;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(10000, "");
        hashMap.put(10003, "Configuration Error Occurred. Please check your appID and placementIDs, and try again when network connectivity is available.");
        hashMap.put(10001, "No advertisements are available for your current bid. Please try again later.");
        hashMap.put(0, "Unknown Error Occurred.");
        hashMap.put(304, "The advertisement in the cache has expired and can no longer be played. Please load another ad");
        hashMap.put(3, "There is already an ongoing operation for the action you requested. Please wait until the operation finished before starting another.");
        hashMap.put(6, "Vungle is not initialized/no longer initialized. Please call Vungle.init() to reinitialize.");
        hashMap.put(Integer.valueOf(AD_UNABLE_TO_PLAY), "Unable to play advertisement");
        hashMap.put(Integer.valueOf(AD_FAILED_TO_DOWNLOAD), "Advertisement failed to download");
        hashMap.put(Integer.valueOf(PLACEMENT_NOT_FOUND), "Placement is not valid");
        hashMap.put(Integer.valueOf(SERVER_RETRY_ERROR), "Remote Server responded with http Retry-After, SDK will retry this request.");
        hashMap.put(Integer.valueOf(ALREADY_PLAYING_ANOTHER_AD), "Vungle is already playing different ad.");
        hashMap.put(Integer.valueOf(NO_SPACE_TO_DOWNLOAD_ASSETS), "There is not enough file system size on a device to download assets for an ad.");
        hashMap.put(Integer.valueOf(NETWORK_ERROR), "Network error. Try again later");
        hashMap.put(Integer.valueOf(ASSET_DOWNLOAD_ERROR), "Assets download failed.");
        hashMap.put(Integer.valueOf(INVALID_SIZE), "Ad size is invalid");
        hashMap.put(Integer.valueOf(WEB_CRASH), "Android web view has crashed");
        hashMap.put(Integer.valueOf(WEBVIEW_RENDER_UNRESPONSIVE), "Android web view render became unresponsive, please clean-up your Webview process if any");
        hashMap.put(Integer.valueOf(NETWORK_UNREACHABLE), "Network error. Please check if network is available and permission for network access is granted.");
        hashMap.put(Integer.valueOf(NETWORK_PERMISSIONS_NOT_GRANTED), "Network permissions not granted. Please check manifest for android.permission.INTERNET and android.permission.ACCESS_NETWORK_STATE");
        hashMap.put(Integer.valueOf(SDK_VERSION_BELOW_REQUIRED_VERSION), "The SDK minimum version should not be overridden. Will not work as expected.");
        hashMap.put(Integer.valueOf(AD_RENDER_NETWORK_ERROR), "Ad rendering failed due to network connectivity issue");
        hashMap.put(3001, "Out of memory");
        hashMap.put(Integer.valueOf(AD_MARKUP_INVALID), "Invalid ad markup");
        hashMap.put(Integer.valueOf(CREATIVE_ERROR), "Creative error occurred");
        hashMap.put(Integer.valueOf(INVALID_AD_STATE), "Invalid ad state ");
        hashMap.put(Integer.valueOf(HEARTBEAT_ERROR), "Heartbeat not received within a valid time window");
        hashMap.put(2, "App id is invalid.");
        hashMap.put(207, "Ad type does not match with placement type.");
        hashMap.put(400, "Concurrent playback not supported");
        hashMap.put(Integer.valueOf(NETWORK_TIMEOUT), "Request timeout.");
        hashMap.put(137, "Pinging Tpat did not succeed during all allowed reries.");
        hashMap.put(130, "Failed to download mraid js.");
        hashMap.put(113, "Server returned an unexpected response object or failed to load the downloaded data.");
        hashMap.put(222, "Placement header bidding type does not match with loadAd call.");
        hashMap.put(136, "Failed to open privacy url");
        EXCEPTION_CODE_TO_MESSAGE_MAP = hashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private VungleError(java.lang.Integer r4, com.vungle.ads.internal.protos.Sdk$SDKError.Reason r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r3 = this;
            r0 = 10000(0x2710, float:1.4013E-41)
            r11 = r0
            r0 = r6
            if (r0 != 0) goto L2c
            com.vungle.ads.VungleError$Companion r0 = com.vungle.ads.VungleError.Companion
            r12 = r0
            r0 = r4
            if (r0 == 0) goto L1b
            r0 = r4
            int r0 = r0.intValue()
            r10 = r0
            goto L20
        L1b:
            r0 = 10000(0x2710, float:1.4013E-41)
            r10 = r0
        L20:
            r0 = r12
            r1 = r10
            java.lang.String r0 = r0.getLocalizedMessage(r1)
            r12 = r0
            goto L2f
        L2c:
            r0 = r6
            r12 = r0
        L2f:
            r0 = r3
            r1 = r12
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.loggableReason = r1
            r0 = r3
            r1 = r7
            r0.placementId = r1
            r0 = r3
            r1 = r8
            r0.creativeId = r1
            r0 = r3
            r1 = r9
            r0.eventId = r1
            r0 = r4
            if (r0 == 0) goto L59
            r0 = r4
            int r0 = r0.intValue()
            r10 = r0
            goto L63
        L59:
            r0 = r5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0 = r5
            int r0 = r0.getNumber()
            r10 = r0
        L63:
            r0 = r3
            r1 = r10
            r0.code = r1
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L88
            com.vungle.ads.VungleError$Companion r0 = com.vungle.ads.VungleError.Companion
            r5 = r0
            r0 = r11
            r10 = r0
            r0 = r4
            if (r0 == 0) goto L81
            r0 = r4
            int r0 = r0.intValue()
            r10 = r0
        L81:
            r0 = r5
            r1 = r10
            java.lang.String r0 = r0.getLocalizedMessage(r1)
            r5 = r0
        L88:
            r0 = r3
            r1 = r5
            r0.errorMessage = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.VungleError.<init>(java.lang.Integer, com.vungle.ads.internal.protos.Sdk$SDKError$Reason, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public /* synthetic */ VungleError(Integer num, Sdk$SDKError.Reason reason, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : reason, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, null);
    }

    public /* synthetic */ VungleError(Integer num, Sdk$SDKError.Reason reason, String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, reason, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.vungle.ads.VungleError");
        VungleError vungleError = (VungleError) obj;
        return this.code == vungleError.code && this.loggableReason == vungleError.loggableReason && Intrinsics.areEqual(this.errorMessage, vungleError.errorMessage) && Intrinsics.areEqual(this.placementId, vungleError.placementId) && Intrinsics.areEqual(this.creativeId, vungleError.creativeId) && Intrinsics.areEqual(this.eventId, vungleError.eventId);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getEventId() {
        return this.eventId;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.errorMessage;
    }

    public final Sdk$SDKError.Reason getLoggableReason() {
        return this.loggableReason;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        int i = this.code;
        Sdk$SDKError.Reason reason = this.loggableReason;
        int i2 = 0;
        int hashCode = reason != null ? reason.hashCode() : 0;
        int hashCode2 = this.errorMessage.hashCode();
        String str = this.placementId;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.creativeId;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.eventId;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }

    public final VungleError logError$vungle_ads_release() {
        logErrorNoReturnValue$vungle_ads_release();
        return this;
    }

    public final void logErrorNoReturnValue$vungle_ads_release() {
        Sdk$SDKError.Reason reason = this.loggableReason;
        if (reason != null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(reason, this.errorMessage, this.placementId, this.creativeId, this.eventId);
        }
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public final VungleError setCreativeId$vungle_ads_release(String str) {
        this.creativeId = str;
        return this;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final VungleError setEventId$vungle_ads_release(String str) {
        this.eventId = str;
        return this;
    }

    public final void setPlacementId(String str) {
        this.placementId = str;
    }

    public final VungleError setPlacementId$vungle_ads_release(String str) {
        this.placementId = str;
        return this;
    }
}
