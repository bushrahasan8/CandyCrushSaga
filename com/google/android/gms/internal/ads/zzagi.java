package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: zzagi.class */
public final class zzagi extends zzagr {
    public static final Parcelable.Creator<zzagi> CREATOR = new zzagh();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagr[] zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagi(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzfy.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.zze = new zzagr[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzagr) parcel.readParcelable(zzagr.class.getClassLoader());
        }
    }

    public zzagi(String str, boolean z, boolean z2, String[] strArr, zzagr[] zzagrVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzagrVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagi.class != obj.getClass()) {
            return false;
        }
        zzagi zzagiVar = (zzagi) obj;
        return this.zzb == zzagiVar.zzb && this.zzc == zzagiVar.zzc && zzfy.zzF(this.zza, zzagiVar.zza) && Arrays.equals(this.zzd, zzagiVar.zzd) && Arrays.equals(this.zze, zzagiVar.zze);
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagr zzagrVar : this.zze) {
            parcel.writeParcelable(zzagrVar, 0);
        }
    }
}
