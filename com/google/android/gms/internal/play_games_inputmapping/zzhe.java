package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Arrays;

/* loaded from: zzhe.class */
public final class zzhe {
    private static final zzhe zza = new zzhe(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;

    private zzhe() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhe(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
    }

    public static zzhe zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhe zzb(zzhe zzheVar, zzhe zzheVar2) {
        int i = zzheVar.zzb;
        int i2 = zzheVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzheVar.zzc, 0);
        System.arraycopy(zzheVar2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzheVar.zzd, 0);
        System.arraycopy(zzheVar2.zzd, 0, copyOf2, 0, 0);
        return new zzhe(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhe)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zzc() {
        int i = this.zze;
        int i2 = i;
        if (i == -1) {
            i2 = 0;
            this.zze = 0;
        }
        return i2;
    }

    public final int zzd() {
        int i = this.zze;
        int i2 = i;
        if (i == -1) {
            i2 = 0;
            this.zze = 0;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(StringBuilder sb, int i) {
    }
}
