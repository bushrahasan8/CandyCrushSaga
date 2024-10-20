package com.applovin.impl;

import android.text.TextUtils;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashSet;
import java.util.Set;

/* loaded from: ha.class */
public class ha {
    private static final Set b = new HashSet(32);
    private static final Set c = new HashSet(16);
    public static final ha d = a(ServiceProvider.NAMED_AD_REQ);
    public static final ha e = a("ad_imp");
    public static final ha f = a("max_ad_imp");
    public static final ha g = a("ad_session_start");
    public static final ha h = a("ad_imp_session");
    public static final ha i = a("max_ad_imp_session");
    public static final ha j = a("cached_files_expired");
    public static final ha k = a("cache_drop_count");
    public static final ha l = a("sdk_reset_state_count", true);
    public static final ha m = a("ad_response_process_failures", true);
    public static final ha n = a("response_process_failures", true);
    public static final ha o = a("incent_failed_to_display_count", true);
    public static final ha p = a("app_paused_and_resumed");
    public static final ha q = a("ad_rendered_with_mismatched_sdk_key", true);
    public static final ha r = a("ad_shown_outside_app_count");
    public static final ha s = a("med_ad_req");
    public static final ha t = a("med_ad_response_process_failures", true);
    public static final ha u = a("med_waterfall_ad_no_fill", true);
    public static final ha v = a("med_waterfall_ad_adapter_load_failed", true);
    public static final ha w = a("med_waterfall_ad_invalid_response", true);
    private final String a;

    static {
        a("fullscreen_ad_nil_vc_count");
        a("applovin_bundle_missing");
    }

    private ha(String str) {
        this.a = str;
    }

    private static ha a(String str) {
        return a(str, false);
    }

    private static ha a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        }
        Set set = b;
        if (set.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        set.add(str);
        ha haVar = new ha(str);
        if (z) {
            c.add(haVar);
        }
        return haVar;
    }

    public static Set a() {
        return c;
    }

    public String b() {
        return this.a;
    }
}
