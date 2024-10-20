package com.google.android.gms.games.leaderboard;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games_v2.zzah;

/* loaded from: ScoreSubmissionData.class */
public final class ScoreSubmissionData {
    private static final String[] zza = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    private String zzb;
    private String zzc;
    private int zzd;
    private SparseArray zze = new SparseArray();

    /* loaded from: ScoreSubmissionData$Result.class */
    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long j, String str, String str2, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.scoreTag = str2;
            this.newBest = z;
        }

        public String toString() {
            return Objects.toStringHelper(this).add("RawScore", Long.valueOf(this.rawScore)).add("FormattedScore", this.formattedScore).add("ScoreTag", this.scoreTag).add("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    public ScoreSubmissionData(DataHolder dataHolder) {
        this.zzd = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        Preconditions.checkArgument(count == 3);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= count) {
                return;
            }
            int windowIndex = dataHolder.getWindowIndex(i2);
            int i3 = i2;
            if (i2 == 0) {
                this.zzb = dataHolder.getString("leaderboardId", 0, windowIndex);
                this.zzc = dataHolder.getString("playerId", 0, windowIndex);
                i3 = 0;
            }
            if (dataHolder.getBoolean("hasResult", i3, windowIndex)) {
                this.zze.put(dataHolder.getInteger("timeSpan", i3, windowIndex), new Result(dataHolder.getLong("rawScore", i3, windowIndex), dataHolder.getString("formattedScore", i3, windowIndex), dataHolder.getString("scoreTag", i3, windowIndex), dataHolder.getBoolean("newBest", i3, windowIndex)));
            }
            i = i3 + 1;
        }
    }

    public String getLeaderboardId() {
        return this.zzb;
    }

    public String getPlayerId() {
        return this.zzc;
    }

    public Result getScoreResult(int i) {
        return (Result) this.zze.get(i);
    }

    public String toString() {
        Objects.ToStringHelper add = Objects.toStringHelper(this).add("PlayerId", this.zzc).add("StatusCode", Integer.valueOf(this.zzd));
        for (int i = 0; i < 3; i++) {
            Result result = (Result) this.zze.get(i);
            add.add("TimesSpan", zzah.zza(i));
            add.add("Result", result == null ? "null" : result.toString());
        }
        return add.toString();
    }
}
