package com.vungle.ads.internal;

import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.CleverCache;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Placement;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: ConfigManager.class */
public final class ConfigManager {
    public static final ConfigManager INSTANCE = new ConfigManager();
    public static final String TAG = "ConfigManager";
    private static ConfigPayload config;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;

    private ConfigManager() {
    }

    public final boolean adLoadOptimizationEnabled() {
        ConfigPayload.LoadOptimizationSettings isAdDownloadOptEnabled;
        ConfigPayload configPayload = config;
        return (configPayload == null || (isAdDownloadOptEnabled = configPayload.isAdDownloadOptEnabled()) == null) ? false : isAdDownloadOptEnabled.getEnabled();
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        return endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
    }

    public final int getCleverCacheDiskPercentage() {
        CleverCache cleverCache;
        Integer diskPercentage;
        ConfigPayload configPayload = config;
        return (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) ? 3 : diskPercentage.intValue();
    }

    public final long getCleverCacheDiskSize() {
        CleverCache cleverCache;
        Long diskSize;
        ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long longValue = diskSize.longValue();
        long j = 1024;
        return longValue * j * j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getConfigExtension() {
        /*
            r2 = this;
            com.vungle.ads.internal.model.ConfigPayload r0 = com.vungle.ads.internal.ConfigManager.config
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L13
            r0 = r3
            java.lang.String r0 = r0.getConfigExtension()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L16
        L13:
            java.lang.String r0 = ""
            r3 = r0
        L16:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ConfigManager.getConfigExtension():java.lang.String");
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        return endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        return (configPayload == null || (gdpr = configPayload.getGdpr()) == null) ? null : gdpr.getButtonAccept();
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        return (configPayload == null || (gdpr = configPayload.getGdpr()) == null) ? null : gdpr.getButtonDeny();
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        return (configPayload == null || (gdpr = configPayload.getGdpr()) == null) ? null : gdpr.getConsentMessage();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getGDPRConsentMessageVersion() {
        /*
            r2 = this;
            com.vungle.ads.internal.model.ConfigPayload r0 = com.vungle.ads.internal.ConfigManager.config
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            r0 = r3
            com.vungle.ads.internal.model.ConfigPayload$GDPRSettings r0 = r0.getGdpr()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L1c
            r0 = r3
            java.lang.String r0 = r0.getConsentMessageVersion()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1f
        L1c:
            java.lang.String r0 = ""
            r3 = r0
        L1f:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ConfigManager.getGDPRConsentMessageVersion():java.lang.String");
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        return (configPayload == null || (gdpr = configPayload.getGdpr()) == null) ? null : gdpr.getConsentTitle();
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        return (configPayload == null || (gdpr = configPayload.getGdpr()) == null) ? false : gdpr.isCountryDataProtected();
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null) ? AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : logMetricsSettings.getErrorLogLevel();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null) ? false : logMetricsSettings.getMetricsEnabled();
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        return endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
    }

    public final String getMraidEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        return endpoints2 != null ? endpoints2.getMraidEndpoint() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getMraidJsVersion() {
        /*
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getMraidEndpoint()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "mraid_"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r5
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r1 = r1.getLastPathSegment()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L32
        L2f:
            java.lang.String r0 = "mraid_1"
            r4 = r0
        L32:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.ConfigManager.getMraidJsVersion():java.lang.String");
    }

    public final Placement getPlacement(String id) {
        Object obj;
        Intrinsics.checkNotNullParameter(id, "id");
        List<Placement> list = placements;
        Placement placement = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
            } while (!Intrinsics.areEqual(((Placement) obj).getReferenceId(), id));
            placement = (Placement) obj;
        }
        return placement;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        return endpoints2 != null ? endpoints2.getRiEndpoint() : null;
    }

    public final int getSessionTimeoutInSecond() {
        ConfigPayload.Session session;
        ConfigPayload configPayload = config;
        return (configPayload == null || (session = configPayload.getSession()) == null) ? 900 : session.getTimeout();
    }

    public final boolean heartbeatEnabled() {
        ConfigPayload.Template template;
        ConfigPayload configPayload = config;
        return (configPayload == null || (template = configPayload.getTemplate()) == null) ? false : template.getHeartbeatEnabled();
    }

    public final void initWithConfig(ConfigPayload config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        config = config2;
        endpoints = config2.getEndpoints();
        placements = config2.getPlacements();
    }

    public final boolean isCleverCacheEnabled() {
        CleverCache cleverCache;
        Boolean enabled;
        ConfigPayload configPayload = config;
        return (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (enabled = cleverCache.getEnabled()) == null) ? false : enabled.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        ConfigPayload.ReportIncentivizedSettings isReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        return (configPayload == null || (isReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) ? false : isReportIncentivizedEnabled.getEnabled();
    }

    public final boolean omEnabled() {
        ConfigPayload.ViewabilitySettings viewability;
        ConfigPayload configPayload = config;
        return (configPayload == null || (viewability = configPayload.getViewability()) == null) ? false : viewability.getOm();
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        return (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) ? true : disableAdId.booleanValue();
    }

    public final boolean validateEndpoints$vungle_ads_release() {
        boolean z;
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            AnalyticsClient.logError$vungle_ads_release$default(AnalyticsClient.INSTANCE, 122, "The ads endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
            z = false;
        } else {
            z = true;
        }
        ConfigPayload.Endpoints endpoints3 = endpoints;
        String riEndpoint = endpoints3 != null ? endpoints3.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            AnalyticsClient.logError$vungle_ads_release$default(AnalyticsClient.INSTANCE, 123, "The ri endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
        }
        ConfigPayload.Endpoints endpoints4 = endpoints;
        String mraidEndpoint = endpoints4 != null ? endpoints4.getMraidEndpoint() : null;
        if (mraidEndpoint == null || mraidEndpoint.length() == 0) {
            AnalyticsClient.logError$vungle_ads_release$default(AnalyticsClient.INSTANCE, 130, "The mraid endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
            z = false;
        }
        ConfigPayload.Endpoints endpoints5 = endpoints;
        String metricsEndpoint = endpoints5 != null ? endpoints5.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            AnalyticsClient.logError$vungle_ads_release$default(AnalyticsClient.INSTANCE, 125, "The metrics endpoint was not provided in the config.", (String) null, (String) null, (String) null, 28, (Object) null);
        }
        ConfigPayload.Endpoints endpoints6 = endpoints;
        String str = null;
        if (endpoints6 != null) {
            str = endpoints6.getErrorLogsEndpoint();
        }
        if (str == null || str.length() == 0) {
            Log.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z;
    }
}
