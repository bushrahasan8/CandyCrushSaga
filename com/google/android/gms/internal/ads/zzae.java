package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: zzae.class */
public final class zzae implements Comparator<zzad>, Parcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzab();
    public final String zza;
    public final int zzb;
    private final zzad[] zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(Parcel parcel) {
        this.zza = parcel.readString();
        zzad[] zzadVarArr = (zzad[]) parcel.createTypedArray(zzad.CREATOR);
        int i = zzfy.zza;
        this.zzc = zzadVarArr;
        this.zzb = zzadVarArr.length;
    }

    private zzae(String str, boolean z, zzad... zzadVarArr) {
        this.zza = str;
        zzad[] zzadVarArr2 = z ? (zzad[]) zzadVarArr.clone() : zzadVarArr;
        this.zzc = zzadVarArr2;
        this.zzb = zzadVarArr2.length;
        Arrays.sort(zzadVarArr2, this);
    }

    public zzae(String str, zzad... zzadVarArr) {
        this(null, true, zzadVarArr);
    }

    public zzae(List list) {
        this(null, false, (zzad[]) list.toArray(new zzad[0]));
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzad zzadVar, zzad zzadVar2) {
        int compareTo;
        zzad zzadVar3 = zzadVar;
        zzad zzadVar4 = zzadVar2;
        UUID uuid = zzo.zza;
        if (!uuid.equals(zzadVar3.zza)) {
            compareTo = zzadVar3.zza.compareTo(zzadVar4.zza);
        } else {
            if (uuid.equals(zzadVar4.zza)) {
                return 0;
            }
            compareTo = 1;
        }
        return compareTo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzae.class != obj.getClass()) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        return zzfy.zzF(this.zza, zzaeVar.zza) && Arrays.equals(this.zzc, zzaeVar.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        int i2 = i;
        if (i == 0) {
            String str = this.zza;
            i2 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
            this.zzd = i2;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzad zza(int i) {
        return this.zzc[i];
    }

    public final zzae zzb(String str) {
        return zzfy.zzF(this.zza, str) ? this : new zzae(str, false, this.zzc);
    }
}
