package com.google.android.gms.internal.measurement;

/* loaded from: zznf.class */
abstract class zznf {
    abstract int zza(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zza(byte[] bArr, int i, int i2) throws zzkb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
