package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;

@SafeParcelable.Class(creator = "GetMetadataRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzek.class */
public final class zzek extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzek> CREATOR = new zzel();

    @SafeParcelable.Field(id = 2)
    private final DriveId zzdd;

    @SafeParcelable.Field(id = 3)
    private final boolean zzha;

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzek(@SafeParcelable.Param(id = 2) DriveId driveId, @SafeParcelable.Param(id = 3) boolean z) {
        this.zzdd = driveId;
        this.zzha = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdd, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzha);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
