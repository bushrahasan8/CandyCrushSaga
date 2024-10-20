package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: zzcl.class */
public final class zzcl {
    private static String zza;

    public static String zza(Context context) {
        String str;
        synchronized (zzcl.class) {
            try {
                if (zza == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                    if (string != null) {
                        if (zzct.zza(true)) {
                        }
                        zza = zzb(string);
                    }
                    string = "emulator";
                    zza = zzb(string);
                }
                str = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static String zzb(String str) {
        for (int i = 0; i < 3; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException e) {
                return "";
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return "";
    }
}
