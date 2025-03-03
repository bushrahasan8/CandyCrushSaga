package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnDeviceUsagePreferenceResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzfj.class */
public final class zzfj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfj> CREATOR = new zzfk();

    @SafeParcelable.Field(id = 2)
    final zzei zzhw;

    @SafeParcelable.Constructor
    public zzfj(@SafeParcelable.Param(id = 2) zzei zzeiVar) {
        this.zzhw = zzeiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzhw, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzei zzas() {
        return this.zzhw;
    }
}
