package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: zzhbv.class */
final class zzhbv implements Iterator {
    private final ArrayDeque zza;
    private zzgyg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzhbv(zzgyl zzgylVar, zzhbu zzhbuVar) {
        zzgyl zzgylVar2;
        if (!(zzgylVar instanceof zzhbx)) {
            this.zza = null;
            this.zzb = (zzgyg) zzgylVar;
            return;
        }
        zzhbx zzhbxVar = (zzhbx) zzgylVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhbxVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhbxVar);
        zzgylVar2 = zzhbxVar.zzd;
        this.zzb = zzb(zzgylVar2);
    }

    private final zzgyg zzb(zzgyl zzgylVar) {
        zzgyl zzgylVar2;
        while (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            this.zza.push(zzhbxVar);
            zzgylVar2 = zzhbxVar.zzd;
            zzgylVar = zzgylVar2;
        }
        return (zzgyg) zzgylVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgyg next() {
        zzgyg zzgygVar;
        zzgyl zzgylVar;
        zzgyg zzgygVar2 = this.zzb;
        if (zzgygVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            ArrayDeque arrayDeque = this.zza;
            zzgygVar = null;
            if (arrayDeque == null) {
                break;
            }
            if (arrayDeque.isEmpty()) {
                zzgygVar = null;
                break;
            }
            zzgylVar = ((zzhbx) this.zza.pop()).zze;
            zzgygVar = zzb(zzgylVar);
            if (zzgygVar.zzd() != 0) {
                break;
            }
        }
        this.zzb = zzgygVar;
        return zzgygVar2;
    }
}
