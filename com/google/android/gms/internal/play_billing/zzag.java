package com.google.android.gms.internal.play_billing;

/* loaded from: zzag.class */
final class zzag extends zzac {
    private final zzai zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzag(zzai zzaiVar, int i) {
        super(zzaiVar.size(), i);
        this.zza = zzaiVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
