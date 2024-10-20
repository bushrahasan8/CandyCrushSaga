package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzgc.class */
public final class zzgc implements zzbx {
    public static final Parcelable.Creator<zzgc> CREATOR = new zzga();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgc(Parcel parcel, zzgb zzgbVar) {
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    public zzgc(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzgc.class != obj.getClass()) {
            return false;
        }
        zzgc zzgcVar = (zzgc) obj;
        return this.zza.equals(zzgcVar.zza) && Arrays.equals(this.zzb, zzgcVar.zzb) && this.zzc == zzgcVar.zzc && this.zzd == zzgcVar.zzd;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String zzz;
        int i = this.zzd;
        if (i != 1) {
            if (i == 23) {
                byte[] bArr = this.zzb;
                int i2 = zzfy.zza;
                zzek.zzd(bArr.length == 4);
                zzz = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            } else if (i != 67) {
                byte[] bArr2 = this.zzb;
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    sb.append(Character.forDigit((bArr2[i3] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr2[i3] & 15, 16));
                }
                zzz = sb.toString();
            } else {
                byte[] bArr3 = this.zzb;
                int i4 = zzfy.zza;
                zzek.zzd(bArr3.length == 4);
                zzz = String.valueOf((bArr3[1] << 16) | (bArr3[0] << 24) | (bArr3[2] << 8) | bArr3[3]);
            }
        } else {
            zzz = zzfy.zzz(this.zzb);
        }
        return "mdta: key=" + this.zza + ", value=" + zzz;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
