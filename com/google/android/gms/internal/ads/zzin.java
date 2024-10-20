package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: zzin.class */
public final class zzin implements AudioManager.OnAudioFocusChangeListener {
    final zzip zza;
    private final Handler zzb;

    public zzin(zzip zzipVar, Handler handler) {
        this.zza = zzipVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzim
            public final zzin zza;
            public final int zzb;

            {
                this.zza = this;
                this.zzb = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzip.zzc(this.zza.zza, this.zzb);
            }
        });
    }
}
