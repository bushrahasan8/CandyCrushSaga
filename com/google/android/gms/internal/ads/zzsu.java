package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo$Api29$;
import com.unity3d.services.core.device.MimeTypes;
import java.util.List;

/* loaded from: zzsu.class */
final class zzsu {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, String str, int i, int i2, double d) {
        List m = MediaCodecInfo$Api29$.ExternalSyntheticApiModelOutline2.m(videoCapabilities);
        if (m == null || m.isEmpty()) {
            return 0;
        }
        int zzb = zzb(m, MediaCodecInfo$Api29$.ExternalSyntheticApiModelOutline0.m(i, i2, (int) d));
        if (zzb == 1 && str.equals(MimeTypes.VIDEO_H264)) {
            MediaCodecInfo$Api29$.ExternalSyntheticApiModelOutline1.m();
            if (zzb(m, MediaCodecInfo$Api29$.ExternalSyntheticApiModelOutline0.m(1280, 720, 60)) != 2) {
                return 0;
            }
        }
        return zzb;
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (MediaCodecInfo$Api29$.ExternalSyntheticApiModelOutline4.m(MediaCodecInfo$Api29$.ExternalSyntheticApiModelOutline3.m(list.get(i)), performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
