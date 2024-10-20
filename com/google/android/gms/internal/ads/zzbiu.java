package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: zzbiu.class */
public final class zzbiu {
    private final Context zza;

    public zzbiu(Context context) {
        this.zza = context;
    }

    public final void zza(zzbyd zzbydVar) {
        try {
            ((zzbiv) zzceg.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcee() { // from class: com.google.android.gms.internal.ads.zzbit
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    zzbiv zzbivVar;
                    if (obj == 0) {
                        zzbivVar = null;
                    } else {
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                        zzbivVar = queryLocalInterface instanceof zzbiv ? (zzbiv) queryLocalInterface : new zzbiv(obj);
                    }
                    return zzbivVar;
                }
            })).zze(zzbydVar);
        } catch (RemoteException e) {
            zzcec.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcef e2) {
            zzcec.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
