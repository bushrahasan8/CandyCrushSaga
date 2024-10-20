package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: zzbll.class */
public final class zzbll extends RemoteCreator {
    public zzbll() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        IInterface zzbjrVar;
        if (iBinder == null) {
            zzbjrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            zzbjrVar = queryLocalInterface instanceof zzbjt ? (zzbjt) queryLocalInterface : new zzbjr(iBinder);
        }
        return zzbjrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.gms.internal.ads.zzbjq] */
    public final zzbjq zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbjo zzbjoVar;
        try {
            IBinder zze = ((zzbjt) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 240304000);
            if (zze == null) {
                zzbjoVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                zzbjoVar = queryLocalInterface instanceof zzbjq ? (zzbjq) queryLocalInterface : new zzbjo(zze);
            }
            return zzbjoVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcec.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
