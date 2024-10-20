package com.google.android.gms.games;

import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: FriendsResolutionRequiredException.class */
public final class FriendsResolutionRequiredException extends ResolvableApiException {
    private FriendsResolutionRequiredException(Status status) {
        super(status);
    }

    public static FriendsResolutionRequiredException zza(Status status) {
        return new FriendsResolutionRequiredException(status);
    }
}
