package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: zzaly.class */
final class zzaly {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfp zzc = new zzfp();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzfp zzfpVar, StringBuilder sb) {
        zzc(zzfpVar);
        if (zzfpVar.zzb() == 0) {
            return null;
        }
        String zzd = zzd(zzfpVar, sb);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzfpVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzm);
        return sb2.toString();
    }

    static void zzc(zzfp zzfpVar) {
        while (true) {
            boolean z = true;
            while (true) {
                boolean z2 = z;
                if (zzfpVar.zzb() <= 0 || !z2) {
                    return;
                }
                char c = (char) zzfpVar.zzM()[zzfpVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    break;
                }
                int zzd = zzfpVar.zzd();
                int zze = zzfpVar.zze();
                byte[] zzM = zzfpVar.zzM();
                if (zzd + 2 <= zze && zzM[zzd] == 47) {
                    int i = zzd + 2;
                    if (zzM[zzd + 1] == 42) {
                        while (true) {
                            int i2 = i + 1;
                            if (i2 >= zze) {
                                break;
                            }
                            if (((char) zzM[i]) == '*' && ((char) zzM[i2]) == '/') {
                                zze = i + 2;
                                i = zze;
                            } else {
                                i = i2;
                            }
                        }
                        zzfpVar.zzL(zze - zzfpVar.zzd());
                    }
                }
                z = false;
            }
            zzfpVar.zzL(1);
        }
    }

    private static String zzd(zzfp zzfpVar, StringBuilder sb) {
        boolean z;
        char c;
        sb.setLength(0);
        int zzd = zzfpVar.zzd();
        int zze = zzfpVar.zze();
        loop0: while (true) {
            while (true) {
                boolean z2 = z;
                if (zzd >= zze || z2) {
                    break loop0;
                }
                c = (char) zzfpVar.zzM()[zzd];
                z = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb.append(c);
            zzd++;
        }
        zzfpVar.zzL(zzd - zzfpVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x04d3, code lost:
    
        if ("}".equals(r6) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04d6, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00f9, code lost:
    
        if (")".equals(zza(r0, r0)) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfp r6) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaly.zzb(com.google.android.gms.internal.ads.zzfp):java.util.List");
    }
}
