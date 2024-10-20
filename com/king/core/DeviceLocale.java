package com.king.core;

import androidx.annotation.Keep;
import java.util.Locale;

@Keep
/* loaded from: DeviceLocale.class */
public class DeviceLocale {
    private DeviceLocale() {
        throw new IllegalStateException("Utility class");
    }

    public static String getCountryCode() {
        String country = Locale.getDefault().getCountry();
        String str = country;
        if (country.isEmpty()) {
            str = "US";
        }
        return str;
    }

    public static String getLanguageCode() {
        String language = Locale.getDefault().getLanguage();
        String str = language;
        if (language.isEmpty()) {
            str = "en";
        }
        return str;
    }

    public static String getLocale() {
        String locale = Locale.getDefault().toString();
        String str = locale;
        if (locale.isEmpty()) {
            str = "en_US";
        }
        return str;
    }
}
