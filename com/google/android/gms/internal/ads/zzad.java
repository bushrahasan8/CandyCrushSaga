package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: zzad.class */
public final class zzad implements Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzac();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public zzad(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzcb.zze(str2);
        this.zzd = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzad zzadVar = (zzad) obj;
        return zzfy.zzF(this.zzb, zzadVar.zzb) && zzfy.zzF(this.zzc, zzadVar.zzc) && zzfy.zzF(this.zza, zzadVar.zza) && Arrays.equals(this.zzd, zzadVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        int i2 = i;
        if (i == 0) {
            int hashCode = this.zza.hashCode();
            String str = this.zzb;
            i2 = (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
            this.zze = i2;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
