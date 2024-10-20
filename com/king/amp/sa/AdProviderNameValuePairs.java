package com.king.amp.sa;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: AdProviderNameValuePairs.class */
public class AdProviderNameValuePairs {
    private Map<String, Object> mParameters = new HashMap();

    public void add(String str, Object obj) {
        this.mParameters.put(str, obj);
    }

    public void clear() {
        this.mParameters.clear();
    }

    public String getKeyAtIndex(int i) {
        for (Map.Entry<String, Object> entry : this.mParameters.entrySet()) {
            if (i == 0) {
                return entry.getKey();
            }
            i--;
        }
        return null;
    }

    public int getNumEntries() {
        return this.mParameters.size();
    }

    public Object getValue(String str) {
        return this.mParameters.get(str);
    }

    public Object getValue(String str, Object obj) {
        Object obj2 = this.mParameters.get(str);
        return obj2 != null ? obj2 : obj;
    }

    public Boolean isEmpty() {
        return Boolean.valueOf(this.mParameters.isEmpty());
    }
}
