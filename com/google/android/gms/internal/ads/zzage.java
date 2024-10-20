package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzage.class */
public final class zzage extends zzagr {
    public static final Parcelable.Creator<zzage> CREATOR = new zzagd();
    public final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzage(android.os.Parcel r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.readString()
            r6 = r0
            int r0 = com.google.android.gms.internal.ads.zzfy.zza
            r5 = r0
            r0 = r3
            r1 = r6
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            byte[] r1 = r1.createByteArray()
            r0.zza = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzage.<init>(android.os.Parcel):void");
    }

    public zzage(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzage.class != obj.getClass()) {
            return false;
        }
        zzage zzageVar = (zzage) obj;
        return this.zzf.equals(zzageVar.zzf) && Arrays.equals(this.zza, zzageVar.zza);
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }
}
