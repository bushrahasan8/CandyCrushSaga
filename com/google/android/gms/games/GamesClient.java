package com.google.android.gms.games;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.Task;

/* loaded from: GamesClient.class */
public interface GamesClient {
    Task<Bundle> getActivationHint();

    Task<String> getAppId();

    Task<String> getCurrentAccountName();

    Task<Intent> getSettingsIntent();

    Task<Void> setGravityForPopups(int i);

    Task<Void> setViewForPopups(View view);
}
