package com.google.android.gms.internal.play_games_inputmapping;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: zzfi.class */
public final class zzfi {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzem zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i = zzem.zza;
        zzel zzelVar = new zzel(bArr, 0, 0, false, null);
        try {
            zzelVar.zza(0);
            zzf = zzelVar;
        } catch (zzfk e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzb(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzc(byte[] bArr) {
        return zzhr.zza(bArr);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static int zze(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzf(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzg(byte[] bArr) {
        int length = bArr.length;
        int zzh = zzh(length, bArr, 0, length);
        int i = zzh;
        if (zzh == 0) {
            i = 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzi(Object obj, Object obj2) {
        return ((zzge) obj).zzv().zzf((zzge) obj2).zzl();
    }
}
