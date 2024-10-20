package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: zzeat.class */
public final class zzeat implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzeat(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        PackageInfo packageInfo;
        try {
            packageInfo = Wrappers.packageManager((Context) this.zza.zzb()).getPackageInfo(((zzeap) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        return packageInfo;
    }
}
