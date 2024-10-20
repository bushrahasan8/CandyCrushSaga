package com.google.android.gms.internal.games_v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PopupLocationInfoParcelableCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: zzan.class */
public final class zzan extends com.google.android.gms.games.internal.zzh {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();

    @SafeParcelable.Field(getter = "getInfoBundle", id = 1)
    private final Bundle zza;

    @SafeParcelable.Field(getter = "getWindowToken", id = 2)
    private final IBinder zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(id = 1) Bundle bundle, @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = bundle;
        this.zzb = iBinder;
    }

    public zzan(zzam zzamVar) {
        this.zza = zzamVar.zza();
        this.zzb = zzamVar.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
