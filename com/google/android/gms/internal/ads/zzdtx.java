package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: zzdtx.class */
public final class zzdtx {
    private final Map zza = new HashMap();

    public final zzdtw zza(String str) {
        zzdtw zzdtwVar;
        synchronized (this) {
            zzdtwVar = (zzdtw) this.zza.get(str);
        }
        return zzdtwVar;
    }

    public final zzdtw zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdtw zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbvg zzbvgVar;
        zzdtw zza = zza(str);
        return (zza == null || (zzbvgVar = zza.zzb) == null) ? "" : zzbvgVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.lang.String r7, com.google.android.gms.internal.ads.zzfif r8) {
        /*
            r6 = this;
            r0 = r6
            monitor-enter(r0)
            r0 = r6
            java.util.Map r0 = r0.zza     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L2f
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L14
            r0 = r6
            monitor-exit(r0)
            return
        L14:
            com.google.android.gms.internal.ads.zzdtw r0 = new com.google.android.gms.internal.ads.zzdtw     // Catch: java.lang.Throwable -> L2f
            r14 = r0
            r0 = 0
            r12 = r0
            r0 = r8
            if (r0 != 0) goto L26
        L20:
            r0 = 0
            r11 = r0
            goto L33
        L26:
            r0 = r8
            com.google.android.gms.internal.ads.zzbvg r0 = r0.zze()     // Catch: java.lang.Throwable -> L2f com.google.android.gms.internal.ads.zzfho -> L90
            r11 = r0
            goto L33
        L2f:
            r7 = move-exception
            goto L8c
        L33:
            r0 = r8
            if (r0 != 0) goto L3a
            goto L44
        L3a:
            r0 = r8
            com.google.android.gms.internal.ads.zzbvg r0 = r0.zzf()     // Catch: java.lang.Throwable -> L2f com.google.android.gms.internal.ads.zzfho -> L95
            r13 = r0
            r0 = r13
            r12 = r0
        L44:
            com.google.android.gms.internal.ads.zzbfu r0 = com.google.android.gms.internal.ads.zzbgc.zzjk     // Catch: java.lang.Throwable -> L2f
            r13 = r0
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L2f
            r1 = r13
            java.lang.Object r0 = r0.zza(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r10 = r0
            r0 = 1
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L63
            goto L71
        L63:
            r0 = r8
            if (r0 != 0) goto L6c
        L67:
            r0 = 0
            r9 = r0
            goto L71
        L6c:
            r0 = r8
            boolean r0 = r0.zzC()     // Catch: java.lang.Throwable -> L2f com.google.android.gms.internal.ads.zzfho -> L9a
        L71:
            r0 = r14
            r1 = r7
            r2 = r11
            r3 = r12
            r4 = r9
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2f
            r0 = r6
            java.util.Map r0 = r0.zza     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            r2 = r14
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r0 = r6
            monitor-exit(r0)
            return
        L8c:
            r0 = r6
            monitor-exit(r0)
            r0 = r7
            throw r0
        L90:
            r11 = move-exception
            goto L20
        L95:
            r13 = move-exception
            goto L44
        L9a:
            r8 = move-exception
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtx.zzd(java.lang.String, com.google.android.gms.internal.ads.zzfif):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(String str, zzbus zzbusVar) {
        synchronized (this) {
            if (this.zza.containsKey(str)) {
                return;
            }
            try {
                this.zza.put(str, new zzdtw(str, zzbusVar.zzf(), zzbusVar.zzg(), true));
            } catch (Throwable th) {
            }
        }
    }
}
