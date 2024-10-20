package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* loaded from: VideosClient.class */
public interface VideosClient {
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STARTED = 2;
    public static final int CAPTURE_OVERLAY_STATE_CAPTURE_STOPPED = 3;
    public static final int CAPTURE_OVERLAY_STATE_DISMISSED = 4;
    public static final int CAPTURE_OVERLAY_STATE_SHOWN = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: VideosClient$CaptureOverlayState.class */
    public @interface CaptureOverlayState {
    }

    @Deprecated
    /* loaded from: VideosClient$OnCaptureOverlayStateListener.class */
    public interface OnCaptureOverlayStateListener {
        @Deprecated
        void onCaptureOverlayStateChanged(int i);
    }

    @Deprecated
    Task<VideoCapabilities> getCaptureCapabilities();

    @Deprecated
    Task<Intent> getCaptureOverlayIntent();

    @Deprecated
    Task<CaptureState> getCaptureState();

    @Deprecated
    Task<Boolean> isCaptureAvailable(int i);

    @Deprecated
    Task<Boolean> isCaptureSupported();

    @Deprecated
    Task<Void> registerOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener onCaptureOverlayStateListener);

    @Deprecated
    Task<Boolean> unregisterOnCaptureOverlayStateChangedListener(OnCaptureOverlayStateListener onCaptureOverlayStateListener);
}
