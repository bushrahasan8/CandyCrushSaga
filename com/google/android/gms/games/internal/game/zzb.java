package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* loaded from: zzb.class */
final class zzb extends zzc {
    @Override // com.google.android.gms.games.internal.game.zzc, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.internal.game.zzc
    /* renamed from: zza */
    public final GameBadgeEntity createFromParcel(Parcel parcel) {
        Integer unparcelClientVersion;
        boolean zzo;
        boolean canUnparcelSafely;
        unparcelClientVersion = DowngradeableSafeParcel.getUnparcelClientVersion();
        zzo = GamesDowngradeableSafeParcel.zzo(unparcelClientVersion);
        if (!zzo) {
            canUnparcelSafely = DowngradeableSafeParcel.canUnparcelSafely(GameBadgeEntity.class.getCanonicalName());
            if (!canUnparcelSafely) {
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                return new GameBadgeEntity(readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
            }
        }
        return super.createFromParcel(parcel);
    }
}
