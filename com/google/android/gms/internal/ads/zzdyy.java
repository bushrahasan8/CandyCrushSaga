package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: zzdyy.class */
public final class zzdyy {
    private final zzdyi zza;
    private final zzdtx zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyy(zzdyi zzdyiVar, zzdtx zzdtxVar) {
        this.zza = zzdyiVar;
        this.zzb = zzdtxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        zzdtw zza;
        zzbvg zzbvgVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbpd zzbpdVar = (zzbpd) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjj)).booleanValue()) {
                    zzdtw zza2 = this.zzb.zza(zzbpdVar.zza);
                    str = (zza2 == null || (zzbvgVar = zza2.zzc) == null) ? "" : zzbvgVar.toString();
                } else {
                    str = "";
                }
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjk)).booleanValue() && (zza = this.zzb.zza(zzbpdVar.zza)) != null && zza.zzd;
                List list2 = this.zzd;
                String str2 = zzbpdVar.zza;
                list2.add(new zzdyx(str2, str, this.zzb.zzc(str2), zzbpdVar.zzb ? 1 : 0, zzbpdVar.zzd, zzbpdVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdyx) it.next()).zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdyw(this));
    }
}
