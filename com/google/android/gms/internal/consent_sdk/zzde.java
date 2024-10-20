package com.google.android.gms.internal.consent_sdk;

import com.onetrust.otpublishers.headless.Public.Keys.OTGppKeys;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABCCPAKeys;
import com.onetrust.otpublishers.headless.Public.Keys.OTIABTCFKeys;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: zzde.class */
public abstract class zzde extends zzda implements Set {
    private transient zzdd zza;

    static int zzf(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzde zzi() {
        return zzdh.zza;
    }

    public static zzde zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, OTIABTCFKeys.IABTCF_TCSTRING, OTGppKeys.IAB_GPP_HDR_GPP_STRING, OTGppKeys.IAB_GPP_GPP_SID, OTIABCCPAKeys.OT_IAB_US_PRIVACY_STRING);
    }

    private static zzde zzl(int i, Object... objArr) {
        int i2;
        int i3;
        if (i == 0) {
            return zzdh.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdi(obj);
        }
        int zzf = zzf(i);
        Object[] objArr2 = new Object[zzf];
        int i4 = zzf - 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i5 >= i) {
                Arrays.fill(objArr, i8, i, (Object) null);
                if (i8 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new zzdi(obj2);
                }
                if (zzf(i8) < zzf / 2) {
                    return zzl(i8, objArr);
                }
                Object[] objArr3 = objArr;
                if (i8 < 3) {
                    objArr3 = Arrays.copyOf(objArr, i8);
                }
                return new zzdh(objArr3, i6, objArr2, i4, i8);
            }
            Object obj3 = objArr[i5];
            if (obj3 == null) {
                throw new NullPointerException("at index " + i5);
            }
            int hashCode = obj3.hashCode();
            int zza = zzcz.zza(hashCode);
            while (true) {
                int i9 = zza & i4;
                Object obj4 = objArr2[i9];
                if (obj4 == null) {
                    objArr[i8] = obj3;
                    objArr2[i9] = obj3;
                    i2 = i6 + hashCode;
                    i3 = i8 + 1;
                    break;
                }
                i2 = i6;
                i3 = i8;
                if (!obj4.equals(obj3)) {
                    zza++;
                }
            }
            i5++;
            i6 = i2;
            i7 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (containsAll(r0) == false) goto L27;
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
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof com.google.android.gms.internal.consent_sdk.zzde
            if (r0 == 0) goto L31
            r0 = r3
            boolean r0 = r0.zzk()
            if (r0 == 0) goto L31
            r0 = r4
            com.google.android.gms.internal.consent_sdk.zzde r0 = (com.google.android.gms.internal.consent_sdk.zzde) r0
            boolean r0 = r0.zzk()
            if (r0 == 0) goto L31
            r0 = r3
            int r0 = r0.hashCode()
            r1 = r4
            int r1 = r1.hashCode()
            if (r0 != r1) goto L2f
            goto L31
        L2f:
            r0 = 0
            return r0
        L31:
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L39
            goto L62
        L39:
            r0 = r4
            boolean r0 = r0 instanceof java.util.Set
            if (r0 == 0) goto L60
            r0 = r4
            java.util.Set r0 = (java.util.Set) r0
            r4 = r0
            r0 = r3
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L64
            r1 = r4
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L60
            r0 = r3
            r1 = r4
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L64
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L62
        L60:
            r0 = 0
            r5 = r0
        L62:
            r0 = r5
            return r0
        L64:
            r4 = move-exception
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzde.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Object next = it.next();
            i = i2 + (next != null ? next.hashCode() : 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdj iterator();

    public final zzdd zzg() {
        zzdd zzddVar = this.zza;
        zzdd zzddVar2 = zzddVar;
        if (zzddVar == null) {
            zzddVar2 = zzh();
            this.zza = zzddVar2;
        }
        return zzddVar2;
    }

    zzdd zzh() {
        Object[] array = toArray();
        int i = zzdd.zzd;
        return zzdd.zzg(array, array.length);
    }

    boolean zzk() {
        return false;
    }
}
