package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: zzu.class */
final class zzu extends zza {
    private final TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzp(int i, String str) {
        if (i == 0) {
            this.zza.setResult(str);
        } else {
            GamesStatusUtils.zza(this.zza, i);
        }
    }
}
