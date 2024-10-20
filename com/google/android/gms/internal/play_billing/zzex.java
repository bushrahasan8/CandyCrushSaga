package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzex.class */
final class zzex implements Iterator {
    final zzfb zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzex(zzfb zzfbVar, zzew zzewVar) {
        this.zza = zzfbVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        boolean z = true;
        int i = this.zzb + 1;
        list = this.zza.zzb;
        if (i >= list.size()) {
            map = this.zza.zzc;
            if (map.isEmpty()) {
                z = false;
            } else {
                if (!zza().hasNext()) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Map.Entry entry;
        List list2;
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        list = this.zza.zzb;
        if (i < list.size()) {
            list2 = this.zza.zzb;
            entry = (Map.Entry) list2.get(this.zzb);
        } else {
            entry = (Map.Entry) zza().next();
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        int i = this.zzb;
        list = this.zza.zzb;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        zzfb zzfbVar = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 - 1;
        zzfbVar.zzl(i2);
    }
}
