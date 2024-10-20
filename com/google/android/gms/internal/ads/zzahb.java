package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzahb.class */
public final class zzahb extends zzagr {
    public static final Parcelable.Creator<zzahb> CREATOR = new zzaha();
    public final String zza;
    public final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzahb(android.os.Parcel r4) {
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
            java.lang.String r1 = r1.readString()
            r0.zza = r1
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.readString()
            r0.zzb = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahb.<init>(android.os.Parcel):void");
    }

    public zzahb(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahb.class != obj.getClass()) {
            return false;
        }
        zzahb zzahbVar = (zzahb) obj;
        return this.zzf.equals(zzahbVar.zzf) && zzfy.zzF(this.zza, zzahbVar.zza) && zzfy.zzF(this.zzb, zzahbVar.zzb);
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode();
        String str = this.zza;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode2) * 31) + i;
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }
}
