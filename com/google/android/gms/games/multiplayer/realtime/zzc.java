package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* loaded from: zzc.class */
final class zzc extends zzd {
    @Override // com.google.android.gms.games.multiplayer.realtime.zzd, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd
    /* renamed from: zza */
    public final RoomEntity createFromParcel(Parcel parcel) {
        Integer unparcelClientVersion;
        boolean zzo;
        boolean canUnparcelSafely;
        unparcelClientVersion = DowngradeableSafeParcel.getUnparcelClientVersion();
        zzo = GamesDowngradeableSafeParcel.zzo(unparcelClientVersion);
        if (!zzo) {
            canUnparcelSafely = DowngradeableSafeParcel.canUnparcelSafely(RoomEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                return new RoomEntity();
            }
        }
        return super.createFromParcel(parcel);
    }
}
