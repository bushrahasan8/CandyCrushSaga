package com.ironsource.mediationsdk.metadata;

import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.metadata.MetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: MetaDataUtils.class */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        return (str == null || str.length() > 2048) ? "The MetaData key you entered is invalid. Please enter a key of maximum 2048 characters." : "";
    }

    public static String checkMetaDataValueValidity(List<String> list) {
        if (list.isEmpty()) {
            return "The MetaData list should include at least one element.";
        }
        for (String str : list) {
            if (str == null || str.length() > 2048) {
                return "The MetaData value(s) you entered is invalid. Please enter a value of maximum 2048 characters.";
            }
        }
        return "";
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (!isKnownKey(str)) {
            return new MetaData(str, list);
        }
        String lowerCase = StringUtils.toLowerCase(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
            String formatValueForType = formatValueForType(str2, valueTypeForKey);
            arrayList.add(valueTypeForKey);
            arrayList2.add(formatValueForType);
        }
        return new MetaData(lowerCase, arrayList2, arrayList);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        String str2 = str;
        if (metaDataValueTypes == MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN) {
            String str3 = a.g;
            if (!str.equalsIgnoreCase(a.g)) {
                if (str.equalsIgnoreCase("yes")) {
                    str3 = a.g;
                } else {
                    str3 = "false";
                    if (!str.equalsIgnoreCase("false")) {
                        if (str.equalsIgnoreCase("no")) {
                            str3 = "false";
                        } else {
                            str2 = "";
                        }
                    }
                }
            }
            str2 = str3;
        }
        return str2;
    }

    public static boolean getMetaDataBooleanValue(String str) {
        return !str.equals("false");
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        return (str.equalsIgnoreCase(a.a) || str.equalsIgnoreCase(a.b) || str.equalsIgnoreCase(a.c) || str.equalsIgnoreCase(a.d)) ? MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN : MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
    }

    public static boolean isKnownKey(String str) {
        return a.l.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        return a.k.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isMediationOnlyKey(String str) {
        return a.j.contains(str.toLowerCase(Locale.getDefault()));
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        return isValidMetaData(str, a.a, str2);
    }

    public static boolean isValidMetaData(String str, String str2, String str3) {
        return str.equalsIgnoreCase(str2) && !TextUtils.isEmpty(str3);
    }
}
