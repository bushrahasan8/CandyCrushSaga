package com.unity3d.services.ads.webplayer;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: WebPlayerSettingsCache.class */
public class WebPlayerSettingsCache {
    private static WebPlayerSettingsCache instance;
    private HashMap<String, JSONObject> _webSettings = new HashMap<>();
    private HashMap<String, JSONObject> _webPlayerSettings = new HashMap<>();
    private HashMap<String, JSONObject> _webPlayerEventSettings = new HashMap<>();

    public static WebPlayerSettingsCache getInstance() {
        if (instance == null) {
            instance = new WebPlayerSettingsCache();
        }
        return instance;
    }

    public void addWebPlayerEventSettings(String str, JSONObject jSONObject) {
        synchronized (this) {
            this._webPlayerEventSettings.put(str, jSONObject);
        }
    }

    public void addWebPlayerSettings(String str, JSONObject jSONObject) {
        synchronized (this) {
            this._webPlayerSettings.put(str, jSONObject);
        }
    }

    public void addWebSettings(String str, JSONObject jSONObject) {
        synchronized (this) {
            this._webSettings.put(str, jSONObject);
        }
    }

    public JSONObject getWebPlayerEventSettings(String str) {
        synchronized (this) {
            if (this._webPlayerEventSettings.containsKey(str)) {
                return this._webPlayerEventSettings.get(str);
            }
            return new JSONObject();
        }
    }

    public JSONObject getWebPlayerSettings(String str) {
        synchronized (this) {
            if (this._webPlayerSettings.containsKey(str)) {
                return this._webPlayerSettings.get(str);
            }
            return new JSONObject();
        }
    }

    public JSONObject getWebSettings(String str) {
        synchronized (this) {
            if (this._webSettings.containsKey(str)) {
                return this._webSettings.get(str);
            }
            return new JSONObject();
        }
    }

    public void removeWebPlayerEventSettings(String str) {
        synchronized (this) {
            if (this._webPlayerEventSettings.containsKey(str)) {
                this._webPlayerEventSettings.remove(str);
            }
        }
    }

    public void removeWebPlayerSettings(String str) {
        synchronized (this) {
            if (this._webPlayerSettings.containsKey(str)) {
                this._webPlayerSettings.remove(str);
            }
        }
    }

    public void removeWebSettings(String str) {
        synchronized (this) {
            if (this._webSettings.containsKey(str)) {
                this._webSettings.remove(str);
            }
        }
    }
}
