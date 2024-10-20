package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzb.class */
public final class zzb extends LinkedHashMap {
    final zzc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zzc zzcVar) {
        this.zza = zzcVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            int size = size();
            zzc zzcVar = this.zza;
            i = zzcVar.zza;
            boolean z = false;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzcVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
            int size2 = size();
            i2 = this.zza.zza;
            if (size2 > i2) {
                z = true;
            }
            return z;
        }
    }
}
