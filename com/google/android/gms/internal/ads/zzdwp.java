package com.google.android.gms.internal.ads;

import com.ironsource.t2;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzdwp.class */
public final class zzdwp {
    private final String zze;
    private final zzdwk zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzo().zzi();

    public zzdwp(String str, zzdwk zzdwkVar) {
        this.zze = str;
        this.zzf = zzdwkVar;
    }

    private final Map zzg() {
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zza.put(ScarConstants.TOKEN_ID_KEY, this.zza.zzQ() ? "" : this.zze);
        return zza;
    }

    public final void zza(String str) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue()) {
                    Map zzg = zzg();
                    zzg.put(t2.h.h, "aaia");
                    zzg.put("aair", "MalformedJson");
                    this.zzb.add(zzg);
                }
            }
        }
    }

    public final void zzb(String str, String str2) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue()) {
                    Map zzg = zzg();
                    zzg.put(t2.h.h, "adapter_init_finished");
                    zzg.put("ancn", str);
                    zzg.put("rqe", str2);
                    this.zzb.add(zzg);
                }
            }
        }
    }

    public final void zzc(String str) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue()) {
                    Map zzg = zzg();
                    zzg.put(t2.h.h, "adapter_init_started");
                    zzg.put("ancn", str);
                    this.zzb.add(zzg);
                }
            }
        }
    }

    public final void zzd(String str) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue()) {
                    Map zzg = zzg();
                    zzg.put(t2.h.h, "adapter_init_finished");
                    zzg.put("ancn", str);
                    this.zzb.add(zzg);
                }
            }
        }
    }

    public final void zze() {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue() && !this.zzd) {
                    Map zzg = zzg();
                    zzg.put(t2.h.h, "init_finished");
                    this.zzb.add(zzg);
                    Iterator it = this.zzb.iterator();
                    while (it.hasNext()) {
                        this.zzf.zzf((Map) it.next());
                    }
                    this.zzd = true;
                }
            }
        }
    }

    public final void zzf() {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbZ)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue() && !this.zzc) {
                    Map zzg = zzg();
                    zzg.put(t2.h.h, "init_started");
                    this.zzb.add(zzg);
                    this.zzc = true;
                }
            }
        }
    }
}
