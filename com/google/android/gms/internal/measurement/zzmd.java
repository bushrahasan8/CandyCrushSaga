package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzmd.class */
public final class zzmd extends zzml {
    private final zzlz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzmd(zzlz zzlzVar) {
        super(zzlzVar);
        this.zza = zzlzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzml, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzmb(this.zza);
    }
}
