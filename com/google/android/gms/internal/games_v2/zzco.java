package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AuthenticationResult;
import com.google.android.gms.games.GamesSignInClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzco.class */
public final class zzco implements GamesSignInClient {
    private final zzav zza;
    private final zzar zzb;

    public zzco(zzav zzavVar, zzar zzarVar) {
        this.zza = zzavVar;
        this.zzb = zzarVar;
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task<AuthenticationResult> isAuthenticated() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task<String> requestServerSideAccess(final String str, final boolean z) {
        return this.zzb.zzb(new zzaq(str, z) { // from class: com.google.android.gms.internal.games_v2.zzcn
            public final String zza;
            public final boolean zzb;

            {
                this.zza = str;
                this.zzb = z;
            }

            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final Task zza(GoogleApi googleApi) {
                return googleApi.doWrite(TaskApiCall.builder().run(new RemoteCall(this.zza, this.zzb) { // from class: com.google.android.gms.internal.games_v2.zzcm
                    public final String zza;
                    public final boolean zzb;

                    {
                        this.zza = r4;
                        this.zzb = r5;
                    }

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        ((com.google.android.gms.games.internal.zzak) obj).zzM((TaskCompletionSource) obj2, this.zza, this.zzb);
                    }
                }).setMethodKey(6699).build());
            }
        });
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final Task<AuthenticationResult> signIn() {
        return this.zza.zzb();
    }
}
