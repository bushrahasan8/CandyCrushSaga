package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzlw.class */
public final class zzlw implements zzle {
    private final zzlg zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlw(zzlg zzlgVar, String str, Object[] objArr) {
        this.zza = zzlgVar;
        this.zzb = str;
        this.zzc = objArr;
        int charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.zzd = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i3++;
                i2 += 13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final zzlg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final zzlr zzb() {
        int i = this.zzd;
        return (i & 1) != 0 ? zzlr.PROTO2 : (i & 4) == 4 ? zzlr.EDITIONS : zzlr.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
