package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: zzali.class */
final class zzali {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzali(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = i9;
        this.zzj = i10;
        this.zzk = i11;
    }

    public static zzali zza(String str) {
        boolean z;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int length = split.length;
            if (i11 >= length) {
                if (i != -1) {
                    return new zzali(i, i2, i10, i9, i3, i4, i5, i6, i7, i8, length);
                }
                return null;
            }
            String zza = zzfwk.zza(split[i11].trim());
            switch (zza.hashCode()) {
                case -1178781136:
                    if (zza.equals("italic")) {
                        z = 6;
                        break;
                    }
                    break;
                case -1026963764:
                    if (zza.equals("underline")) {
                        z = 7;
                        break;
                    }
                    break;
                case -192095652:
                    if (zza.equals("strikeout")) {
                        z = 8;
                        break;
                    }
                    break;
                case -70925746:
                    if (zza.equals("primarycolour")) {
                        z = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (zza.equals("bold")) {
                        z = 5;
                        break;
                    }
                    break;
                case 3373707:
                    if (zza.equals("name")) {
                        z = false;
                        break;
                    }
                    break;
                case 366554320:
                    if (zza.equals("fontsize")) {
                        z = 4;
                        break;
                    }
                    break;
                case 767321349:
                    if (zza.equals("borderstyle")) {
                        z = 9;
                        break;
                    }
                    break;
                case 1767875043:
                    if (zza.equals("alignment")) {
                        z = true;
                        break;
                    }
                    break;
                case 1988365454:
                    if (zza.equals("outlinecolour")) {
                        z = 3;
                        break;
                    }
                    break;
            }
            z = -1;
            switch (z) {
                case false:
                    i = i11;
                    break;
                case true:
                    i2 = i11;
                    break;
                case true:
                    i10 = i11;
                    break;
                case true:
                    i9 = i11;
                    break;
                case true:
                    i3 = i11;
                    break;
                case true:
                    i4 = i11;
                    break;
                case true:
                    i5 = i11;
                    break;
                case true:
                    i6 = i11;
                    break;
                case true:
                    i7 = i11;
                    break;
                case true:
                    i8 = i11;
                    break;
            }
            i11++;
        }
    }
}
