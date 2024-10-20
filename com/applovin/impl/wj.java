package com.applovin.impl;

import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import java.util.HashSet;

/* loaded from: wj.class */
public class wj {
    private final String a;
    private final Class b;
    public static final wj c = new wj("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final wj d = new wj("com.applovin.sdk.launched_before", Boolean.class);
    public static final wj e = new wj("com.applovin.sdk.latest_installed_version", String.class);
    public static final wj f = new wj("com.applovin.sdk.install_date", Long.class);
    public static final wj g = new wj("com.applovin.sdk.user_id", String.class);
    public static final wj h = new wj("com.applovin.sdk.compass_id", String.class);
    public static final wj i = new wj("com.applovin.sdk.compass_random_token", String.class);
    public static final wj j = new wj("com.applovin.sdk.applovin_random_token", String.class);
    public static final wj k = new wj("com.applovin.sdk.device_test_group", String.class);
    public static final wj l = new wj("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final wj m = new wj("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final wj n = new wj("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final wj o = new wj("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final wj p = new wj(OTIABTCFKeys.IABTCF_CMPSDKID, Object.class);
    public static final wj q = new wj(OTIABTCFKeys.IABTCF_CMPSDKVERSION, Object.class);
    public static final wj r = new wj(OTIABTCFKeys.IABTCF_GDPRAPPLIES, Object.class);
    public static final wj s = new wj(OTIABTCFKeys.IABTCF_TCSTRING, String.class);
    public static final wj t = new wj(OTIABTCFKeys.IABTCF_ADD_TL_CONSENT, String.class);
    public static final wj u = new wj(OTIABTCFKeys.IABTCF_VENDORCONSENTS, String.class);
    public static final wj v = new wj(OTIABTCFKeys.IABTCF_VENDORLEGITIMATEINTERESTS, String.class);
    public static final wj w = new wj(OTIABTCFKeys.IABTCF_PURPOSECONSENTS, String.class);
    public static final wj x = new wj(OTIABTCFKeys.IABTCF_PURPOSELEGITIMATEINTERESTS, String.class);
    public static final wj y = new wj(OTIABTCFKeys.IABTCF_SPECIALFEATURESOPTINS, String.class);
    public static final wj z = new wj("com.applovin.sdk.stats", String.class);
    public static final wj A = new wj("com.applovin.sdk.task.stats", HashSet.class);
    public static final wj B = new wj("com.applovin.sdk.network_response_code_mapping", String.class);
    public static final wj C = new wj("com.applovin.sdk.event_tracking.super_properties", String.class);
    public static final wj D = new wj("com.applovin.sdk.last_video_position", Integer.class);
    public static final wj E = new wj("com.applovin.sdk.should_resume_video", Boolean.class);
    public static final wj F = new wj("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final wj G = new wj("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final wj H = new wj("com.applovin.sdk.persisted_data", String.class);
    public static final wj I = new wj("com.applovin.sdk.mediation_provider", String.class);
    public static final wj J = new wj("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final wj K = new wj("com.applovin.sdk.user_agent", String.class);
    public static final wj L = new wj("com.applovin.sdk.last_os_version_user_agent_collected_for", String.class);
    public static final wj M = new wj("com.taboola.api.user_id", String.class);
    public static final wj N = new wj("com.taboola.api.user_id_creation_date", Long.class);

    public wj(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public String a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public String toString() {
        return "Key{name='" + this.a + "', type=" + this.b + '}';
    }
}
