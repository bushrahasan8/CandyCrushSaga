package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: zzaga.class */
public final class zzaga implements zzbx {
    public static final Parcelable.Creator<zzaga> CREATOR = new zzafz();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzaga(int i, String str, String str2, String str3, boolean z, int i2) {
        zzek.zzd(i2 != -1 ? i2 > 0 : true);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaga(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i = zzfy.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaga.class != obj.getClass()) {
            return false;
        }
        zzaga zzagaVar = (zzaga) obj;
        return this.zza == zzagaVar.zza && zzfy.zzF(this.zzb, zzagaVar.zzb) && zzfy.zzF(this.zzc, zzagaVar.zzc) && zzfy.zzF(this.zzd, zzagaVar.zzd) && this.zze == zzagaVar.zze && this.zzf == zzagaVar.zzf;
    }

    public final int hashCode() {
        String str = this.zzb;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i2 = this.zza;
        String str2 = this.zzc;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.zzd;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((((i2 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode) * 31) + hashCode2) * 31) + i) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i2 = zzfy.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        String str = this.zzc;
        if (str != null) {
            zzbtVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbtVar.zzi(str2);
        }
    }
}
