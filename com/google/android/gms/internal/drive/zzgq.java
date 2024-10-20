package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.query.Query;

@SafeParcelable.Class(creator = "QueryRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzgq.class */
public final class zzgq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgq> CREATOR = new zzgr();

    @SafeParcelable.Field(id = 2)
    private final Query zzir;

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzgq(@SafeParcelable.Param(id = 2) Query query) {
        this.zzir = query;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzir, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
