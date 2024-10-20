package com.king.amp.sa;

import android.util.Log;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: AbmMediaPlayerLayoutConfig.class */
public class AbmMediaPlayerLayoutConfig {
    private final String TAG;
    private JSONArray chapterConfig;
    private List<Map<String, String>> chapterConfigMapList;
    private JSONObject layoutConfig;
    private Map<String, String> layoutConfigMap;
    private String layoutConfigString;

    public AbmMediaPlayerLayoutConfig() {
        this.TAG = "AbmMediaPlayerLayoutConfig";
        this.layoutConfig = new JSONObject();
    }

    public AbmMediaPlayerLayoutConfig(String str) {
        this.TAG = "AbmMediaPlayerLayoutConfig";
        try {
            this.layoutConfigString = str;
            this.layoutConfig = new JSONObject(str);
            this.layoutConfigMap = new HashMap();
            generateLayoutConfigMap();
        } catch (JSONException e) {
            Log.e("AbmMediaPlayerLayoutConfig", "Error when parsing Json string.");
        }
    }

    private void generateChapterConfigMapList() {
        for (int i = 0; i < this.chapterConfig.length(); i++) {
            try {
                JSONObject jSONObject = this.chapterConfig.getJSONObject(i);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
                this.chapterConfigMapList.add(hashMap);
            } catch (JSONException e) {
                Log.e("AbmMediaPlayerLayoutConfig", "Error when generating chapter config map.");
                return;
            }
        }
    }

    private void generateLayoutConfigMap() {
        Iterator<String> keys = this.layoutConfig.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.layoutConfigMap.put(next, this.layoutConfig.getString(next));
            } catch (JSONException e) {
                Log.e("AbmMediaPlayerLayoutConfig", "Error when generating layout config map.");
            }
        }
    }

    public List<Map<String, String>> getChapterConfigMapList() {
        return this.chapterConfigMapList;
    }

    public Map<String, String> getLayoutConfigMap() {
        return this.layoutConfigMap;
    }

    public String getLayoutConfigString() {
        return this.layoutConfigString;
    }

    public void setChapterConfig(String str) {
        try {
            this.chapterConfig = new JSONArray(str);
            this.chapterConfigMapList = new ArrayList();
            generateChapterConfigMapList();
        } catch (JSONException e) {
            Log.e("AbmMediaPlayerLayoutConfig", "Error when parsing Json string.");
        }
    }
}
