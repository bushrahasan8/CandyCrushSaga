package com.ironsource.sdk.controller;

import com.ironsource.r5;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: FeaturesManager.class */
public class FeaturesManager {
    private static volatile FeaturesManager c;
    private Map a;
    private final ArrayList b = new a(this);

    /* loaded from: FeaturesManager$a.class */
    class a extends ArrayList {
        final FeaturesManager a;

        a(FeaturesManager featuresManager) {
            this.a = featuresManager;
            add(t2.d.f);
            add(t2.d.e);
            add(t2.d.g);
            add(t2.d.h);
            add(t2.d.i);
            add(t2.d.j);
            add(t2.d.k);
            add(t2.d.l);
            add(t2.d.m);
        }
    }

    private FeaturesManager() {
        if (c != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (c == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (c == null) {
                        c = new FeaturesManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList a() {
        return new ArrayList(this.b);
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        return networkConfiguration.has(t2.a.c) ? networkConfiguration.optJSONObject(t2.a.c) : new JSONObject();
    }

    public int getDebugMode() {
        int i = 0;
        Integer num = 0;
        try {
            if (this.a.containsKey("debugMode")) {
                num = (Integer) this.a.get("debugMode");
            }
        } catch (Exception e) {
            e.printStackTrace();
            num = 0;
        }
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    public r5 getFeatureFlagHealthCheck() {
        return new r5(SDKUtils.getNetworkConfiguration().optJSONObject(t2.a.q));
    }

    public int getInitRecoverTrials() {
        JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject(t2.a.e);
        if (optJSONObject != null) {
            return optJSONObject.optInt(t2.a.d, 0);
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.a = map;
    }
}
