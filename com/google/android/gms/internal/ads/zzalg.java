package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.t2;

/* loaded from: zzalg.class */
final class zzalg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzalg(int i, int i2, int i3, int i4, int i5) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzalg zza(String str) {
        boolean z;
        zzek.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int length = split.length;
            if (i5 >= length) {
                if (i == -1 || i2 == -1 || i3 == -1) {
                    return null;
                }
                return new zzalg(i, i2, i4, i3, length);
            }
            String zza = zzfwk.zza(split[i5].trim());
            switch (zza.hashCode()) {
                case 100571:
                    if (zza.equals("end")) {
                        z = true;
                        break;
                    }
                    break;
                case 3556653:
                    if (zza.equals(t2.h.K0)) {
                        z = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (zza.equals("start")) {
                        z = false;
                        break;
                    }
                    break;
                case 109780401:
                    if (zza.equals("style")) {
                        z = 2;
                        break;
                    }
                    break;
            }
            z = -1;
            if (!z) {
                i = i5;
            } else if (z) {
                i2 = i5;
            } else if (z == 2) {
                i4 = i5;
            } else if (z == 3) {
                i3 = i5;
            }
            i5++;
        }
    }
}
