package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.internal.zzh;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* loaded from: GoogleSignInClient.class */
public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {
    private static final zzc zzar = new zzc(null);

    @VisibleForTesting
    private static int zzas = zzd.zzau;

    /* loaded from: GoogleSignInClient$zzc.class */
    private static final class zzc implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private zzc() {
        }

        /* synthetic */ zzc(com.google.android.gms.auth.api.signin.zzc zzcVar) {
            this();
        }

        @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
        public final /* synthetic */ GoogleSignInAccount convert(GoogleSignInResult googleSignInResult) {
            return googleSignInResult.getSignInAccount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* loaded from: GoogleSignInClient$zzd.class */
    public enum zzd {
        public static final int zzau = 1;
        public static final int zzav = 2;
        public static final int zzaw = 3;
        public static final int zzax = 4;
        private static final int[] zzay = {1, 2, 3, 4};

        public static int[] values$50KLMJ33DTMIUPRFDTJMOP9FC5N68SJFD5I2UPRDECNM2TBKD0NM2S395TPMIPRED5N2UHRFDTJMOPAJD5JMSIBE8DM6IPBEEGI4IRBGDHIMQPBEEHGN8QBFDOTG____0() {
            return (int[]) zzay.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, Auth.GOOGLE_SIGN_IN_API, googleSignInOptions, new ApiExceptionMapper());
    }

    private final int zze() {
        int i;
        synchronized (this) {
            if (zzas == zzd.zzau) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (isGooglePlayServicesAvailable == 0) {
                    zzas = zzd.zzax;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, isGooglePlayServicesAvailable, null) != null || DynamiteModule.getLocalVersion(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    zzas = zzd.zzav;
                } else {
                    zzas = zzd.zzaw;
                }
            }
            i = zzas;
        }
        return i;
    }

    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int i = com.google.android.gms.auth.api.signin.zzc.zzat[zze() - 1];
        return i != 1 ? i != 2 ? zzh.zze(applicationContext, getApiOptions()) : zzh.zzc(applicationContext, getApiOptions()) : zzh.zzd(applicationContext, getApiOptions());
    }

    public Task<Void> revokeAccess() {
        return PendingResultUtil.toVoidTask(zzh.zzd(asGoogleApiClient(), getApplicationContext(), zze() == zzd.zzaw));
    }

    public Task<Void> signOut() {
        return PendingResultUtil.toVoidTask(zzh.zzc(asGoogleApiClient(), getApplicationContext(), zze() == zzd.zzaw));
    }

    public Task<GoogleSignInAccount> silentSignIn() {
        return PendingResultUtil.toTask(zzh.zzc(asGoogleApiClient(), getApplicationContext(), getApiOptions(), zze() == zzd.zzaw), zzar);
    }
}
