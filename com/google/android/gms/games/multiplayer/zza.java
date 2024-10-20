package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* loaded from: zza.class */
final class zza extends zzb {
    @Override // com.google.android.gms.games.multiplayer.zzb, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.multiplayer.zzb
    /* renamed from: zza */
    public final ParticipantEntity createFromParcel(Parcel parcel) {
        Integer unparcelClientVersion;
        boolean zzo;
        boolean canUnparcelSafely;
        unparcelClientVersion = DowngradeableSafeParcel.getUnparcelClientVersion();
        zzo = GamesDowngradeableSafeParcel.zzo(unparcelClientVersion);
        if (!zzo) {
            canUnparcelSafely = DowngradeableSafeParcel.canUnparcelSafely(ParticipantEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                return new ParticipantEntity();
            }
        }
        return super.createFromParcel(parcel);
    }
}
