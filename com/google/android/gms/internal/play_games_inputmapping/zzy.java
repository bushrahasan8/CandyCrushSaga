package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Iterator;

/* loaded from: zzy.class */
final class zzy extends zzar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(String str, Class cls, boolean z) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzar
    public final void zza(Iterator it, zzaq zzaqVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zzaqVar.zza(zzd(), next);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String zzd = zzd();
            sb.append(']');
            zzaqVar.zza(zzd, sb.toString());
        }
    }
}
