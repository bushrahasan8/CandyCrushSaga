package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.EventsClient;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzcl.class */
public final class zzcl implements EventsClient {
    private final zzar zza;

    public zzcl(zzar zzarVar) {
        this.zza = zzarVar;
    }

    @Override // com.google.android.gms.games.EventsClient
    public final void increment(final String str, final int i) {
        this.zza.zzb(new zzaq(str, i) { // from class: com.google.android.gms.internal.games_v2.zzci
            public final String zza;
            public final int zzb;

            {
                this.zza = str;
                this.zzb = i;
            }

            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final Task zza(GoogleApi googleApi) {
                return googleApi.doWrite(TaskApiCall.builder().run(new RemoteCall(this.zza, this.zzb) { // from class: com.google.android.gms.internal.games_v2.zzcf
                    public final String zza;
                    public final int zzb;

                    {
                        this.zza = r4;
                        this.zzb = r5;
                    }

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        ((com.google.android.gms.games.internal.zzak) obj).zzx(this.zza, this.zzb);
                    }
                }).setMethodKey(6729).build());
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final Task<AnnotatedData<EventBuffer>> load(final boolean z) {
        return this.zza.zzb(new zzaq(z) { // from class: com.google.android.gms.internal.games_v2.zzcj
            public final boolean zza;

            {
                this.zza = z;
            }

            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final Task zza(GoogleApi googleApi) {
                return googleApi.doRead(TaskApiCall.builder().run(new RemoteCall(this.zza) { // from class: com.google.android.gms.internal.games_v2.zzcg
                    public final boolean zza;

                    {
                        this.zza = r4;
                    }

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        ((com.google.android.gms.games.internal.zzak) obj).zzA((TaskCompletionSource) obj2, this.zza);
                    }
                }).setMethodKey(6727).build());
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final Task<AnnotatedData<EventBuffer>> loadByIds(final boolean z, final String... strArr) {
        return this.zza.zzb(new zzaq(z, strArr) { // from class: com.google.android.gms.internal.games_v2.zzck
            public final boolean zza;
            public final String[] zzb;

            {
                this.zza = z;
                this.zzb = strArr;
            }

            @Override // com.google.android.gms.internal.games_v2.zzaq
            public final Task zza(GoogleApi googleApi) {
                return googleApi.doRead(TaskApiCall.builder().run(new RemoteCall(this.zza, this.zzb) { // from class: com.google.android.gms.internal.games_v2.zzch
                    public final boolean zza;
                    public final String[] zzb;

                    {
                        this.zza = r4;
                        this.zzb = r5;
                    }

                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(Object obj, Object obj2) {
                        ((com.google.android.gms.games.internal.zzak) obj).zzB((TaskCompletionSource) obj2, this.zza, this.zzb);
                    }
                }).setMethodKey(6728).build());
            }
        });
    }
}
