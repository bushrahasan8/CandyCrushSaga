package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* loaded from: BannerRefreshInfo.class */
public class BannerRefreshInfo {
    private static BannerRefreshInfo instance;
    private HashMap<String, Integer> _refreshRateMap = new HashMap<>();

    public static BannerRefreshInfo getInstance() {
        if (instance == null) {
            instance = new BannerRefreshInfo();
        }
        return instance;
    }

    public Integer getRefreshRate(String str) {
        Integer num;
        synchronized (this) {
            num = this._refreshRateMap.get(str);
        }
        return num;
    }

    public void setRefreshRate(String str, Integer num) {
        synchronized (this) {
            this._refreshRateMap.put(str, num);
        }
    }
}
