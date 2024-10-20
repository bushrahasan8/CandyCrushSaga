package com.facebook.login;

import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: LoginConfiguration.class */
public final class LoginConfiguration {
    public static final Companion Companion = new Companion(null);
    private final String codeVerifier;
    private final String nonce;
    private final Set permissions;

    /* loaded from: LoginConfiguration$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginConfiguration(Collection collection, String nonce) {
        this(collection, nonce, PKCEUtil.generateCodeVerifier());
        Intrinsics.checkNotNullParameter(nonce, "nonce");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LoginConfiguration(java.util.Collection r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r4 = this;
            r0 = r7
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L13
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            java.lang.String r1 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L13:
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginConfiguration.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public LoginConfiguration(Collection collection, String nonce, String codeVerifier) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        if (!NonceUtil.isValidNonce(nonce) || !PKCEUtil.isValidCodeVerifier(codeVerifier)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add(Scopes.OPEN_ID);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(permissions)");
        this.permissions = unmodifiableSet;
        this.nonce = nonce;
        this.codeVerifier = codeVerifier;
    }

    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Set getPermissions() {
        return this.permissions;
    }
}
