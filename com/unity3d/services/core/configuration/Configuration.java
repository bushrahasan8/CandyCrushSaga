package com.unity3d.services.core.configuration;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.i5;
import com.unity3d.ads.core.domain.AndroidBoldExperimentHandler;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.configuration.AdsModuleConfiguration;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.store.core.configuration.StoreModuleConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Configuration.class */
public class Configuration {
    private String _configUrl;
    private ConfigurationRequestFactory _configurationRequestFactory;
    private int _connectedEventThresholdInMs;
    private boolean _delayWebViewUpdate;
    private ExperimentsReader _experimentReader;
    private String _filteredJsonString;
    private int _loadTimeout;
    private int _maxRetries;
    private int _maximumConnectedEvents;
    private double _metricSampleRate;
    private Boolean _metricsEnabled;
    private String _metricsUrl;
    private final Class<?>[] _moduleConfigurationList;
    private Map<String, IModuleConfiguration> _moduleConfigurations;
    private long _networkErrorTimeout;
    private int _privacyRequestWaitTimeout;
    private JSONObject _rawJsonData;
    private int _resetWebAppTimeout;
    private long _retryDelay;
    private double _retryScalingFactor;
    private String _sTkn;
    private String _scarBiddingUrl;
    private String _sdkVersion;
    private int _showTimeout;
    private String _src;
    private String _stateId;
    private int _tokenTimeout;
    private String _unifiedAuctionToken;
    private Class[] _webAppApiClassList;
    private long _webViewAppCreateTimeout;
    private int _webViewBridgeTimeout;
    private String _webViewData;
    private String _webViewHash;
    private String _webViewUrl;
    private String _webViewVersion;

    public Configuration() {
        this._moduleConfigurationList = new Class[]{CoreModuleConfiguration.class, AdsModuleConfiguration.class, AnalyticsModuleConfiguration.class, BannersModuleConfiguration.class, StoreModuleConfiguration.class};
        this._experimentReader = new ExperimentsReader();
        setOptionalFields(new JSONObject(), false);
    }

    public Configuration(String str) {
        this(str, new Experiments());
    }

    public Configuration(String str, ExperimentsReader experimentsReader) {
        this(str, experimentsReader.getCurrentlyActiveExperiments());
        this._experimentReader = experimentsReader;
    }

    public Configuration(String str, IExperiments iExperiments) {
        this();
        this._configUrl = str;
        this._configurationRequestFactory = new ConfigurationRequestFactory(this);
        this._experimentReader.updateLocalExperiments(iExperiments);
    }

    public Configuration(JSONObject jSONObject) throws MalformedURLException, JSONException {
        this._moduleConfigurationList = new Class[]{CoreModuleConfiguration.class, AdsModuleConfiguration.class, AnalyticsModuleConfiguration.class, BannersModuleConfiguration.class, StoreModuleConfiguration.class};
        this._experimentReader = new ExperimentsReader();
        handleConfigurationData(jSONObject, false);
    }

    private void createWebAppApiClassList() {
        ArrayList arrayList = new ArrayList();
        for (Class cls : getModuleConfigurationList()) {
            IModuleConfiguration moduleConfiguration = getModuleConfiguration(cls);
            if (moduleConfiguration != null && moduleConfiguration.getWebAppApiClassList() != null) {
                arrayList.addAll(Arrays.asList(moduleConfiguration.getWebAppApiClassList()));
            }
        }
        this._webAppApiClassList = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private JSONObject getFilteredConfigJson(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (!next.equalsIgnoreCase("tkn") && !next.equalsIgnoreCase(i5.E0) && !next.equalsIgnoreCase("srr") && !next.equalsIgnoreCase("sTkn")) {
                jSONObject2.put(next, opt);
            }
        }
        return jSONObject2;
    }

