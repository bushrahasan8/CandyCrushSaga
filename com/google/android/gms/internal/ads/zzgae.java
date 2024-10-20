package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: zzgae.class */
public final class zzgae extends zzfzt {
    Object[] zzd;
    private int zze;

    public zzgae() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgae(int i) {
        super(i);
        this.zzd = new Object[zzgaf.zzh(i)];
    }

    @Override // com.google.android.gms.internal.ads.zzfzt, com.google.android.gms.internal.ads.zzfzu
    public final /* bridge */ /* synthetic */ zzfzu zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgae zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzgaf.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length;
                int hashCode = obj.hashCode();
                int zza = zzfzs.zza(hashCode);
                while (true) {
                    int i = zza & (length - 1);
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzgae zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzgaf zzh() {
        zzgaf zzv;
        zzgaf zzgafVar;
        boolean zzw;
        int i = this.zzb;
        if (i == 0) {
            return zzgbq.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        if (this.zzd == null || zzgaf.zzh(i) != this.zzd.length) {
            zzv = zzgaf.zzv(this.zzb, this.zza);
            zzgafVar = zzv;
            this.zzb = zzgafVar.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            Object[] objArr2 = objArr;
            zzw = zzgaf.zzw(i2, objArr.length);
            if (zzw) {
                objArr2 = Arrays.copyOf(objArr, i2);
            }
            int i3 = this.zze;
            Object[] objArr3 = this.zzd;
            zzgafVar = new zzgbq(objArr2, i3, objArr3, objArr3.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgafVar;
    }
}
