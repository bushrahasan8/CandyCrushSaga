package com.google.android.gms.internal.ads;

/* loaded from: zzacq.class */
public final class zzacq {
    public final String zza;

    private zzacq(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzacq zza(zzfp zzfpVar) {
        String str;
        zzfpVar.zzL(2);
        int zzm = zzfpVar.zzm();
        int i = zzm >> 1;
        int zzm2 = zzfpVar.zzm();
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i2 = (zzm2 >> 3) | ((zzm & 1) << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i2 >= 10 ? "." : ".0");
        sb.append(i2);
        return new zzacq(i, i2, sb.toString());
    }
}
