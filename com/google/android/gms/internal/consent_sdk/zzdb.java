package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzdb.class */
public final class zzdb extends zzcy {
    private final zzdd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdb(zzdd zzddVar, int i) {
        super(zzddVar.size(), i);
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcy
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
