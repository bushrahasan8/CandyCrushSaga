package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: sd.class */
public class sd extends k4 {
    public sd(a0 a0Var) {
        super(a0Var);
    }

    public void a() {
        a(y.COLLECT_TOKEN, new HashMap());
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        a(y.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        a(y.COLLECT_TOKENS_FAILED, hashMap);
    }

    public void a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    public void a(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    public void a(Map<String, Object> map, long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }

    public void b(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        a(y.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }
}
