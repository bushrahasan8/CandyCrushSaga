package com.google.android.gms.games;

import com.google.android.gms.internal.games_v2.zzal;
import com.google.android.gms.tasks.Task;

@zzal
/* loaded from: GamesSignInClient.class */
public interface GamesSignInClient {
    @zzal
    Task<AuthenticationResult> isAuthenticated();

    @zzal
    Task<String> requestServerSideAccess(String str, boolean z);

    @zzal
    Task<AuthenticationResult> signIn();
}
