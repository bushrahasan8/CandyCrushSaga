package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: zzdbw.class */
public final class zzdbw extends zzdgl {
    public zzdbw(Set set) {
        super(set);
    }

    public final void zza(final Context context) {
        zzu(new zzdgk(context) { // from class: com.google.android.gms.internal.ads.zzdbv
            public final Context zza;

            {
                this.zza = context;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbs) obj).zzbs(this.zza);
            }
        });
    }

    public final void zzb(final Context context) {
        zzu(new zzdgk(context) { // from class: com.google.android.gms.internal.ads.zzdbt
            public final Context zza;

            {
                this.zza = context;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbs) obj).zzbu(this.zza);
            }
        });
    }

    public final void zzc(final Context context) {
        zzu(new zzdgk(context) { // from class: com.google.android.gms.internal.ads.zzdbu
            public final Context zza;

            {
                this.zza = context;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdbs) obj).zzbv(this.zza);
            }
        });
    }
}
