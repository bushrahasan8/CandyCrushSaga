package com.google.android.gms.internal.ads;

/* loaded from: zzfxw.class */
final class zzfxw implements zzfxu {
    private static final zzfxu zza = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzfxv
        @Override // com.google.android.gms.internal.ads.zzfxu
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzfxu zzb;
    private Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxw(zzfxu zzfxuVar) {
        this.zzb = zzfxuVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        Object obj2 = obj;
        if (obj == zza) {
            obj2 = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj2) + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final Object zza() {
        zzfxu zzfxuVar = this.zzb;
        zzfxu zzfxuVar2 = zza;
        if (zzfxuVar != zzfxuVar2) {
            synchronized (this) {
                if (this.zzb != zzfxuVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzfxuVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
