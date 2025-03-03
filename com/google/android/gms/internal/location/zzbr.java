package com.google.android.gms.internal.location;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzbr.class */
public final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final zzbs zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(zzbs zzbsVar, int i, int i2) {
        this.zzc = zzbsVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.location.zzbp
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.location.zzbp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.location.zzbp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* renamed from: zzh */
    public final zzbs subList(int i, int i2) {
        zzbm.zzc(i, i2, this.zzb);
        zzbs zzbsVar = this.zzc;
        int i3 = this.zza;
        return zzbsVar.subList(i + i3, i2 + i3);
    }
}
