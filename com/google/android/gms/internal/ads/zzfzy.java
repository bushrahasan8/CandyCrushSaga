package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzfzy.class */
public final class zzfzy extends zzfya {
    private final zzgaa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzy(zzgaa zzgaaVar, int i) {
        super(zzgaaVar.size(), i);
        this.zza = zzgaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
