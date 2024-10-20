package com.google.android.gms.internal.play_games_inputmapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbx.class */
public final class zzbx extends zzby {
    private final Map zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbx(zzbg zzbgVar, zzbg zzbgVar2, zzbs zzbsVar) {
        super(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzd(linkedHashMap, zzbgVar);
        zzd(linkedHashMap, zzbgVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzar) entry.getKey()).zzf()) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.zza = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void zzd(Map map, zzbg zzbgVar) {
        for (int i = 0; i < zzbgVar.zza(); i++) {
            zzar zzb = zzbgVar.zzb(i);
            Object obj = map.get(zzb);
            if (zzb.zzf()) {
                List list = (List) obj;
                List list2 = list;
                if (list == null) {
                    list2 = new ArrayList();
                    map.put(zzb, list2);
                }
                list2.add(zzb.zze(zzbgVar.zzc(i)));
            } else {
                map.put(zzb, zzb.zze(zzbgVar.zzc(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final void zza(zzbo zzboVar, Object obj) {
        for (Map.Entry entry : this.zza.entrySet()) {
            zzar zzarVar = (zzar) entry.getKey();
            Object value = entry.getValue();
            if (zzarVar.zzf()) {
                zzboVar.zzb(zzarVar, ((List) value).iterator(), obj);
            } else {
                zzboVar.zza(zzarVar, value, obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzby
    public final Set zzc() {
        return this.zza.keySet();
    }
}
