package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: zzdyk.class */
public final class zzdyk implements zzdhv {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zza(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzb(String str, String str2) {
        synchronized (this) {
            this.zza.putInt(str, 3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzc(String str) {
        synchronized (this) {
            this.zza.putInt(str, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzd(String str) {
        synchronized (this) {
            this.zza.putInt(str, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdhv
    public final void zzf() {
    }

    public final Bundle zzg() {
        Bundle bundle;
        synchronized (this) {
            bundle = new Bundle(this.zza);
        }
        return bundle;
    }
}
