package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* loaded from: zzdjk.class */
public final class zzdjk extends zzdgl {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdjk(Set set) {
        super(set);
    }

    public final void zza() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjh
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjg
            @Override // com.google.android.gms.internal.ads.zzdgk
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final void zzc() {
        synchronized (this) {
            if (!this.zzb) {
                zzu(zzdji.zza);
                this.zzb = true;
            }
            zzu(new zzdgk() { // from class: com.google.android.gms.internal.ads.zzdjj
                @Override // com.google.android.gms.internal.ads.zzdgk
                public final void zza(Object obj) {
                    ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
                }
            });
        }
    }

    public final void zzd() {
        synchronized (this) {
            zzu(zzdji.zza);
            this.zzb = true;
        }
    }
}
