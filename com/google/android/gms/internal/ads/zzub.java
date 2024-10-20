package com.google.android.gms.internal.ads;

/* loaded from: zzub.class */
public final class zzub implements zzwj {
    protected final zzwj[] zza;

    public zzub(zzwj[] zzwjVarArr) {
        this.zza = zzwjVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        long j;
        zzwj[] zzwjVarArr = this.zza;
        int length = zzwjVarArr.length;
        int i = 0;
        long j2 = Long.MAX_VALUE;
        while (true) {
            j = j2;
            if (i >= length) {
                break;
            }
            long zzb = zzwjVarArr[i].zzb();
            long j3 = j;
            if (zzb != Long.MIN_VALUE) {
                j3 = Math.min(j, zzb);
            }
            i++;
            j2 = j3;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        long j;
        zzwj[] zzwjVarArr = this.zza;
        int length = zzwjVarArr.length;
        int i = 0;
        long j2 = Long.MAX_VALUE;
        while (true) {
            j = j2;
            if (i >= length) {
                break;
            }
            long zzc = zzwjVarArr[i].zzc();
            long j3 = j;
            if (zzc != Long.MIN_VALUE) {
                j3 = Math.min(j, zzc);
            }
            i++;
            j2 = j3;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j) {
        for (zzwj zzwjVar : this.zza) {
            zzwjVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        boolean z;
        boolean zzo;
        boolean z2 = false;
        while (true) {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            zzwj[] zzwjVarArr = this.zza;
            int length = zzwjVarArr.length;
            int i = 0;
            boolean z3 = false;
            while (true) {
                z = z3;
                if (i >= length) {
                    break;
                }
                zzwj zzwjVar = zzwjVarArr[i];
                long zzc2 = zzwjVar.zzc();
                boolean z4 = zzc2 != Long.MIN_VALUE && zzc2 <= zzlgVar.zza;
                if (zzc2 != zzc) {
                    zzo = z;
                    if (!z4) {
                        i++;
                        z3 = zzo;
                    }
                }
                zzo = z | zzwjVar.zzo(zzlgVar);
                i++;
                z3 = zzo;
            }
            boolean z5 = z2 | z;
            z2 = z5;
            if (!z) {
                z2 = z5;
                break;
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        for (zzwj zzwjVar : this.zza) {
            if (zzwjVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
