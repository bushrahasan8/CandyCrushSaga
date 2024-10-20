package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: zzfmz.class */
public final class zzfmz implements Runnable {
    private final zzfnc zzb;
    private String zzc;
    private String zzd;
    private zzfgx zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmz(zzfnc zzfncVar) {
        this.zzb = zzfncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            zzg();
        }
    }

    public final zzfmz zza(zzfmo zzfmoVar) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfmoVar.zzi();
                list.add(zzfmoVar);
                Future future = this.zzg;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzg = zzcep.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziG)).intValue(), TimeUnit.MILLISECONDS);
            }
        }
        return this;
    }

    public final zzfmz zzb(String str) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue() && zzfmy.zze(str)) {
                this.zzc = str;
            }
        }
        return this;
    }

    public final zzfmz zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                this.zzf = zzeVar;
            }
        }
        return this;
    }

    public final zzfmz zzd(ArrayList arrayList) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE) && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.zzh = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.zzh = 6;
                                }
                            }
                            this.zzh = 5;
                        }
                        this.zzh = 8;
                    }
                    this.zzh = 4;
                }
                this.zzh = 3;
            }
        }
        return this;
    }

    public final zzfmz zze(String str) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                this.zzd = str;
            }
        }
        return this;
    }

    public final zzfmz zzf(zzfgx zzfgxVar) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                this.zze = zzfgxVar;
            }
        }
        return this;
    }

    public final void zzg() {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                Future future = this.zzg;
                if (future != null) {
                    future.cancel(false);
                }
                for (zzfmo zzfmoVar : this.zza) {
                    int i = this.zzh;
                    if (i != 2) {
                        zzfmoVar.zzm(i);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfmoVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zzd) && !zzfmoVar.zzk()) {
                        zzfmoVar.zzd(this.zzd);
                    }
                    zzfgx zzfgxVar = this.zze;
                    if (zzfgxVar != null) {
                        zzfmoVar.zzb(zzfgxVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                        if (zzeVar != null) {
                            zzfmoVar.zza(zzeVar);
                        }
                    }
                    this.zzb.zzb(zzfmoVar.zzl());
                }
                this.zza.clear();
            }
        }
    }

    public final zzfmz zzh(int i) {
        synchronized (this) {
            if (((Boolean) zzbht.zzc.zze()).booleanValue()) {
                this.zzh = i;
            }
        }
        return this;
    }
}
