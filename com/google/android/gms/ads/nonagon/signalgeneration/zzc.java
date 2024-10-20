package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.t2;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzc.class */
public final class zzc {
    private final zzdwk zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zza(zzbgc.zzgY)).intValue();
    private final long zzb = ((Long) zzba.zzc().zza(zzbgc.zzgZ)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zza(zzbgc.zzhe)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zza(zzbgc.zzhc)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzb(this));

    public zzc(zzdwk zzdwkVar) {
        this.zzh = zzdwkVar;
    }

    private final void zzg(final zzdwa zzdwaVar) {
        synchronized (this) {
            if (this.zzc) {
                ArrayDeque arrayDeque = this.zzg;
                final ArrayDeque clone = arrayDeque.clone();
                arrayDeque.clear();
                ArrayDeque arrayDeque2 = this.zzf;
                final ArrayDeque clone2 = arrayDeque2.clone();
                arrayDeque2.clear();
                zzcep.zza.execute(new Runnable(this, zzdwaVar, clone, clone2) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                    public final zzc zza;
                    public final zzdwa zzb;
                    public final ArrayDeque zzc;
                    public final ArrayDeque zzd;

                    {
                        this.zza = this;
                        this.zzb = zzdwaVar;
                        this.zzc = clone;
                        this.zzd = clone2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze(this.zzb, this.zzc, this.zzd);
                    }
                });
            }
        }
    }

    private final void zzh(zzdwa zzdwaVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdwaVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put(t2.h.h, "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException e) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzf(this.zzi);
        }
    }

    private final void zzi() {
        synchronized (this) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            try {
                Iterator it = this.zze.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                        break;
                    }
                    this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                    it.remove();
                }
            } catch (ConcurrentModificationException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "QueryJsonMap.removeExpiredEntries");
            }
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final String zzb(String str, zzdwa zzdwaVar) {
        synchronized (this) {
            Pair pair = (Pair) this.zze.get(str);
            zzdwaVar.zza().put("rid", str);
            if (pair == null) {
                zzdwaVar.zza().put("mhit", "false");
                return null;
            }
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzdwaVar.zza().put("mhit", a.g);
            return str2;
        }
    }

    public final void zzd(String str, String str2, zzdwa zzdwaVar) {
        synchronized (this) {
            this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), str2));
            zzi();
            zzg(zzdwaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzdwa zzdwaVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdwaVar, arrayDeque, "to");
        zzh(zzdwaVar, arrayDeque2, "of");
    }

    public final void zzf(String str) {
        synchronized (this) {
            this.zze.remove(str);
        }
    }
}
