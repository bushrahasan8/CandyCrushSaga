package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

@UsedByReflection("GamesGmsClientImpl.java")
@RetainForClient
@Deprecated
@SafeParcelable.Class(creator = "RoomEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: RoomEntity.class */
public final class RoomEntity extends GamesDowngradeableSafeParcel {
    public static final Parcelable.Creator<RoomEntity> CREATOR = new zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public RoomEntity() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
            return;
        }
        parcel.writeString("unsupported");
        parcel.writeString("unsupported");
        parcel.writeLong(0L);
        parcel.writeInt(0);
        parcel.writeString("unsupported");
        parcel.writeInt(-1);
        parcel.writeBundle(null);
        parcel.writeInt(0);
    }
}
