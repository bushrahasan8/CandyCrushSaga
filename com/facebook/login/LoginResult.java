package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: LoginResult.class */
public final class LoginResult {
    private final AccessToken accessToken;
    private final AuthenticationToken authenticationToken;
    private final Set recentlyDeniedPermissions;
    private final Set recentlyGrantedPermissions;

    public LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set recentlyGrantedPermissions, Set recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = recentlyGrantedPermissions;
        this.recentlyDeniedPermissions = recentlyDeniedPermissions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        return Intrinsics.areEqual(this.accessToken, loginResult.accessToken) && Intrinsics.areEqual(this.authenticationToken, loginResult.authenticationToken) && Intrinsics.areEqual(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && Intrinsics.areEqual(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final Set getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }

    public final Set getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public int hashCode() {
        int hashCode = this.accessToken.hashCode();
        AuthenticationToken authenticationToken = this.authenticationToken;
        return (((((hashCode * 31) + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }
}
