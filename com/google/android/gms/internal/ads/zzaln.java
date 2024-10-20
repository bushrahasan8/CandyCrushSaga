package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.regex.Pattern;

/* loaded from: zzaln.class */
final class zzaln {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgaf zze = zzgaf.zzp("auto", "none");
    private static final zzgaf zzf = zzgaf.zzq("dot", "sesame", "circle");
    private static final zzgaf zzg = zzgaf.zzp("filled", MRAIDPresenter.OPEN);
    private static final zzgaf zzh = zzgaf.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaln(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzaln zza(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (str == null) {
            return null;
        }
        String zza = zzfwk.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzgaf zzm = zzgaf.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzgag.zza(zzgca.zzb(zzh, zzm), "outside");
        int hashCode = str2.hashCode();
        boolean z2 = -1;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals("after")) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals("outside")) {
                z = true;
            }
            z = -1;
        }
        int i4 = z ? !z ? 1 : -2 : 2;
        zzgbz zzb = zzgca.zzb(zze, zzm);
        if (zzb.isEmpty()) {
            zzgbz zzb2 = zzgca.zzb(zzg, zzm);
            zzgbz zzb3 = zzgca.zzb(zzf, zzm);
            if (zzb2.isEmpty() && zzb3.isEmpty()) {
                i2 = -1;
                i3 = 0;
            } else {
                String str3 = (String) zzgag.zza(zzb2, "filled");
                int i5 = (str3.hashCode() == 3417674 && str3.equals(MRAIDPresenter.OPEN)) ? 2 : 1;
                String str4 = (String) zzgag.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        z2 = false;
                    }
                } else if (str4.equals("sesame")) {
                    z2 = true;
                }
                if (!z2) {
                    i = 2;
                } else if (!z2) {
                    i3 = i5;
                    i2 = 1;
                } else {
                    i = 3;
                }
                int i6 = i5;
                i2 = i;
                i3 = i6;
            }
        } else {
            String str5 = (String) zzb.iterator().next();
            if (str5.hashCode() != 3387192) {
                i2 = -1;
                i3 = 0;
            } else {
                i2 = -1;
                i3 = 0;
                if (str5.equals("none")) {
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new zzaln(i2, i3, i4);
    }
}
