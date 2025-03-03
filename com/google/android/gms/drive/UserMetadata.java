package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "UserMetadataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: UserMetadata.class */
public class UserMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserMetadata> CREATOR = new zzt();

    @SafeParcelable.Field(id = 2)
    private final String zzbo;

    @SafeParcelable.Field(id = 3)
    private final String zzbp;

    @SafeParcelable.Field(id = 4)
    private final String zzbq;

    @SafeParcelable.Field(id = 5)
    private final boolean zzbr;

    @SafeParcelable.Field(id = 6)
    private final String zzbs;

    @SafeParcelable.Constructor
    public UserMetadata(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) String str4) {
        this.zzbo = str;
        this.zzbp = str2;
        this.zzbq = str3;
        this.zzbr = z;
        this.zzbs = str4;
    }

    public String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", this.zzbo, this.zzbp, this.zzbq, Boolean.valueOf(this.zzbr), this.zzbs);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbo, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbp, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzbq, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzbr);
        SafeParcelWriter.writeString(parcel, 6, this.zzbs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
