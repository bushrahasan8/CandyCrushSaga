package com.google.android.gms.games;

import com.google.android.gms.internal.games_v2.zzal;

@zzal
/* loaded from: AuthenticationResult.class */
public final class AuthenticationResult {
    public static final AuthenticationResult zza = new AuthenticationResult(true);
    public static final AuthenticationResult zzb = new AuthenticationResult(false);
    private final boolean zzc;

    private AuthenticationResult(boolean z) {
        this.zzc = z;
    }

    @zzal
    public boolean isAuthenticated() {
        return this.zzc;
    }
}
