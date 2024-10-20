package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper$Api30$;

/* loaded from: zzaar.class */
final class zzaar {
    public static void zza(Surface surface, float f) {
        try {
            VideoFrameReleaseHelper$Api30$.ExternalSyntheticApiModelOutline0.m(surface, f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzff.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
