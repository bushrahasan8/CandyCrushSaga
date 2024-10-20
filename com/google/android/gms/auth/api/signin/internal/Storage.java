package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

@KeepForSdk
/* loaded from: Storage.class */
public class Storage {
    private static final Lock zaa = new ReentrantLock();
    private static Storage zab;
    private final Lock zac = new ReentrantLock();
    private final SharedPreferences zad;

    Storage(Context context) {
        this.zad = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk
    public static Storage getInstance(Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zaa;
        lock.lock();
        try {
            if (zab == null) {
                zab = new Storage(context.getApplicationContext());
            }
            Storage storage = zab;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            zaa.unlock();
            throw th;
        }
    }

    private static final String zae(String str, String str2) {
        return str + ":" + str2;
    }

    @KeepForSdk
    public void clear() {
        this.zac.lock();
        try {
            this.zad.edit().clear().apply();
        } finally {
            this.zac.unlock();
        }
    }

    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        GoogleSignInAccount googleSignInAccount;
        String zaa2 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa2)) {
            googleSignInAccount = null;
        } else {
            String zaa3 = zaa(zae("googleSignInAccount", zaa2));
            googleSignInAccount = null;
            if (zaa3 != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.zab(zaa3);
                } catch (JSONException e) {
                    googleSignInAccount = null;
                }
            }
        }
        return googleSignInAccount;
    }

    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        GoogleSignInOptions googleSignInOptions;
        String zaa2 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa2)) {
            googleSignInOptions = null;
        } else {
            String zaa3 = zaa(zae("googleSignInOptions", zaa2));
            googleSignInOptions = null;
            if (zaa3 != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.zab(zaa3);
                } catch (JSONException e) {
                    googleSignInOptions = null;
                }
            }
        }
        return googleSignInOptions;
    }

    @KeepForSdk
    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String zac = googleSignInAccount.zac();
        zad(zae("googleSignInAccount", zac), googleSignInAccount.zad());
        zad(zae("googleSignInOptions", zac), googleSignInOptions.zaf());
    }

    protected final String zaa(String str) {
        this.zac.lock();
        try {
            return this.zad.getString(str, null);
        } finally {
            this.zac.unlock();
        }
    }

    protected final void zab(String str) {
        this.zac.lock();
        try {
            this.zad.edit().remove(str).apply();
        } finally {
            this.zac.unlock();
        }
    }

    public final void zac() {
        String zaa2 = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa2)) {
            return;
        }
        zab(zae("googleSignInAccount", zaa2));
        zab(zae("googleSignInOptions", zaa2));
    }

    protected final void zad(String str, String str2) {
        this.zac.lock();
        try {
            this.zad.edit().putString(str, str2).apply();
        } finally {
            this.zac.unlock();
        }
    }
}
