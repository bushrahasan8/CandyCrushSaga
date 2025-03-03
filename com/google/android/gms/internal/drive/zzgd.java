package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "OnResourceIdSetResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzgd.class */
public final class zzgd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgd> CREATOR = new zzge();

    @SafeParcelable.Field(getter = "getResourceIds", id = 2)
    private final List<String> zzim;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzgd(@SafeParcelable.Param(id = 2) List<String> list) {
        this.zzim = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzim, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
