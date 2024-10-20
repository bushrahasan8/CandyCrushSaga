package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: zzgpa.class */
public final class zzgpa {
    private static final ThreadLocal zza = new zzgoz();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    public static byte[] zzb(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() {
        try {
            return SecureRandom.getInstance("SHA1PRNG", ProviderInstaller.PROVIDER_NAME);
        } catch (GeneralSecurityException e) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            } catch (GeneralSecurityException e2) {
                try {
                    return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                } catch (GeneralSecurityException e3) {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null));
                        } catch (GeneralSecurityException e4) {
                            return new SecureRandom();
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e5) {
                        throw new GeneralSecurityException("Failed to get Conscrypt provider", e5);
                    }
                }
            }
        }
    }
}
