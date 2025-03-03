package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: zzaqr.class */
public final class zzaqr {
    protected static final Comparator zza = new zzaqq();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList(64);
    private int zzd = 0;

    public zzaqr(int i) {
    }

    private final void zzc() {
        synchronized (this) {
            while (this.zzd > 4096) {
                byte[] bArr = (byte[]) this.zzb.remove(0);
                this.zzc.remove(bArr);
                this.zzd -= bArr.length;
            }
        }
    }

    public final void zza(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                int length = bArr.length;
                if (length <= 4096) {
                    this.zzb.add(bArr);
                    int binarySearch = Collections.binarySearch(this.zzc, bArr, zza);
                    int i = binarySearch;
                    if (binarySearch < 0) {
                        i = (-binarySearch) - 1;
                    }
                    this.zzc.add(i, bArr);
                    this.zzd += length;
                    zzc();
                }
            }
        }
    }

    public final byte[] zzb(int i) {
        synchronized (this) {
            for (int i2 = 0; i2 < this.zzc.size(); i2++) {
                byte[] bArr = (byte[]) this.zzc.get(i2);
                int length = bArr.length;
                if (length >= i) {
                    this.zzd -= length;
                    this.zzc.remove(i2);
                    this.zzb.remove(bArr);
                    return bArr;
                }
            }
            return new byte[i];
        }
    }
}