    private void setOptionalFields(JSONObject jSONObject, boolean z) {
        this._webViewVersion = jSONObject.optString("version", null);
        boolean z2 = false;
        this._delayWebViewUpdate = jSONObject.optBoolean("dwu", false);
        this._resetWebAppTimeout = jSONObject.optInt("rwt", 10000);
        this._maxRetries = jSONObject.optInt("mr", 6);
        this._retryDelay = jSONObject.optLong("rd", UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
        this._retryScalingFactor = jSONObject.optDouble("rcf", 2.0d);
        this._connectedEventThresholdInMs = jSONObject.optInt("cet", 10000);
        this._maximumConnectedEvents = jSONObject.optInt("mce", 500);
        this._networkErrorTimeout = jSONObject.optLong("net", 60000L);
        this._sdkVersion = jSONObject.optString(i5.J, "");
        this._showTimeout = jSONObject.optInt("sto", 10000);
        this._loadTimeout = jSONObject.optInt("lto", 30000);
        this._webViewBridgeTimeout = jSONObject.optInt("wto", 5000);
        this._metricsUrl = jSONObject.optString("murl", "");
        this._metricSampleRate = jSONObject.optDouble("msr", 100.0d);
        this._webViewAppCreateTimeout = jSONObject.optLong("wct", 60000L);
        this._tokenTimeout = jSONObject.optInt("tto", 5000);
        this._privacyRequestWaitTimeout = jSONObject.optInt("prwto", AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        this._src = jSONObject.optString("src", null);
        this._scarBiddingUrl = jSONObject.optString("scurl", ScarConstants.SCAR_PRD_BIDDING_ENDPOINT);
        if (this._metricSampleRate >= new Random().nextInt(99) + 1) {
            z2 = true;
        }
        this._metricsEnabled = Boolean.valueOf(z2);
        IExperiments experimentObjects = jSONObject.has(AndroidBoldExperimentHandler.EXPO_NODE_NAME) ? new ExperimentObjects(jSONObject.optJSONObject(AndroidBoldExperimentHandler.EXPO_NODE_NAME)) : new Experiments(jSONObject.optJSONObject("exp"));
        if (z) {
            this._experimentReader.updateRemoteExperiments(experimentObjects);
        } else {
            this._experimentReader.updateLocalExperiments(experimentObjects);
        }
    }

    public Boolean areMetricsEnabledForCurrentSession() {
        return this._metricsEnabled;
    }

    public void deleteFromDisk() {
        File file = new File(SdkProperties.getLocalConfigurationFilepath());
        if (file.exists()) {
            file.delete();
        }
    }

    public String getConfigUrl() {
        return this._configUrl;
    }

    public int getConnectedEventThreshold() {
        return this._connectedEventThresholdInMs;
    }

    public boolean getDelayWebViewUpdate() {
        return this._delayWebViewUpdate;
    }

    public IExperiments getExperiments() {
        return this._experimentReader.getCurrentlyActiveExperiments();
    }

    public ExperimentsReader getExperimentsReader() {
        return this._experimentReader;
    }

    public String getFilteredJsonString() {
        return this._filteredJsonString;
    }

    public int getLoadTimeout() {
        return this._loadTimeout;
    }

    public int getMaxRetries() {
        return this._maxRetries;
    }

    public int getMaximumConnectedEvents() {
        return this._maximumConnectedEvents;
    }

    public double getMetricSampleRate() {
        return this._metricSampleRate;
    }

    public String getMetricsUrl() {
        return this._metricsUrl;
    }

    public IModuleConfiguration getModuleConfiguration(Class cls) {
        Map<String, IModuleConfiguration> map = this._moduleConfigurations;
        if (map != null && map.containsKey(cls)) {
            return this._moduleConfigurations.get(cls);
        }
        try {
            IModuleConfiguration iModuleConfiguration = (IModuleConfiguration) cls.newInstance();
            if (iModuleConfiguration == null) {
                return null;
            }
            if (this._moduleConfigurations == null) {
                HashMap hashMap = new HashMap();
                this._moduleConfigurations = hashMap;
                hashMap.put(cls.getName(), iModuleConfiguration);
            }
            return iModuleConfiguration;
        } catch (Exception e) {
            return null;
        }
    }

    public Class[] getModuleConfigurationList() {
        return this._moduleConfigurationList;
    }

    public long getNetworkErrorTimeout() {
        return this._networkErrorTimeout;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this._privacyRequestWaitTimeout;
    }

    public JSONObject getRawConfigData() {
        return this._rawJsonData;
    }

    public int getResetWebappTimeout() {
        return this._resetWebAppTimeout;
    }

    public long getRetryDelay() {
        return this._retryDelay;
    }

    public double getRetryScalingFactor() {
        return this._retryScalingFactor;
    }

    public String getScarBiddingUrl() {
        return this._scarBiddingUrl;
    }

    public String getSdkVersion() {
        return this._sdkVersion;
    }

    public String getSessionToken() {
        return this._sTkn;
    }

    public int getShowTimeout() {
        return this._showTimeout;
    }

    public String getSrc() {
        String str = this._src;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public String getStateId() {
        String str = this._stateId;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public int getTokenTimeout() {
        return this._tokenTimeout;
    }

    public String getUnifiedAuctionToken() {
        return this._unifiedAuctionToken;
    }

    public Class[] getWebAppApiClassList() {
        if (this._webAppApiClassList == null) {
            createWebAppApiClassList();
        }
        return this._webAppApiClassList;
    }

    public long getWebViewAppCreateTimeout() {
        return this._webViewAppCreateTimeout;
    }

    public int getWebViewBridgeTimeout() {
        return this._webViewBridgeTimeout;
    }

    public String getWebViewData() {
        return this._webViewData;
    }

    public String getWebViewHash() {
        return this._webViewHash;
    }

    public String getWebViewUrl() {
        return this._webViewUrl;
    }

    public String getWebViewVersion() {
        return this._webViewVersion;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleConfigurationData(org.json.JSONObject r5, boolean r6) throws java.net.MalformedURLException, org.json.JSONException {
        /*
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r5
            java.lang.String r1 = "url"
            boolean r0 = r0.isNull(r1)     // Catch: org.json.JSONException -> Lba
            if (r0 != 0) goto L18
            r0 = r5
            java.lang.String r1 = "url"
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> Lba
            r7 = r0
            goto L1a
        L18:
            r0 = 0
            r7 = r0
        L1a:
            r0 = r7
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Laf
            r0 = r4
            r1 = r7
            r0._webViewUrl = r1
            r0 = r5
            java.lang.String r1 = "hash"
            boolean r0 = r0.isNull(r1)     // Catch: org.json.JSONException -> L45
            if (r0 != 0) goto L3b
            r0 = r5
            java.lang.String r1 = "hash"
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L45
            r7 = r0
            goto L3d
        L3b:
            r0 = 0
            r7 = r0
        L3d:
            r0 = r4
            r1 = r7
            r0._webViewHash = r1     // Catch: org.json.JSONException -> L45
            goto L4b
        L45:
            r7 = move-exception
            r0 = r4
            r1 = 0
            r0._webViewHash = r1
        L4b:
            r0 = r5
            java.lang.String r1 = "tkn"
            boolean r0 = r0.isNull(r1)
            if (r0 != 0) goto L5e
            r0 = r5
            java.lang.String r1 = "tkn"
            java.lang.String r0 = r0.optString(r1)
            r7 = r0
            goto L60
        L5e:
            r0 = 0
            r7 = r0
        L60:
            r0 = r4
            r1 = r7
            r0._unifiedAuctionToken = r1
            r0 = r5
            java.lang.String r1 = "sid"
            boolean r0 = r0.isNull(r1)
            if (r0 != 0) goto L78
            r0 = r5
            java.lang.String r1 = "sid"
            java.lang.String r0 = r0.optString(r1)
            r7 = r0
            goto L7a
        L78:
            r0 = 0
            r7 = r0
        L7a:
            r0 = r4
            r1 = r7
            r0._stateId = r1
            r0 = r8
            r7 = r0
            r0 = r5
            java.lang.String r1 = "sTkn"
            boolean r0 = r0.isNull(r1)
            if (r0 != 0) goto L92
            r0 = r5
            java.lang.String r1 = "sTkn"
            java.lang.String r0 = r0.optString(r1)
            r7 = r0
        L92:
            r0 = r4
            r1 = r7
            r0._sTkn = r1
            r0 = r4
            r1 = r5
            r2 = r6
            r0.setOptionalFields(r1, r2)
            r0 = r4
            r1 = r4
            r2 = r5
            org.json.JSONObject r1 = r1.getFilteredConfigJson(r2)
            java.lang.String r1 = r1.toString()
            r0._filteredJsonString = r1
            r0 = r4
            r1 = r5
            r0._rawJsonData = r1
            return
        Laf:
            java.net.MalformedURLException r0 = new java.net.MalformedURLException
            r1 = r0
            java.lang.String r2 = "WebView URL is null or empty"
            r1.<init>(r2)
            throw r0
        Lba:
            r7 = move-exception
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.configuration.Configuration.handleConfigurationData(org.json.JSONObject, boolean):void");
    }

    public void makeRequest() throws Exception {
        if (this._configUrl == null) {
            throw new MalformedURLException("Base URL is null");
        }
        HttpRequest httpRequest = WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
        InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        try {
            handleConfigurationData(new JSONObject(((HttpClient) Utilities.getService(HttpClient.class)).executeBlocking(httpRequest).getBody().toString()), true);
            InitializeEventsMetricSender.getInstance().didConfigRequestEnd(true);
            saveToDisk();
        } catch (Exception e) {
            InitializeEventsMetricSender.getInstance().didConfigRequestEnd(false);
            throw e;
        }
    }

    public void saveToDisk() {
        Utilities.writeFile(new File(SdkProperties.getLocalConfigurationFilepath()), getFilteredJsonString());
    }

    public void setWebViewData(String str) {
        this._webViewData = str;
    }

    public void setWebViewHash(String str) {
        this._webViewHash = str;
    }

    public void setWebViewUrl(String str) {
        this._webViewUrl = str;
    }
}
