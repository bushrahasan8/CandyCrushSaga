package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer$Api26$;
import com.ironsource.t2;

/* loaded from: zzaaf.class */
final class zzaaf {
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(t2.h.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        boolean z = false;
        if (display != null) {
            z = false;
            if (MediaCodecVideoRenderer$Api26$.ExternalSyntheticApiModelOutline0.m(display)) {
                int[] m = MediaCodecVideoRenderer$Api26$.ExternalSyntheticApiModelOutline2.m(MediaCodecVideoRenderer$Api26$.ExternalSyntheticApiModelOutline1.m(display));
                int length = m.length;
                int i = 0;
                while (true) {
                    z = false;
                    if (i >= length) {
                        break;
                    }
                    if (m[i] == 1) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
        }
        return z;
    }
}
