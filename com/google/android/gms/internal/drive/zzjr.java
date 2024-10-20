package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: zzjr.class */
public abstract class zzjr extends zzjb {
    private static final Logger logger = Logger.getLogger(zzjr.class.getName());
    private static final boolean zzog = zznd.zzfd();
    zzjt zzoh;

    /* loaded from: zzjr$zza.class */
    static final class zza extends zzjr {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = 0;
            this.position = 0;
            this.limit = i2;
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzl(j);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, zzjc zzjcVar) throws IOException {
            zzb(i, 2);
            zza(zzjcVar);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, zzlq zzlqVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zzb(3, 2);
            zzb(zzlqVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        final void zza(int i, zzlq zzlqVar, zzmf zzmfVar) throws IOException {
            zzb(i, 2);
            zzit zzitVar = (zzit) zzlqVar;
            int zzbm = zzitVar.zzbm();
            int i2 = zzbm;
            if (zzbm == -1) {
                i2 = zzmfVar.zzn(zzitVar);
                zzitVar.zzo(i2);
            }
            zzy(i2);
            zzmfVar.zza(zzlqVar, this.zzoh);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzl(str);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(zzjc zzjcVar) throws IOException {
            zzy(zzjcVar.size());
            zzjcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.drive.zzjb
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzaa(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.position = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.position = i5;
                bArr[i4] = (byte) (i >> 16);
                this.position = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int i, int i2) throws IOException {
            zzy((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int i, zzjc zzjcVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzjcVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(zzlq zzlqVar) throws IOException {
            zzy(zzlqVar.zzcx());
            zzlqVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzx(i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzn(j);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final int zzca() {
            return this.limit - this.position;
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzy(i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzd(byte[] bArr, int i, int i2) throws IOException {
            zzy(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzaa(i2);
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzl(long j) throws IOException {
            long j2 = j;
            if (zzjr.zzog) {
                j2 = j;
                if (zzca() >= 10) {
                    while ((j & (-128)) != 0) {
                        byte[] bArr = this.buffer;
                        int i = this.position;
                        this.position = i + 1;
                        zznd.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                    byte[] bArr2 = this.buffer;
                    int i2 = this.position;
                    this.position = 1 + i2;
                    zznd.zza(bArr2, i2, (byte) j);
                    return;
                }
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzl(String str) throws IOException {
            int i = this.position;
            try {
                int zzad = zzjr.zzad(str.length() * 3);
                int zzad2 = zzjr.zzad(str.length());
                if (zzad2 != zzad) {
                    zzy(zznf.zza(str));
                    this.position = zznf.zza(str, this.buffer, this.position, zzca());
                    return;
                }
                int i2 = i + zzad2;
                this.position = i2;
                int zza = zznf.zza(str, this.buffer, i2, zzca());
                this.position = i;
                zzy((zza - i) - zzad2);
                this.position = zza;
            } catch (zznj e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzn(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.position = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.position = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.position = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.position = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.position = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.position = i8;
                bArr[i7] = (byte) (j >> 48);
                this.position = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzx(int i) throws IOException {
            if (i >= 0) {
                zzy(i);
            } else {
                zzl(i);
            }
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzy(int i) throws IOException {
            int i2 = i;
            if (zzjr.zzog) {
                i2 = i;
                if (!zzix.zzbr()) {
                    i2 = i;
                    if (zzca() >= 5) {
                        if ((i & (-128)) == 0) {
                            byte[] bArr = this.buffer;
                            int i3 = this.position;
                            this.position = 1 + i3;
                            zznd.zza(bArr, i3, (byte) i);
                            return;
                        }
                        byte[] bArr2 = this.buffer;
                        int i4 = this.position;
                        this.position = i4 + 1;
                        zznd.zza(bArr2, i4, (byte) (i | 128));
                        int i5 = i >>> 7;
                        if ((i5 & (-128)) == 0) {
                            byte[] bArr3 = this.buffer;
                            int i6 = this.position;
                            this.position = 1 + i6;
                            zznd.zza(bArr3, i6, (byte) i5);
                            return;
                        }
                        byte[] bArr4 = this.buffer;
                        int i7 = this.position;
                        this.position = i7 + 1;
                        zznd.zza(bArr4, i7, (byte) (i5 | 128));
                        int i8 = i >>> 14;
                        if ((i8 & (-128)) == 0) {
                            byte[] bArr5 = this.buffer;
                            int i9 = this.position;
                            this.position = 1 + i9;
                            zznd.zza(bArr5, i9, (byte) i8);
                            return;
                        }
                        byte[] bArr6 = this.buffer;
                        int i10 = this.position;
                        this.position = i10 + 1;
                        zznd.zza(bArr6, i10, (byte) (i8 | 128));
                        int i11 = i >>> 21;
                        if ((i11 & (-128)) == 0) {
                            byte[] bArr7 = this.buffer;
                            int i12 = this.position;
                            this.position = 1 + i12;
                            zznd.zza(bArr7, i12, (byte) i11);
                            return;
                        }
                        byte[] bArr8 = this.buffer;
                        int i13 = this.position;
                        this.position = i13 + 1;
                        zznd.zza(bArr8, i13, (byte) (i11 | 128));
                        byte[] bArr9 = this.buffer;
                        int i14 = this.position;
                        this.position = 1 + i14;
                        zznd.zza(bArr9, i14, (byte) (i >>> 28));
                        return;
                    }
                }
            }
            while ((i2 & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.buffer;
                    int i15 = this.position;
                    this.position = i15 + 1;
                    bArr10[i15] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr11 = this.buffer;
            int i16 = this.position;
            this.position = i16 + 1;
            bArr11[i16] = (byte) i2;
        }
    }

    /* loaded from: zzjr$zzb.class */
    public static final class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzb(java.lang.String r5, java.lang.Throwable r6) {
            /*
                r4 = this;
                r0 = r5
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r5 = r0
                r0 = r5
                int r0 = r0.length()
                if (r0 == 0) goto L16
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r1 = r5
                java.lang.String r0 = r0.concat(r1)
                r5 = r0
                goto L20
            L16:
                java.lang.String r0 = new java.lang.String
                r1 = r0
                java.lang.String r2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r1.<init>(r2)
                r5 = r0
            L20:
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.drive.zzjr.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzjr() {
    }

    public static int zza(int i, zzkx zzkxVar) {
        int zzab = zzab(i);
        int zzcx = zzkxVar.zzcx();
        return zzab + zzad(zzcx) + zzcx;
    }

    public static int zza(zzkx zzkxVar) {
        int zzcx = zzkxVar.zzcx();
        return zzad(zzcx) + zzcx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzlq zzlqVar, zzmf zzmfVar) {
        zzit zzitVar = (zzit) zzlqVar;
        int zzbm = zzitVar.zzbm();
        int i = zzbm;
        if (zzbm == -1) {
            i = zzmfVar.zzn(zzitVar);
            zzitVar.zzo(i);
        }
        return zzad(i) + i;
    }

    public static int zzab(int i) {
        return zzad(i << 3);
    }

    public static int zzac(int i) {
        if (i >= 0) {
            return zzad(i);
        }
        return 10;
    }

    public static int zzad(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzae(int i) {
        return zzad(zzai(i));
    }

    public static int zzaf(int i) {
        return 4;
    }

    public static int zzag(int i) {
        return 4;
    }

    public static int zzah(int i) {
        return zzac(i);
    }

    private static int zzai(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzaj(int i) {
        return zzad(i);
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(int i, double d) {
        return zzab(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzab(i) + 4;
    }

    public static int zzb(int i, zzkx zzkxVar) {
        return (zzab(1) << 1) + zzh(2, i) + zza(3, zzkxVar);
    }

    public static int zzb(int i, zzlq zzlqVar) {
        return (zzab(1) << 1) + zzh(2, i) + zzab(3) + zzc(zzlqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzlq zzlqVar, zzmf zzmfVar) {
        return zzab(i) + zza(zzlqVar, zzmfVar);
    }

    public static int zzb(int i, String str) {
        return zzab(i) + zzm(str);
    }

    public static int zzb(zzjc zzjcVar) {
        int size = zzjcVar.size();
        return zzad(size) + size;
    }

    public static zzjr zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzc(int i, zzjc zzjcVar) {
        int zzab = zzab(i);
        int size = zzjcVar.size();
        return zzab + zzad(size) + size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzc(int i, zzlq zzlqVar, zzmf zzmfVar) {
        int zzab = zzab(i);
        zzit zzitVar = (zzit) zzlqVar;
        int zzbm = zzitVar.zzbm();
        int i2 = zzbm;
        if (zzbm == -1) {
            i2 = zzmfVar.zzn(zzitVar);
            zzitVar.zzo(i2);
        }
        return (zzab << 1) + i2;
    }

    public static int zzc(int i, boolean z) {
        return zzab(i) + 1;
    }

    public static int zzc(zzlq zzlqVar) {
        int zzcx = zzlqVar.zzcx();
        return zzad(zzcx) + zzcx;
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        return zzad(length) + length;
    }

    public static int zzd(int i, long j) {
        return zzab(i) + zzp(j);
    }

    public static int zzd(int i, zzjc zzjcVar) {
        return (zzab(1) << 1) + zzh(2, i) + zzc(3, zzjcVar);
    }

    @Deprecated
    public static int zzd(zzlq zzlqVar) {
        return zzlqVar.zzcx();
    }

    public static int zzd(boolean z) {
        return 1;
    }

    public static int zze(int i, long j) {
        return zzab(i) + zzp(j);
    }

    public static int zzf(int i, long j) {
        return zzab(i) + zzp(zzt(j));
    }

    public static int zzg(int i, int i2) {
        return zzab(i) + zzac(i2);
    }

    public static int zzg(int i, long j) {
        return zzab(i) + 8;
    }

    public static int zzh(int i, int i2) {
        return zzab(i) + zzad(i2);
    }

    public static int zzh(int i, long j) {
        return zzab(i) + 8;
    }

    public static int zzi(int i, int i2) {
        return zzab(i) + zzad(zzai(i2));
    }

    public static int zzj(int i, int i2) {
        return zzab(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzab(i) + 4;
    }

    public static int zzl(int i, int i2) {
        return zzab(i) + zzac(i2);
    }

    public static int zzm(String str) {
        int length;
        try {
            length = zznf.zza(str);
        } catch (zznj e) {
            length = str.getBytes(zzkm.UTF_8).length;
        }
        return zzad(length) + length;
    }

    public static int zzo(long j) {
        return zzp(j);
    }

    public static int zzp(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        int i2 = i;
        long j2 = j;
        if (((-2097152) & j) != 0) {
            i2 = i + 2;
            j2 = j >>> 14;
        }
        int i3 = i2;
        if ((j2 & (-16384)) != 0) {
            i3 = i2 + 1;
        }
        return i3;
    }

    public static int zzq(long j) {
        return zzp(zzt(j));
    }

    public static int zzr(long j) {
        return 8;
    }

    public static int zzs(long j) {
        return 8;
    }

    private static long zzt(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public final void zza(double d) throws IOException {
        zzn(Double.doubleToRawLongBits(d));
    }

    public final void zza(float f) throws IOException {
        zzaa(Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zza(int i, float f) throws IOException {
        zzf(i, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzjc zzjcVar) throws IOException;

    public abstract void zza(int i, zzlq zzlqVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzlq zzlqVar, zzmf zzmfVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(zzjc zzjcVar) throws IOException;

    final void zza(String str, zznj zznjVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznjVar);
        byte[] bytes = str.getBytes(zzkm.UTF_8);
        try {
            zzy(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public abstract void zzaa(int i) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzt(j));
    }

    public abstract void zzb(int i, zzjc zzjcVar) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzlq zzlqVar) throws IOException;

    public abstract void zzc(byte b) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public final void zzc(boolean z) throws IOException {
        zzc(z ? (byte) 1 : (byte) 0);
    }

    public abstract int zzca();

    public final void zzcb() {
        if (zzca() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzd(int i, int i2) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzd(byte[] bArr, int i, int i2) throws IOException;

    public final void zze(int i, int i2) throws IOException {
        zzd(i, zzai(i2));
    }

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzl(long j) throws IOException;

    public abstract void zzl(String str) throws IOException;

    public final void zzm(long j) throws IOException {
        zzl(zzt(j));
    }

    public abstract void zzn(long j) throws IOException;

    public abstract void zzx(int i) throws IOException;

    public abstract void zzy(int i) throws IOException;

    public final void zzz(int i) throws IOException {
        zzy(zzai(i));
    }
}
