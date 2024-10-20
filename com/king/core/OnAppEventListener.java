package com.king.core;

import androidx.annotation.Keep;

@Keep
/* loaded from: OnAppEventListener.class */
public interface OnAppEventListener {
    void onDestroy();

    void onPause();

    void onResume();
}
