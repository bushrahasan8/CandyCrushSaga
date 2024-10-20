package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzq.class */
final class zzq extends zza {
    private final TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzb(int i, String str) {
        if (i == 0 || i == 3003) {
            this.zza.setResult(Boolean.valueOf(i == 3003));
        } else {
            GamesStatusUtils.zza(this.zza, i);
        }
    }
}
