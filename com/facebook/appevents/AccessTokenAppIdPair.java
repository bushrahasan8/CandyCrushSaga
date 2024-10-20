package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AccessTokenAppIdPair.class */
public final class AccessTokenAppIdPair implements Serializable {
    public static final Companion Companion = new Companion(null);
    private final String accessTokenString;
    private final String applicationId;

    /* loaded from: AccessTokenAppIdPair$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: AccessTokenAppIdPair$SerializationProxyV1.class */
    public static final abstract class SerializationProxyV1 implements Serializable {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(AccessToken accessToken) {
        this(accessToken.getToken(), FacebookSdk.getApplicationId());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }

    public AccessTokenAppIdPair(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.accessTokenString = Utility.isNullOrEmpty(str) ? null : str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        boolean z = false;
        if (Utility.areObjectsEqual(accessTokenAppIdPair.accessTokenString, this.accessTokenString)) {
            z = false;
            if (Utility.areObjectsEqual(accessTokenAppIdPair.applicationId, this.applicationId)) {
                z = true;
            }
        }
        return z;
    }

    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        String str = this.accessTokenString;
        return (str != null ? str.hashCode() : 0) ^ this.applicationId.hashCode();
    }
}
