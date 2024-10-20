package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzmc.class */
public final class zzmc extends zzlz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmc(int i) {
        super(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzlz
    public final void zzd() {
        if (!zze()) {
            for (int i = 0; i < zza(); i++) {
                Map.Entry zzb = zzb(i);
                if (((zzjl) zzb.getKey()).zze()) {
                    zzb.setValue(Collections.unmodifiableList((List) zzb.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzjl) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
