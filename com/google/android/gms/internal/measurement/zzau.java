package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: zzau.class */
final class zzau implements Iterator<zzaq> {
    private int zza = 0;
    private final zzas zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzas zzasVar) {
        this.zzb = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.zza;
        str = this.zzb.zza;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        String str;
        String str2;
        int i = this.zza;
        str = this.zzb.zza;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        str2 = this.zzb.zza;
        int i2 = this.zza;
        this.zza = i2 + 1;
        return new zzas(String.valueOf(str2.charAt(i2)));
    }
}
