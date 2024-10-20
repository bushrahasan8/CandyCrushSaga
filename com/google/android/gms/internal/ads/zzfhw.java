package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: zzfhw.class */
public final class zzfhw {
    public zzfhw() {
        try {
            zzghg.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgyi zzt = zzgyl.zzt();
        try {
            zzgfv.zzb(zzggm.zzc(zzggf.zza(zzgoa.zzb().zza("AES128_GCM"))), zzgfu.zzb(zzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdwa zzdwaVar) {
        zzggm zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgfs) zzc.zze(zzgpb.zza(), zzgfs.class)).zza(bArr, bArr2);
            zzdwaVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.decrypt");
            zzdwaVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    private static final zzggm zzc(String str) {
        zzggm zzggmVar;
        try {
            zzggmVar = zzgfv.zza(zzgft.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.getHandle");
            zzggmVar = null;
        }
        return zzggmVar;
    }
}
