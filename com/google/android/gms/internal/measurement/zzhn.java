package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhn.class */
public final class zzhn extends zzhg<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhn(zzho zzhoVar, String str, Boolean bool, boolean z) {
        super(zzhoVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzhg
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzgf.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzgf.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }
}
