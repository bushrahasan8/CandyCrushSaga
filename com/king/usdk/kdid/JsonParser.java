package com.king.usdk.kdid;

import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Keep
/* loaded from: JsonParser.class */
public class JsonParser {
    public static <V> V parse(Class<V> cls, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            V newInstance = cls.newInstance();
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && jSONObject.has(field.getName())) {
                    if (field.getType().isEnum()) {
                        field.set(newInstance, Enum.valueOf(field.getType(), jSONObject.getString(field.getName())));
                    } else if (List.class.isAssignableFrom(field.getType())) {
                        JSONArray jSONArray = jSONObject.getJSONArray(field.getName());
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(jSONArray.getString(i));
                        }
                        field.set(newInstance, arrayList);
                    } else {
                        field.set(newInstance, jSONObject.getString(field.getName()));
                    }
                }
            }
            return newInstance;
        } catch (Exception e) {
            return null;
        }
    }

    public static String serialize(Class<TokenMetaData> cls, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                    if (List.class.isAssignableFrom(field.getType())) {
                        JSONArray jSONArray = new JSONArray();
                        List list = (List) field.get(obj);
                        for (int i = 0; i < list.size(); i++) {
                            jSONArray.put(list.get(i));
                        }
                        jSONObject.put(field.getName(), jSONArray);
                    } else {
                        jSONObject.put(field.getName(), field.get(obj));
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
