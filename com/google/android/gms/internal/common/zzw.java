package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzw.class */
public abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzw(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z;
        zzoVar = zzxVar.zza;
        this.zzc = zzoVar;
        z = zzxVar.zzb;
        this.zzd = z;
        this.zzf = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r0 = r4.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r0 != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r0 = r4.zzb.length();
        r4.zze = -1;
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r0 <= r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r4.zzb.charAt(r0 - 1);
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        r8 = r4.zzb.subSequence(r6, r5).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        r4.zzf = r0 - 1;
     */
    @Override // com.google.android.gms.internal.common.zzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.common.zzw.zza():java.lang.Object");
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
