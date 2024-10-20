package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: zzgwz.class */
public final class zzgwz {
    public static final zzgwz zza = new zzgwz(new zzgxa());
    public static final zzgwz zzb = new zzgwz(new zzgxe());
    public static final zzgwz zzc = new zzgwz(new zzgxg());
    public static final zzgwz zzd = new zzgwz(new zzgxf());
    public static final zzgwz zze = new zzgwz(new zzgxb());
    public static final zzgwz zzf = new zzgwz(new zzgxd());
    public static final zzgwz zzg = new zzgwz(new zzgxc());
    private final zzgwy zzh;

    public zzgwz(zzgxh zzgxhVar) {
        this.zzh = !zzgmw.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgwt(zzgxhVar, null) : new zzgwv(zzgxhVar, null) : new zzgwx(zzgxhVar, null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
