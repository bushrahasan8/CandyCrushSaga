package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: zzmt.class */
abstract class zzmt<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(T t);

    abstract B zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzij zzijVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zznt zzntVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzlv zzlvVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzlv zzlvVar) throws IOException {
        int zzd = zzlvVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzb(b, i, zzlvVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zza((zzmt<T, B>) b, i, zzlvVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zza((zzmt<T, B>) b, i, zzlvVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzkb.zza();
            }
            zza((zzmt<T, B>) b, i, zzlvVar.zzf());
            return true;
        }
        B zza = zza();
        while (zzlvVar.zzc() != Integer.MAX_VALUE && zza((zzmt<T, B>) zza, zzlvVar)) {
        }
        if ((4 | (i << 3)) != zzlvVar.zzd()) {
            throw zzkb.zzb();
        }
        zza((zzmt<T, B>) b, i, (int) zze(zza));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(T t, zznt zzntVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzd(Object obj);

    abstract T zze(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj);
}
