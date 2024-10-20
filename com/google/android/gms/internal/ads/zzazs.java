package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: zzazs.class */
final class zzazs implements Comparator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazs(zzazu zzazuVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazy zzazyVar = (zzazy) obj;
        zzazy zzazyVar2 = (zzazy) obj2;
        int i = zzazyVar.zzc - zzazyVar2.zzc;
        return i != 0 ? i : Long.compare(zzazyVar.zza, zzazyVar2.zza);
    }
}
