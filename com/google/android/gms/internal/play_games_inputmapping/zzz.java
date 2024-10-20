package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: zzz.class */
final class zzz extends zzar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzz(String str, Class cls, boolean z) {
        super("tags", cls, false);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzar
    public final /* bridge */ /* synthetic */ void zzb(Object obj, zzaq zzaqVar) {
        for (Map.Entry entry : ((zzdf) obj).zzb().entrySet()) {
            if (((Set) entry.getValue()).isEmpty()) {
                zzaqVar.zza((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zzaqVar.zza((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
