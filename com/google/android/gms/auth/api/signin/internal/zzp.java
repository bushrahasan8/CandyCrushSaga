package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: zzp.class */
public final class zzp {
    private static zzp zzbn;

    @VisibleForTesting
    private Storage zzbo;

    @VisibleForTesting
    private GoogleSignInAccount zzbp;

    @VisibleForTesting
    private GoogleSignInOptions zzbq;

    private zzp(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zzbo = storage;
        this.zzbp = storage.getSavedDefaultGoogleSignInAccount();
        this.zzbq = this.zzbo.getSavedDefaultGoogleSignInOptions();
    }

    public static zzp zzd(Context context) {
        zzp zze;
        synchronized (zzp.class) {
            try {
                zze = zze(context.getApplicationContext());
            } catch (Throwable th) {
                throw th;
            }
        }
        return zze;
    }

    private static zzp zze(Context context) {
        zzp zzpVar;
        synchronized (zzp.class) {
            try {
                if (zzbn == null) {
                    zzbn = new zzp(context);
                }
                zzpVar = zzbn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzpVar;
    }

    public final void clear() {
        synchronized (this) {
            this.zzbo.clear();
            this.zzbp = null;
            this.zzbq = null;
        }
    }

    public final void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            this.zzbo.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
            this.zzbp = googleSignInAccount;
            this.zzbq = googleSignInOptions;
        }
    }

    public final GoogleSignInAccount zzh() {
        GoogleSignInAccount googleSignInAccount;
        synchronized (this) {
            googleSignInAccount = this.zzbp;
        }
        return googleSignInAccount;
    }

    public final GoogleSignInOptions zzi() {
        GoogleSignInOptions googleSignInOptions;
        synchronized (this) {
            googleSignInOptions = this.zzbq;
        }
        return googleSignInOptions;
    }
}
