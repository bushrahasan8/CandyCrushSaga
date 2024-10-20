package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: zzdk.class */
public final class zzdk extends zzdi {
    private static final Map zza;
    private final zzaw zzb;
    private final String zzc;

    static {
        EnumMap enumMap = new EnumMap(zzaw.class);
        for (zzaw zzawVar : zzaw.values()) {
            zzdk[] zzdkVarArr = new zzdk[10];
            for (int i = 0; i < 10; i++) {
                zzdkVarArr[i] = new zzdk(i, zzawVar, zzax.zza());
            }
            enumMap.put((EnumMap) zzawVar, (zzaw) zzdkVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzdk(int i, zzaw zzawVar, zzax zzaxVar) {
        super(zzaxVar, i);
        String sb;
        zzds.zza(zzawVar, "format char");
        this.zzb = zzawVar;
        if (zzaxVar.zze()) {
            sb = zzawVar.zze();
        } else {
            char zzb = zzawVar.zzb();
            char c = zzaxVar.zzk() ? zzb & 65503 ? 1 : 0 : zzb;
            StringBuilder sb2 = new StringBuilder("%");
            zzaxVar.zzl(sb2);
            sb2.append(c);
            sb = sb2.toString();
        }
        this.zzc = sb;
    }

    public static zzdk zza(int i, zzaw zzawVar, zzax zzaxVar) {
        return (i >= 10 || !zzaxVar.zze()) ? new zzdk(i, zzawVar, zzaxVar) : ((zzdk[]) zza.get(zzawVar))[i];
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdi
    protected final void zzb(zzdj zzdjVar, Object obj) {
        zzdjVar.zzc(obj, this.zzb, zzd());
    }
}
