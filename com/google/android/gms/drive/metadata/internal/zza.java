package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: zza.class */
public final class zza implements Parcelable.Creator<AppVisibleCustomProperties> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AppVisibleCustomProperties createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzc.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AppVisibleCustomProperties(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ AppVisibleCustomProperties[] newArray(int i) {
        return new AppVisibleCustomProperties[i];
    }
}
