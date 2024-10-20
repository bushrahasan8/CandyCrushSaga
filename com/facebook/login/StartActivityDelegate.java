package com.facebook.login;

import android.app.Activity;
import android.content.Intent;

/* loaded from: StartActivityDelegate.class */
public interface StartActivityDelegate {
    Activity getActivityContext();

    void startActivityForResult(Intent intent, int i);
}
