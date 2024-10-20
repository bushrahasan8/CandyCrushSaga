package com.google.android.gms.internal.play_games_inputmapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: zzbl.class */
final class zzbl extends zzbo {
    private final Map zza;
    private final Map zzb;
    private final zzbn zzc;
    private final zzbm zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbl(zzbk zzbkVar, zzbh zzbhVar) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        HashMap hashMap2 = new HashMap();
        this.zzb = hashMap2;
        hashMap.putAll(zzbk.zzd(zzbkVar));
        hashMap2.putAll(zzbk.zze(zzbkVar));
        this.zzc = zzbk.zzf(zzbkVar);
        this.zzd = zzbk.zzg(zzbkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbo
    public final void zza(zzar zzarVar, Object obj, Object obj2) {
        zzbn zzbnVar = (zzbn) this.zza.get(zzarVar);
        if (zzbnVar != null) {
            zzbnVar.zza(zzarVar, obj, obj2);
        } else {
            zzarVar.zzg(obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzbo
    public final void zzb(zzar zzarVar, Iterator it, Object obj) {
        zzbm zzbmVar = (zzbm) this.zzb.get(zzarVar);
        if (zzbmVar != null) {
            zzbmVar.zza(zzarVar, it, obj);
        } else if (this.zzd != null && !this.zza.containsKey(zzarVar)) {
            zzarVar.zzh(it, obj);
        } else {
            while (it.hasNext()) {
                zza(zzarVar, it.next(), obj);
            }
        }
    }
}
