package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* loaded from: StatusExceptionMapper.class */
public interface StatusExceptionMapper {
    @KeepForSdk
    Exception getException(Status status);
}
