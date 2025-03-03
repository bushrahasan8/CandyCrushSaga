package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.games.Player;

@VisibleForTesting
/* loaded from: LeaderboardScore.class */
public interface LeaderboardScore extends Freezable<LeaderboardScore> {
    public static final int LEADERBOARD_RANK_UNKNOWN = -1;

    String getDisplayRank();

    void getDisplayRank(CharArrayBuffer charArrayBuffer);

    String getDisplayScore();

    void getDisplayScore(CharArrayBuffer charArrayBuffer);

    long getRank();

    long getRawScore();

    Player getScoreHolder();

    String getScoreHolderDisplayName();

    void getScoreHolderDisplayName(CharArrayBuffer charArrayBuffer);

    Uri getScoreHolderHiResImageUri();

    @Deprecated
    @KeepName
    String getScoreHolderHiResImageUrl();

    Uri getScoreHolderIconImageUri();

    @Deprecated
    @KeepName
    String getScoreHolderIconImageUrl();

    String getScoreTag();

    long getTimestampMillis();
}
