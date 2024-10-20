package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzhcz.class */
public final class zzhcz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhcy zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:17:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    static {
        /*
            Method dump skipped, instructions count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcz.m1634clinit():void");
    }

    private zzhcz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzA() {
        return zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzgxw.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        Field field = zzF;
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, "address");
            if (zzF2 != null && zzF2.getType() == Long.TYPE) {
                return zzF2;
            }
            field = null;
        }
        return field;
    }

    private static Field zzF(Class cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th) {
            field = null;
        }
        return field;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j, byte b) {
        zzhcy zzhcyVar = zzf;
        Unsafe unsafe = zzhcyVar.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((((int) j) ^ (-1)) & 3) << 3;
        zzhcyVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j, byte b) {
        zzhcy zzhcyVar = zzf;
        Unsafe unsafe = zzhcyVar.zza;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = (((int) j) & 3) << 3;
        zzhcyVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(long j) {
        return zzf.zza(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzc(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(Object obj, long j) {
        return zzf.zza.getInt(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zze(ByteBuffer byteBuffer) {
        zzhcy zzhcyVar = zzf;
        return zzhcyVar.zza.getLong(byteBuffer, zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(Object obj, long j) {
        return zzf.zza.getLong(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzh(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzi() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzhcv());
        } catch (Throwable th) {
            unsafe = null;
        }
        return unsafe;
    }

    static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhcz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(long j, byte[] bArr, long j2, long j3) {
        zzf.zzd(j, bArr, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(Object obj, long j, boolean z) {
        zzf.zze(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(byte[] bArr, long j, byte b) {
        zzf.zzf(bArr, zza + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzr(Object obj, long j, double d) {
        zzf.zzg(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzs(Object obj, long j, float f) {
        zzf.zzh(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzt(Object obj, long j, int i) {
        zzf.zza.putInt(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzu(Object obj, long j, long j2) {
        zzf.zza.putLong(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzv(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzy(Class cls) {
        int i = zzgxw.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzz(Object obj, long j) {
        return zzf.zzi(obj, j);
    }
}
