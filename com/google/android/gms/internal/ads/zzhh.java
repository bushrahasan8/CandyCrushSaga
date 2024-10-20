package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: zzhh.class */
final class zzhh extends zzfzq {
    private final Map zza;

    public zzhh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final Set entrySet() {
        return zzgca.zzc(this.zza.entrySet(), new zzfxf() { // from class: com.google.android.gms.internal.ads.zzhf
            @Override // com.google.android.gms.internal.ads.zzfxf
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final boolean isEmpty() {
        boolean z = true;
        if (!this.zza.isEmpty()) {
            if (super.size() != 1) {
                z = false;
            } else {
                if (!super.containsKey(null)) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final Set keySet() {
        return zzgca.zzc(this.zza.keySet(), new zzfxf() { // from class: com.google.android.gms.internal.ads.zzhg
            @Override // com.google.android.gms.internal.ads.zzfxf
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, com.google.android.gms.internal.ads.zzfzr
    protected final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final Map zzb() {
        return this.zza;
    }
}
