package com.google.android.gms.internal.drive;

import java.util.Iterator;

/* loaded from: zzml.class */
final class zzml extends zzmr {
    private final zzmi zzvk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzml(zzmi zzmiVar) {
        super(zzmiVar, null);
        this.zzvk = zzmiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzml(zzmi zzmiVar, zzmj zzmjVar) {
        this(zzmiVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzmk(this.zzvk, null);
    }
}
