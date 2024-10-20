package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: zzbwq.class */
public final class zzbwq extends RemoteCreator {
    public zzbwq() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        IInterface zzbwuVar;
        if (iBinder == null) {
            zzbwuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            zzbwuVar = queryLocalInterface instanceof zzbww ? (zzbww) queryLocalInterface : new zzbwu(iBinder);
        }
        return zzbwuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.gms.internal.ads.zzbwt] */
    public final zzbwt zza(Activity activity) {
        zzbwr zzbwrVar;
        try {
            IBinder zze = ((zzbww) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                zzbwrVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                zzbwrVar = queryLocalInterface instanceof zzbwt ? (zzbwt) queryLocalInterface : new zzbwr(zze);
            }
            return zzbwrVar;
        } catch (RemoteException e) {
            zzcec.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzcec.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
