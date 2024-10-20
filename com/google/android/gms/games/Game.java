package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;

/* loaded from: Game.class */
public interface Game extends Freezable<Game>, Parcelable {
    boolean areSnapshotsEnabled();

    int getAchievementTotalCount();

    String getApplicationId();

    String getDescription();

    void getDescription(CharArrayBuffer charArrayBuffer);

    String getDeveloperName();

    void getDeveloperName(CharArrayBuffer charArrayBuffer);

    String getDisplayName();

    void getDisplayName(CharArrayBuffer charArrayBuffer);

    Uri getFeaturedImageUri();

    @Deprecated
    @KeepName
    String getFeaturedImageUrl();

    Uri getHiResImageUri();

    @Deprecated
    @KeepName
    String getHiResImageUrl();

    Uri getIconImageUri();

    @Deprecated
    @KeepName
    String getIconImageUrl();

    int getLeaderboardCount();

    String getPrimaryCategory();

    String getSecondaryCategory();

    String getThemeColor();

    boolean hasGamepadSupport();

    String zza();

    boolean zzb();

    boolean zzc();

    boolean zzd();

    boolean zze();

    @Deprecated
    boolean zzf();

    @Deprecated
    boolean zzg();
}
