package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: zziz.class */
public final class zziz extends zzce {

    @Deprecated
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zziy
    };
    private static final String zzl = Integer.toString(1001, 36);
    private static final String zzm = Integer.toString(1002, 36);
    private static final String zzn = Integer.toString(1003, 36);
    private static final String zzo = Integer.toString(1004, 36);
    private static final String zzp = Integer.toString(1005, 36);
    private static final String zzq = Integer.toString(1006, 36);
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzam zzh;
    public final int zzi;
    public final zzur zzj;
    final boolean zzk;

    private zziz(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zziz(int r15, java.lang.Throwable r16, java.lang.String r17, int r18, java.lang.String r19, int r20, com.google.android.gms.internal.ads.zzam r21, int r22, boolean r23) {
        /*
            r14 = this;
            r0 = r15
            if (r0 == 0) goto La4
            r0 = r15
            r1 = 1
            if (r0 == r1) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r17 = r0
            goto La7
        Lf:
            r0 = r21
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r25 = r0
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            r24 = r0
            r0 = r22
            if (r0 == 0) goto L58
            r0 = r22
            r1 = 1
            if (r0 == r1) goto L52
            r0 = r22
            r1 = 2
            if (r0 == r1) goto L4c
            r0 = r22
            r1 = 3
            if (r0 == r1) goto L46
            r0 = r22
            r1 = 4
            if (r0 != r1) goto L3e
            java.lang.String r0 = "YES"
            r17 = r0
            goto L5b
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L46:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            r17 = r0
            goto L5b
        L4c:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            r17 = r0
            goto L5b
        L52:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            r17 = r0
            goto L5b
        L58:
            java.lang.String r0 = "NO"
            r17 = r0
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r26 = r0
            r0 = r26
            r1 = r19
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            java.lang.String r1 = " error, index="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            r1 = r20
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            java.lang.String r1 = ", format="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            r1 = r25
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            java.lang.String r1 = ", format_supported="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r26
            java.lang.String r0 = r0.toString()
            r17 = r0
            goto La7
        La4:
            java.lang.String r0 = "Source error"
            r17 = r0
        La7:
            r0 = r17
            r25 = r0
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb9
            r0 = r17
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
            r25 = r0
        Lb9:
            r0 = r14
            r1 = r25
            r2 = r16
            r3 = r18
            r4 = r15
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r11 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziz.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzam, int, boolean):void");
    }

    private zziz(String str, Throwable th, int i, int i2, String str2, int i3, zzam zzamVar, int i4, zzur zzurVar, long j, boolean z) {
        super(str, th, i, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzek.zzd(z2);
        zzek.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzamVar;
        this.zzi = i4;
        this.zzj = zzurVar;
        this.zzk = z;
    }

    public static zziz zzb(Throwable th, String str, int i, zzam zzamVar, int i2, boolean z, int i3) {
        if (zzamVar == null) {
            i2 = 4;
        }
        return new zziz(1, th, null, i3, str, i, zzamVar, i2, z);
    }

    public static zziz zzc(IOException iOException, int i) {
        return new zziz(0, iOException, i);
    }

    public static zziz zzd(RuntimeException runtimeException, int i) {
        return new zziz(2, runtimeException, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zziz zza(zzur zzurVar) {
        String message = getMessage();
        int i = zzfy.zza;
        return new zziz(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzurVar, this.zzc, this.zzk);
    }
}
