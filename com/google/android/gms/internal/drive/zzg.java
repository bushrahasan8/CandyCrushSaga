package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.drive.events.ListenerToken;

/* loaded from: zzg.class */
public final class zzg implements ListenerToken {
    private final ListenerHolder.ListenerKey zzcy;
    private ICancelToken zzcz = null;

    public zzg(ListenerHolder.ListenerKey listenerKey) {
        this.zzcy = listenerKey;
    }

    public final boolean cancel() {
        ICancelToken iCancelToken = this.zzcz;
        if (iCancelToken == null) {
            return false;
        }
        try {
            iCancelToken.cancel();
            return true;
        } catch (RemoteException e) {
            return false;
        }
    }

    public final void setCancelToken(ICancelToken iCancelToken) {
        this.zzcz = iCancelToken;
    }

    public final ListenerHolder.ListenerKey zzad() {
        return this.zzcy;
    }
}
