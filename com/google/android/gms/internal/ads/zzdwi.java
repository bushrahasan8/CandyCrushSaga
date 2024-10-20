package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: zzdwi.class */
public final class zzdwi implements zzfln {
    private final zzdwa zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdwi(zzdwa zzdwaVar, Set set, Clock clock) {
        zzflg zzflgVar;
        this.zzb = zzdwaVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdwh zzdwhVar = (zzdwh) it.next();
            Map map = this.zzd;
            zzflgVar = zzdwhVar.zzc;
            map.put(zzflgVar, zzdwhVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzflg zzflgVar, boolean z) {
        zzflg zzflgVar2;
        String str;
        zzflgVar2 = ((zzdwh) this.zzd.get(zzflgVar)).zzb;
        if (this.zza.containsKey(zzflgVar2)) {
            String str2 = true != z ? "f." : "s.";
            Clock clock = this.zzc;
            Map map = this.zza;
            long elapsedRealtime = clock.elapsedRealtime();
            long longValue = ((Long) map.get(zzflgVar2)).longValue();
            zzdwa zzdwaVar = this.zzb;
            Map map2 = this.zzd;
            Map zza = zzdwaVar.zza();
            str = ((zzdwh) map2.get(zzflgVar)).zza;
            zza.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime - longValue))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbL(zzflg zzflgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbM(zzflg zzflgVar, String str, Throwable th) {
        if (this.zza.containsKey(zzflgVar)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            long elapsedRealtime = clock.elapsedRealtime();
            long longValue = ((Long) map.get(zzflgVar)).longValue();
            zzdwa zzdwaVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdwaVar.zza().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime - longValue))));
        }
        if (this.zzd.containsKey(zzflgVar)) {
            zze(zzflgVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbN(zzflg zzflgVar, String str) {
        this.zza.put(zzflgVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzd(zzflg zzflgVar, String str) {
        if (this.zza.containsKey(zzflgVar)) {
            Clock clock = this.zzc;
            Map map = this.zza;
            long elapsedRealtime = clock.elapsedRealtime();
            long longValue = ((Long) map.get(zzflgVar)).longValue();
            zzdwa zzdwaVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdwaVar.zza().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime - longValue))));
        }
        if (this.zzd.containsKey(zzflgVar)) {
            zze(zzflgVar, true);
        }
    }
}
