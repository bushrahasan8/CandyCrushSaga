package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* loaded from: zzblm.class */
public final class zzblm extends RemoteCreator {
    public zzblm() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        IInterface zzbjxVar;
        if (iBinder == null) {
            zzbjxVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
            zzbjxVar = queryLocalInterface instanceof zzbjz ? (zzbjz) queryLocalInterface : new zzbjx(iBinder);
        }
        return zzbjxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.gms.internal.ads.zzbjw] */
    public final zzbjw zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbju zzbjuVar;
        try {
            IBinder zze = ((zzbjz) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                zzbjuVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
                zzbjuVar = queryLocalInterface instanceof zzbjw ? (zzbjw) queryLocalInterface : new zzbju(zze);
            }
            return zzbjuVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcec.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
