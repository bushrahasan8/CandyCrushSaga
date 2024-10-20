package com.google.android.gms.games;

import com.google.android.gms.tasks.Task;

/* loaded from: GamesMetadataClient.class */
public interface GamesMetadataClient {
    Task<Game> getCurrentGame();

    Task<AnnotatedData<Game>> loadGame();
}
