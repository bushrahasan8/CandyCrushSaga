package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DriveServiceResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzec.class */
public final class zzec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzec> CREATOR = new zzed();

    @SafeParcelable.Field(id = 2)
    final IBinder zzgs;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzec(@SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zzgs = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzgs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
