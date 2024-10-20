package com.google.android.gms.internal.ads;

/* loaded from: zzabs.class */
public final class zzabs {
    public static final int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabr zza(byte[] bArr) throws zzcc {
        return zzb(new zzfo(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (r0 == 29) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0197, code lost:
    
        if (r0 != 3) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzabr zzb(com.google.android.gms.internal.ads.zzfo r7, boolean r8) throws com.google.android.gms.internal.ads.zzcc {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabs.zzb(com.google.android.gms.internal.ads.zzfo, boolean):com.google.android.gms.internal.ads.zzabr");
    }

    private static int zzc(zzfo zzfoVar) {
        int zzd = zzfoVar.zzd(5);
        return zzd == 31 ? zzfoVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzfo zzfoVar) throws zzcc {
        int i;
        int zzd = zzfoVar.zzd(4);
        if (zzd == 15) {
            if (zzfoVar.zza() < 24) {
                throw zzcc.zza("AAC header insufficient data", null);
            }
            i = zzfoVar.zzd(24);
        } else {
            if (zzd >= 13) {
                throw zzcc.zza("AAC header wrong Sampling Frequency Index", null);
            }
            i = zzb[zzd];
        }
        return i;
    }
}
