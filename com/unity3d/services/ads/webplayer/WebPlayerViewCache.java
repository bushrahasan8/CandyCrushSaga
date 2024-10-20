package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

/* loaded from: WebPlayerViewCache.class */
public class WebPlayerViewCache {
    private static WebPlayerViewCache instance;
    private HashMap<String, WebPlayerView> _webPlayerMap = new HashMap<>();

    public static WebPlayerViewCache getInstance() {
        if (instance == null) {
            instance = new WebPlayerViewCache();
        }
        return instance;
    }

    public void addWebPlayer(String str, WebPlayerView webPlayerView) {
        synchronized (this) {
            this._webPlayerMap.put(str, webPlayerView);
        }
    }

    public WebPlayerView getWebPlayer(String str) {
        synchronized (this) {
            if (!this._webPlayerMap.containsKey(str)) {
                return null;
            }
            return this._webPlayerMap.get(str);
        }
    }

    public void removeWebPlayer(String str) {
        synchronized (this) {
            if (this._webPlayerMap.containsKey(str)) {
                this._webPlayerMap.remove(str);
            }
        }
    }
}
