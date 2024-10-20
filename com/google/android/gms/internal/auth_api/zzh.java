package com.google.android.gms.internal.auth_api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* loaded from: zzh.class */
public final class zzh implements CredentialRequestResult {
    private final Status mStatus;
    private final Credential zzal;

    public zzh(Status status, Credential credential) {
        this.mStatus = status;
        this.zzal = credential;
    }

    public static com.google.android.gms.internal.auth-api.zzh zzd(Status status) {
        return new zzh(status, null);
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    public final Credential getCredential() {
        return this.zzal;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.mStatus;
    }
}
