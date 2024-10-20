package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: zzeis.class */
public final class zzeis {
    private final String zzc;
    private zzfgp zzd = null;
    private zzfgm zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeis(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfgm zzfgmVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzds)).booleanValue() ? zzfgmVar.zzaq : zzfgmVar.zzx;
    }

    private final void zzk(zzfgm zzfgmVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            Map map = this.zzb;
            String zzj = zzj(zzfgmVar);
            if (map.containsKey(zzj)) {
                return;
            }
            Bundle bundle = new Bundle();
            Iterator<String> keys = zzfgmVar.zzw.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, zzfgmVar.zzw.getString(next));
                } catch (JSONException e) {
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgO)).booleanValue()) {
                str = zzfgmVar.zzG;
                str2 = zzfgmVar.zzH;
                str3 = zzfgmVar.zzI;
                str4 = zzfgmVar.zzJ;
            } else {
                str = "";
                str2 = "";
                str3 = "";
                str4 = "";
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfgmVar.zzF, 0L, null, bundle, str, str2, str3, str4);
            try {
                this.zza.add(i, zzuVar);
            } catch (IndexOutOfBoundsException e2) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e2, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
            }
            this.zzb.put(zzj, zzuVar);
        }
    }

    private final void zzl(zzfgm zzfgmVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String zzj = zzj(zzfgmVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfgmVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(zzj);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzgP)).booleanValue() && z) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzdaq zzb() {
        return new zzdaq(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfgm zzfgmVar) {
        zzk(zzfgmVar, this.zza.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0 >= r4.zzb.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.internal.ads.zzfgm r5) {
        /*
            r4 = this;
            r0 = r4
            java.util.Map r0 = r0.zzb
            r1 = r5
            java.lang.String r1 = zzj(r1)
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            r0 = r4
            java.util.List r0 = r0.zza
            r1 = r5
            int r0 = r0.indexOf(r1)
            r7 = r0
            r0 = r7
            if (r0 < 0) goto L2c
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r4
            java.util.Map r1 = r1.zzb
            int r1 = r1.size()
            if (r0 < r1) goto L3a
        L2c:
            r0 = r4
            java.util.List r0 = r0.zza
            r1 = r4
            com.google.android.gms.ads.internal.client.zzu r1 = r1.zzf
            int r0 = r0.indexOf(r1)
            r6 = r0
        L3a:
            r0 = r6
            if (r0 < 0) goto L8a
            r0 = r6
            r1 = r4
            java.util.Map r1 = r1.zzb
            int r1 = r1.size()
            if (r0 < r1) goto L4e
            goto L8a
        L4e:
            r0 = r4
            r1 = r4
            java.util.List r1 = r1.zza
            r2 = r6
            java.lang.Object r1 = r1.get(r2)
            com.google.android.gms.ads.internal.client.zzu r1 = (com.google.android.gms.ads.internal.client.zzu) r1
            r0.zzf = r1
        L5f:
            int r6 = r6 + 1
            r0 = r6
            r1 = r4
            java.util.List r1 = r1.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L8a
            r0 = r4
            java.util.List r0 = r0.zza
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.ads.internal.client.zzu r0 = (com.google.android.gms.ads.internal.client.zzu) r0
            r5 = r0
            r0 = r5
            r1 = 0
            r0.zzb = r1
            r0 = r5
            r1 = 0
            r0.zzc = r1
            goto L5f
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeis.zze(com.google.android.gms.internal.ads.zzfgm):void");
    }

    public final void zzf(zzfgm zzfgmVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfgmVar, j, zzeVar, false);
    }

    public final void zzg(zzfgm zzfgmVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfgmVar, j, null, true);
    }

    public final void zzh(String str, List list) {
        synchronized (this) {
            if (this.zzb.containsKey(str)) {
                int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
                try {
                    this.zza.remove(indexOf);
                } catch (IndexOutOfBoundsException e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
                }
                this.zzb.remove(str);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzk((zzfgm) it.next(), indexOf);
                    indexOf++;
                }
            }
        }
    }

    public final void zzi(zzfgp zzfgpVar) {
        this.zzd = zzfgpVar;
    }
}
