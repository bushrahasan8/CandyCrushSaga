package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.PlayerStatsClient;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzdm.class */
public final class zzdm implements PlayerStatsClient {
    private final zzar zza;

    public zzdm(zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.PlayerStatsClient
    public final Task<AnnotatedData<PlayerStats>> loadPlayerStats(final boolean z) {
        return this.zza.zzb(new zzaq(z) { // from class: com.google.android.gms.internal.games_v2.zzdl
            public final boolean zza;

            {
                this.zza = z;
            }

            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final Task zza(GoogleApi googleApi) {
                return googleApi.doRead(TaskApiCall.builder().run(new RemoteCall(this.zza) { // from class: com.google.android.gms.internal.games_v2.zzdk
                    public final boolean zza;

                    {
                        this.zza = r4;
                    }

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        ((com.google.android.gms.games.internal.zzak) obj).zzH((TaskCompletionSource) obj2, this.zza);
                    }
                }).setMethodKey(6708).build());
            }
        });
    }
}
