package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzds;
import com.google.android.gms.measurement.internal.zziu;
import com.google.android.gms.measurement.internal.zzix;
import com.google.android.gms.measurement.internal.zzkn;
import java.util.List;
import java.util.Map;

/* loaded from: zzd.class */
final class zzd implements zzkn {
    private final zzds zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(zzds zzdsVar) {
        this.zza = zzdsVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final int zza(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final Object zza(int i) {
        return this.zza.zza(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final List zza(String str, String str2) {
        return this.zza.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final Map zza(String str, String str2, boolean z) {
        return this.zza.zza(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zza(Bundle bundle) {
        this.zza.zza(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zza(zziu zziuVar) {
        this.zza.zza(zziuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zza(zzix zzixVar) {
        this.zza.zza(zzixVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zza(String str, String str2, Bundle bundle, long j) {
        this.zza.zza(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zzb(zzix zzixVar) {
        this.zza.zzb(zzixVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zzb(String str) {
        this.zza.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zzb(String str, String str2, Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final void zzc(String str) {
        this.zza.zzc(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final long zzf() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final String zzg() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final String zzh() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final String zzi() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final String zzj() {
        return this.zza.zzi();
    }
}
