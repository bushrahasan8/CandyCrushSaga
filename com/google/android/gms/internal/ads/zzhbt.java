package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: zzhbt.class */
public final class zzhbt {
    private final ArrayDeque zza = new ArrayDeque();

    private zzhbt() {
    }

    public /* synthetic */ zzhbt(zzhbs zzhbsVar) {
    }

    public static /* bridge */ /* synthetic */ zzgyl zza(zzhbt zzhbtVar, zzgyl zzgylVar, zzgyl zzgylVar2) {
        zzhbtVar.zzb(zzgylVar);
        zzhbtVar.zzb(zzgylVar2);
        zzgyl zzgylVar3 = (zzgyl) zzhbtVar.zza.pop();
        while (true) {
            zzgyl zzgylVar4 = zzgylVar3;
            if (zzhbtVar.zza.isEmpty()) {
                return zzgylVar4;
            }
            zzgylVar3 = new zzhbx((zzgyl) zzhbtVar.zza.pop(), zzgylVar4);
        }
    }

    private final void zzb(zzgyl zzgylVar) {
        zzgyl zzgylVar2;
        zzgyl zzgylVar3;
        zzgyl zzgylVar4;
        zzhbx zzhbxVar;
        if (!zzgylVar.zzh()) {
            if (!(zzgylVar instanceof zzhbx)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgylVar.getClass())));
            }
            zzhbx zzhbxVar2 = (zzhbx) zzgylVar;
            zzgylVar2 = zzhbxVar2.zzd;
            zzb(zzgylVar2);
            zzgylVar3 = zzhbxVar2.zze;
            zzb(zzgylVar3);
            return;
        }
        int zzc = zzc(zzgylVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int zzc2 = zzhbx.zzc(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzgyl) this.zza.peek()).zzd() >= zzc2) {
            this.zza.push(zzgylVar);
            return;
        }
        int zzc3 = zzhbx.zzc(zzc);
        zzgyl zzgylVar5 = (zzgyl) this.zza.pop();
        while (true) {
            zzgylVar4 = zzgylVar5;
            if (this.zza.isEmpty() || ((zzgyl) this.zza.peek()).zzd() >= zzc3) {
                break;
            } else {
                zzgylVar5 = new zzhbx((zzgyl) this.zza.pop(), zzgylVar4);
            }
        }
        zzhbx zzhbxVar3 = new zzhbx(zzgylVar4, zzgylVar);
        while (true) {
            zzhbxVar = zzhbxVar3;
            if (!this.zza.isEmpty()) {
                int zzc4 = zzc(zzhbxVar.zzd());
                ArrayDeque arrayDeque2 = this.zza;
                if (((zzgyl) arrayDeque2.peek()).zzd() >= zzhbx.zzc(zzc4 + 1)) {
                    break;
                } else {
                    zzhbxVar3 = new zzhbx((zzgyl) this.zza.pop(), zzhbxVar);
                }
            } else {
                break;
            }
        }
        this.zza.push(zzhbxVar);
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzhbx.zza, i);
        int i2 = binarySearch;
        if (binarySearch < 0) {
            i2 = (-(binarySearch + 1)) - 1;
        }
        return i2;
    }
}
