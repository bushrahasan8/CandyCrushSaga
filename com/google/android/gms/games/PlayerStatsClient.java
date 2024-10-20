package com.google.android.gms.games;

import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.tasks.Task;

/* loaded from: PlayerStatsClient.class */
public interface PlayerStatsClient {
    Task<AnnotatedData<PlayerStats>> loadPlayerStats(boolean z);
}
