package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: xd.class */
public class xd extends k4 {
    public xd(a0 a0Var) {
        super(a0Var);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        a(y.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(Map<String, Object> map, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(y.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }

    public void b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, hashMap);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    public void f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    public void h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    public void l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_OPENED, hashMap);
    }

    public void m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, hashMap);
    }

    public void n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, hashMap);
    }

    public void o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    public void p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    public void q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        a(y.TROUBLESHOOTING_WATERFALL_OVERHEAD, hashMap);
    }
}
