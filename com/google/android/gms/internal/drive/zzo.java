package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.Contents;

@SafeParcelable.Class(creator = "CloseContentsRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzo.class */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(id = 2)
    private final Contents zzdf;

    @SafeParcelable.Field(id = 4)
    private final int zzdh;

    @SafeParcelable.Field(id = 3)
    private final Boolean zzdj;

    @VisibleForTesting
    public zzo(int i, boolean z) {
        this(null, Boolean.FALSE, i);
    }

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzo(@SafeParcelable.Param(id = 2) Contents contents, @SafeParcelable.Param(id = 3) Boolean bool, @SafeParcelable.Param(id = 4) int i) {
        this.zzdf = contents;
        this.zzdj = bool;
        this.zzdh = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdf, i, false);
        SafeParcelWriter.writeBooleanObject(parcel, 3, this.zzdj, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzdh);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
