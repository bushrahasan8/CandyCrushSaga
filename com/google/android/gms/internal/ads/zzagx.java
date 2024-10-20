package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzagx.class */
public final class zzagx extends zzagr {
    public static final Parcelable.Creator<zzagx> CREATOR = new zzagw();
    public final String zza;
    public final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagx(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.createByteArray();
    }

    public zzagx(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagx.class != obj.getClass()) {
            return false;
        }
        zzagx zzagxVar = (zzagx) obj;
        return zzfy.zzF(this.zza, zzagxVar.zza) && Arrays.equals(this.zzb, zzagxVar.zzb);
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }
}
