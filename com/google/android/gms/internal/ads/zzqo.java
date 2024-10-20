package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import androidx.media3.exoplayer.ExoPlayerImpl$Api31$;
import androidx.media3.exoplayer.audio.DefaultAudioSink$Api31$;

/* loaded from: zzqo.class */
final class zzqo {
    public static void zza(AudioTrack audioTrack, zzpb zzpbVar) {
        LogSessionId zza = zzpbVar.zza();
        if (DefaultAudioSink$Api31$.ExternalSyntheticApiModelOutline0.m(zza, ExoPlayerImpl$Api31$.ExternalSyntheticApiModelOutline0.m())) {
            return;
        }
        DefaultAudioSink$Api31$.ExternalSyntheticApiModelOutline1.m(audioTrack, zza);
    }
}
