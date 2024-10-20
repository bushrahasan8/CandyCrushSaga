package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzagc.class */
public final class zzagc extends zzagr {
    public static final Parcelable.Creator<zzagc> CREATOR = new zzagb();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagc(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public zzagc(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagc.class != obj.getClass()) {
            return false;
        }
        zzagc zzagcVar = (zzagc) obj;
        return this.zzc == zzagcVar.zzc && zzfy.zzF(this.zza, zzagcVar.zza) && zzfy.zzF(this.zzb, zzagcVar.zzb) && Arrays.equals(this.zzd, zzagcVar.zzd);
    }

    public final int hashCode() {
        String str = this.zza;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.zzc;
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((i2 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode) * 31) + i) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagr, com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzd, this.zzc);
    }
}
