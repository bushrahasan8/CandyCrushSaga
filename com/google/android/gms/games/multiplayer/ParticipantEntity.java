package com.google.android.gms.games.multiplayer;

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
@SafeParcelable.Class(creator = "ParticipantEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: ParticipantEntity.class */
public final class ParticipantEntity extends GamesDowngradeableSafeParcel {
    public static final Parcelable.Creator<ParticipantEntity> CREATOR = new zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public ParticipantEntity() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
            return;
        }
        parcel.writeString("unsupported");
        parcel.writeString("unsupported");
        parcel.writeString(null);
        parcel.writeString(null);
        parcel.writeInt(0);
        parcel.writeString("unsupported");
        parcel.writeInt(0);
        parcel.writeInt(0);
    }
}
