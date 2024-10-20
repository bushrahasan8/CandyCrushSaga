package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: zzaqt.class */
final class zzaqt {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzaqt(java.lang.String r14, com.google.android.gms.internal.ads.zzapj r15) {
        /*
            r13 = this;
            r0 = r15
            java.lang.String r0 = r0.zzb
            r25 = r0
            r0 = r15
            long r0 = r0.zzc
            r20 = r0
            r0 = r15
            long r0 = r0.zzd
            r22 = r0
            r0 = r15
            long r0 = r0.zze
            r18 = r0
            r0 = r15
            long r0 = r0.zzf
            r16 = r0
            r0 = r15
            java.util.List r0 = r0.zzh
            r24 = r0
            r0 = r24
            if (r0 == 0) goto L2e
            r0 = r24
            r15 = r0
        L2b:
            goto L8b
        L2e:
            r0 = r15
            java.util.Map r0 = r0.zzg
            r15 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r15
            int r2 = r2.size()
            r1.<init>(r2)
            r24 = r0
            r0 = r15
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r26 = r0
        L4f:
            r0 = r24
            r15 = r0
            r0 = r26
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2b
            r0 = r26
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r15 = r0
            r0 = r24
            com.google.android.gms.internal.ads.zzaps r1 = new com.google.android.gms.internal.ads.zzaps
            r2 = r1
            r3 = r15
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r4 = r15
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto L4f
        L8b:
            r0 = r13
            r1 = r14
            r2 = r25
            r3 = r20
            r4 = r22
            r5 = r18
            r6 = r16
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqt.<init>(java.lang.String, com.google.android.gms.internal.ads.zzapj):void");
    }

    private zzaqt(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    public static zzaqt zza(zzaqu zzaquVar) throws IOException {
        if (zzaqw.zze(zzaquVar) != 538247942) {
            throw new IOException();
        }
        String zzh = zzaqw.zzh(zzaquVar);
        String zzh2 = zzaqw.zzh(zzaquVar);
        long zzf = zzaqw.zzf(zzaquVar);
        long zzf2 = zzaqw.zzf(zzaquVar);
        long zzf3 = zzaqw.zzf(zzaquVar);
        long zzf4 = zzaqw.zzf(zzaquVar);
        int zze = zzaqw.zze(zzaquVar);
        if (zze < 0) {
            throw new IOException("readHeaderList size=" + zze);
        }
        ArrayList emptyList = zze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < zze; i++) {
            emptyList.add(new zzaps(zzaqw.zzh(zzaquVar).intern(), zzaqw.zzh(zzaquVar).intern()));
        }
        return new zzaqt(zzh, zzh2, zzf, zzf2, zzf3, zzf4, emptyList);
    }
}
