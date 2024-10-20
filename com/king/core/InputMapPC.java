package com.king.core;

import android.util.Pair;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: InputMapPC.class */
public class InputMapPC {
    protected static Map<String, String> mTranslations = new HashMap();
    protected static Map<String, LinkedHashMap<String, Pair<List<Integer>, List<Integer>>>> mInputMap = new LinkedHashMap();

    public static void setUpInputMap(Map<String, LinkedHashMap<String, Pair<List<Integer>, List<Integer>>>> map) {
        mInputMap.clear();
        mTranslations.clear();
        mInputMap = map;
    }
}
