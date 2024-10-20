package com.google.android.gms.internal.ads;

/* loaded from: zzws.class */
public final class zzws {
    public final int zzc;
    private final zzgaa zze;
    private int zzf;
    public static final zzws zza = new zzws(new zzcz[0]);
    private static final String zzd = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzwr
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzws(zzcz... zzczVarArr) {
        this.zze = zzgaa.zzk(zzczVarArr);
        this.zzc = zzczVarArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.zze.size()) {
                return;
            }
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < this.zze.size(); i4++) {
                if (((zzcz) this.zze.get(i2)).equals(this.zze.get(i4))) {
                    zzff.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzws.class != obj.getClass()) {
            return false;
        }
        zzws zzwsVar = (zzws) obj;
        return this.zzc == zzwsVar.zzc && this.zze.equals(zzwsVar.zze);
    }

    public final int hashCode() {
        int i = this.zzf;
        int i2 = i;
        if (i == 0) {
            i2 = this.zze.hashCode();
            this.zzf = i2;
        }
        return i2;
    }

    public final int zza(zzcz zzczVar) {
        int indexOf = this.zze.indexOf(zzczVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcz zzb(int i) {
        return (zzcz) this.zze.get(i);
    }
}
