package com.google.android.gms.internal.games_v2;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzw.class */
public final class zzw extends GoogleApi implements zzs {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new Api("GamesConnect.API", zzuVar, clientKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(Context context, zzq zzqVar) {
        super(context, (Api<zzq>) zzc, zzqVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.internal.games_v2.zzs
    public final Task zza(final zzy zzyVar, boolean z) {
        TaskApiCall build = TaskApiCall.builder().run(new RemoteCall(this, zzyVar) { // from class: com.google.android.gms.internal.games_v2.zzt
            public final zzw zza;
            public final zzy zzb;

            {
                this.zza = this;
                this.zzb = zzyVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzw zzwVar = this.zza;
                ((zzae) ((zzx) obj).getService()).zzd(new zzv(zzwVar, (TaskCompletionSource) obj2), this.zzb);
            }
        }).setMethodKey(6737).setAutoResolveMissingFeatures(z).build();
        return z ? doWrite(build) : doBestEffortWrite(build);
    }
}
