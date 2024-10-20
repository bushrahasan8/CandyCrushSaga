package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: zzcum.class */
public class zzcum {
    private final zzcwf zza;
    private final View zzb;
    private final zzfgn zzc;
    private final zzcjk zzd;

    public zzcum(View view, zzcjk zzcjkVar, zzcwf zzcwfVar, zzfgn zzfgnVar) {
        this.zzb = view;
        this.zzd = zzcjkVar;
        this.zza = zzcwfVar;
        this.zzc = zzfgnVar;
    }

    public static final zzdim zzf(final Context context, final zzcei zzceiVar, final zzfgm zzfgmVar, final zzfhh zzfhhVar) {
        return new zzdim(new zzdcl(context, zzceiVar, zzfgmVar, zzfhhVar) { // from class: com.google.android.gms.internal.ads.zzcuk
            public final Context zza;
            public final zzcei zzb;
            public final zzfgm zzc;
            public final zzfhh zzd;

            {
                this.zza = context;
                this.zzb = zzceiVar;
                this.zzc = zzfgmVar;
                this.zzd = zzfhhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdcl
            public final void zzr() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zza, this.zzb.zza, this.zzc.zzD.toString(), this.zzd.zzf);
            }
        }, zzcep.zzf);
    }

    public static final Set zzg(zzcvw zzcvwVar) {
        return Collections.singleton(new zzdim(zzcvwVar, zzcep.zzf));
    }

    public static final zzdim zzh(zzcvu zzcvuVar) {
        return new zzdim(zzcvuVar, zzcep.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcjk zzb() {
        return this.zzd;
    }

    public final zzcwf zzc() {
        return this.zza;
    }

    public zzdcj zzd(Set set) {
        return new zzdcj(set);
    }

    public final zzfgn zze() {
        return this.zzc;
    }
}
