package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: zzac.class */
public final class zzac {
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    private final boolean zzf() {
        float f;
        synchronized (this) {
            f = this.zzb;
        }
        return f >= 0.0f;
    }

    public final float zza() {
        synchronized (this) {
            if (!zzf()) {
                return 1.0f;
            }
            return this.zzb;
        }
    }

    public final void zzc(boolean z) {
        synchronized (this) {
            this.zza = z;
        }
    }

    public final void zzd(float f) {
        synchronized (this) {
            this.zzb = f;
        }
    }

    public final boolean zze() {
        boolean z;
        synchronized (this) {
            z = this.zza;
        }
        return z;
    }
}
