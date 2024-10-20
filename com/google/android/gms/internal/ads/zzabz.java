package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: zzabz.class */
public final class zzabz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzabz(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = f;
        this.zzk = str;
    }

    public static zzabz zza(zzfp zzfpVar) throws zzcc {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        float f;
        int i6;
        int i7;
        try {
            zzfpVar.zzL(4);
            int zzm = zzfpVar.zzm() & 3;
            int i8 = zzm + 1;
            if (i8 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzm2 = zzfpVar.zzm() & 31;
            for (int i9 = 0; i9 < zzm2; i9++) {
                arrayList.add(zzb(zzfpVar));
            }
            int zzm3 = zzfpVar.zzm();
            for (int i10 = 0; i10 < zzm3; i10++) {
                arrayList.add(zzb(zzfpVar));
            }
            if (zzm2 > 0) {
                zzgl zze = zzgm.zze((byte[]) arrayList.get(0), zzm + 2, ((byte[]) arrayList.get(0)).length);
                i = zze.zze;
                i2 = zze.zzf;
                int i11 = zze.zzh;
                int i12 = zze.zzi;
                i3 = zze.zzj;
                int i13 = zze.zzk;
                int i14 = zze.zzl;
                f = zze.zzg;
                str = zzem.zza(zze.zza, zze.zzb, zze.zzc);
                i7 = i11 + 8;
                i6 = i12 + 8;
                i4 = i13;
                i5 = i14;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                str = null;
                f = 1.0f;
                i6 = -1;
                i7 = -1;
            }
            return new zzabz(arrayList, i8, i, i2, i7, i6, i3, i4, i5, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfp zzfpVar) {
        int zzq = zzfpVar.zzq();
        int zzd = zzfpVar.zzd();
        zzfpVar.zzL(zzq);
        return zzem.zzc(zzfpVar.zzM(), zzd, zzq);
    }
}
