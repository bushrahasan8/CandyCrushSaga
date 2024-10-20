package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: zzbab.class */
public final class zzbab implements Comparator {
    public zzbab(zzbac zzbacVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazq zzazqVar = (zzazq) obj;
        zzazq zzazqVar2 = (zzazq) obj2;
        int i = -1;
        if (zzazqVar.zzd() >= zzazqVar2.zzd()) {
            if (zzazqVar.zzd() <= zzazqVar2.zzd()) {
                if (zzazqVar.zzb() >= zzazqVar2.zzb()) {
                    if (zzazqVar.zzb() <= zzazqVar2.zzb()) {
                        float zza = zzazqVar.zza();
                        float zzd = zzazqVar.zzd();
                        float zzc = zzazqVar.zzc();
                        float zzb = zzazqVar.zzb();
                        float zza2 = zzazqVar2.zza();
                        float zzd2 = zzazqVar2.zzd();
                        float zzc2 = zzazqVar2.zzc();
                        float zzb2 = zzazqVar2.zzb();
                        float f = (zza - zzd) * (zzc - zzb);
                        float f2 = (zza2 - zzd2) * (zzc2 - zzb2);
                        if (f <= f2) {
                            if (f >= f2) {
                                return 0;
                            }
                        }
                    }
                }
            }
            i = 1;
        }
        return i;
    }
}
