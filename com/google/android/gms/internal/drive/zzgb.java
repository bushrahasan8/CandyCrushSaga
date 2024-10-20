package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: zzgb.class */
public final class zzgb implements Parcelable.Creator<zzga> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzga createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzgo zzgoVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzgoVar = (zzgo) SafeParcelReader.createParcelable(parcel, readHeader, zzgo.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzga(zzgoVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzga[] newArray(int i) {
        return new zzga[i];
    }
}
