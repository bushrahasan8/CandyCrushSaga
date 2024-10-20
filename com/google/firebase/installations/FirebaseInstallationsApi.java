package com.google.firebase.installations;

import com.google.android.gms.tasks.Task;

/* loaded from: FirebaseInstallationsApi.class */
public interface FirebaseInstallationsApi {
    Task getId();

    Task getToken(boolean z);
}
