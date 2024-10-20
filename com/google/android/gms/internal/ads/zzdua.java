package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzdua.class */
public final class zzdua {
    private final zzfid zza;
    private final zzdtx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdua(zzfid zzfidVar, zzdtx zzdtxVar) {
        this.zza = zzfidVar;
        this.zzb = zzdtxVar;
    }

    final zzbsv zza() throws RemoteException {
        zzbsv zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzcec.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbus zzb(String str) throws RemoteException {
        zzbus zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfif zzc(String str, JSONObject jSONObject) throws zzfho {
        zzbsy zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbtv(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbtv(new zzbvk());
            } else {
                zzbsv zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        zzcec.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfif zzfifVar = new zzfif(zzb);
            this.zzb.zzd(str, zzfifVar);
            return zzfifVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzjk)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfho(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
