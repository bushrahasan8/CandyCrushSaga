package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: zzdht.class */
public final class zzdht extends zzdgl implements zzdhv {
    public zzdht(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzu(new zzdgk(str2) { // from class: com.google.android.gms.internal.ads.zzdhn
            public final String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdhv) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzb(final String str, final String str2) {
        zzu(new zzdgk(str, str2) { // from class: com.google.android.gms.internal.ads.zzdhq
            public final String zza;
            public final String zzb;

            {
                this.zza = str;
                this.zzb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdhv) obj).zzb(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzc(final String str) {
        zzu(new zzdgk(str) { // from class: com.google.android.gms.internal.ads.zzdhp
            public final String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdhv) obj).zzc(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzd(final String str) {
        zzu(new zzdgk(str) { // from class: com.google.android.gms.internal.ads.zzdhr
            public final String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdhv) obj).zzd(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zze() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdhs
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdhv) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzf() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdho
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((zzdhv) obj).zzf();
            }
        });
    }
}
