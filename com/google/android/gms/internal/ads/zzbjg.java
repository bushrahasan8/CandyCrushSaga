package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: zzbjg.class */
public final class zzbjg extends NativeAd.AdChoicesInfo {
    private final zzbjf zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbjg(zzbjf zzbjfVar) {
        this.zza = zzbjfVar;
        try {
            this.zzc = zzbjfVar.zzg();
        } catch (RemoteException e) {
            zzcec.zzh("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbjfVar.zzh()) {
                zzbjm zzbjmVar = null;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        zzbjmVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbjmVar = queryLocalInterface instanceof zzbjm ? (zzbjm) queryLocalInterface : new zzbjk(iBinder);
                    }
                }
                if (zzbjmVar != null) {
                    this.zzb.add(new zzbjn(zzbjmVar));
                }
            }
        } catch (RemoteException e2) {
            zzcec.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
