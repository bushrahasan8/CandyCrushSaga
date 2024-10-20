package com.google.android.gms.internal.drive;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zznd.class */
public final class zznd {
    private static final Logger logger = Logger.getLogger(zznd.class.getName());
    private static final Class<?> zzni;
    private static final boolean zzog;
    private static final Unsafe zzuc;
    private static final boolean zzvy;
    private static final boolean zzvz;
    private static final zzd zzwa;
    private static final boolean zzwb;
    private static final long zzwc;
    private static final long zzwd;
    private static final long zzwe;
    private static final long zzwf;
    private static final long zzwg;
    private static final long zzwh;
    private static final long zzwi;
    private static final long zzwj;
    private static final long zzwk;
    private static final long zzwl;
    private static final long zzwm;
    private static final long zzwn;
    private static final long zzwo;
    private static final long zzwp;
    private static final int zzwq;
    static final boolean zzwr;

    /* loaded from: zznd$zza.class */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zznd.zzwr) {
                zznd.zzb(obj, j, z);
            } else {
                zznd.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zznd.zzwr) {
                zznd.zza(obj, j, b);
            } else {
                zznd.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final boolean zzl(Object obj, long j) {
            return zznd.zzwr ? zznd.zzr(obj, j) : zznd.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final byte zzx(Object obj, long j) {
            return zznd.zzwr ? zznd.zzp(obj, j) : zznd.zzq(obj, j);
        }
    }

    /* loaded from: zznd$zzb.class */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zznd.zzwr) {
                zznd.zzb(obj, j, z);
            } else {
                zznd.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zznd.zzwr) {
                zznd.zza(obj, j, b);
            } else {
                zznd.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final boolean zzl(Object obj, long j) {
            return zznd.zzwr ? zznd.zzr(obj, j) : zznd.zzs(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final float zzm(Object obj, long j) {
            return Float.intBitsToFloat(zzj(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final double zzn(Object obj, long j) {
            return Double.longBitsToDouble(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final byte zzx(Object obj, long j) {
            return zznd.zzwr ? zznd.zzp(obj, j) : zznd.zzq(obj, j);
        }
    }

    /* loaded from: zznd$zzc.class */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, double d) {
            this.zzws.putDouble(obj, j, d);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, float f) {
            this.zzws.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zzws.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zzws.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final boolean zzl(Object obj, long j) {
            return this.zzws.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final float zzm(Object obj, long j) {
            return this.zzws.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final double zzn(Object obj, long j) {
            return this.zzws.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.drive.zznd.zzd
        public final byte zzx(Object obj, long j) {
            return this.zzws.getByte(obj, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: zznd$zzd.class */
    public static abstract class zzd {
        Unsafe zzws;

        zzd(Unsafe unsafe) {
            this.zzws = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public final void zza(Object obj, long j, int i) {
            this.zzws.putInt(obj, j, i);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzws.putLong(obj, j, j2);
        }

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public final int zzj(Object obj, long j) {
            return this.zzws.getInt(obj, j);
        }

        public final long zzk(Object obj, long j) {
            return this.zzws.getLong(obj, j);
        }

        public abstract boolean zzl(Object obj, long j);

        public abstract float zzm(Object obj, long j);

        public abstract double zzn(Object obj, long j);

        public abstract byte zzx(Object obj, long j);
    }

    static {
        Unsafe zzff = zzff();
        zzuc = zzff;
        zzni = zzix.zzbs();
        boolean zzk = zzk(Long.TYPE);
        zzvy = zzk;
        boolean zzk2 = zzk(Integer.TYPE);
        zzvz = zzk2;
        zzd zzdVar = null;
        if (zzff != null) {
            if (!zzix.zzbr()) {
                zzdVar = new zzc(zzff);
            } else if (zzk) {
                zzdVar = new zzb(zzff);
            } else if (zzk2) {
                zzdVar = new zza(zzff);
            }
        }
        zzwa = zzdVar;
        zzwb = zzfh();
        zzog = zzfg();
        long zzi = zzi(byte[].class);
        zzwc = zzi;
        zzwd = zzi(boolean[].class);
        zzwe = zzj(boolean[].class);
        zzwf = zzi(int[].class);
        zzwg = zzj(int[].class);
        zzwh = zzi(long[].class);
        zzwi = zzj(long[].class);
        zzwj = zzi(float[].class);
        zzwk = zzj(float[].class);
        zzwl = zzi(double[].class);
        zzwm = zzj(double[].class);
        zzwn = zzi(Object[].class);
        zzwo = zzj(Object[].class);
        Field zzfi = zzfi();
        zzwp = (zzfi == null || zzdVar == null) ? -1L : zzdVar.zzws.objectFieldOffset(zzfi);
        zzwq = (int) (zzi & 7);
        zzwr = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zznd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j) {
        return zzwa.zzx(bArr, zzwc + j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzj = zzj(obj, j2);
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzwa.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzwa.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, int i) {
        zzwa.zza(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzwa.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzwa.zzws.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, boolean z) {
        zzwa.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzwa.zze(bArr, zzwc + j, b);
    }

    private static Field zzb(Class<?> cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th) {
            field = null;
        }
        return field;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int zzj = zzj(obj, j2);
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzj & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzfd() {
        return zzog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzfe() {
        return zzwb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzff() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzne());
        } catch (Throwable th) {
            unsafe = null;
        }
        return unsafe;
    }

    private static boolean zzfg() {
        Unsafe unsafe = zzuc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (zzix.zzbr()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzfh() {
        Unsafe unsafe = zzuc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (zzfi() == null) {
                return false;
            }
            if (zzix.zzbr()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field zzfi() {
        Field zzb2;
        if (zzix.zzbr() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzh(Class<T> cls) {
        try {
            return (T) zzuc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzog) {
            return zzwa.zzws.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzog) {
            return zzwa.zzws.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(Object obj, long j) {
        return zzwa.zzj(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzk(Object obj, long j) {
        return zzwa.zzk(obj, j);
    }

    private static boolean zzk(Class<?> cls) {
        if (!zzix.zzbr()) {
            return false;
        }
        try {
            Class<?> cls2 = zzni;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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
    public static boolean zzl(Object obj, long j) {
        return zzwa.zzl(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzm(Object obj, long j) {
        return zzwa.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzn(Object obj, long j) {
        return zzwa.zzn(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, long j) {
        return zzwa.zzws.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzp(Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzr(Object obj, long j) {
        return zzp(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }
}
