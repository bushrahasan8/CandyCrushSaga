package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import java.util.Objects;

/* loaded from: UserMessagingPlatform.class */
public final class UserMessagingPlatform {

    /* loaded from: UserMessagingPlatform$OnConsentFormLoadFailureListener.class */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    /* loaded from: UserMessagingPlatform$OnConsentFormLoadSuccessListener.class */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull final Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        zzbn zzc = com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc();
        zzcr.zza();
        OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new OnConsentFormLoadSuccessListener(activity, onConsentFormDismissedListener) { // from class: com.google.android.gms.internal.consent_sdk.zzbl
            public final Activity zza;
            public final ConsentForm.OnConsentFormDismissedListener zzb;

            {
                this.zza = activity;
                this.zzb = onConsentFormDismissedListener;
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                consentForm.show(this.zza, this.zzb);
            }
        };
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzc.zzb(onConsentFormLoadSuccessListener, new OnConsentFormLoadFailureListener(onConsentFormDismissedListener) { // from class: com.google.android.gms.internal.consent_sdk.zzbm
            public final ConsentForm.OnConsentFormDismissedListener zza;

            {
                this.zza = onConsentFormDismissedListener;
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                this.zza.onConsentFormDismissed(formError);
            }
        });
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(context).zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
