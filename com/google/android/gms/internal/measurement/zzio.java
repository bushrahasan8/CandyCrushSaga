package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzio.class */
public final class zzio {
    private final zzja zza;
    private final byte[] zzb;

    private zzio(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = zzja.zzb(bArr);
    }

    public final zzij zza() {
        this.zza.zzb();
        return new zzit(this.zzb);
    }

    public final zzja zzb() {
        return this.zza;
    }
}
