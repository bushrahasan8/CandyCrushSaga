package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* loaded from: zzbh.class */
final class zzbh implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int compareTo;
        zzbq zzbqVar = (zzbq) obj;
        zzbq zzbqVar2 = (zzbq) obj2;
        zzbg zzbgVar = new zzbg(zzbqVar);
        zzbg zzbgVar2 = new zzbg(zzbqVar2);
        while (zzbgVar.hasNext() && zzbgVar2.hasNext()) {
            compareTo = Integer.valueOf(zzbgVar.zza() & 255).compareTo(Integer.valueOf(zzbgVar2.zza() & 255));
            if (compareTo != 0) {
                break;
            }
        }
        compareTo = Integer.valueOf(zzbqVar.zzd()).compareTo(Integer.valueOf(zzbqVar2.zzd()));
        return compareTo;
    }
}
