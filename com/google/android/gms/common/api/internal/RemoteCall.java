package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: RemoteCall.class */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(T t, U u) throws RemoteException;
}
