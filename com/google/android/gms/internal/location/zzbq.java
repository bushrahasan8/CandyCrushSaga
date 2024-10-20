package com.google.android.gms.internal.location;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbq.class */
public final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(zzbs<E> zzbsVar, int i) {
        super(zzbsVar.size(), i);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    protected final E zza(int i) {
        return this.zza.get(i);
    }
}
