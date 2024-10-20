package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzfmb.class */
final class zzfmb {
    private final Clock zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzfmb(Clock clock) {
        this.zza = clock;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i = 0;
            if (((List) entry.getValue()).size() > 1) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    i++;
                    arrayList.add(new zzfma(((String) entry.getKey()) + "." + i, (String) it.next()));
                }
            } else {
                arrayList.add(new zzfma((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
            return;
        }
        Clock clock = this.zza;
        Map map = this.zzc;
        long elapsedRealtime = clock.elapsedRealtime();
        long longValue = ((Long) map.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime - longValue);
        zzd(str, sb.toString());
    }

    public final void zzc(String str, String str2) {
        if (!this.zzc.containsKey(str)) {
            this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
            return;
        }
        Clock clock = this.zza;
        Map map = this.zzc;
        zzd(str, str2 + (clock.elapsedRealtime() - ((Long) map.remove(str)).longValue()));
    }
}
