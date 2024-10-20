package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Store.class */
class Store {
    final SharedPreferences store;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: Store$Token.class */
    public static class Token {
        private static final long REFRESH_PERIOD_MILLIS = TimeUnit.DAYS.toMillis(7);
        final String appVersion;
        final long timestamp;
        final String token;

        private Token(String str, String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        static String encode(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        static Token parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean needsRefresh(String str) {
            return System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }

    public Store(Context context) {
        this.store = context.getSharedPreferences("com.google.android.gms.appid", 0);
        checkForRestore(context, "com.google.android.gms.appid-no-backup");
    }

    private void checkForRestore(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            deleteAll();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    private String createTokenKey(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public void deleteAll() {
        synchronized (this) {
            this.store.edit().clear().commit();
        }
    }

    public void deleteToken(String str, String str2) {
        synchronized (this) {
            String createTokenKey = createTokenKey(str, str2);
            SharedPreferences.Editor edit = this.store.edit();
            edit.remove(createTokenKey);
            edit.commit();
        }
    }

    public Token getToken(String str, String str2) {
        Token parse;
        synchronized (this) {
            parse = Token.parse(this.store.getString(createTokenKey(str, str2), null));
        }
        return parse;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.store.getAll().isEmpty();
        }
        return isEmpty;
    }

    public void saveToken(String str, String str2, String str3, String str4) {
        synchronized (this) {
            String encode = Token.encode(str3, str4, System.currentTimeMillis());
            if (encode == null) {
                return;
            }
            SharedPreferences.Editor edit = this.store.edit();
            edit.putString(createTokenKey(str, str2), encode);
            edit.commit();
        }
    }
}
