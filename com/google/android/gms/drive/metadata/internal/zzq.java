package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PartialDriveIdCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzq.class */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.Field(id = 2)
    final String zzad;

    @SafeParcelable.Field(id = 3)
    final long zzae;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.drive.DriveId.RESOURCE_TYPE_UNKNOWN", id = 4)
    final int zzaf;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) int i) {
        this.zzad = str;
        this.zzae = j;
        this.zzaf = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzad, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzae);
        SafeParcelWriter.writeInt(parcel, 4, this.zzaf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
