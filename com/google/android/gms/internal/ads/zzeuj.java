package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: zzeuj.class */
public final class zzeuj implements zzexq {
    private final Context zza;
    private final zzgey zzb;

    public zzeuj(Context context, zzgey zzgeyVar) {
        this.zza = context;
        this.zzb = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeui
            public final zzeuj zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                Bundle bundle;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzazp zzg = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzg();
                if (zzg == null) {
                    bundle = null;
                } else if (com.google.android.gms.ads.internal.zzt.zzo().zzi().zzN() && com.google.android.gms.ads.internal.zzt.zzo().zzi().zzO()) {
                    bundle = null;
                } else {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzazf zza = zzg.zza();
                    if (zza != null) {
                        String zzd = zza.zzd();
                        String zze = zza.zze();
                        String zzf = zza.zzf();
                        if (zzd != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzi().zzw(zzd);
                        }
                        zzk = zzf;
                        zzj = zzd;
                        str = zze;
                        if (zzf != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzi().zzy(zzf);
                            zzk = zzf;
                            zzj = zzd;
                            str = zze;
                        }
                    } else {
                        zzj = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzj();
                        zzk = com.google.android.gms.ads.internal.zzt.zzo().zzi().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzi().zzO()) {
                        if (zzk == null || TextUtils.isEmpty(zzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", zzk);
                        }
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzt.zzo().zzi().zzN()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    bundle = null;
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeuk(bundle);
            }
        });
    }
}
