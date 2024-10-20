package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: zzgs.class */
final class zzgs extends zzgz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgz
    public final void zza() {
        if (!zzb()) {
            for (int i = 0; i < zzc(); i++) {
                Map.Entry zzd = zzd(i);
                if (((zzev) zzd.getKey()).zzc()) {
                    zzd.setValue(Collections.unmodifiableList((List) zzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzev) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
