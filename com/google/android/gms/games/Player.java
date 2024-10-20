package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@VisibleForTesting
/* loaded from: Player.class */
public interface Player extends Freezable<Player>, Parcelable {
    public static final long CURRENT_XP_UNKNOWN = -1;
    public static final long TIMESTAMP_UNKNOWN = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: Player$FriendsListVisibilityStatus.class */
    public @interface FriendsListVisibilityStatus {
        public static final int FEATURE_UNAVAILABLE = 3;
        public static final int REQUEST_REQUIRED = 2;
        public static final int UNKNOWN = 0;
        public static final int VISIBLE = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: Player$PlayerFriendStatus.class */
    public @interface PlayerFriendStatus {
        public static final int FRIEND = 4;
        public static final int NO_RELATIONSHIP = 0;
        public static final int UNKNOWN = -1;
    }

    Uri getBannerImageLandscapeUri();

    @Deprecated
    @KeepName
    String getBannerImageLandscapeUrl();

    Uri getBannerImagePortraitUri();

    @Deprecated
    @KeepName
    String getBannerImagePortraitUrl();

    CurrentPlayerInfo getCurrentPlayerInfo();

    String getDisplayName();

    void getDisplayName(CharArrayBuffer charArrayBuffer);

    Uri getHiResImageUri();

    @Deprecated
    @KeepName
    String getHiResImageUrl();

    Uri getIconImageUri();

    @Deprecated
    @KeepName
    String getIconImageUrl();

    @Deprecated
    long getLastPlayedWithTimestamp();

    PlayerLevelInfo getLevelInfo();

    String getPlayerId();

    PlayerRelationshipInfo getRelationshipInfo();

    long getRetrievedTimestamp();

    String getTitle();

    void getTitle(CharArrayBuffer charArrayBuffer);

    boolean hasHiResImage();

    boolean hasIconImage();

    @Deprecated
    int zza();

    long zzb();

    com.google.android.gms.games.internal.player.zza zzc();

    String zzd();

    String zze();

    boolean zzf();

    boolean zzg();

    boolean zzh();
}
