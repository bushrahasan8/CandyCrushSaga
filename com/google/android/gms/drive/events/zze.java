package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

@ShowFirstParty
@SafeParcelable.Class(creator = "ChangesAvailableOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zze.class */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    @SafeParcelable.Field(id = 2)
    private final int zzbw;

    @SafeParcelable.Field(id = 3)
    private final boolean zzbx;

    @SafeParcelable.Field(id = 4)
    private final List<DriveSpace> zzby;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) List<DriveSpace> list) {
        this.zzbw = i;
        this.zzbx = z;
        this.zzby = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != zze.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zze zzeVar = (zze) obj;
        return Objects.equal(this.zzby, zzeVar.zzby) && this.zzbw == zzeVar.zzbw && this.zzbx == zzeVar.zzbx;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzby, Integer.valueOf(this.zzbw), Boolean.valueOf(this.zzbx));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzbw);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzbx);
        SafeParcelWriter.writeTypedList(parcel, 4, this.zzby, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
