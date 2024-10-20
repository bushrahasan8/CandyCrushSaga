package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: zzbh.class */
public final class zzbh {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbh(zzbf zzbfVar, zzbg zzbgVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbfVar.zzb;
        int size = list.size();
        list2 = zzbfVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbfVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbfVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double[] dArr = this.zzc;
            double[] dArr2 = this.zzb;
            int[] iArr = this.zzd;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new zzbe(str, d, d2, i2 / this.zze, i2));
            i++;
        }
    }

    public final void zzb(double d) {
        this.zze++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.zzb[i]) {
                int[] iArr = this.zzd;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }
}
