package com.google.android.gms.internal.play_games_inputmapping;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: zzax.class */
public final class zzax {
    private static final long zza;
    private static final zzax zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        zza = j;
        zzb = new zzax(0, -1, -1);
    }

    private zzax(int i, int i2, int i3) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }

    public static zzax zza() {
        return zzb;
    }

    public static zzax zzb(String str, int i, int i2, boolean z) throws zzdp {
        if (i == i2 && !z) {
            return zzb;
        }
        int i3 = true != z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '0') {
                if (charAt > '9') {
                    throw zzdp.zzb("invalid flag", str, i);
                }
                int i5 = charAt - '0';
                while (i4 != i2) {
                    int i6 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == '.') {
                        return new zzax(i3, i5, zzn(str, i6, i2));
                    }
                    char c = (char) (charAt2 - '0');
                    if (c >= '\n') {
                        throw zzdp.zzb("invalid width character", str, i4);
                    }
                    i5 = (i5 * 10) + c;
                    if (i5 > 999999) {
                        throw zzdp.zza("width too large", str, i, i2);
                    }
                    i4 = i6;
                }
                return new zzax(i3, i5, -1);
            }
            int zzm = zzm(charAt);
            if (zzm < 0) {
                if (charAt == '.') {
                    return new zzax(i3, -1, zzn(str, i4, i2));
                }
                throw zzdp.zzb("invalid flag", str, i);
            }
            int i7 = 1 << zzm;
            if ((i3 & i7) != 0) {
                throw zzdp.zzb("repeated flag", str, i);
            }
            i3 |= i7;
            i = i4;
        }
        return new zzax(i3, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(String str, boolean z) {
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int zzm = zzm(str.charAt(i2));
            if (zzm < 0) {
                throw new IllegalArgumentException(str.length() != 0 ? "invalid flags: ".concat(str) : new String("invalid flags: "));
            }
            i |= 1 << zzm;
        }
        return i;
    }

    private static int zzm(char c) {
        return ((int) ((zza >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    private static int zzn(String str, int i, int i2) throws zzdp {
        if (i == i2) {
            throw zzdp.zzb("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= '\n') {
                throw zzdp.zzb("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw zzdp.zza("precision too large", str, i, i2);
            }
        }
        if (i3 == 0) {
            if (i2 != i + 1) {
                throw zzdp.zza("invalid precision", str, i, i2);
            }
            i3 = 0;
        }
        return i3;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        return zzaxVar.zzc == this.zzc && zzaxVar.zzd == this.zzd && zzaxVar.zze == this.zze;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    public final zzax zzd(int i, boolean z, boolean z2) {
        if (zze()) {
            return this;
        }
        int i2 = this.zzc;
        int i3 = i2 & 128;
        return i3 != 0 ? (i3 == i2 && this.zzd == -1 && this.zze == -1) ? this : new zzax(i3, -1, -1) : zzb;
    }

    public final boolean zze() {
        return this == zzb;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r0 == (-1)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzh(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.zze()
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = r3
            int r0 = r0.zzc
            r6 = r0
            r0 = r4
            r1 = -1
            r0 = r0 ^ r1
            r1 = r6
            r0 = r0 & r1
            if (r0 == 0) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = r5
            if (r0 != 0) goto L30
            r0 = r3
            int r0 = r0.zze
            r1 = -1
            if (r0 != r1) goto L2e
            goto L30
        L2e:
            r0 = 0
            return r0
        L30:
            r0 = r3
            int r0 = r0.zzd
            r4 = r0
            r0 = r6
            r1 = 9
            r0 = r0 & r1
            r1 = 9
            if (r0 != r1) goto L43
        L3e:
            r0 = 0
            r5 = r0
            goto L63
        L43:
            r0 = r6
            r1 = 96
            r0 = r0 & r1
            r6 = r0
            r0 = r6
            r1 = 96
            if (r0 != r1) goto L51
            goto L3e
        L51:
            r0 = r7
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L63
            r0 = r7
            r5 = r0
            r0 = r4
            r1 = -1
            if (r0 != r1) goto L63
            goto L3e
        L63:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_games_inputmapping.zzax.zzh(int, boolean):boolean");
    }

    public final boolean zzi(zzaw zzawVar) {
        return zzh(zzawVar.zzd(), zzawVar.zzc().zza());
    }

    public final int zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        return (this.zzc & 128) != 0;
    }

    public final StringBuilder zzl(StringBuilder sb) {
        if (!zze()) {
            int i = this.zzc & (-129);
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i4 = this.zzd;
            if (i4 != -1) {
                sb.append(i4);
            }
            if (this.zze != -1) {
                sb.append('.');
                sb.append(this.zze);
            }
        }
        return sb;
    }
}
