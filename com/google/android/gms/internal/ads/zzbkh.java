package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: zzbkh.class */
public final class zzbkh {
    private final zzbkg zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();

    public zzbkh(zzbkg zzbkgVar) {
        Context context;
        this.zza = zzbkgVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbkgVar.zzh());
        } catch (RemoteException | NullPointerException e) {
            zzcec.zzh("", e);
            context = null;
        }
        MediaView mediaView = null;
        if (context != null) {
            mediaView = new MediaView(context);
            try {
                if (true != this.zza.zzs(ObjectWrapper.wrap(mediaView))) {
                    mediaView = null;
                }
            } catch (RemoteException e2) {
                zzcec.zzh("", e2);
                mediaView = null;
            }
        }
        this.zzb = mediaView;
    }

    public final zzbkg zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzcec.zzh("", e);
            return null;
        }
    }
}
