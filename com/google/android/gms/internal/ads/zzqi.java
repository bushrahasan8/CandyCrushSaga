package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider$Api31$;

/* loaded from: zzqi.class */
final class zzqi {
    public static zzpg zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int m = DefaultAudioOffloadSupportProvider$Api31$.ExternalSyntheticApiModelOutline0.m(audioFormat, audioAttributes);
        if (m == 0) {
            return zzpg.zza;
        }
        zzpe zzpeVar = new zzpe();
        boolean z2 = false;
        if (zzfy.zza > 32) {
            z2 = false;
            if (m == 2) {
                z2 = true;
            }
        }
        zzpeVar.zza(true);
        zzpeVar.zzb(z2);
        zzpeVar.zzc(z);
        return zzpeVar.zzd();
    }
}
