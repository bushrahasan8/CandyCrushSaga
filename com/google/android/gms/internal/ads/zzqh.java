package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider$Api29$;

/* loaded from: zzqh.class */
final class zzqh {
    public static zzpg zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!DefaultAudioOffloadSupportProvider$Api29$.ExternalSyntheticApiModelOutline0.m(audioFormat, audioAttributes)) {
            return zzpg.zza;
        }
        zzpe zzpeVar = new zzpe();
        zzpeVar.zza(true);
        zzpeVar.zzc(z);
        return zzpeVar.zzd();
    }
}
