package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: zzaak.class */
public final class zzaak extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaai zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaak(zzaai zzaaiVar, SurfaceTexture surfaceTexture, boolean z, zzaaj zzaajVar) {
        super(surfaceTexture);
        this.zzd = zzaaiVar;
        this.zza = z;
    }

    public static zzaak zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z) {
            z2 = zzb(context);
        }
        zzek.zzf(z2);
        zzaai zzaaiVar = new zzaai();
        if (z) {
            i = zzb;
        }
        return zzaaiVar.zza(i);
    }

    public static boolean zzb(Context context) {
        int i;
        synchronized (zzaak.class) {
            try {
                if (!zzc) {
                    zzb = zzeu.zzc(context) ? zzeu.zzd() ? 1 : 2 : 0;
                    zzc = true;
                }
                i = zzb;
            } finally {
            }
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
