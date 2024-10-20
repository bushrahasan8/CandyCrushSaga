package com.google.android.gms.internal.ads;

/* loaded from: zzfwp.class */
public abstract class zzfwp implements zzfxf {
    public static zzfwp zzc(char c) {
        return new zzfwm(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
