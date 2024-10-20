package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzcz.class */
public final class zzcz {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcy
    };

    public zzcz(String str, zzam... zzamVarArr) {
        this.zzc = str;
        this.zzg = zzamVarArr;
        int zzb = zzcb.zzb(zzamVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzcb.zzb(zzamVarArr[0].zzl) : zzb;
        zzd(zzamVarArr[0].zzd);
        int i = zzamVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void zze(String str, String str2, String str3, int i) {
        zzff.zzd("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzcz.class != obj.getClass()) {
            return false;
        }
        zzcz zzczVar = (zzcz) obj;
        return this.zzc.equals(zzczVar.zzc) && Arrays.equals(this.zzg, zzczVar.zzg);
    }

    public final int hashCode() {
        int i = this.zzh;
        int i2 = i;
        if (i == 0) {
            i2 = ((this.zzc.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzg);
            this.zzh = i2;
        }
        return i2;
    }

    public final int zza(zzam zzamVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzamVar == this.zzg[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzam zzb(int i) {
        return this.zzg[i];
    }

    public final zzcz zzc(String str) {
        return new zzcz(str, this.zzg);
    }
}
