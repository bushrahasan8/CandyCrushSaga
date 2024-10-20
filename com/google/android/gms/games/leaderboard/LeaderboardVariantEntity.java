package com.google.android.gms.games.leaderboard;

import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.games_v2.zzah;

@UsedByReflection("GamesGmsClientImpl.java")
/* loaded from: LeaderboardVariantEntity.class */
public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final int zza;
    private final int zzb;
    private final boolean zzc;
    private final long zzd;
    private final String zze;
    private final long zzf;
    private final String zzg;
    private final String zzh;
    private final long zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardVariant) {
        this.zza = leaderboardVariant.getTimeSpan();
        this.zzb = leaderboardVariant.getCollection();
        this.zzc = leaderboardVariant.hasPlayerInfo();
        this.zzd = leaderboardVariant.getRawPlayerScore();
        this.zze = leaderboardVariant.getDisplayPlayerScore();
        this.zzf = leaderboardVariant.getPlayerRank();
        this.zzg = leaderboardVariant.getDisplayPlayerRank();
        this.zzh = leaderboardVariant.getPlayerScoreTag();
        this.zzi = leaderboardVariant.getNumScores();
        this.zzj = leaderboardVariant.zza();
        this.zzk = leaderboardVariant.zzc();
        this.zzl = leaderboardVariant.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(LeaderboardVariant leaderboardVariant) {
        return Objects.hashCode(Integer.valueOf(leaderboardVariant.getTimeSpan()), Integer.valueOf(leaderboardVariant.getCollection()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.zza(), leaderboardVariant.zzb(), leaderboardVariant.zzc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zze(LeaderboardVariant leaderboardVariant) {
        Object obj;
        Objects.ToStringHelper add = Objects.toStringHelper(leaderboardVariant).add("TimeSpan", zzah.zza(leaderboardVariant.getTimeSpan()));
        int collection = leaderboardVariant.getCollection();
        if (collection == -1) {
            obj = "UNKNOWN";
        } else if (collection == 0) {
            obj = "PUBLIC";
        } else if (collection != 1) {
            obj = "SOCIAL_1P";
            if (collection != 2) {
                if (collection == 3) {
                    obj = "FRIENDS";
                } else {
                    if (collection != 4) {
                        StringBuilder sb = new StringBuilder(43);
                        sb.append("Unknown leaderboard collection: ");
                        sb.append(collection);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    obj = "SOCIAL_1P";
                }
            }
        } else {
            obj = "SOCIAL";
        }
        return add.add("Collection", obj).add("RawPlayerScore", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getRawPlayerScore()) : "none").add("DisplayPlayerScore", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerScore() : "none").add("PlayerRank", leaderboardVariant.hasPlayerInfo() ? Long.valueOf(leaderboardVariant.getPlayerRank()) : "none").add("DisplayPlayerRank", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerRank() : "none").add("NumScores", Long.valueOf(leaderboardVariant.getNumScores())).add("TopPageNextToken", leaderboardVariant.zza()).add("WindowPageNextToken", leaderboardVariant.zzb()).add("WindowPagePrevToken", leaderboardVariant.zzc()).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzf(LeaderboardVariant leaderboardVariant, Object obj) {
        if (!(obj instanceof LeaderboardVariant)) {
            return false;
        }
        if (leaderboardVariant == obj) {
            return true;
        }
        LeaderboardVariant leaderboardVariant2 = (LeaderboardVariant) obj;
        return Objects.equal(Integer.valueOf(leaderboardVariant2.getTimeSpan()), Integer.valueOf(leaderboardVariant.getTimeSpan())) && Objects.equal(Integer.valueOf(leaderboardVariant2.getCollection()), Integer.valueOf(leaderboardVariant.getCollection())) && Objects.equal(Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && Objects.equal(Long.valueOf(leaderboardVariant2.getRawPlayerScore()), Long.valueOf(leaderboardVariant.getRawPlayerScore())) && Objects.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && Objects.equal(Long.valueOf(leaderboardVariant2.getPlayerRank()), Long.valueOf(leaderboardVariant.getPlayerRank())) && Objects.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && Objects.equal(Long.valueOf(leaderboardVariant2.getNumScores()), Long.valueOf(leaderboardVariant.getNumScores())) && Objects.equal(leaderboardVariant2.zza(), leaderboardVariant.zza()) && Objects.equal(leaderboardVariant2.zzb(), leaderboardVariant.zzb()) && Objects.equal(leaderboardVariant2.zzc(), leaderboardVariant.zzc());
    }

    public final boolean equals(Object obj) {
        return zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ LeaderboardVariant freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getDisplayPlayerRank() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getDisplayPlayerScore() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String getPlayerScoreTag() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
        return this.zzc;
    }

    public final int hashCode() {
        return zzd(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return zze(this);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzb() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final String zzc() {
        return this.zzk;
    }
}
