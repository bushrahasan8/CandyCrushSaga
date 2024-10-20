package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: NotificationParams.class */
public class NotificationParams {
    private final Bundle data;

    public NotificationParams(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.data = new Bundle(bundle);
    }

    private static int getLightColor(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean isAnalyticsKey(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(keyWithOldPrefix("gcm.n.e")));
    }

    private static boolean isReservedKey(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String keyWithOldPrefix(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String normalizePrefix(String str) {
        if (!this.data.containsKey(str) && str.startsWith("gcm.n.")) {
            String keyWithOldPrefix = keyWithOldPrefix(str);
            if (this.data.containsKey(keyWithOldPrefix)) {
                return keyWithOldPrefix;
            }
        }
        return str;
    }

    private static String userFriendlyKey(String str) {
        String str2 = str;
        if (str.startsWith("gcm.n.")) {
            str2 = str.substring(6);
        }
        return str2;
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        return "1".equals(string) || Boolean.parseBoolean(string);
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException e) {
            Log.w("NotificationParams", "Couldn't parse value of " + userFriendlyKey(str) + "(" + string + ") into an int");
            return null;
        }
    }

    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException e) {
            Log.w("NotificationParams", "Malformed JSON for key " + userFriendlyKey(str) + ": " + string + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] getLightSettings() {
        JSONArray jSONArray = getJSONArray("gcm.n.light_settings");
        try {
            if (jSONArray == null) {
                return null;
            }
            try {
                if (jSONArray.length() == 3) {
                    return new int[]{getLightColor(jSONArray.optString(0)), jSONArray.optInt(1), jSONArray.optInt(2)};
                }
                throw new JSONException("lightSettings don't have all three fields");
            } catch (IllegalArgumentException e) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". " + e.getMessage() + ". Skipping setting LightSettings");
                return null;
            }
        } catch (JSONException e2) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri getLink() {
        String string = getString("gcm.n.link_android");
        String str = string;
        if (TextUtils.isEmpty(string)) {
            str = getString("gcm.n.link");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public Object[] getLocalizationArgsForKey(String str) {
        JSONArray jSONArray = getJSONArray(str + "_loc_args");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public String getLocalizationResourceForKey(String str) {
        return getString(str + "_loc_key");
    }

    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", userFriendlyKey(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + userFriendlyKey(str2) + ": " + Arrays.toString(localizationArgsForKey) + " Default value will be used.", e);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException e) {
            Log.w("NotificationParams", "Couldn't parse value of " + userFriendlyKey(str) + "(" + string + ") into a long");
            return null;
        }
    }

    public String getNotificationChannelId() {
        return getString("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer getNotificationCount() {
        Integer integer = getInteger("gcm.n.notification_count");
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= 0) {
            return integer;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + integer + ". Skipping setting notificationCount.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer getNotificationPriority() {
        Integer integer = getInteger("gcm.n.notification_priority");
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -2 && integer.intValue() <= 2) {
            return integer;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + integer + ". Skipping setting notificationPriority.");
        return null;
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        return !TextUtils.isEmpty(string) ? string : getLocalizedString(resources, str, str2);
    }

    public String getSoundResourceName() {
        String string = getString("gcm.n.sound2");
        String str = string;
        if (TextUtils.isEmpty(string)) {
            str = getString("gcm.n.sound");
        }
        return str;
    }

    public String getString(String str) {
        return this.data.getString(normalizePrefix(str));
    }

    public long[] getVibrateTimings() {
        JSONArray jSONArray = getJSONArray("gcm.n.vibrate_timings");
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException e) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer getVisibility() {
        Integer integer = getInteger("gcm.n.visibility");
        if (integer == null) {
            return null;
        }
        if (integer.intValue() >= -1 && integer.intValue() <= 1) {
            return integer;
        }
        Log.w("NotificationParams", "visibility is invalid: " + integer + ". Skipping setting visibility.");
        return null;
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = new Bundle(this.data);
        for (String str : this.data.keySet()) {
            if (!isAnalyticsKey(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = new Bundle(this.data);
        for (String str : this.data.keySet()) {
            if (isReservedKey(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
