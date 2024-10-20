package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzmj.class */
final class zzmj implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final zzlz zzd;

    private zzmj(zzlz zzlzVar) {
        this.zzd = zzlzVar;
        this.zza = -1;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.zza + 1;
        list = this.zzd.zzb;
        if (i < list.size()) {
            return true;
        }
        map = this.zzd.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        list = this.zzd.zzb;
        if (i >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zzd.zzb;
        return (Map.Entry) list2.get(this.zza);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i = this.zza;
        list = this.zzd.zzb;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        zzlz zzlzVar = this.zzd;
        int i2 = this.zza;
        this.zza = i2 - 1;
        zzlzVar.zzc(i2);
    }
}
