package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: zzbn.class */
public final class zzbn {
    private final zzdr zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbn(zzdr zzdrVar, Executor executor) {
        this.zza = zzdrVar;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbb zzbbVar) {
        final AtomicReference atomicReference = this.zzd;
        Objects.requireNonNull(atomicReference);
        zzbbVar.zzb(new UserMessagingPlatform.OnConsentFormLoadSuccessListener(atomicReference) { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            public final AtomicReference zza;

            {
                this.zza = atomicReference;
            }

            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                this.zza.set(consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.google.android.gms.internal.consent_sdk.zzav] */
    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzcr.zza();
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
            return;
        }
        ?? zza = this.zza.zza();
        zza.zza(zzbpVar);
        zza.zzb().zza().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.google.android.gms.internal.consent_sdk.zzav] */
    public final void zzc() {
        zzbp zzbpVar = (zzbp) this.zzc.get();
        if (zzbpVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        ?? zza = this.zza.zza();
        zza.zza(zzbpVar);
        final zzbb zza2 = zza.zzb().zza();
        zza2.zza = true;
        zzcr.zza.post(new Runnable(this, zza2) { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            public final zzbn zza;
            public final zzbb zzb;

            {
                this.zza = this;
                this.zzb = zza2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb);
            }
        });
    }

    public final void zzd(zzbp zzbpVar) {
        this.zzc.set(zzbpVar);
    }

    public final void zze(Activity activity, final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcr.zza();
        zzj zzb = zza.zza(activity).zzb();
        if (zzb == null) {
            zzcr.zza.post(new Runnable(onConsentFormDismissedListener) { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                public final ConsentForm.OnConsentFormDismissedListener zza;

                {
                    this.zza = onConsentFormDismissedListener;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.onConsentFormDismissed(new zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcr.zza.post(new Runnable(onConsentFormDismissedListener) { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                public final ConsentForm.OnConsentFormDismissedListener zza;

                {
                    this.zza = onConsentFormDismissedListener;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.onConsentFormDismissed(new zzg(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                zzcr.zza.post(new Runnable(onConsentFormDismissedListener) { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                    public final ConsentForm.OnConsentFormDismissedListener zza;

                    {
                        this.zza = onConsentFormDismissedListener;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.onConsentFormDismissed(new zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzcr.zza.post(new Runnable(onConsentFormDismissedListener) { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    public final ConsentForm.OnConsentFormDismissedListener zza;

                    {
                        this.zza = onConsentFormDismissedListener;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.onConsentFormDismissed(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    public final zzbn zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
