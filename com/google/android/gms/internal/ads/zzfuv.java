package com.google.android.gms.internal.ads;

/* loaded from: zzfuv.class */
final class zzfuv extends zzfvo {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final zzfvo zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final zzfvo zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final zzfvp zzc() {
        if (this.zzc == 1) {
            return new zzfux(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
