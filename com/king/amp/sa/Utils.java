package com.king.amp.sa;

import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.sdk.controller.f;

/* loaded from: Utils.class */
public class Utils {
    private static Utils instance;
    public ALog logImpl;

    private Utils(ALog aLog) {
        if (aLog != null) {
            this.logImpl = aLog;
        } else {
            this.logImpl = new LogImpl();
        }
    }

    private static void addDurationToMetadata(Bundle bundle, AdProviderNameValuePairs adProviderNameValuePairs) {
        if (bundle.containsKey("CreativeDurationMs")) {
            adProviderNameValuePairs.add("adDuration", Double.valueOf(bundle.getInt("CreativeDurationMs") / 1000.0d));
        }
    }

    private static void addMetadataAsStringIfValueIsValid(Bundle bundle, String str, String str2, AdProviderNameValuePairs adProviderNameValuePairs) {
        String string = bundle.getString(str2);
        if (string == null || string.length() < 1) {
            return;
        }
        adProviderNameValuePairs.add(str, string);
    }

    private static void addMetadataWrappersIfPresent(Bundle bundle, AdProviderNameValuePairs adProviderNameValuePairs) {
        Parcelable[] parcelableArray = bundle.getParcelableArray("Wrappers");
        if (parcelableArray == null || parcelableArray.length < 1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Parcelable parcelable : parcelableArray) {
            Bundle bundle2 = parcelable instanceof Bundle ? (Bundle) parcelable : null;
            if (bundle2 == null) {
                warning("Utils", "Metadata wrapper is not of type Bundle");
            } else {
                String string = bundle2.getString("AdId");
                if (string != null && string.length() > 0) {
                    sb.append(string);
                    sb.append(",");
                }
                String string2 = bundle2.getString("AdSystem");
                if (string2 != null && string2.length() > 0) {
                    sb2.append(string2);
                    sb2.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        adProviderNameValuePairs.add("wrapperAdIds", sb.toString());
        adProviderNameValuePairs.add("wrapperAdSystems", sb2.toString());
    }

    public static Utils getInstance(ALog aLog) {
        Utils utils;
        synchronized (Utils.class) {
            try {
                if (instance == null) {
                    instance = new Utils(aLog);
                }
                utils = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return utils;
    }

    public static void log(String str, String str2) {
        getInstance(null).logImpl.log(str, str2);
    }

    public static void parseMetaData(Bundle bundle, AdProviderNameValuePairs adProviderNameValuePairs) {
        addMetadataAsStringIfValueIsValid(bundle, f.b.c, "AdId", adProviderNameValuePairs);
        addMetadataAsStringIfValueIsValid(bundle, "adCreativeName", "AdTitle", adProviderNameValuePairs);
        addMetadataAsStringIfValueIsValid(bundle, "dealId", "DealId", adProviderNameValuePairs);
        addMetadataAsStringIfValueIsValid(bundle, "adTagUrid", "adtagurid", adProviderNameValuePairs);
        addDurationToMetadata(bundle, adProviderNameValuePairs);
        addMetadataAsStringIfValueIsValid(bundle, "vastAdSystem", "AdSystem", adProviderNameValuePairs);
        addMetadataAsStringIfValueIsValid(bundle, "vastCreativeId", "CreativeId", adProviderNameValuePairs);
        addMetadataAsStringIfValueIsValid(bundle, "mainAssetURL", "MediaUrl", adProviderNameValuePairs);
        addMetadataWrappersIfPresent(bundle, adProviderNameValuePairs);
    }

    public static void warning(String str, String str2) {
        getInstance(null).logImpl.warning(str, str2);
    }
}
