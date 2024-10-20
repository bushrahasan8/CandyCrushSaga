package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: zzfm.class */
public final class zzfm implements Parcelable.Creator<zzfl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfl createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                j = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 3) {
                j2 = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 4) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.drive.zzh.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzfl(j, j2, i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzfl[] newArray(int i) {
        return new zzfl[i];
    }
}
