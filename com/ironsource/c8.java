package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* loaded from: c8.class */
public class c8 extends k4 {
    public c8(a0 a0Var) {
        super(a0Var);
    }

    public void a() {
        a(y.INIT_SUCCESS);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        a(y.INIT_FAILED, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        a(y.INIT_ENDED, hashMap);
    }

    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        a(y.INIT_STARTED, hashMap);
    }
}
