package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* loaded from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    private WeakReference mMediaControllerImpl;

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i, Bundle bundle) {
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver$$ExternalSyntheticThrowCCEIfNotNull0.m(this.mMediaControllerImpl.get());
    }
}
