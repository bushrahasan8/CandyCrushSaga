package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzl.class */
public final class zzl {
    private final Application zza;
    private final zzap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(Application application, zzap zzapVar) {
        this.zza = application;
        this.zzb = zzapVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzci zzc(Activity activity, ConsentRequestParameters consentRequestParameters) throws zzg {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        ConsentDebugSettings consentDebugSettings2 = consentDebugSettings;
        if (consentDebugSettings == null) {
            consentDebugSettings2 = new ConsentDebugSettings.Builder(this.zza).build();
        }
        return zzn.zza(new zzn(this, activity, consentDebugSettings2, consentRequestParameters, null));
    }
}
