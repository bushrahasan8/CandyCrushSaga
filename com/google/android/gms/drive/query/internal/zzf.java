package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class(creator = "FieldWithSortOrderCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: zzf.class */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    @SafeParcelable.Field(id = 1)
    private final String fieldName;

    @SafeParcelable.Field(id = 2)
    private final boolean zzmc;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z) {
        this.fieldName = str;
        this.zzmc = z;
    }

    public final String toString() {
        return String.format(Locale.US, "FieldWithSortOrder[%s %s]", this.fieldName, this.zzmc ? "ASC" : "DESC");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.fieldName, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzmc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
