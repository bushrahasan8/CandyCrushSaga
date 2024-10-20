package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import androidx.media3.exoplayer.ExoPlayerImpl$Api31$;
import androidx.media3.exoplayer.audio.DefaultAudioSink$Api31$;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$Api31$;

/* loaded from: zzsw.class */
final class zzsw {
    public static void zza(zzsp zzspVar, zzpb zzpbVar) {
        LogSessionId zza = zzpbVar.zza();
        if (DefaultAudioSink$Api31$.ExternalSyntheticApiModelOutline0.m(zza, ExoPlayerImpl$Api31$.ExternalSyntheticApiModelOutline0.m())) {
            return;
        }
        zzspVar.zzb.setString("log-session-id", MediaCodecRenderer$Api31$.ExternalSyntheticApiModelOutline0.m(zza));
    }
}
