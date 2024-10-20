package com.google.android.gms.internal.ads;

import com.google.android.gms.drive.ExecutionOptions;
import java.util.Arrays;

/* loaded from: zzyx.class */
public final class zzyx {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyq[] zzd = new zzyq[100];

    public zzyx(boolean z, int i) {
    }

    public final int zza() {
        int i;
        synchronized (this) {
            i = this.zzb;
        }
        return i * ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH;
    }

    public final zzyq zzb() {
        zzyq zzyqVar;
        synchronized (this) {
            this.zzb++;
            int i = this.zzc;
            if (i > 0) {
                zzyq[] zzyqVarArr = this.zzd;
                int i2 = i - 1;
                this.zzc = i2;
                zzyqVar = zzyqVarArr[i2];
                zzyqVar.getClass();
                zzyqVarArr[i2] = null;
            } else {
                zzyqVar = new zzyq(new byte[ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH], 0);
                int i3 = this.zzb;
                zzyq[] zzyqVarArr2 = this.zzd;
                int length = zzyqVarArr2.length;
                if (i3 > length) {
                    this.zzd = (zzyq[]) Arrays.copyOf(zzyqVarArr2, length + length);
                    return zzyqVar;
                }
            }
            return zzyqVar;
        }
    }

    public final void zzc(zzyq zzyqVar) {
        synchronized (this) {
            zzyq[] zzyqVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzyqVarArr[i] = zzyqVar;
            this.zzb--;
            notifyAll();
        }
    }

    public final void zzd(zzyr zzyrVar) {
        synchronized (this) {
            while (zzyrVar != null) {
                zzyq[] zzyqVarArr = this.zzd;
                int i = this.zzc;
                this.zzc = i + 1;
                zzyqVarArr[i] = zzyrVar.zzc();
                this.zzb--;
                zzyrVar = zzyrVar.zzd();
            }
            notifyAll();
        }
    }

    public final void zze() {
        synchronized (this) {
            zzf(0);
        }
    }

    public final void zzf(int i) {
        synchronized (this) {
            int i2 = this.zza;
            this.zza = i;
            if (i < i2) {
                zzg();
            }
        }
    }

    public final void zzg() {
        synchronized (this) {
            int i = this.zza;
            int i2 = zzfy.zza;
            int max = Math.max(0, ((i + 65535) / ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH) - this.zzb);
            int i3 = this.zzc;
            if (max >= i3) {
                return;
            }
            Arrays.fill(this.zzd, max, i3, (Object) null);
            this.zzc = max;
        }
    }
}
