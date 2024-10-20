package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: zzja.class */
public abstract class zzja extends zzig {
    private static final Logger zzb = Logger.getLogger(zzja.class.getName());
    private static final boolean zzc = zzmz.zzc();
    zzjc zza;

    /* loaded from: zzja$zza.class */
    public static final class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* loaded from: zzja$zzb.class */
    private static final class zzb extends zzja {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i2;
        }

        private final void zzc(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zze, i2);
                this.zze += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                this.zze = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzig
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzb(int i, zzlg zzlgVar) throws IOException {
            zzj(1, 3);
            zzk(2, i);
            zzj(3, 2);
            zzc(zzlgVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzb(int i, String str) throws IOException {
            zzj(i, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzb(int i, boolean z) throws IOException {
            zzj(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzb(zzij zzijVar) throws IOException {
            zzk(zzijVar.zzb());
            zzijVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzb(String str) throws IOException {
            int i = this.zze;
            try {
                int zzg = zzja.zzg(str.length() * 3);
                int zzg2 = zzja.zzg(str.length());
                if (zzg2 != zzg) {
                    zzk(zznd.zza(str));
                    this.zze = zznd.zza(str, this.zzb, this.zze, zza());
                    return;
                }
                int i2 = i + zzg2;
                this.zze = i2;
                int zza = zznd.zza(str, this.zzb, i2, zza());
                this.zze = i;
                zzk((zza - i) - zzg2);
                this.zze = zza;
            } catch (zznh e) {
                this.zze = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzb(byte[] bArr, int i, int i2) throws IOException {
            zzk(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzc(int i, zzij zzijVar) throws IOException {
            zzj(i, 2);
            zzb(zzijVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        final void zzc(int i, zzlg zzlgVar, zzly zzlyVar) throws IOException {
            zzj(i, 2);
            zzk(((zzhz) zzlgVar).zza(zzlyVar));
            zzlyVar.zza((zzly) zzlgVar, (zznt) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzc(zzlg zzlgVar) throws IOException {
            zzk(zzlgVar.zzbw());
            zzlgVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzd(int i, zzij zzijVar) throws IOException {
            zzj(1, 3);
            zzk(2, i);
            zzc(3, zzijVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzf(int i, long j) throws IOException {
            zzj(i, 1);
            zzf(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzf(long j) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i2 = i + 1;
                this.zze = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.zze = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.zze = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.zze = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.zze = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.zze = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.zze = i8;
                bArr[i7] = (byte) (j >> 48);
                this.zze = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzg(int i, int i2) throws IOException {
            zzj(i, 5);
            zzh(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzh(int i) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zze;
                int i3 = i2 + 1;
                this.zze = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.zze = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.zze = i5;
                bArr[i4] = (byte) (i >> 16);
                this.zze = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzh(int i, int i2) throws IOException {
            zzj(i, 0);
            zzi(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzh(int i, long j) throws IOException {
            zzj(i, 0);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzh(long j) throws IOException {
            long j2 = j;
            if (zzja.zzc) {
                j2 = j;
                if (zza() >= 10) {
                    while ((j & (-128)) != 0) {
                        byte[] bArr = this.zzb;
                        int i = this.zze;
                        this.zze = i + 1;
                        zzmz.zza(bArr, i, (byte) (((int) j) | 128));
                        j >>>= 7;
                    }
                    byte[] bArr2 = this.zzb;
                    int i2 = this.zze;
                    this.zze = 1 + i2;
                    zzmz.zza(bArr2, i2, (byte) j);
                    return;
                }
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zze;
                    this.zze = i3 + 1;
                    bArr3[i3] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zze;
            this.zze = i4 + 1;
            bArr4[i4] = (byte) j2;
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzi(int i) throws IOException {
            if (i >= 0) {
                zzk(i);
            } else {
                zzh(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzj(int i, int i2) throws IOException {
            zzk((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzk(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zze;
                    this.zze = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zze;
            this.zze = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzja
        public final void zzk(int i, int i2) throws IOException {
            zzj(i, 0);
            zzk(i2);
        }
    }

    private zzja() {
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zza(int i) {
        return zze(i);
    }

    public static int zza(int i, double d) {
        return zzg(i << 3) + 8;
    }

    public static int zza(int i, float f) {
        return zzg(i << 3) + 4;
    }

    public static int zza(int i, int i2) {
        return zzg(i << 3) + zze(i2);
    }

    public static int zza(int i, long j) {
        return zzg(i << 3) + 8;
    }

    public static int zza(int i, zzij zzijVar) {
        int zzg = zzg(i << 3);
        int zzb2 = zzijVar.zzb();
        return zzg + zzg(zzb2) + zzb2;
    }

    public static int zza(int i, zzkk zzkkVar) {
        return (zzg(8) << 1) + zzf(2, i) + zzb(3, zzkkVar);
    }

    public static int zza(int i, zzlg zzlgVar) {
        return (zzg(8) << 1) + zzf(2, i) + zzg(24) + zzb(zzlgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zza(int i, zzlg zzlgVar, zzly zzlyVar) {
        return (zzg(i << 3) << 1) + ((zzhz) zzlgVar).zza(zzlyVar);
    }

    public static int zza(int i, String str) {
        return zzg(i << 3) + zza(str);
    }

    public static int zza(int i, boolean z) {
        return zzg(i << 3) + 1;
    }

    public static int zza(long j) {
        return 8;
    }

    public static int zza(zzij zzijVar) {
        int zzb2 = zzijVar.zzb();
        return zzg(zzb2) + zzb2;
    }

    public static int zza(zzkk zzkkVar) {
        int zzb2 = zzkkVar.zzb();
        return zzg(zzb2) + zzb2;
    }

    @Deprecated
    public static int zza(zzlg zzlgVar) {
        return zzlgVar.zzbw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzlg zzlgVar, zzly zzlyVar) {
        int zza2 = ((zzhz) zzlgVar).zza(zzlyVar);
        return zzg(zza2) + zza2;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zznd.zza(str);
        } catch (zznh e) {
            length = str.getBytes(zzjw.zza).length;
        }
        return zzg(length) + length;
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(int i) {
        return 4;
    }

    public static int zzb(int i, int i2) {
        return zzg(i << 3) + 4;
    }

    public static int zzb(int i, long j) {
        return zzg(i << 3) + zze(j);
    }

    public static int zzb(int i, zzij zzijVar) {
        return (zzg(8) << 1) + zzf(2, i) + zza(3, zzijVar);
    }

    public static int zzb(int i, zzkk zzkkVar) {
        int zzg = zzg(i << 3);
        int zzb2 = zzkkVar.zzb();
        return zzg + zzg(zzb2) + zzb2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzlg zzlgVar, zzly zzlyVar) {
        return zzg(i << 3) + zza(zzlgVar, zzlyVar);
    }

    public static int zzb(long j) {
        return zze(j);
    }

    public static int zzb(zzlg zzlgVar) {
        int zzbw = zzlgVar.zzbw();
        return zzg(zzbw) + zzbw;
    }

    public static zzja zzb(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public static int zzc(int i) {
        return zze(i);
    }

    public static int zzc(int i, int i2) {
        return zzg(i << 3) + zze(i2);
    }

    public static int zzc(int i, long j) {
        return zzg(i << 3) + 8;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i) {
        return 4;
    }

    public static int zzd(int i, int i2) {
        return zzg(i << 3) + 4;
    }

    public static int zzd(int i, long j) {
        return zzg(i << 3) + zze(zzi(j));
    }

    public static int zzd(long j) {
        return zze(zzi(j));
    }

    public static int zze(int i) {
        return zzg(zzl(i));
    }

    public static int zze(int i, int i2) {
        return zzg(i << 3) + zzg(zzl(i2));
    }

    public static int zze(int i, long j) {
        return zzg(i << 3) + zze(j);
    }

    public static int zze(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzf(int i) {
        return zzg(i << 3);
    }

    public static int zzf(int i, int i2) {
        return zzg(i << 3) + zzg(i2);
    }

    public static int zzg(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    private static int zzl(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b) throws IOException;

    final void zza(String str, zznh zznhVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznhVar);
        byte[] bytes = str.getBytes(zzjw.zza);
        try {
            zzk(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zza(e);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(double d) throws IOException {
        zzf(Double.doubleToRawLongBits(d));
    }

    public final void zzb(float f) throws IOException {
        zzh(Float.floatToRawIntBits(f));
    }

    public final void zzb(int i, double d) throws IOException {
        zzf(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, float f) throws IOException {
        zzg(i, Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int i, zzlg zzlgVar) throws IOException;

    public abstract void zzb(int i, String str) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(zzij zzijVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    public final void zzb(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzc(int i, zzij zzijVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(int i, zzlg zzlgVar, zzly zzlyVar) throws IOException;

    public abstract void zzc(zzlg zzlgVar) throws IOException;

    public abstract void zzd(int i, zzij zzijVar) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzf(long j) throws IOException;

    public abstract void zzg(int i, int i2) throws IOException;

    public final void zzg(int i, long j) throws IOException {
        zzh(i, zzi(j));
    }

    public final void zzg(long j) throws IOException {
        zzh(zzi(j));
    }

    public abstract void zzh(int i) throws IOException;

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzh(long j) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public final void zzi(int i, int i2) throws IOException {
        zzk(i, zzl(i2));
    }

    public final void zzj(int i) throws IOException {
        zzk(zzl(i));
    }

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzk(int i, int i2) throws IOException;
}
