package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zziq;
import java.util.EnumMap;

/* loaded from: zzaj.class */
final class zzaj {
    private final EnumMap<zziq.zza, zzai> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj() {
        this.zza = new EnumMap<>(zziq.zza.class);
    }

    private zzaj(EnumMap<zziq.zza, zzai> enumMap) {
        EnumMap<zziq.zza, zzai> enumMap2 = new EnumMap<>((Class<zziq.zza>) zziq.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzaj zza(String str) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        if (str.length() >= zziq.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zziq.zza[] values = zziq.zza.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (zziq.zza) zzai.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzaj(enumMap);
            }
        }
        return new zzaj();
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (zziq.zza zzaVar : zziq.zza.values()) {
            zzai zzaiVar = this.zza.get(zzaVar);
            zzai zzaiVar2 = zzaiVar;
            if (zzaiVar == null) {
                zzaiVar2 = zzai.UNSET;
            }
            c = zzaiVar2.zzl;
            sb.append(c);
        }
        return sb.toString();
    }

    public final zzai zza(zziq.zza zzaVar) {
        zzai zzaiVar = this.zza.get(zzaVar);
        zzai zzaiVar2 = zzaiVar;
        if (zzaiVar == null) {
            zzaiVar2 = zzai.UNSET;
        }
        return zzaiVar2;
    }

    public final void zza(zziq.zza zzaVar, int i) {
        zzai zzaiVar = zzai.UNSET;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    zzaiVar = zzai.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        zzaiVar = zzai.INITIALIZATION;
                    }
                }
            }
            zzaiVar = zzai.API;
        } else {
            zzaiVar = zzai.TCF;
        }
        this.zza.put((EnumMap<zziq.zza, zzai>) zzaVar, (zziq.zza) zzaiVar);
    }

    public final void zza(zziq.zza zzaVar, zzai zzaiVar) {
        this.zza.put((EnumMap<zziq.zza, zzai>) zzaVar, (zziq.zza) zzaiVar);
    }
}
