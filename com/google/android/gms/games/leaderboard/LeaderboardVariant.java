package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@VisibleForTesting
/* loaded from: LeaderboardVariant.class */
public interface LeaderboardVariant extends Freezable<LeaderboardVariant> {
    public static final int COLLECTION_FRIENDS = 3;
    public static final int COLLECTION_PUBLIC = 0;
    public static final int NUM_SCORES_UNKNOWN = -1;
    public static final int NUM_TIME_SPANS = 3;
    public static final int PLAYER_RANK_UNKNOWN = -1;
    public static final int PLAYER_SCORE_UNKNOWN = -1;
    public static final int TIME_SPAN_ALL_TIME = 2;
    public static final int TIME_SPAN_DAILY = 0;
    public static final int TIME_SPAN_WEEKLY = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: LeaderboardVariant$Collection.class */
    public @interface Collection {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: LeaderboardVariant$TimeSpan.class */
    public @interface TimeSpan {
    }

    int getCollection();

    String getDisplayPlayerRank();

    String getDisplayPlayerScore();

    long getNumScores();

    long getPlayerRank();

    String getPlayerScoreTag();

    long getRawPlayerScore();

    int getTimeSpan();

    boolean hasPlayerInfo();

    String zza();

    String zzb();

    String zzc();
}
