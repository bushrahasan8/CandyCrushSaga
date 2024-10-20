package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: zzacy.class */
public final class zzacy {
    public static int zza(zzacv zzacvVar, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int zzb;
        int i4 = 0;
        while (true) {
            i3 = i4;
            if (i3 >= i2 || (zzb = zzacvVar.zzb(bArr, i + i3, i2 - i3)) == -1) {
                break;
            }
            i4 = i3 + zzb;
        }
        return i3;
    }

    public static void zzb(boolean z, String str) throws zzcc {
        if (!z) {
            throw zzcc.zza(str, null);
        }
    }

    public static boolean zzc(zzacv zzacvVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzacvVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzacv zzacvVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzack) zzacvVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException e) {
            return false;
        }
    }

    public static boolean zze(zzacv zzacvVar, int i) throws IOException {
        try {
            ((zzack) zzacvVar).zzo(i, false);
            return true;
        } catch (EOFException e) {
            return false;
        }
    }
}
