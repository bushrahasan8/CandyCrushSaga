package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* loaded from: zac.class */
public final class zac {
    private static final SimpleArrayMap zaa = new SimpleArrayMap();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
    }

    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, zaa2);
        }
        if (i == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, zaa2);
        }
        if (i == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, zaa2);
        }
        if (i == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", zaa2);
        }
        if (i == 7) {
            return zag(context, "common_google_play_services_network_error_text", zaa2);
        }
        if (i == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, zaa2);
        }
        if (i == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", zaa2);
        }
        switch (i) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", zaa2);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", zaa2);
            case 18:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, zaa2);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, zaa2);
        }
    }

    public static String zad(Context context, int i) {
        return (i == 6 || i == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i);
    }

    public static String zae(Context context, int i) {
        String zah = i == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i);
        return zah == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : zah;
    }

    public static String zaf(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zah = zah(context, str);
        String str3 = zah;
        if (zah == null) {
            str3 = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, str3, str2);
    }

    private static String zah(Context context, String str) {
        SimpleArrayMap simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(zab)) {
                simpleArrayMap.clear();
                zab = locale;
            }
            String str2 = (String) simpleArrayMap.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                simpleArrayMap.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
