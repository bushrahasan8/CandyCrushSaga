package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* loaded from: zzam.class */
public abstract class zzam extends zzaf implements Set {
    private transient zzai zza;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (containsAll(r0) == false) goto L15;
     */
    @Override // java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L40
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L13
            r0 = r6
            r5 = r0
            goto L40
        L13:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L3e
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L42
            r1 = r4
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L42
            if (r0 != r1) goto L3e
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L42
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L40
        L3e:
            r0 = 0
            r5 = r0
        L40:
            r0 = r5
            return r0
        L42:
            r4 = move-exception
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzam.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzau.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public zzai zzd() {
        zzai zzaiVar = this.zza;
        zzai zzaiVar2 = zzaiVar;
        if (zzaiVar == null) {
            zzaiVar2 = zzh();
            this.zza = zzaiVar2;
        }
        return zzaiVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzav iterator();

    zzai zzh() {
        Object[] array = toArray();
        int i = zzai.zzd;
        return zzai.zzi(array, array.length);
    }
}
